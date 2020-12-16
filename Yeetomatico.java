package AAB-Robo;
import robocode.*;
//import java.awt.Color;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * Yeetomatico - a robot by (your name here)
 */
public class Yeetomatico extends Robot
{
	int moveDirection=1;


	/**
	 * run: Yeetomatico's default behavior
	 */
	public void run() {
	setAdjustRadarForRobotTurn(true);
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		// setColors(Color.red,Color.blue,Color.green); // body,gun,radar

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			
			ahead(100);
			turnRadarRight(Double.POSITIVE_INFINITY); //scanne uendelig fra https://robowiki.net/wiki/SuperTracker 
			
		


		}
	}

	/**
	 * 
	 */
	 
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		turnGunLeft((getGunHeading()-e.getBearing()-getHeading()) +  (e.getVelocity()* e.getDistance()));
	
			

		if (getEnergy() > 40 && e.getDistance() > 50) {
			fire(3);
		}
		else {
			fire(1);
		}
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		back(10);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		moveDirection *= -1;
	}	
}
