package org.usfirst.frc.team2557.robot;


import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.DoubleSolenoid;


/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	//here are the motors for the wheels
	public static CANTalon 	winchmotor = new CANTalon(2);
//	public static boolean variable;

    public static CANTalon WenchM = new CANTalon(2);
	
    public static DoubleSolenoid WenchSol = new DoubleSolenoid(0, 0, 1); //Breakout 1 ports 0 and 1

	public static AnalogGyro GWinch = new AnalogGyro(1);
	
    
}
