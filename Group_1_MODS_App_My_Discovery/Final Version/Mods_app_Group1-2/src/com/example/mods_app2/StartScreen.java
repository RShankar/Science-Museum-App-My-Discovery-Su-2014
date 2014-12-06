package com.example.mods_app2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class StartScreen extends Activity implements OnClickListener {
	
    //Set up the buttons
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.languages);
		
		 ImageButton englishButton = (ImageButton) findViewById(R.id.englishButton);
		 
		 ImageButton spanishButton = (ImageButton) findViewById(R.id.spanishButton);
		 
		 //ImageButton portugueseButton = (ImageButton) findViewById(R.id.portugueseButton);
		 
		 englishButton.setOnClickListener(new OnClickListener() {
	  
				

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent intent = new Intent(v.getContext(),MainActivity.class);
					
					startActivityForResult(intent, 0);
				
					
				
}
		 });
		 
		 spanishButton.setOnClickListener(new OnClickListener() {
			  
				

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent intent = new Intent(v.getContext(),MainActivity_Spanish.class);
					
					startActivityForResult(intent, 0);
				
					
				
}
		 });
		 
		 /*portugueseButton.setOnClickListener(new OnClickListener() {
			  
				

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent intent = new Intent(v.getContext(),MainActivity_Portuguese.class);
					
					startActivityForResult(intent, 0);
				
					
				
}
		 });*/
	}


	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	}
}