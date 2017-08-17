package it.pulzer.android.earthdawncharactercreator;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

import it.pulzer.android.earthdawncharactercreator.disciplines.AirSailor;
import it.pulzer.android.earthdawncharactercreator.disciplines.Archer;
import it.pulzer.android.earthdawncharactercreator.disciplines.BaseDiscipline;
import it.pulzer.android.earthdawncharactercreator.disciplines.Beastmaster;
import it.pulzer.android.earthdawncharactercreator.disciplines.Cavalryman;
import it.pulzer.android.earthdawncharactercreator.disciplines.Elementalist;
import it.pulzer.android.earthdawncharactercreator.disciplines.Illusionist;
import it.pulzer.android.earthdawncharactercreator.disciplines.Nethermancer;
import it.pulzer.android.earthdawncharactercreator.disciplines.Scout;
import it.pulzer.android.earthdawncharactercreator.disciplines.Swordmaster;
import it.pulzer.android.earthdawncharactercreator.disciplines.Thief;
import it.pulzer.android.earthdawncharactercreator.disciplines.Troubadour;
import it.pulzer.android.earthdawncharactercreator.disciplines.Warrior;
import it.pulzer.android.earthdawncharactercreator.disciplines.Weaponsmith;
import it.pulzer.android.earthdawncharactercreator.disciplines.Wizard;
import it.pulzer.android.earthdawncharactercreator.modelview.BaseDisciplineAdapter;
import it.pulzer.android.earthdawncharactercreator.modelview.CharacterAdapter;
import it.pulzer.android.earthdawncharactercreator.modelview.BaseRaceAdapter;
import it.pulzer.android.earthdawncharactercreator.races.BaseRace;
import it.pulzer.android.earthdawncharactercreator.races.Dwarf;
import it.pulzer.android.earthdawncharactercreator.races.Elf;
import it.pulzer.android.earthdawncharactercreator.races.Human;
import it.pulzer.android.earthdawncharactercreator.races.Obsidiman;
import it.pulzer.android.earthdawncharactercreator.races.Ork;
import it.pulzer.android.earthdawncharactercreator.races.Troll;
import it.pulzer.android.earthdawncharactercreator.races.Tskrang;
import it.pulzer.android.earthdawncharactercreator.races.Windling;

public class MainActivity extends AppCompatActivity {
    public static String CHARACTER_POSITION = "CharacterPosition";
    public static ArrayList<Character> characterSet = new ArrayList<>();
    ArrayAdapter<Character> dataAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton addCharacterBtn = (FloatingActionButton) findViewById(R.id.addCharacterBtn);
        addCharacterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    builder = new AlertDialog.Builder(MainActivity.this, android.R.style.Theme_Material_Dialog_Alert);
                } else {
                    builder = new AlertDialog.Builder(MainActivity.this);
                }

                LayoutInflater li = LayoutInflater.from(getApplicationContext());
                View dialogView = li.inflate(R.layout.dialog_new_character, null);

                builder.setView(dialogView);
                final EditText input_character_name = (EditText) dialogView
                        .findViewById(R.id.input_character_name);

                final Spinner spinner_character_race = (Spinner) dialogView
                        .findViewById(R.id.spinner_character_race);
                ArrayList<BaseRace> races = new ArrayList<BaseRace>() {
                    {
                        add(new Dwarf());
                        add(new Elf());
                        add(new Human());
                        add(new Obsidiman());
                        add(new Ork());
                        add(new Troll());
                        add(new Tskrang());
                        add(new Windling());
                    }
                };
                BaseRaceAdapter raceAdapter = new BaseRaceAdapter(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_item,
                        races
                );
                raceAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner_character_race.setAdapter(raceAdapter);

                final Spinner spinner_character_discipline = (Spinner) dialogView
                        .findViewById(R.id.spinner_character_discipline);
                final ArrayList<BaseDiscipline> disciplines = new ArrayList<BaseDiscipline>() {
                    {
                        add(new AirSailor());
                        add(new Archer());
                        add(new Beastmaster());
                        add(new Cavalryman());
                        add(new Elementalist());
                        add(new Illusionist());
                        add(new Nethermancer());
                        add(new Scout());
                        add(new Swordmaster());
                        add(new Thief());
                        add(new Troubadour());
                        add(new Warrior());
                        add(new Weaponsmith());
                        add(new Wizard());
                    }
                };
                BaseDisciplineAdapter disciplineAdapter = new BaseDisciplineAdapter(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_dropdown_item,
                        disciplines
                );
                disciplineAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner_character_discipline.setAdapter(disciplineAdapter);

                builder
                        .setCancelable(false)
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        String name = input_character_name.getText().toString();
                                        BaseRace race = (BaseRace)spinner_character_race.getSelectedItem();
                                        BaseDiscipline disc = (BaseDiscipline) spinner_character_discipline.getSelectedItem();
                                        Character newCharacter = new Character(name, race, disc);
                                        newCharacter.advanceCircle();
                                        characterSet.add(newCharacter);
                                        dataAdapter.notifyDataSetChanged();

                                    }
                                })
                        .setNegativeButton("Cancel",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        dialog.cancel();
                                    }
                                })
                        .show();
            }
        });

        MainActivity.characterSet.add(new Character("Faldon", new Tskrang(), new Thief()));
        MainActivity.characterSet.add(new Character("Nenquist", new Elf(), new Swordmaster()));

        MainActivity.characterSet.get(0).advanceCircle();
        MainActivity.characterSet.get(0).advanceCircle();
        MainActivity.characterSet.get(1).advanceCircle();

        dataAdapter = new CharacterAdapter(this, 0, characterSet);
        final ListView listView = (ListView) findViewById(R.id.character_list);
        listView.setAdapter(dataAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Character c = (Character) listView.getItemAtPosition(position);
                Intent intent = new Intent(MainActivity.this, ShowCharacterActivity.class);
                intent.putExtra(MainActivity.CHARACTER_POSITION, characterSet.indexOf(c));
                startActivity(intent);
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        dataAdapter.notifyDataSetChanged();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
