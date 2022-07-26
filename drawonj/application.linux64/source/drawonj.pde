// drawonj because draw on j, j = java

import controlP5.*;

ControlP5 cp5;

void setup() {
  size(1000, 600);
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

void exitbutton() {
  println("exitbutton pressed");
  exit();
}
void clearbutton() {
  println("clearbutton pressed");
  background(backgroundcol);
}

void colorslider(float tempvirable1) {
  sizemouse = tempvirable1;
}

void draw() {
  if (mousePressed == true) {
    if (mouseButton == LEFT) fill(brushcol); circle(mouseX, mouseY, sizemouse);
    if (mouseButton == RIGHT) fill(backgroundcol); circle(mouseX, mouseY, sizemouse);
  }

}
