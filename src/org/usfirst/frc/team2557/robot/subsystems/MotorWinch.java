package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class MotorWinch extends Subsystem {
	
	
	public void WinchStop(){
		RobotMap.winchmotor.set(0);
	}
	
	public void Gyro(){
		
		if(RobotMap.GWinch.getAngle() <=90 && RobotMap.GWinch.getAngle() > 0.1){
			RobotMap.GWinch.reset();
			RobotMap.WenchSol.set(Value.kForward);
			RobotMap.winchmotor.set(1);
		}
		else if(RobotMap.GWinch.getAngle() == 0){
			RobotMap.WenchSol.set(Value.kReverse);
			RobotMap.winchmotor.set(0);
		}
	}
	public void lock(){
		RobotMap.WenchSol.set(Value.kReverse);
	}
	public void unlock(){
		RobotMap.WenchSol.set(Value.kForward);
	}
	
	public void Down(){
		RobotMap.WenchM.set(1);
	}
	public void Up(){
		RobotMap.WenchM.set(-1);
	}
	public void Stop(){
		RobotMap.WenchM.set(0);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

