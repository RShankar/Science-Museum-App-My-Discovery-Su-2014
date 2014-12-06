package com.example.mods_app2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MainActivity_Spanish extends Activity implements OnClickListener {
	
    //Set up the buttons
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main_spanish);
		
		View exposicionesButton = findViewById(R.id.exposicionesButton);
	    exposicionesButton.setOnClickListener(this);
	    
	    View parkingButton1 = findViewById(R.id.button1);
	    parkingButton1.setOnClickListener(this);
	    
	    ImageButton gameButton1 = (ImageButton) findViewById(R.id.imageButton1);
	    ImageButton aboutButton1 = (ImageButton) findViewById(R.id.imageButton2);
	    ImageButton exitButton1 = (ImageButton) findViewById(R.id.imageButton3);
	    
	    
	    gameButton1.setOnClickListener(new OnClickListener() {
	    	 
			@Override
			public void onClick(View arg0) {
				
			    	  Intent LaunchIntent = 
			    	  getPackageManager().getLaunchIntentForPackage("processing.test.manateemania");
			    	  startActivity(LaunchIntent);
			}
 
		});
	    
	    aboutButton1.setOnClickListener(new OnClickListener() {
	    	public void onClick(View arg0) {
	    		setContentView(R.layout.about_spa);
	    		
	    		
	    	}
	    	
	    	
	    });
	    
	    exitButton1.setOnClickListener(new OnClickListener() {
	    	public void onClick(View arg0) {
	    		//finish();
	    		Intent exit = new Intent(Intent.ACTION_MAIN);
	    		exit.addCategory(Intent.CATEGORY_HOME);
	    		exit.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
	    		startActivity(exit);
	    		
	    		
	    	}
	    	
	    	
	    });

	}
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		switch (arg0.getId()) {
	      case R.id.exposicionesButton:
	    	  
	    	  Intent FirstFloor = new Intent(arg0.getContext(),Exposiciones.class);
				
			  startActivityForResult(FirstFloor, 0);
				
	          break;
	          
           case R.id.button1:
	    	  
        	   Intent LaunchIntent = 
 	    	  getPackageManager().getLaunchIntentForPackage("processing.test.modsparkingmapcode");
 	    	  startActivity(LaunchIntent);
				
	          break;
		
	}
	
	}
	
}