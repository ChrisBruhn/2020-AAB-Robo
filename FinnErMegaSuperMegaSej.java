package AAB-Robo;
import robocode.*;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/JuniorRobot.html

/**
 * Nop - a robot by (your name here)
 */
public class FinnErMegaSuperMegaSej extends JuniorRobot
{
	/**
	 * run: Nop's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// Some color codes: blue, yellow, black, white, red, pink, brown, grey, orange...
		// Sets these colors (robot parts): body, gun, radar, bullet, scan_arc
		setColors(orange, blue, white, yellow, black);

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			ahead(50);
			turnLeft(45);
			ahead(50);
			turnRight(90);
			turnGunRight(360);
		
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */

	public void onScannedRobot() {
		// Replace the next line with any behavior you would like

turnGunTo(scannedAngle);
			if (energy > 40 && scannedDistance > 100) {
			fire(3);
		}
		else {
			fire(1);
		}
	
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	

	public void onHitByBullet() {
		// Replace the next line with any behavior you would like
		turnAheadLeft(100, 90 - hitByBulletAngle);	
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall() {
		// Replace the next line with any behavior you would like
	 
		turnTo(-(180-hitWallAngle));		
		ahead(50);
	}	
}
