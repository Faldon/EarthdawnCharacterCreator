package it.pulzer.android.earthdawncharactercreator.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import it.pulzer.android.earthdawncharactercreator.Attribute;
import it.pulzer.android.earthdawncharactercreator.Character;
import it.pulzer.android.earthdawncharactercreator.R;
import it.pulzer.android.earthdawncharactercreator.ShowCharacterActivity;
import it.pulzer.android.earthdawncharactercreator.disciplines.BaseDiscipline;
import it.pulzer.android.earthdawncharactercreator.races.BaseRace;

/**
 * Created by faldon on 29.07.17.
 */

public class TabFragmentSectionTalents extends Fragment   {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_tabsection_talents, container,false);

        final ListView listView = (ListView) v.findViewById(R.id.talent_list);
        listView.setAdapter(ShowCharacterActivity.getTalentAdapter());
        return v;
    }
}
