package prog;
import robocode.*;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/JuniorRobot.html

/**
 * Test2 - a robot by (your name here)
 */
public class Test21 extends JuniorRobot
{
	/**
	 * run: Test2's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// Some color codes: blue, yellow, black, white, red, pink, brown, grey, orange...
		// Sets these colors (robot parts): body, gun, radar, bullet, scan_arc

		// du har sat farven på dine granater til sort, derfor kan vi ikke se dem! jeg har ændret det til hvid
		setColors(black, red, gray, white, white);

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			// denne linje har jeg tilføjet - nu scanner du efter fjener ;)
			turnGunLeft(360);
			turnAheadRight(100,180);

		}
	}

       
	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot() {
		// Replace the next line with any behavior you would like
		turnGunTo(scannedAngle);
		fire(1);
	}
	
    public void onHitRobot(){
		back(30);
		// har jeg rettet til tre, kører du ind i en robot er du tæt på og der er derfor god chance for at ramme!
		fire(3);
	}


	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet() {
		// Replace the next line with any behavior you would like
		back(100);
		fire(2);
	}
	
    // denne linje fjerner jeg giver ingen mening
	/* public void getBearing(){
		fire(1);
	}

    public void getEnergy(){
	}
	*/

	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall() {
		// Replace the next line with any behavior you would like
		back(200);
		turnBackRight(50,180);
	}	
}
