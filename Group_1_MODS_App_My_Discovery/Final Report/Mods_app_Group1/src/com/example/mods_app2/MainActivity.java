package com.example.mods_app2;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MainActivity extends Activity implements OnClickListener {
	
    //Set up the buttons
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
	    View modsButton = findViewById(R.id.mods);
	    modsButton.setOnClickListener(this);
	    
	    View parkingButton = findViewById(R.id.parking);
	    parkingButton.setOnClickListener(this);
	    
//	    View manateeButton = findViewById(R.id.manatee);
//	    manateeButton.setOnClickListener(this);
	    
//	    View aboutButton = findViewById(R.id.about);
//	    aboutButton.setOnClickListener(this);
//	    
//	    View exitButton = findViewById(R.id.exit);
//	    exitButton.setOnClickListener(this);
	    
	    ImageButton gameButton = (ImageButton) findViewById(R.id.gameButton1);
	    ImageButton aboutButton = (ImageButton) findViewById(R.id.aboutButton);
	    ImageButton exitButton = (ImageButton) findViewById(R.id.exitButton);
	    
	    
	    gameButton.setOnClickListener(new OnClickListener() {
	    	 
			@Override
			public void onClick(View arg0) {
				
			    	  Intent LaunchIntent = 
			    	  getPackageManager().getLaunchIntentForPackage("processing.test.manateemania");
			    	  startActivity(LaunchIntent);
			}
 
		});
	    
	    aboutButton.setOnClickListener(new OnClickListener() {
	    	public void onClick(View arg0) {
	    		setContentView(R.layout.about);
	    		
	    		
	    	}
	    	
	    	
	    });
	    
	    exitButton.setOnClickListener(new OnClickListener() {
	    	public void onClick(View arg0) {
	    		Intent exit_a = new Intent(Intent.ACTION_MAIN);
	    		exit_a.addCategory(Intent.CATEGORY_HOME);
	    		exit_a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
	    		startActivity(exit_a);
	    		
	    		
	    	}
	    	
	    	
	    });
	    }
	

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
	      case R.id.mods:
	    	  //setContentView(R.layout.exhibits);
	    	  //setContentView(R.layout.exhibits_screen);
	    	  
	    	  Intent FirstFloor = new Intent(v.getContext(),Exhibits.class);
				
			  startActivityForResult(FirstFloor, 0);
				
	          break;
	          
	      case R.id.parking:
	    	  Intent LaunchIntent = 
	    	  getPackageManager().getLaunchIntentForPackage("processing.test.modsparkingmapcode");
	    	  startActivity(LaunchIntent);
	    	  
	    	  //setContentView(R.layout.parking);
	          break;
	          
	      
	          
//	      case R.id.manatee:
//	    	  Intent LaunchIntent = 
//	    	  getPackageManager().getLaunchIntentForPackage("processing.test.manateemania");
//	    	  startActivity(LaunchIntent);
//	          break;
	          
//	      case R.id.about:
//	    	  setContentView(R.layout.about);
//	          break;
//	          
//	      case R.id.exit:
//	    	  finish();
//	          break;
		
	}
}
	
	
}