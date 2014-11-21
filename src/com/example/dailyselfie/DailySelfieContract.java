package com.example.dailyselfie;

public final class DailySelfieContract {

	
	public static final String TABLE_NAME = "SELFIE";

	public static final String _ID = "_id";
	public static final String SELFIE_BITMAP_PATH = "selfieBitmapPath";
	public static final String TAKEN_DATE_TIME = "takenDateTime";
	
	
	
	private static final String TEXT_TYPE = " TEXT";
	private static final String COMMA_SEP = ",";
	public static final String SQL_CREATE_ENTRIES =
	    "CREATE TABLE " + TABLE_NAME + " (" +
	    _ID + " INTEGER PRIMARY KEY," +
	    SELFIE_BITMAP_PATH + TEXT_TYPE + COMMA_SEP +
	    TAKEN_DATE_TIME + TEXT_TYPE + " )";

	public static final String SQL_DELETE_ENTRIES =
	    "DROP TABLE IF EXISTS " + TABLE_NAME;
}
