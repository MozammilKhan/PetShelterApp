package com.example.android.pets.data;

import android.provider.BaseColumns;

public final class PetContract {
    public static abstract class PetEntry implements BaseColumns {
        public final static String TABLE_NAME = "pets";
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_BREED = "breed";
        public static final String COLUMN_PET_GENDER = "gender";
        public static final String COLUMN_PET_WEIGHT = "weight";

        /**
         * Possible values for the genders.
         */
        public static final int GENDER_Unknown = 0;
        public static final int GENDER_Male = 1;
        public static final int GENDER_Female = 2;
    }
}
