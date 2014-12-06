package com.example.mods_app2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class FirstFloor extends Activity implements OnClickListener {
	
    //Set up the buttons
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.firstfloor_screen);
		
		ImageButton discoveryButton = (ImageButton) findViewById(R.id.DiscoveryButton);
		
		discoveryButton.setOnClickListener(new OnClickListener() {
	    	 
			@Override
			public void onClick(View arg0) {
				
				Intent FirstFloor = new Intent(arg0.getContext(),Discovery.class);
				
				  startActivityForResult(FirstFloor, 0);
			}
 
		});
		
        ImageButton evergladesButton = (ImageButton) findViewById(R.id.evergladesButton);
		
		evergladesButton.setOnClickListener(new OnClickListener() {
	    	 
			@Override
			public void onClick(View arg0) {
				
				Intent FirstFloor = new Intent(arg0.getContext(),Everglades.class);
				
				  startActivityForResult(FirstFloor, 0);
			}
 
		});
		
		
        ImageButton preButton = (ImageButton) findViewById(R.id.preHistoricButton);
		
		preButton.setOnClickListener(new OnClickListener() {
	    	 
			@Override
			public void onClick(View arg0) {
				
				Intent FirstFloor = new Intent(arg0.getContext(),PreHistoric.class);
				
				  startActivityForResult(FirstFloor, 0);
			}
 
		});
		
        ImageButton goGreenButton = (ImageButton) findViewById(R.id.goGreenButton);
		
		goGreenButton.setOnClickListener(new OnClickListener() {
	    	 
			@Override
			public void onClick(View arg0) {
				
				Intent FirstFloor = new Intent(arg0.getContext(),GoGreen.class);
				
				  startActivityForResult(FirstFloor, 0);
			}
 
		});
		
        ImageButton floridaEcoButton = (ImageButton) findViewById(R.id.floridaEcoButton);
		
		floridaEcoButton.setOnClickListener(new OnClickListener() {
	    	 
			@Override
			public void onClick(View arg0) {
				
				Intent FirstFloor = new Intent(arg0.getContext(),FloridaEco.class);
				
				  startActivityForResult(FirstFloor, 0);
			}
 
		});
		
        ImageButton floridaWaterButton = (ImageButton) findViewById(R.id.floridaWaterButton);
		
		floridaWaterButton.setOnClickListener(new OnClickListener() {
	    	 
			@Override
			public void onClick(View arg0) {
				
				Intent FirstFloor = new Intent(arg0.getContext(),FloridaWater.class);
				
				  startActivityForResult(FirstFloor, 0);
			}
 
		});
		
        ImageButton otterButton = (ImageButton) findViewById(R.id.otterButton);
		
		otterButton.setOnClickListener(new OnClickListener() {
	    	 
			@Override
			public void onClick(View arg0) {
				
				Intent FirstFloor = new Intent(arg0.getContext(),Otter.class);
				
				  startActivityForResult(FirstFloor, 0);
			}
 
		});
		
        ImageButton stormButton = (ImageButton) findViewById(R.id.stormButton);
		
		stormButton.setOnClickListener(new OnClickListener() {
	    	 
			@Override
			public void onClick(View arg0) {
				
				Intent FirstFloor = new Intent(arg0.getContext(),Storm.class);
				
				  startActivityForResult(FirstFloor, 0);
			}
 
		});
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
}