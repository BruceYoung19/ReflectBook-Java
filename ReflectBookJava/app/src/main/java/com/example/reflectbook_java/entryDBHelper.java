package com.example.reflectbook_java;

import android.content.Context;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class entryDBHelper extends SQLiteOpenHelper{

    public static final String DATABASE_NAME = "EntryList.db";
    public static final int DATABASE_VERSION = 1 ;

    public entryDBHelper(Context content){
    super(content,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
