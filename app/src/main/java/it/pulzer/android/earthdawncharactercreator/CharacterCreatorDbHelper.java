package it.pulzer.android.earthdawncharactercreator;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

import it.pulzer.android.earthdawncharactercreator.disciplines.BaseDiscipline;
import it.pulzer.android.earthdawncharactercreator.model.Character;
import it.pulzer.android.earthdawncharactercreator.CharacterCreatorContract.*;
import it.pulzer.android.earthdawncharactercreator.races.BaseRace;

/**
 * Created by faldon on 08.09.17.
 */

public class CharacterCreatorDbHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "EarthdawnCharacterCreator.db";

    private static final String SQL_CREATE_CHARACTERS =
            "CREATE TABLE " + CharacterCreatorContract.CharacterEntry.TABLENAME + " (" +
                    CharacterCreatorContract.CharacterEntry._ID + " INTEGER PRIMARY KEY," +
                    CharacterCreatorContract.CharacterEntry.COLNAME_NAME + " TEXT," +
                    CharacterCreatorContract.CharacterEntry.COLNAME_CIRCLE + " INTEGER," +
                    CharacterCreatorContract.CharacterEntry.COLNAME_LPCURRENT + " INTEGER," +
                    CharacterCreatorContract.CharacterEntry.COLNAME_LPTOTAL + " INTEGER," +
                    CharacterCreatorContract.CharacterEntry.COLNAME_RACE + " TEXT," +
                    CharacterCreatorContract.CharacterEntry.COLNAME_DISCIPLINE + " TEXT" +
                    ")";

    private static final String SQL_DELETE_CHARACTERS =
            "DROP TABLE IF EXISTS " + CharacterCreatorContract.CharacterEntry.TABLENAME;

    private static final String SQL_CREATE_CHARACTER_TALENTS =
            "CREATE TABLE " + CharacterCreatorContract.CharacterTalentEntry.TABLENAME + " (" +
                    CharacterCreatorContract.CharacterTalentEntry._ID + " INTEGER PRIMARY KEY," +
                    CharacterCreatorContract.CharacterTalentEntry.COLNAME_CHARACTER + " INTEGER," +
                    CharacterCreatorContract.CharacterTalentEntry.COLNAME_TALENT + " TEXT," +
                    CharacterCreatorContract.CharacterTalentEntry.COLNAME_RANK + " INTEGER" +
                    ")";

    private static final String SQL_DELETE_CHARACTER_TALENTS =
            "DROP TABLE IF EXISTS " + CharacterCreatorContract.CharacterTalentEntry.TABLENAME;

    public CharacterCreatorDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SQL_CREATE_CHARACTERS);
        sqLiteDatabase.execSQL(SQL_CREATE_CHARACTER_TALENTS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(SQL_DELETE_CHARACTER_TALENTS);
        sqLiteDatabase.execSQL(SQL_DELETE_CHARACTERS);
        onCreate(sqLiteDatabase);
    }

    public boolean persistCharacter(SQLiteDatabase db, Character c) {
        boolean success = false;
        db.beginTransaction();
        try {
            ContentValues characterValues = new ContentValues();
            characterValues.put(CharacterEntry.COLNAME_NAME, c.getName());
            characterValues.put(CharacterEntry.COLNAME_DISCIPLINE, c.getDiscipline().getName());
            characterValues.put(CharacterEntry.COLNAME_RACE, c.getRace().getName());
            characterValues.put(CharacterEntry.COLNAME_CIRCLE, c.getCircle());
            characterValues.put(CharacterEntry.COLNAME_LPCURRENT, c.getCurrentLP());
            characterValues.put(CharacterEntry.COLNAME_LPTOTAL, c.getTotalLP());

            long newRowId = db.insertOrThrow(CharacterEntry.TABLENAME, null, characterValues);
            for (BaseDiscipline.DiscipleTalent dt : c.getTrainedTalents()) {
                ContentValues talentValues = new ContentValues();
                talentValues.put(CharacterTalentEntry.COLNAME_CHARACTER, newRowId);
                talentValues.put(CharacterTalentEntry.COLNAME_TALENT, dt.getTalent().name);
                talentValues.put(CharacterTalentEntry.COLNAME_RANK, c.getTalentRank(dt));
                db.insertOrThrow(CharacterTalentEntry.TABLENAME, null, talentValues);
            }
            db.setTransactionSuccessful();
            success = true;
        } catch (SQLiteException e) {
            Log.d("ECC_DB", e.getMessage());
        } finally {
            db.endTransaction();
        }
        return success;
    }

    public Character loadCharacter(SQLiteDatabase db, int id) {
        Character fromDb = null;
        String[] projection = {
                CharacterEntry._ID,
                CharacterEntry.COLNAME_NAME,
                CharacterEntry.COLNAME_DISCIPLINE,
                CharacterEntry.COLNAME_RACE,
                CharacterEntry.COLNAME_NAME,
                CharacterEntry.COLNAME_CIRCLE,
                CharacterEntry.COLNAME_LPCURRENT,
                CharacterEntry.COLNAME_LPTOTAL
        };

        String selection = CharacterEntry._ID + " = ?";
        String[] selectionArgs = { Integer.toString(id) };

        Cursor cursor = db.query(
                CharacterEntry.TABLENAME,
                projection,
                selection,
                selectionArgs,
                null,
                null,
                null
        );
        if(cursor.moveToNext()) {
            String discipline = cursor.getString(
                    cursor.getColumnIndex(CharacterEntry.COLNAME_DISCIPLINE)
            );
            String race = cursor.getString(
                    cursor.getColumnIndex(CharacterEntry.COLNAME_RACE)
            );
            try {
                Class<?> cD = Class.forName("it.pulzer.android.earthdawncharactercreator."+discipline);
                Constructor<?> cdCtor = cD.getConstructor(String.class);
                BaseDiscipline d = (BaseDiscipline)cdCtor.newInstance();

                Class<?> cR = Class.forName("it.pulzer.android.earthdawncharactercreator."+race);
                Constructor<?> crCtor = cR.getConstructor(String.class);
                BaseRace r = (BaseRace) crCtor.newInstance();

                String[] talentProjection = {
                        CharacterTalentEntry.COLNAME_TALENT,
                        CharacterTalentEntry.COLNAME_RANK
                };

                Cursor talentCursor = db.query(
                        CharacterTalentEntry.TABLENAME,
                        talentProjection,
                        CharacterTalentEntry.COLNAME_CHARACTER + " = ?",
                        new String[] { Integer.toString(id) },
                        null,
                        null,
                        null
                );
                HashMap<BaseDiscipline.DiscipleTalent, Integer> talents = new HashMap<>();
                while(talentCursor.moveToNext()) {
                    talents.put(
                            d.getDiscipleTalent(talentCursor.getString(
                                    talentCursor.getColumnIndex(CharacterTalentEntry.COLNAME_TALENT))
                            ),
                            talentCursor.getInt(
                                    talentCursor.getColumnIndex(CharacterTalentEntry.COLNAME_RANK)
                            )
                    );
                }
                talentCursor.close();

                fromDb = new Character(
                        cursor.getString(cursor.getColumnIndex(CharacterEntry.COLNAME_NAME)),
                        r,
                        d,
                        cursor.getInt(cursor.getColumnIndex(CharacterEntry.COLNAME_CIRCLE)),
                        cursor.getInt(cursor.getColumnIndex(CharacterEntry.COLNAME_LPCURRENT)),
                        cursor.getInt(cursor.getColumnIndex(CharacterEntry.COLNAME_LPTOTAL)),
                        talents
                );

            } catch (InstantiationException | NoSuchMethodException | IllegalAccessException |
                    ClassNotFoundException | InvocationTargetException e) {
                e.printStackTrace();
            } finally {
                cursor.close();
            }
        }
        return fromDb;
    }
}
