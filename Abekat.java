package prog;
import robocode.*;

public class Abekat extends JuniorRobot
{

	public void run() {
	
		setColors(yellow, black, black, black, yellow);

		// Robot main loop
		while(true) {
	ahead(50);
	turnGunRight(360);
	}
}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */	

	
		
	public void onScannedRobot() {
		// Replace the next line with any behavior you would like
	
		
turnGunTo(scannedAngle);
fire(3);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet() {
		// Replace the next line with any behavior you would like
		ahead(20);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall() {
		// Replace the next line with any behavior you would like
		back(50);
	}	
}


