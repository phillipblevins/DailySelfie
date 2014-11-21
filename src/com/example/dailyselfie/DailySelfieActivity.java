package com.example.dailyselfie;


import course.labs.contentproviderlab.PlaceViewAdapter;
import android.app.ListActivity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class DailySelfieActivity extends ListActivity  {
	private static String TAG = "DS-DailySelfieActivity";
	private DailySelfieAdapter mCursorAdapter;
	
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.i(TAG, "entered onCreate");		
		super.onCreate(savedInstanceState);
		DailySelfieDbHelper mDbHelper = new DailySelfieDbHelper(this);
		
		SQLiteDatabase db = mDbHelper.getReadableDatabase();
		Cursor c= db.rawQuery("SELECT * FROM " + DailySelfieContract.TABLE_NAME, null); 
		StartManagingCursor(c);
		
		
		mCursorAdapter = new DailySelfieAdapter(getApplicationContext(),null,0);
		setListAdapter(mCursorAdapter);
		
		
		Log.i(TAG, "Leaving onCreate");	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.daily_selfie, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
			
		}
		return super.onOptionsItemSelected(item);
	}
}
