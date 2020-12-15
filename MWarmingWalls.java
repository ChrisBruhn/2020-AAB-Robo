package prog;
import robocode.*;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/JuniorRobot.html

/**
 * MWarming - a robot by (your name here)
 */
public class MWarmingWalls extends JuniorRobot
{
	/**
	 * run: MWarming's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here
 
		// Some color codes: blue, yellow, black, white, red, pink, brown, grey, orange...
		// Sets these colors (robot parts): body, gun, radar, bullet, scan_arc
		setColors(orange, blue, white, yellow, black);

		// Robot main loop
	

		while (true) {
			// face up
			turnTo(0);
			//turnLeft(heading);
			ahead(fieldHeight-robotY-20);
			turnGunLeft(360);
			
			// face right
			turnRight(90);
			ahead(fieldWidth-robotX-20);
			turnGunLeft(360);
			// face down
			turnRight(90);
			ahead(fieldHeight-40);
			turnGunLeft(360);
			turnGunRight(360);
			// face left
			turnRight(90);
			ahead(fieldWidth-40);
			turnGunLeft(360);
			turnGunRight(360);
			}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot() {
		// Replace the next line with any behavior you would like
		int v = scannedVelocity;
		int d = scannedDistance;
		int b = scannedBearing; 
		int h = scannedHeading;
		int a = scannedAngle;
	 
		turnGunTo(a);

		if (d<200){
		
		fire(2);
		
		}
		
		if (d<500){
		//turnGunTo(a);
		fire(1);
		
		}
	
		if (d<1000){
		//turnGunTo(a);
		fire(0.5);
		
		}	

	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet() {
		// Replace the next line with any behavior you would like
		
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall() {
		// Replace the next line with any behavior you would like
		
	}	
	
	public void onHitRobot (){
	
	turnTo(hitRobotAngle);
	turnGunTo(hitRobotAngle);	
	fire(3);
	back(10);	
	ahead(scannedDistance);
	
	
	}
}
