package com.example.contentprovider;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;


public class MyDBhelper extends SQLiteOpenHelper {

    public MyDBhelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, "wmyDB", null, version);
        Log.d("wmy","MyDBhelper is running....");
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table student(" +
                "id integer primary key AUTOINCREMENT,name varchar(20),age integer,sex varchar(20) )");
        Log.d("wmy","onCreate is running....");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

}

