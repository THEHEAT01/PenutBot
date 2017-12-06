package org.usfirst.frc.team2559.robot;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.RobotDrive;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static CANTalon RightDrive;
	public static CANTalon LeftDrive;
	public static RobotDrive robitDrive;
	public static void init(){
		RightDrive = new CANTalon(1);
		LeftDrive = new CANTalon(2);
		robitDrive = new RobotDrive(RightDrive, LeftDrive);
	}
}
	
