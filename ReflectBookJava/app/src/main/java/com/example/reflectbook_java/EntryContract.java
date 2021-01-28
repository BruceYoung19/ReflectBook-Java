package com.example.reflectbook_java;

import android.provider.BaseColumns;

public class EntryContract {

    public EntryContract(){

    }

    public static final class EntryContact implements BaseColumns {
        public static String TABLE_NAME = "EntryList";
        public static String COLUMN_ID = "ID";
        public static String COLUMN_MOOD = "Mood";
        public static String COLUMN_Date = "Date";
        public static String COLUMN_ENTRY_TEXT = "EntryText";
        // TODO: 21/01/21  add more colmun
    }

}
