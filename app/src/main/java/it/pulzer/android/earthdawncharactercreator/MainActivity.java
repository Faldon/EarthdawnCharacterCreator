package it.pulzer.android.earthdawncharactercreator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import it.pulzer.android.earthdawncharactercreator.disciplines.Swordmaster;
import it.pulzer.android.earthdawncharactercreator.disciplines.Thief;
import it.pulzer.android.earthdawncharactercreator.modelview.CharacterAdapter;
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

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.addCharacterBtn);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
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
