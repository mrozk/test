package com.example.maps;

import android.os.Bundle;
import android.view.Menu;

import android.support.v4.app.FragmentActivity;

public class MainActivity extends FragmentActivity
{
    @Override
    protected void onCreate(Bundle arg0) 
    {	
    	super.onCreate(arg0);
        setContentView(R.layout.activity_main);
       
    }
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
