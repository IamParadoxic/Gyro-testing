package org.usfirst.frc.team2557.robot;


import org.usfirst.frc.team2557.robot.commands.GyroWinch;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    
	public Joystick gamepad1;
	
    public JoystickButton gp1LB;

    public OI() {
    //Gamepad ports
    gamepad1 = new Joystick(0);
    gp1LB = new JoystickButton(gamepad1, 5);
    
    gp1LB.toggleWhenPressed(new GyroWinch());
    }
}

