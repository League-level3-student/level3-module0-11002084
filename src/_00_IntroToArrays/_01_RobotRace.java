package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		int numRobots = 6;
		boolean circularRace = true;
	
		//2. create an array of 5 robots.
		Robot[] robotArray = new Robot[numRobots];
		
		//3. use a for loop to initialize the robots.
		for(int i=0; i<numRobots; i++) {

			robotArray[i] = new Robot();
			//4. make each robot start at the bottom of the screen, side by side, facing up
			if(circularRace) {
				robotArray[i].moveTo(100, 300);
				robotArray[i].setSpeed(50);
			} else {
				robotArray[i].moveTo((i+1)*(750/numRobots), 550);
				robotArray[i].setSpeed(10);
			}
			robotArray[i].setAngle(0);
		}
	
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
		Random rand = new Random();
		int winningRobot = 0;
		boolean robotWon = false;
		int[] robotDegreeArray = new int[numRobots];
		
		if(circularRace) {
			for(int i=0; i<numRobots; i++) {
				robotDegreeArray[i] = 0;
			}
		}
		
		while(!robotWon) {
			for(int i=0; i<robotArray.length; i++) {
				if(circularRace) {
					
					for(int j=0; j<rand.nextInt(50); j++) {
						robotArray[i].move(5);
						robotArray[i].turn(1);
						robotDegreeArray[i]++;
					}
					
					if(robotDegreeArray[i] >= 360) {
						winningRobot = i;
						robotWon = true;
						break;
					}
				} else {
					robotArray[i].move(rand.nextInt(50));
					
					if(robotArray[i].getY() <= 0) {
						winningRobot = i;
						robotWon = true;
						break;
					}
				}
			}
		}
    	
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
		
		robotArray[winningRobot].moveTo(450, 300);
    	robotArray[winningRobot].turn(1080);
		
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.
    	
    	

	}
}
