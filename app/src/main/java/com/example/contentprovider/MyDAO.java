package com.example.contentprovider;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;

public class MyDAO {
    private SQLiteDatabase database;
    Context context;

    public MyDAO(Context context)
    {
        MyDBhelper dBhelper=new MyDBhelper(context,"wmyDB",null,1);
        this.context=context;
        database=dBhelper.getWritableDatabase();

    }



    public Uri wmyInsert(ContentValues contentValues){
        ContentValues values=new ContentValues();
        values.put("name","雨曦");
        values.put("age",20);
        values.put("sex","女");
        Uri uri=Uri.parse("content://wmy.Provider2/student");

      long id=database.insert("student",null,contentValues);
        Uri  inserturi=ContentUris.withAppendedId(uri,id);
        context.getContentResolver().notifyChange(inserturi,null);
        return inserturi;
    }





}
