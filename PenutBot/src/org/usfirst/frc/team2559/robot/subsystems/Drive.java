package org.usfirst.frc.team2559.robot.subsystems;

import org.usfirst.frc.team2559.robot.OI;
import org.usfirst.frc.team2559.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drive extends Subsystem{
		final CANTalon RightSide = RobotMap.RightDrive;
		final CANTalon LeftSide = RobotMap.LeftDrive;
		public static final RobotDrive robitDrive = RobotMap.robitDrive;
	public void speeds(){
		
	}
	public void enableSaftey(){
		robitDrive.setSafetyEnabled(true);
	}
	public void disableSaftey(){
		robitDrive.setSafetyEnabled(false);
	}
	

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	public static void joyride(){
		robitDrive.tankDrive(LeftJoy, RightJoy);
	}

}
