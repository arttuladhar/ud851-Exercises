package com.example.android.waitlist.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static com.example.android.waitlist.data.WaitlistContract.*;

// TODO (1) extend the SQLiteOpenHelper class
public class WaitlistDbHelper extends SQLiteOpenHelper{

    static final String DATABASE_NAME = "waitlist.db";
    static final int DATABASE_VERSION = 1;

    public WaitlistDbHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        final String SQL_CREATE_WAITLIST_TABLE = "CREATE TABLE " + WaitlistEntry.TABLE_NAME + " (" +
                WaitlistEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                WaitlistEntry.COLUMN_GUEST_NAME + " TEXT NOT NULL, " +
                WaitlistEntry.COLUMN_PARTY_SIZE + " INTEGER NOT NULL, " +
                WaitlistEntry.COLUMN_TIMESTAMP + " TIMESTAMP DEFAULT CURRENT_TIMESTAMP" +
                "); ";

        sqLiteDatabase.execSQL(SQL_CREATE_WAITLIST_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + WaitlistEntry.TABLE_NAME);
        onCreate(sqLiteDatabase);
    }

    // DONE TODO (2) Create a static final String called DATABASE_NAME and set it to "waitlist.db"

    // DONE TODO (3) Create a static final int called DATABASE_VERSION and set it to 1

    // DONE TODO (4) Create a Constructor that takes a context and calls the parent constructor

    // DONE TODO (5) Override the onCreate method

        // DONE TODO (6) Inside, create an String query called SQL_CREATE_WAITLIST_TABLE that will create the table

        // DONE TODO (7) Execute the query by calling execSQL on sqLiteDatabase and pass the string query SQL_CREATE_WAITLIST_TABLE

    // DONE TODO (8) Override the onUpgrade method

        // DONE TODO (9) Inside, execute a drop table query, and then call onCreate to re-create it

}