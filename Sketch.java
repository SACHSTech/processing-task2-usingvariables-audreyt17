import processing.core.PApplet;

public class Sketch extends PApplet {
	
	/**
  * Description: 
  * Write a prgram that creates a drawing using processing     variables variables like width and height to make a         drawing that is dynamic to changes in size
  * @author: Tao A
  */
  
  public void settings() {
	// put your size call here
    size(200, 250);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(131, 174, 242);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	//foreground settings
    stroke(0,0,0);
    strokeWeight(1);
    fill(126, 189, 125);
    rect((float) (width/-20), (float) (height/1.06), (float) (width/0.9), (height));

  //draw the head
    fill(255, 249, 128);
    ellipse(100, 128, 90, 90);

  //white part of eyes
    fill(255);

  //draw the eyes
    ellipse(79, 120, 25, 20);
    ellipse(120, 120, 25, 20);

  //black part of the pupils
    fill(8, 10, 10);

  //draw the pupils
    ellipse(79, 120, 7, 7);
    ellipse(120, 120, 7, 7);

  //colour of the mouth
    fill(227, 67, 50);

  //draw the mouth
    arc(100, 140, 60, 43, 0, 311/99);

  //lines for body
    stroke(0, 0, 0);
    strokeWeight(2);
    line(100, 210, 100, 175);
    line(130, 190, 70, 190);
    line(120, 230, 100, 210);
    line(100, 210, 80, 230);
    
  }
  
  // define other methods down here.
}