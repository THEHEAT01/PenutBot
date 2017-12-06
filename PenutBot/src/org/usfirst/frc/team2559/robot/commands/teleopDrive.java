package org.usfirst.frc.team2559.robot.commands;

import org.usfirst.frc.team2559.robot.Robot;
import org.usfirst.frc.team2559.robot.subsystems.Drive;

import edu.wpi.first.wpilibj.command.Command;

public class teleopDrive extends Command {

	public teleopDrive() {
		// TODO Auto-generated constructor stub
		requires(Robot.drive);
		
	}
	protected void initialize() {
    	Robot.drive.enableSaftey();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Drive.joyride();
    	} 

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
