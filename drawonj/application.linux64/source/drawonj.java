import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import controlP5.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class drawonj extends PApplet {

// drawonj because draw on j, j = java



ControlP5 cp5;

public void setup() {
  
  fill(brushcol);
  background(backgroundcol);
  surface.setTitle("Простая рисовалка на Java");
  noStroke();
  frameRate(5012);
  cp5 = new ControlP5(this);
  cp5.addButton("exitbutton").setPosition(10, 560).setSize(100, 30).setLabel("Quit");
  cp5.addButton("clearbutton").setPosition(120, 560).setSize(100, 30).setLabel("clear");
  cp5.addSlider("colorslider").setPosition(230, 560).setSize(300, 30).setLabel("").setRange(1, 100);
  cp5.addColorWheel("brushcol").setPosition(550, 400).setSize(200, 200).setLabel("");
}

public void exitbutton() {
  println("exitbutton pressed");
  exit();
}
public void clearbutton() {
  println("clearbutton pressed");
  background(backgroundcol);
}

public void colorslider(float tempvirable1) {
  sizemouse = tempvirable1;
}

public void draw() {
  if (mousePressed == true) {
    if (mouseButton == LEFT) fill(brushcol); circle(mouseX, mouseY, sizemouse);
    if (mouseButton == RIGHT) fill(backgroundcol); circle(mouseX, mouseY, sizemouse);
  }

}
int backgroundcol = 250;
int brushcol = 0;
float sizemouse = 20;
  public void settings() {  size(1000, 600); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "drawonj" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
