package com.example.student;

public class VariableDeclare {

    public static final int  DB_VERSION=1;
    public static final String  DB_NAME="Student.db";
    public static final String  TABLE_NAME1="First Table";
    public static final String  TABLE_NAME2="Second Table";
    public static final String _ID ="Id";
    public static final String NAME ="Name";
    public static final String  ROLL ="Roll";
    public static final String  SEMESTER ="Semester";
    //public static String CREATE_TABLE1="CREATE TABLE  "+TABLE_NAME1+" ("+_ID+" INTEGER PRIMARY KEY AUTOINCREMENT,"+NAME+" TEXT, "+ROLL+" TEXT, "+SEMESTER+" TEXT) ";
    //public static String CREATE_TABLE2="CREATE TABLE  "+TABLE_NAME2+" ("+_ID+" INTEGER PRIMARY KEY AUTOINCREMENT,"+NAME+" TEXT, "+ROLL+" TEXT, "+SEMESTER+" TEXT) ";

     public static String CREATE_TABLE1 ="CREATE TABLE "+TABLE_NAME1+"("
            +_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "
            +NAME+" TEXT, "
            +ROLL+" TEXT, "
            +SEMESTER+ " TEXT"
            +")";

    public static String CREATE_TABLE2 ="CREATE TABLE "+TABLE_NAME2+"("
            +_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "
            +NAME+" TEXT, "
            +ROLL+" TEXT, "
            +SEMESTER+ " TEXT"
            +")";
}
