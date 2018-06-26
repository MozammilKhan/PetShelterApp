package com.example.android.pets.data;

import android.net.Uri;
import android.provider.BaseColumns;

import java.net.URI;

public final class PetContract {

    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private PetContract() {
    }

    //name for the content provider, guaranteed to be unique on the device
    public static final String CONTENT_AUTHORITY = "com.example.android.pets";
    //base of all uri's
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
    //possible path for the provider, ex.: content://com.example.android.pets/pets/ is a valid path
    public static final String PATH_PETS = "pets";


    public static abstract class PetEntry implements BaseColumns {
        //The content URI to access the pet data in the provider
        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_PETS);

        public final static String TABLE_NAME = "pets";
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_BREED = "breed";
        public static final String COLUMN_PET_GENDER = "gender";
        public static final String COLUMN_PET_WEIGHT = "weight";

        /**
         * Possible values for the genders.
         */
        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;

    }

}
