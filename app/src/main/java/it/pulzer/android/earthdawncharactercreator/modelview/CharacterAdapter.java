package it.pulzer.android.earthdawncharactercreator.modelview;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import it.pulzer.android.earthdawncharactercreator.Character;
import it.pulzer.android.earthdawncharactercreator.R;

/**
 * Created by faldon on 24.07.17.
 */

public class CharacterAdapter extends ArrayAdapter<Character> {
    private Context ctx;
    private ArrayList<Character> characterList = new ArrayList<>();
    private int mTotalCount;

    public CharacterAdapter(Context context, int textViewResourceId, ArrayList<Character> characterList) {
        super(context, textViewResourceId, characterList);
        this.ctx = context;
        this.characterList = characterList;
    }

    @Override
    @NotNull
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater vi = (LayoutInflater)ctx.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            v = vi.inflate(R.layout.character_dataview, null);
        }
        Character c = characterList.get(position);
        if (c != null) {
            TextView character_name = (TextView) v.findViewById(R.id.character_name);
            character_name.setText(c.getName());
            TextView character_discipline = (TextView) v.findViewById(R.id.character_discipline);
            character_discipline.setText(c.getDiscipline().getName());
            TextView character_circle = (TextView) v.findViewById(R.id.character_circle);
            character_circle.setText(Integer.toString(c.getCircle()));
        }
        return v;
    }
}