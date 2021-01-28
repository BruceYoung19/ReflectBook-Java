package com.example.reflectbook_java;

import android.content.Context;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.reflectbook_java.EntryContract.*;

public class entryDBHelper extends SQLiteOpenHelper{

    public static final String DATABASE_NAME = "EntryList.db";
    public static final int DATABASE_VERSION = 1 ;

    public entryDBHelper(Context content){
    super(content,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        final String SQL_CREATE_ENTRYLIST_TABLE= "CREATE TABLE " +
                EntryContact.TABLE_NAME + " ( " +
                EntryContact._ID + "INTEGER PRIMARY KEY AUTOINCREMENT, " +
                EntryContact.COLUMN_ID + " TEXT NOT NULL , " +
                EntryContact.COLUMN_Date + "TIMESTAMP DEFAULT CURRENT_TIMESTAMP, " +
                EntryContact.COLUMN_MOOD +  " TEXT NOT NULL, " +
                EntryContact.COLUMN_ENTRY_TEXT + " TEXT NOT NULL" +
                " );" ;
        db.execSQL(SQL_CREATE_ENTRYLIST_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + EntryContact.TABLE_NAME);
        onCreate(db);
    }
}
