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
    public static CANTalon 	FrontLeft = new CANTalon(4); 	//Port4
    public static CANTalon 	FrontRight = new CANTalon(5);	//Port5
    public static CANTalon 	BackLeft = new CANTalon(0);		//Port0
    public static CANTalon 	BackRight = new CANTalon(1);	//Port1
	public static CANTalon 	winchmotor = new CANTalon(2);
	public static CANTalon 	intakemotor = new CANTalon(3);
//	public static boolean variable;

    
	public static DoubleSolenoid IntakeSol = new DoubleSolenoid(0, 2, 3); //Breakout 1 ports 2 and 3
    public static DoubleSolenoid WenchSol = new DoubleSolenoid(0, 0, 1); //Breakout 1 ports 0 and 1
	public static DoubleSolenoid 	SuperShifterSol = new DoubleSolenoid(0, 4, 5); //Breakout ports 4 and 5

	public static AnalogGyro GWinch = new AnalogGyro(1);
	
    
}
