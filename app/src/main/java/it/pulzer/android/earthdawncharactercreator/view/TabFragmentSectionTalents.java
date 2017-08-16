package it.pulzer.android.earthdawncharactercreator.view;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import it.pulzer.android.earthdawncharactercreator.R;
import it.pulzer.android.earthdawncharactercreator.ShowCharacterActivity;
import it.pulzer.android.earthdawncharactercreator.disciplines.BaseDiscipline.DiscipleTalent;
import it.pulzer.android.earthdawncharactercreator.modelview.TalentAdapter;

/**
 * Created by faldon on 29.07.17.
 */

public class TabFragmentSectionTalents extends Fragment   {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_tabsection_talents, container,false);

        final ListView listView = (ListView) v.findViewById(R.id.talent_list);
        listView.setAdapter(ShowCharacterActivity.getTalentAdapter());
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                TalentAdapter dataAdapter = (TalentAdapter) adapterView.getAdapter();
                DiscipleTalent item = (DiscipleTalent)adapterView.getItemAtPosition(position);
                if(dataAdapter.isSelected(item)) {
                    dataAdapter.deselect(item);
                    view.setBackgroundColor(Color.TRANSPARENT);
                } else {
                    dataAdapter.select(item);
                    view.setBackgroundResource(R.color.colorAccent);
                }
            }
        });
        return v;
    }
}
