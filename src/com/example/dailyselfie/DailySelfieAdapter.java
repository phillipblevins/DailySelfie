package com.example.dailyselfie;

import java.io.File;
import java.io.IOException;

import android.content.Context;
import android.database.Cursor;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;

public class DailySelfieAdapter extends CursorAdapter {


	Context mContext;
	private static String TAG = "DS-DailySelfieAdapter";
    private LayoutInflater sLayoutInflater = null;
	
	public DailySelfieAdapter(Context context, Cursor cursor) {
		super(context, cursor);

		mContext = context;
		sLayoutInflater = LayoutInflater.from(mContext);

		
	}

	@Override
	public void bindView(View arg0, Context arg1, Cursor arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public View newView(Context arg0, Cursor arg1, ViewGroup arg2) {
		// TODO Auto-generated method stub
		return null;
	}

}
