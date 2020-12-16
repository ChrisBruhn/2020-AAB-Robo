package prog;  
import robocode.*;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/JuniorRobot.html

/**
 * Oliver - a robot by (your name here)
 */
public class Oliver extends JuniorRobot
{
	/**
	 * run: Oliver's default behavior
	 */
	public void run() {
	
	
		setColors(orange, blue, white, yellow, black);

		// Robot main loop
		while(true) {
		turnAheadLeft(100,90); 
		
			turnGunRight(360);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot() {
		// Replace the next line with any behavior you would like
		turnGunTo(scannedAngle);
		fire(0.1);
		
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet() {
		// Replace the next line with any behavior you would like
		back(10);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall() {
		// Replace the next line with any behavior you would like
		back(50);
		turnRight(40);
		ahead(90);
	}	
}
