package org.usfirst.frc.team2559.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public static Joystick RightHandMan;
	public static Joystick LeftyLoosie;
	public OI(){
		RightHandMan = new Joystick(0);
		LeftyLoosie = new Joystick(1);
		
	}

public void speedR(){
	RightHandMan.getRawAxis(1);
}
public void speedL(){
	LeftyLoosie.getRawAxis(1);
}
}
