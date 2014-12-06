package com.example.mods_app2;

import processing.core.PApplet;
import processing.core.PImage;
import ketai.sensors.*;

//PApplet in fact extends android.app.Activity
public class Game extends PApplet { //PApplet in fact extends android.app.Activity
	
	KetaiSensor sensor;
	
	boolean pause = false;
	float x, y, remoteX, remoteY;
	float myAccelerometerX, myAccelerometerY;
	int targetX, targetY, targetXX, targetYY;
	int score;
	int highscore;
	float speedX;
	double speedY = .01;
	PImage manatee;
	PImage plant;
	PImage water;
	PImage start;
	PImage bottle;
	PImage gameover;
	PImage pausescreen;
	PImage instructions;
	int stage;
	
    public void setup() {
    	
    	  stage = 1;
    	  sensor = new KetaiSensor(this);
    	  orientation(PORTRAIT);
    	  textAlign(CENTER, CENTER);
    	  textSize(36);
    	  sensor.start();
    	  strokeWeight(5);  
    	  imageMode(CENTER);
    	  manatee = loadImage("eightbitmanatee.png");  
    	  plant = loadImage("eightbitplant.png");
    	  bottle = loadImage("eightbitbottle.png");
    	  start = loadImage("pixelforestbackground2012.png");
    	  gameover = loadImage("gameover2012.png");
    	  pausescreen = loadImage("pausescreen.png");
    	  instructions = loadImage("manateemaniainstructions.png");
    	  init();
    	  background(start);
    	
    	
    	
    }
 
    public void draw() {
    	/*...*/
    	
    	if (stage==1){ //start page
    	      score = 0;//so score doesn't stay after you lose
    	    if (mousePressed==true){
    	      stage=4;
    	    }
    	  }
    	  if (stage==2){
    	  water = loadImage("watergif.gif");
    	  background(water);
    	  size(1200,1200);
    	  // Targets
    	  fill (0);
    	  stroke(0, 60, 0);
    	  tint(255, 255);
    	  image(plant, targetX, targetY, 200, 200); 
    	  tint( 255, 255);
    	  image(bottle, targetXX, targetYY, 50, 100);
    	  stroke (60, 0, 0);
    	  noStroke();
    	  fill(250);
    	  stroke(0);
    	  rect(1, 1, 150, 100);
    	  fill(0);
    	  textSize(75);
    	  text(score, 50, 50);
    	  
    	  // manatee
    	  speedX += (myAccelerometerX) * 0.2;  
    	  speedY += (myAccelerometerY) * 0.2;
    	  
    	  if (x <= 25+speedX || x > width-25+speedX) {
    	    speedX *= -0.8;  
    	  }
    	  if (y <= 25-speedY || y > height-25-speedY) {
    	    speedY *= -0.8;
    	  }
    	  x -= speedX;  
    	  y += speedY;
    	  image(manatee, x, y);
    	  // Collision 
    	  if (dist(x, y, targetX, targetY) < 100) {
    	    score++;
    	    init();
    	  }
    	   if (dist(x, y, targetXX, targetYY) < 100) {
    	    stage=3;
    	    init();
    	  }

    	}
    	if (stage==4){
    	  background(instructions); // is there a way to not make it skip stage 4 without stopping/delaying the loop?
    	  noLoop();
    	  delay(100);
    	  loop();
    	  if(mousePressed==true){
    	        stage=2;
    	  }
    	}
    	  
    	if (stage==3){   //gameover screen
    	  background(gameover);
    	  fill(20);
    	  textSize(95);
    	  text(score, 690, 625);
    	  if (score > highscore){
    	    highscore = score;
    	  }
    	  else{
    	    
    	  }
    	  text(highscore, 850, 520);
    	  if (mousePressed==true){
    	    setup();
    	}
    	}
    	
    	
    }
    public void mousePressed() //pause on click, play on click
    {if (stage==2){
      if(pause == true){
      noLoop();
      tint(255, 255);
     background(pausescreen);
    }else{
      loop();
    }
    if(pause == false){
       pause = true;
    }else{
       pause = false;
    }     
    }
    }

    void onAccelerometerEvent(float _x, float _y, float _z)
    {
      myAccelerometerX = _x;
      myAccelerometerY = _y;
    }


    void init() {   // items randomly respawn
      x = (float) (random(25, width-25));
      y = (float)(random(25, height-25));
      targetX = (int) (random(25, width-35));
      targetY = (int)(random(25, height-35));
      targetXX = (int)(random(25, width-75));
      targetYY = (int)(random(25, height-75));
}
}
