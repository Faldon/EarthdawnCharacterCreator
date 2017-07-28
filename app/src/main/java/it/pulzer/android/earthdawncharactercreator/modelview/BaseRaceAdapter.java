package it.pulzer.android.earthdawncharactercreator.modelview;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
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
import it.pulzer.android.earthdawncharactercreator.races.BaseRace;

/**
 * Created by faldon on 24.07.17.
 */

public class BaseRaceAdapter extends ArrayAdapter<BaseRace> {
    private Context ctx;
    private ArrayList<BaseRace> raceList = new ArrayList<>();
    private int mTotalCount;

    public BaseRaceAdapter(Context context, int textViewResourceId, ArrayList<BaseRace> raceList) {
        super(context, textViewResourceId, raceList);
        this.ctx = context;
        this.raceList = raceList;
    }

    @Override
    @NotNull
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        if(v == null)
        {
            LayoutInflater inflater = (LayoutInflater)ctx.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(android.R.layout.simple_spinner_item, parent, false);
        }
        BaseRace r = raceList.get(position);
        if(r != null) {
            TextView text1 = (TextView) v.findViewById(android.R.id.text1);
            text1.setText(
                    ctx.getResources().getString(
                            ctx.getResources().getIdentifier(
                                    r.getName(), "string", ctx.getPackageName()
                            )
                    )
            );
        }
        return v;
    }

    @Override
    public View getDropDownView(int position, View convertView, @NotNull ViewGroup parent) {
        View v = convertView;
        if(v == null)
        {
            LayoutInflater inflater = (LayoutInflater)ctx.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(android.R.layout.simple_spinner_dropdown_item, parent, false);
        }
        BaseRace r = raceList.get(position);
        if(r != null) {
            TextView text1 = (TextView) v.findViewById(android.R.id.text1);
            text1.setText(
                    ctx.getResources().getString(
                            ctx.getResources().getIdentifier(
                                    r.getName(), "string", ctx.getPackageName()
                            )
                    )
            );
        }
        return v;
    }

    private String getRaceName(int position) {
        return raceList.get(position).getName();
    }

}