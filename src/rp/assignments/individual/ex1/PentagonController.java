package rp.assignments.individual.ex1;

import rp.robotics.DifferentialDriveRobot;
import rp.systems.StoppableRunnable;

/**
 * 
 * A placeholder to show you how you could start writing a controller for the
 * first part of the first individual assignment (creating a controller which
 * drives in a pentagon). Note that you don't have to follow this structure for
 * your controller as there are more elegant and efficient (at least in terms of
 * numbers of lines of code) in which you can implement the different shape
 * controllers.
 * 
 * @author Nick Hawes
 *
 */
public class PentagonController implements StoppableRunnable {

	private DifferentialDriveRobot robot;
	private float sideLength;
	private int cornerAngle = cornerAngle = 72;
	private final int NUMB_OF_CORNERS = 5;

	public PentagonController(DifferentialDriveRobot robot, float sideLength) {
		// TODO Auto-generated method stub
		this.robot = robot;
		this.sideLength = sideLength;
	}

	@Override
	public void run() {
		for(int i = 0; i < NUMB_OF_CORNERS; i++) {
			robot.getDifferentialPilot().travel(sideLength);
			robot.getDifferentialPilot().rotate(cornerAngle);
		}
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
	}

}
