package com.example.mods_app2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class SecondFloor extends Activity implements OnClickListener {
	
    //Set up the buttons
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.secondfloor_screen);
		
        ImageButton aviationButton = (ImageButton) findViewById(R.id.AviationButton);
		
		aviationButton.setOnClickListener(new OnClickListener() {
	    	 
			@Override
			public void onClick(View arg0) {
				
				Intent FirstFloor = new Intent(arg0.getContext(),Aviation.class);
				
				  startActivityForResult(FirstFloor, 0);
			}
 
		});
		
        ImageButton dinosaurButton = (ImageButton) findViewById(R.id.dinosaurButton1);
		
		dinosaurButton.setOnClickListener(new OnClickListener() {
	    	 
			@Override
			public void onClick(View arg0) {
				
				Intent FirstFloor = new Intent(arg0.getContext(),Dinosaur.class);
				
				  startActivityForResult(FirstFloor, 0);
			}
 
		});
		
        ImageButton powerfulButton = (ImageButton) findViewById(R.id.powerfulButton);
		
		powerfulButton.setOnClickListener(new OnClickListener() {
	    	 
			@Override
			public void onClick(View arg0) {
				
				Intent FirstFloor = new Intent(arg0.getContext(),Powerful.class);
				
				  startActivityForResult(FirstFloor, 0);
			}
 
		});
		
        ImageButton gooseBumpsButton = (ImageButton) findViewById(R.id.gooseBumpsButton);
		
		gooseBumpsButton.setOnClickListener(new OnClickListener() {
	    	 
			@Override
			public void onClick(View arg0) {
				
				Intent FirstFloor = new Intent(arg0.getContext(),GooseBumps.class);
				
				  startActivityForResult(FirstFloor, 0);
			}
 
		});
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
}