package com.userInterface;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class AndroidInterfaceActivity extends Activity {
    /** Called when the activity is first created. */
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Spinner sexSpinner = (Spinner) findViewById(R.id.sexSpinner);
        
        // date
        Spinner daySpinner = (Spinner) findViewById(R.id.daySpinner);
        Spinner monthSpinner = (Spinner) findViewById(R.id.monthSpinner);
        Spinner yearSpinner = (Spinner) findViewById(R.id.yearSpinner);
        
        String sex[]= { "Male","Female" };  
        String day[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", 
        				"13", "14", "15", "16", "17", "18", "19", "20","21", "22", "23", 
        				"24", "25", "26", "27", "28", "29", "30", "31" };
        String month[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };
        String year[] = {"1900", "1901", "1902", "1903" };        
        
        sexSpinner.setAdapter((ArrayAdapter) new ArrayAdapter(this, android.R.layout.simple_spinner_item, sex));

        daySpinner.setAdapter((ArrayAdapter) new ArrayAdapter(this, android.R.layout.simple_spinner_item, day));
        monthSpinner.setAdapter((ArrayAdapter) new ArrayAdapter(this, android.R.layout.simple_spinner_item, month));
        yearSpinner.setAdapter((ArrayAdapter) new ArrayAdapter(this, android.R.layout.simple_spinner_item, year));       
        
    }
}