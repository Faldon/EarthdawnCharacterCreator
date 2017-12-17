package it.pulzer.android.earthdawncharactercreator;

import android.provider.BaseColumns;

/**
 * Created by faldon on 04.09.17.
 */

public final class CharacterCreatorContract {
    
    private CharacterCreatorContract() {}

    public static class CharacterEntry implements BaseColumns {
        public static final String TABLENAME = "characters";
        public static final String COLNAME_NAME = "name";
        public static final String COLNAME_CIRCLE = "circle";
        public static final String COLNAME_LPCURRENT = "lp_current";
        public static final String COLNAME_LPTOTAL = "lp_total";
        public static final String COLNAME_RACE = "race";
        public static final String COLNAME_DISCIPLINE = "discipline";
    }

    public static class CharacterTalentEntry implements BaseColumns {
        public static final String TABLENAME = "character_talents";
        public static final String COLNAME_CHARACTER = "character";
        public static final String COLNAME_TALENT = "talent";
        public static final String COLNAME_RANK = "rank";
    }
}
