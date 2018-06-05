package com.example.android.pets.data;

import android.provider.BaseColumns;

public final class PetContract {
    public static abstract class PetEntry implements BaseColumns {

        public static final String _ID = BaseColumns._ID;
        public static final String NAME = "name";
        public static final String BREED = "breed";
        public static final String GENDER = "gender";
        public static final String WEIGHT = "weight";

        /**
         * Possible values for the genders.
         */
        public static final int Unknown = 0;
        public static final int Male = 1;
        public static final int Female = 2;
    }
}
