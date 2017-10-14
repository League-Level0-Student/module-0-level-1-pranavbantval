/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */


	import java.awt.KeyEventDispatcher; 
	import java.awt.KeyboardFocusManager; 
	import java.awt.event.KeyEvent; 
	import java.io.File;
	import javax.sound.sampled.AudioInputStream; 
	import javax.sound.sampled.AudioSystem; 
	import javax.sound.sampled.Clip;

    import org.jointheleague.graphical.robot.Robot;
	
	public class RobotInSpace implements KeyEventDispatcher {
		
	Robot rob = new Robot("mini");
int x  = 1;
	/*  Make the Robot move around the screen when the arrow keys are pressed... */
	private void moveRobot(int keyPressed) throws Exception {
	    // 0. Print out the keyPressed variable and write down the numbers for each arrow key
System.out.println(keyPressed);
	    // 1. If the up arrow is pressed, move the Robot up the screen.
if (keyPressed==38) {
	rob.microMove(x);
	
}
	    // 2. If the down arrow is pressed, move the Robot down.
if (keyPressed==40) {
	rob.microMove(-x);
	
}
	    // 3. If the left arrow is pressed, make the Robot go left. Hint: Make sure to end with the Robot facing UP.
	    if (keyPressed==37) {
			rob.setAngle(180);
			rob.microMove(x);
			rob.setAngle(0);
		}
	    // 4. If right is pressed, move the Robot right.
	    if (keyPressed==39) {
			rob.setAngle(90);
			rob.microMove(x);
			rob.setAngle(0);
			
		}
	    // 5. Then move the Robot to RD-2D for a surprise! 
	}

	private void checkIfR2D2Found() throws Exception {
	    int robotLocationX = rob.getX();
	    int robotLocationY = rob.getY();

		if (robotLocationX <= 7300 && robotLocationX >= 720 && robotLocationY >= 150 && robotLocationY <= 160)
	        playEureka();
	}

	public static void main(String[] args) {
	    new RobotInSpace().controlTheRobot();
	}


	private void controlTheRobot() {
	    KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
	    rob.setWindowImage("planet.jpg");
	    rob.penUp();
	    rob.setSpeed(10);
	}

	public boolean dispatchKeyEvent(KeyEvent e) {
	  try {
		if (e.getID() == KeyEvent.KEY_PRESSED) {
	        moveRobot(e.getKeyCode());
	        try {
	            checkIfR2D2Found();
	        } catch (Exception exception) {
	        }
	    }}
	  catch (Exception ex) {
	  }
	    return false;
	}

	public void playEureka() {
	    System.out.println("EUREKA!");
	    try {
	   		 Clip clip = AudioSystem.getClip();
	   		 clip.open(AudioSystem.getAudioInputStream(RobotInSpace.class.getResource("r2d2-eureka.wav")));
	   		 clip.start();
	   		 Thread.sleep(6000);
	   	} catch (Exception ex) {
	     	ex.printStackTrace();
	   	}
	}
	}


