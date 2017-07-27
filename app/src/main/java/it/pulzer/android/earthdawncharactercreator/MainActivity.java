package it.pulzer.android.earthdawncharactercreator;

import android.app.AlertDialog;
import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

import it.pulzer.android.earthdawncharactercreator.disciplines.BaseDiscipline;
import it.pulzer.android.earthdawncharactercreator.disciplines.Swordmaster;
import it.pulzer.android.earthdawncharactercreator.disciplines.Thief;
import it.pulzer.android.earthdawncharactercreator.modelview.CharacterAdapter;
import it.pulzer.android.earthdawncharactercreator.races.BaseRace;
import it.pulzer.android.earthdawncharactercreator.races.Elf;
import it.pulzer.android.earthdawncharactercreator.races.Tskrang;

public class MainActivity extends AppCompatActivity {
    ArrayList<Character> characterSet = new ArrayList<>();

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
                // get prompts.xml view
                LayoutInflater li = LayoutInflater.from(getApplicationContext());
                View dialogView = li.inflate(R.layout.dialog_new_character, null);

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getApplicationContext());

                // set prompts.xml to alertdialog builder
                alertDialogBuilder.setView(dialogView);

                final EditText input_character_name = (EditText) dialogView
                        .findViewById(R.id.input_character_name);

                final Spinner spinner_character_race = (Spinner) dialogView
                        .findViewById(R.id.spinner_character_race);
                String[] races = new String[]{
                        "Elf",
                        "Tskrang"
                };
                ArrayAdapter<String> raceAdapter = new ArrayAdapter<String>(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_dropdown_item,
                        races
                );
                spinner_character_race.setAdapter(raceAdapter);

                final Spinner spinner_character_discipline = (Spinner) dialogView
                        .findViewById(R.id.spinner_character_discipline);
                String[] disciplines = new String[]{
                        "Thief",
                        "Swordmaster"
                };
                ArrayAdapter<String> disciplineAdapter = new ArrayAdapter<String>(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_dropdown_item,
                        disciplines
                );
                spinner_character_discipline.setAdapter(disciplineAdapter);

                // set dialog message
                alertDialogBuilder
                        .setCancelable(false)
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        // get user input and set it to result
                                        // edit text
                                        String name = input_character_name.getText().toString();
//                                        BaseRace race = (BaseRace)spinner_character_race.getSelectedItem();
//                                        BaseDiscipline disc = (BaseDiscipline) spinner_character_discipline.getSelectedItem();
//                                        Character newCharacter = new Character(name, race, disc);
//                                        characterSet.add(newCharacter);
                                    }
                                })
                        .setNegativeButton("Cancel",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        dialog.cancel();
                                    }
                                });

                // create alert dialog
                AlertDialog alertDialog = alertDialogBuilder.create();

                // show it
                alertDialog.show();

//            }
                //startActivity(new Intent(MainActivity.this,ShowCharacterActivity.class));
            }
        });

        characterSet.add(new Character("Faldon", new Tskrang(), new Thief()));
        characterSet.add(new Character("Nenquist", new Elf(), new Swordmaster()));

        characterSet.get(0).advanceCircle();
        characterSet.get(0).advanceCircle();
        characterSet.get(1).advanceCircle();

        ArrayAdapter<Character> dataAdapter = new CharacterAdapter(this, 0, characterSet);
        ListView listView = (ListView) findViewById(R.id.character_list);
        listView.setAdapter(dataAdapter);
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
