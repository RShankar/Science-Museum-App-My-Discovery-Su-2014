package com.example.mods_app2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class Exposiciones extends Activity implements OnClickListener {
	
    //Set up the buttons
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.exposiciones);
		
		View firstFloor = findViewById(R.id.firstFloor);
	    firstFloor.setOnClickListener(this);
	    
	    View secondFloor = findViewById(R.id.secondFloor);
	    secondFloor.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		switch (arg0.getId()) {
	      case R.id.firstFloor:
	    	  
	    	  Intent FirstFloor = new Intent(arg0.getContext(),Primerpiso.class);
				
				startActivityForResult(FirstFloor, 0);
	    	  
	          break;
	          
	      case R.id.secondFloor:
	    	  
	    	  Intent SecondFloor = new Intent(arg0.getContext(),SegundoPiso.class);
				
				startActivityForResult(SecondFloor, 0);
	    	  
	          break;
		
		
	}
	
}
}

