package com.example.mods_app2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Primerpiso extends Activity implements OnClickListener {
	
    //Set up the buttons
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.primerpiso);
		
		ImageButton discoveryButton = (ImageButton) findViewById(R.id.DiscoveryButton);
		
		discoveryButton.setOnClickListener(new OnClickListener() {
	    	 
			@Override
			public void onClick(View arg0) {
				
				Intent FirstFloor = new Intent(arg0.getContext(),Discovery_spa.class);
				
				  startActivityForResult(FirstFloor, 0);
			}
 
		});
		
        ImageButton evergladesButton = (ImageButton) findViewById(R.id.evergladesButton);
		
		evergladesButton.setOnClickListener(new OnClickListener() {
	    	 
			@Override
			public void onClick(View arg0) {
				
				Intent FirstFloor = new Intent(arg0.getContext(),Everglades_spa.class);
				
				  startActivityForResult(FirstFloor, 0);
			}
 
		});
		
		
        ImageButton preButton = (ImageButton) findViewById(R.id.preHistoricButton);
		
		preButton.setOnClickListener(new OnClickListener() {
	    	 
			@Override
			public void onClick(View arg0) {
				
				Intent FirstFloor = new Intent(arg0.getContext(),PreHistoric_Spa.class);
				
				  startActivityForResult(FirstFloor, 0);
			}
 
		});
		
        ImageButton goGreenButton = (ImageButton) findViewById(R.id.goGreenButton);
		
		goGreenButton.setOnClickListener(new OnClickListener() {
	    	 
			@Override
			public void onClick(View arg0) {
				
				Intent FirstFloor = new Intent(arg0.getContext(),GoGreen_spa.class);
				
				  startActivityForResult(FirstFloor, 0);
			}
 
		});
		
        ImageButton floridaEcoButton = (ImageButton) findViewById(R.id.floridaEcoButton);
		
		floridaEcoButton.setOnClickListener(new OnClickListener() {
	    	 
			@Override
			public void onClick(View arg0) {
				
				Intent FirstFloor = new Intent(arg0.getContext(),FloridaEco_spa.class);
				
				  startActivityForResult(FirstFloor, 0);
			}
 
		});
		
        ImageButton floridaWaterButton = (ImageButton) findViewById(R.id.floridaWaterButton);
		
		floridaWaterButton.setOnClickListener(new OnClickListener() {
	    	 
			@Override
			public void onClick(View arg0) {
				
				Intent FirstFloor = new Intent(arg0.getContext(),FloridaWater_spa.class);
				
				  startActivityForResult(FirstFloor, 0);
			}
 
		});
		
        ImageButton otterButton = (ImageButton) findViewById(R.id.otterButton);
		
		otterButton.setOnClickListener(new OnClickListener() {
	    	 
			@Override
			public void onClick(View arg0) {
				
				Intent FirstFloor = new Intent(arg0.getContext(),Otter_spa.class);
				
				  startActivityForResult(FirstFloor, 0);
			}
 
		});
		
        ImageButton stormButton = (ImageButton) findViewById(R.id.stormButton);
		
		stormButton.setOnClickListener(new OnClickListener() {
	    	 
			@Override
			public void onClick(View arg0) {
				
				Intent FirstFloor = new Intent(arg0.getContext(),Storm_spa.class);
				
				  startActivityForResult(FirstFloor, 0);
			}
 
		});
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
}