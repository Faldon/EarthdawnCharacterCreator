package it.pulzer.android.earthdawncharactercreator;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;
import it.pulzer.android.earthdawncharactercreator.disciplines.BaseDiscipline.DiscipleTalent;
import it.pulzer.android.earthdawncharactercreator.model.Character;
import it.pulzer.android.earthdawncharactercreator.modelview.TalentAdapter;
import it.pulzer.android.earthdawncharactercreator.view.TabFragmentSectionGeneral;
import it.pulzer.android.earthdawncharactercreator.view.TabFragmentSectionTalents;

public class ShowCharacterActivity extends AppCompatActivity {

    private static Character c;
    private static ArrayList<DiscipleTalent> talentSet;
    private static ArrayAdapter<DiscipleTalent> talentAdapter;

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_character);

        Intent intent = getIntent();
        int position = intent.getIntExtra(MainActivity.CHARACTER_POSITION, 0);
        ShowCharacterActivity.c = MainActivity.characterSet.get(position);
        ShowCharacterActivity.talentSet = ShowCharacterActivity.c.getTrainedTalents();
        ShowCharacterActivity.talentAdapter = new TalentAdapter(this, 0, ShowCharacterActivity.talentSet);

        this.setTitle(c.getName() + " - " + c.getDiscipline().getName());

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.addTab(tabLayout.newTab().setText(R.string.tab_general));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.tab_talents));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);

        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(
                getSupportFragmentManager(), tabLayout.getTabCount()
        );

        mViewPager.setAdapter(mSectionsPagerAdapter);

        tabLayout.setupWithViewPager(mViewPager);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_show_character, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_advancecircle) {
            if(c.canAdvanceCircle()) {
                c.advanceCircle();
                ((TalentAdapter)talentAdapter).setTalentList(c.getTrainedTalents());
                ((TabFragmentSectionGeneral)mSectionsPagerAdapter.generalTab).setCharacterCircle();
                mSectionsPagerAdapter.notifyDataSetChanged();
            } else {
                AlertDialog.Builder builder;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    builder = new AlertDialog.Builder(ShowCharacterActivity.this, android.R.style.Theme_Material_Dialog_Alert);
                } else {
                    builder = new AlertDialog.Builder(ShowCharacterActivity.this);
                }
                builder
                        .setMessage(R.string.dialog_cannot_advance)
                        .setCancelable(false)
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        dialog.dismiss();
                                    }
                                })
                        .show();
            }
            return true;
        }
        if (id == R.id.action_improvetalentranks) {
            for(DiscipleTalent dt : ((TalentAdapter) talentAdapter).getSelectedItems()) {
                c.improveTalentRank(dt);
            }
            talentAdapter.notifyDataSetChanged();
            return true;
        }
        if (id == R.id.action_reducetalentranks) {
            for(DiscipleTalent dt : ((TalentAdapter) talentAdapter).getSelectedItems()) {
                c.reduceTalentRank(dt);
            }
            talentAdapter.notifyDataSetChanged();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @NotNull
    public static Character getDepictedCharacter() {
        return ShowCharacterActivity.c;
    }

    public static ArrayAdapter<DiscipleTalent> getTalentAdapter() {
        return ShowCharacterActivity.talentAdapter;
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_show_character, container, false);
            TextView textView = (TextView) rootView.findViewById(R.id.section_label);
            textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
            return rootView;
        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {
        int mNumOfTabs;
        Fragment generalTab;
        Fragment talentsTab;

        public SectionsPagerAdapter(FragmentManager fm, int numOfTabs) {
            super(fm);
            this.mNumOfTabs = numOfTabs;
            generalTab = new TabFragmentSectionGeneral();
            talentsTab = new TabFragmentSectionTalents();

        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return generalTab;
                case 1:
                    return talentsTab;
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return mNumOfTabs;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch(position) {
                case 0:
                    return getString(R.string.tab_general);
                case 1:
                    return getString(R.string.tab_talents);
                default:
                    return null;
            }
        }
    }
}
