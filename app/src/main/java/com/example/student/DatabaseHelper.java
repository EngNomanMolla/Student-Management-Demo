package com.example.student;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    Context context;
    public long Id;
    public DatabaseHelper(@Nullable Context context) {
        super(context, VariableDeclare.DB_NAME, null, VariableDeclare.DB_VERSION);
        this.context=context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(VariableDeclare.CREATE_TABLE1);
        db.execSQL(VariableDeclare.CREATE_TABLE2);
        Toast.makeText(context, "Create", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ VariableDeclare.TABLE_NAME1);
        db.execSQL("DROP TABLE IF EXISTS "+ VariableDeclare.TABLE_NAME2);

        onCreate(db);

    }
    public long InsertData(ModelClass modelClass){
        SQLiteDatabase sqLiteDatabase=getWritableDatabase();
        ContentValues contentValues=new ContentValues();
         if(modelClass.getSemester()=="1st"){
        contentValues.put(VariableDeclare.NAME,modelClass.getName());
        contentValues.put(VariableDeclare.ROLL,modelClass.getRoll());
        contentValues.put(VariableDeclare.SEMESTER,modelClass.getSemester());
        long id= sqLiteDatabase.insert(VariableDeclare.TABLE_NAME1,null,contentValues);
        Id=id;

         }
         if(modelClass.getSemester()=="2nd"){
             contentValues.put(VariableDeclare.NAME,modelClass.getName());
             contentValues.put(VariableDeclare.ROLL,modelClass.getRoll());
             contentValues.put(VariableDeclare.SEMESTER,modelClass.getSemester());
             long id= sqLiteDatabase.insert(VariableDeclare.TABLE_NAME2,null,contentValues);
             Id=id;
         }
        return Id;



    }
}
