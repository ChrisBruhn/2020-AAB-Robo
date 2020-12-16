package prog;
import robocode.*;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/JuniorRobot.html

/**
 * Finn_pind - a robot by (your name here)
 */
public class Finn_pind extends JuniorRobot
{
	/**
	 * run: Finn_pind's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// Some color codes: blue, yellow, black, white, red, pink, brown, grey, orange...
		// Sets these colors (robot parts): body, gun, radar, bullet, scan_arc
		setColors(green, blue, green, black, yellow);

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			ahead(20);
			turnGunRight(333);
			turnRight(20);
			turnGunTo(hitRobotAngle);
			
			
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot() {
		// Replace the next line with any behavior you would like
		turnGunTo(scannedAngle);
    	fire(5);
 
		
	
	    
	}
	public void onHitRobot (){
	ahead(10);
	
	
}
	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet() {
		// Replace the next line with any behavior you would like
		
		ahead(5);
		
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall() {
		// Replace the next line with any behavior you would like
		turnLeft(90);
	}	
}
