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

import it.pulzer.android.earthdawncharactercreator.R;
import it.pulzer.android.earthdawncharactercreator.ShowCharacterActivity;
import it.pulzer.android.earthdawncharactercreator.StepTable;
import it.pulzer.android.earthdawncharactercreator.disciplines.BaseDiscipline.DiscipleTalent;

/**
 * Created by faldon on 24.07.17.
 */

public class TalentAdapter extends ArrayAdapter<DiscipleTalent> {
    private Context ctx;
    private ArrayList<DiscipleTalent> talentList = new ArrayList<>();
    private ArrayList<DiscipleTalent> selectedItems = new ArrayList<>();
    private int mTotalCount;

    public TalentAdapter(Context context, int textViewResourceId, ArrayList<DiscipleTalent> talentList) {
        super(context, textViewResourceId, talentList);
        this.ctx = context;
        this.talentList = talentList;
    }

    @Override
    @NotNull
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater vi = (LayoutInflater)ctx.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            v = vi.inflate(R.layout.dataview_talent, null);
        }

        DiscipleTalent t = talentList.get(position);
        if (t != null) {
            TextView talent_name = (TextView) v.findViewById(R.id.talent_name);
            talent_name.setText(getTalentName(position));
            TextView talent_rank = (TextView) v.findViewById(R.id.talent_rank);
            talent_rank.setText(getTalentRank(position));
            TextView talent_attribute = (TextView) v.findViewById(R.id.talent_attribute);
            talent_attribute.setText(getTalentAttribute(position));
            TextView talent_dice = (TextView) v.findViewById(R.id.talent_dice);
            talent_dice.setText(getTalentDice(position));
            TextView talent_disciple = (TextView) v.findViewById(R.id.talent_disciple);
            talent_disciple.setText(getIsDisciplineTalent(position));
            TextView talent_action = (TextView) v.findViewById(R.id.talent_action);
            talent_action.setText(getTalentAction(position));
            TextView talent_strain = (TextView) v.findViewById(R.id.talent_strain);
            talent_strain.setText(getTalentStrain(position));
        }
        return v;
    }

    @NonNull
    private String getTalentName(int position) {
        return ctx.getString(ctx.getResources().getIdentifier(
                talentList.get(position).getTalent().name.replace(" ", "_"),
                "string",
                ctx.getPackageName()
        ));
    }

    private String getTalentRank(int position) {
        return Integer.toString(
                ShowCharacterActivity.getDepictedCharacter().getTalentRank(talentList.get(position))
        );
    }

    @NonNull
    private String getTalentAttribute(int position) {
        return ctx.getString(ctx.getResources().getIdentifier(
                talentList.get(position).getTalent().baseAttribute,
                "string",
                ctx.getPackageName()
        ));
    }

    private String getTalentDice(int position) {
        int attrStep = ShowCharacterActivity.getDepictedCharacter().getRace().getStep(
                ShowCharacterActivity.getDepictedCharacter().getRace().getAttribute(
                        talentList.get(position).getTalent().baseAttribute
                        ).currentValue
        );
        int talentRank = ShowCharacterActivity.getDepictedCharacter().getTalentRank(
                talentList.get(position)
        );
        return StepTable.GetActionDice(attrStep + talentRank);
    }

    @NonNull
    private String getIsDisciplineTalent(int position) {
        if(talentList.get(position).isDiscipline()) {
            return ctx.getString(R.string.yes);
        }
        return ctx.getString(R.string.no);
    }

    @NonNull
    private String getTalentAction(int position) {
        return ctx.getString(ctx.getResources().getIdentifier(
                talentList.get(position).getTalent().action.replace(" ", "_"),
                "string",
                ctx.getPackageName()
        ));
    }

    private String getTalentStrain(int position) {
        return Integer.toString(talentList.get(position).getTalent().strain);
    }

    public void select(DiscipleTalent item) {
        selectedItems.add(item);
    }

    public void deselect(DiscipleTalent item) {
        selectedItems.remove(item);
    }

    public boolean isSelected(DiscipleTalent item) {
        return selectedItems.contains(item);
    }

    public ArrayList<DiscipleTalent> getSelectedItems() {
        return selectedItems;
    }
}