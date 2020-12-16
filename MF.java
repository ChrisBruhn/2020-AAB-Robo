
package prog;


import robocode.JuniorRobot;



public class MF extends JuniorRobot {
    private EnemyBot enemy = new EnemyBot();
{
	/**
	 * run: MF's default behavior
	 */}
	public void run() {
		// Initialization of the robot should be put here

		// Some color codes: blue, yellow, black, white, red, pink, brown, grey, orange...
		// Sets these colors (robot parts): body, gun, radar, bullet, scan_arc
		setColors(orange, blue, white, yellow, black);

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			turnGunRight(360);
			turnAheadRight(100, 15); 
			turnGunLeft(360); 
		
			 

		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
public void onScannedRobot() {
        int se = scannedEnergy;
        int sd = scannedDistance;
        int sb = scannedBearing;
        int sa = scannedAngle;
        int sh = scannedHeading;
turnGunTo(sa); 
	 fire(1);
	 
        if (enemy.none()) {
            enemy.setName("Tobias");
			enemy.setEnergy(se);
            System.out.println(" ENERGI IS SET TO: " + enemy.getEnergy()+" Navn: "+enemy.getName());
        }
        //stik halen mellem benene
        else {
            if (se>enemy.getEnergy()){
                System.out.println("Uhh Im running away!");  


if(sh >= enemy.getHeading()) {
turnAheadLeft(120,45); 
}
else{
turnAheadRight(120,45); 
}

            }
}
}

        


	
	
public void onHitRobot() {
	
        int sd = scannedDistance;
        int sa = scannedAngle;


	if (sd < 75) {
turnGunTo(sa); 	
fire(3); 
	}
	else
	turnGunTo(sa); 
       fire(2);
	  
   }
   



	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet() {
		
  int sd = scannedDistance;
  int sa = scannedAngle;
		
	if (sd >80) {
turnGunTo(sa); 
fire();
fire();
fire();		


}
	}
		 

	
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall() {
		back(200);
		turnLeft(45); 
		turnGunTo(360);
	
		}
	
	}	
