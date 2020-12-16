package Programmering;
import robocode.*;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/JuniorRobot.html

/**
 * VisarRobot - a robot by (your name here)
 */
public class VisarRobot extends JuniorRobot
{
	public void run() {

        while(true) {
         turnGunRight(10); 
		 turnLeft(-10);    
        }
    }
//Dodging virker 80% af tiden, dog misser den på robotter som bevæger sig.
    public void onScannedRobot() {
	//Kunne ikke få math.sin til at virke, så jeg har bare lavet en distance funktion
    int distance = scannedDistance;
	    if(distance<200){
	    ahead(0);
        fire(3);
	    back(75);
        ahead(75);
        }
        else if(distance<400){
	    ahead(0);
        fire(2);
	    back(75);
        ahead(75);
        }
        else if(distance<600){
	    ahead(0);
        fire(1);
	    back(75);
        ahead(75);
        }
        else{
	    ahead(0);
        fire(1);
	    back(75);
        ahead(75);
        }
    }

    public void onHitByBullet() {
//Mindre problem her (nedenunder forklaring)
		turnAheadLeft(250, 180 - hitByBulletBearing);
    }
    
//Der er et problem her, da den nogle gange ved højre side af banen står stille, da den turner mod muren
    public void onHitWall() {
       if (heading > 0 && heading <= 135) {
           turnBackLeft(300, 90 - hitByBulletBearing); }
		   
       else if (heading > 136 && heading <= 315) {
           turnBackRight(300, 90 - hitByBulletBearing); }
		   
       else if (heading > 316 && heading <= 359) {
           turnBackLeft(300, 90 - hitByBulletBearing); }
   }
}	
   