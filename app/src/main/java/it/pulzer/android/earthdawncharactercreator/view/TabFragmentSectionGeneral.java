package it.pulzer.android.earthdawncharactercreator.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import it.pulzer.android.earthdawncharactercreator.model.Attribute;
import it.pulzer.android.earthdawncharactercreator.model.Character;
import it.pulzer.android.earthdawncharactercreator.R;
import it.pulzer.android.earthdawncharactercreator.ShowCharacterActivity;
import it.pulzer.android.earthdawncharactercreator.disciplines.BaseDiscipline;
import it.pulzer.android.earthdawncharactercreator.races.BaseRace;

/**
 * Created by faldon on 29.07.17.
 */

public class TabFragmentSectionGeneral extends Fragment   {

    TextView charCircle;
    Character currentCharacter;
    BaseRace currentRace;
    BaseDiscipline currentDiscipline;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_tabsection_general, container,false);

        currentCharacter = ShowCharacterActivity.getDepictedCharacter();
        currentRace = currentCharacter.getRace();
        currentDiscipline = currentCharacter.getDiscipline();

        //region General Character data
        TextView charName = (TextView) v.findViewById(R.id.tab_general_charactername);
        charName.setText(currentCharacter.getName());

        TextView charDiscipline = (TextView) v.findViewById(R.id.tab_general_discipline);
        charDiscipline.setText(currentDiscipline.getName());

        charCircle = (TextView) v.findViewById(R.id.tab_general_circle);
        charCircle.setText(String.format("%d", currentCharacter.getCircle()));
        //endregion

        //region Attribute data
        TextView attrDEX = (TextView) v.findViewById((R.id.tab_general_dex));
        int dexVal = currentRace.getAttribute(Attribute.DEX).currentValue;
        int dexStep = currentRace.getStep(dexVal);
        
        attrDEX.setText(String.format("%d (%d)", dexVal, dexStep));

        TextView attrSTR = (TextView) v.findViewById((R.id.tab_general_str));
        int strVal = currentRace.getAttribute(Attribute.STR).currentValue;
        int strStep = currentRace.getStep(strVal);

        attrSTR.setText(String.format("%d (%d)", strVal, strStep));

        TextView attrTOU = (TextView) v.findViewById((R.id.tab_general_tou));
        int touVal = currentRace.getAttribute(Attribute.TOU).currentValue;
        int touStep = currentRace.getStep(touVal);

        attrTOU.setText(String.format("%d (%d)", touVal, touStep));

        TextView attrPER = (TextView) v.findViewById((R.id.tab_general_per));
        int perVal = currentRace.getAttribute(Attribute.PER).currentValue;
        int perStep = currentRace.getStep(perVal);

        attrPER.setText(String.format("%d (%d)", perVal, perStep));

        TextView attrWIL = (TextView) v.findViewById((R.id.tab_general_wil));
        int wilVal = currentRace.getAttribute(Attribute.WIL).currentValue;
        int wilStep = currentRace.getStep(wilVal);

        attrWIL.setText(String.format("%d (%d)", wilVal, wilStep));

        TextView attrCHA = (TextView) v.findViewById((R.id.tab_general_cha));
        int chaVal = currentRace.getAttribute(Attribute.CHA).currentValue;
        int chaStep = currentRace.getStep(chaVal);

        attrCHA.setText(String.format("%d (%d)", chaVal, chaStep));
        //endregion

        //region Defense and Threshold data
        TextView wtVal = (TextView) v.findViewById(R.id.wt_value);
        int wt = currentCharacter.getWoundThreshold();
        wtVal.setText(String.format("%d", wt));

        TextView utVal = (TextView) v.findViewById(R.id.ut_value);
        int ut = currentCharacter.getUnconsciousThreshold();
        utVal.setText(String.format("%d", ut));

        TextView dtVal = (TextView) v.findViewById(R.id.dt_value);
        int dt = currentCharacter.getDeathThreshold();
        dtVal.setText(String.format("%d", dt));
        
        TextView pdVal = (TextView) v.findViewById(R.id.pd_value);
        int pd = currentCharacter.getPhysicalDefense();
        pdVal.setText(String.format("%d", pd));

        TextView mdVal = (TextView) v.findViewById(R.id.md_value);
        int md = currentCharacter.getMysticalDefense();
        mdVal.setText(String.format("%d", md));

        TextView sdVal = (TextView) v.findViewById(R.id.sd_value);
        int sd = currentCharacter.getSocialDefense();
        sdVal.setText(String.format("%d", sd));
        //endregion

        //region Armor data
        TextView paVal = (TextView) v.findViewById(R.id.pa_value);
        int pa = currentCharacter.getPhysicalArmor();
        paVal.setText(String.format("%d", pa));

        TextView maVal = (TextView) v.findViewById(R.id.ma_value);
        int ma = currentCharacter.getMysticalArmor();
        maVal.setText(String.format("%d", ma));
        //endregion

        //region Initiative and Recovery
        TextView initiativeVal = (TextView) v.findViewById(R.id.initiative_value);
        int initiative = currentCharacter.getInitiative();
        initiativeVal.setText(String.format("%d", initiative));

        TextView rcVal = (TextView) v.findViewById(R.id.rc_value);
        int rc = currentCharacter.getRecoveryCount();
        rcVal.setText(String.format("%d", rc));
        //endregion

        //region Movement and Carrying
        TextView carryVal = (TextView) v.findViewById(R.id.cc_value);
        int carry = currentCharacter.getCarryCapacity();
        carryVal.setText(String.format("%d", carry));

        TextView liftVal = (TextView) v.findViewById(R.id.ll_value);
        int lift = currentCharacter.getLiftingLimit();
        liftVal.setText(String.format("%d", lift));

        TextView moveVal = (TextView) v.findViewById(R.id.mr_value);
        int move = currentCharacter.getMovementRate();
        moveVal.setText(String.format("%d", move));
        //endregion

        return v;
    }

    public void setCharacterCircle() {
        charCircle.setText(String.format("%d", currentCharacter.getCircle()));
    }
}
