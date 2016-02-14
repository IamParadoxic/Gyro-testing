package org.usfirst.frc.team2557.robot;


import org.usfirst.frc.team2557.robot.commands.GyroWinch;
import org.usfirst.frc.team2557.robot.commands.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    
	public Joystick gamepad1;
	
    public JoystickButton gp1A;
    public JoystickButton gp1B;
    public JoystickButton gp1LB;
    public JoystickButton gp1RB;

    public OI() {
    //Gamepad ports
    gamepad1 = new Joystick(0);
    gp1A = new JoystickButton(gamepad1, 1);
    gp1B = new JoystickButton(gamepad1, 2);
    gp1LB = new JoystickButton(gamepad1, 5);
    gp1RB = new JoystickButton(gamepad1, 6);

    gp1A.toggleWhenPressed(new GyroWinch());
    gp1B.toggleWhenPressed(new WenchLock());
    gp1LB.whileHeld(new Wench_up());
    gp1RB.whileHeld(new Wench_down());
    }
}

