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

import it.pulzer.android.earthdawncharactercreator.disciplines.BaseDiscipline;

/**
 * Created by faldon on 24.07.17.
 */

public class BaseDisciplineAdapter extends ArrayAdapter<BaseDiscipline> {
    private Context ctx;
    private ArrayList<BaseDiscipline> disciplineList = new ArrayList<>();
    private int mTotalCount;

    public BaseDisciplineAdapter(Context context, int textViewResourceId, ArrayList<BaseDiscipline> disciplineList) {
        super(context, textViewResourceId, disciplineList);
        this.ctx = context;
        this.disciplineList = disciplineList;
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
        BaseDiscipline d = disciplineList.get(position);
        if(d != null) {
            TextView text1 = (TextView) v.findViewById(android.R.id.text1);
            text1.setText(
                    ctx.getResources().getString(
                            ctx.getResources().getIdentifier(
                                    d.getName(), "string", ctx.getPackageName()
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
        BaseDiscipline d = disciplineList.get(position);
        if(d != null) {
            TextView text1 = (TextView) v.findViewById(android.R.id.text1);
            text1.setText(
                    ctx.getResources().getString(
                            ctx.getResources().getIdentifier(
                                    d.getName(), "string", ctx.getPackageName()
                            )
                    )
            );
        }
        return v;
    }

    private String getDisciplineName(int position) {return disciplineList.get(position).getName();
    }

}