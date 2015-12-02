// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc219.2015Robot;
    
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import java.util.Vector;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController subsystem1SpeedController1;
    public static SpeedController subsystem1SpeedController2;
    public static SpeedController subsystem1SpeedController3;
    public static SpeedController subsystem1SpeedController4;
    public static RobotDrive subsystem1RobotDrive41;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        subsystem1SpeedController1 = new TalonSRX(0);
        LiveWindow.addActuator("Subsystem 1", "Speed Controller 1", (TalonSRX) subsystem1SpeedController1);
        
        subsystem1SpeedController2 = new TalonSRX(1);
        LiveWindow.addActuator("Subsystem 1", "Speed Controller 2", (TalonSRX) subsystem1SpeedController2);
        
        subsystem1SpeedController3 = new TalonSRX(2);
        LiveWindow.addActuator("Subsystem 1", "Speed Controller 3", (TalonSRX) subsystem1SpeedController3);
        
        subsystem1SpeedController4 = new TalonSRX(3);
        LiveWindow.addActuator("Subsystem 1", "Speed Controller 4", (TalonSRX) subsystem1SpeedController4);
        
        subsystem1RobotDrive41 = new RobotDrive(subsystem1SpeedController1, subsystem1SpeedController2,
              subsystem1SpeedController3, subsystem1SpeedController4);
        
        subsystem1RobotDrive41.setSafetyEnabled(true);
        subsystem1RobotDrive41.setExpiration(0.1);
        subsystem1RobotDrive41.setSensitivity(0.5);
        subsystem1RobotDrive41.setMaxOutput(1.0);


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
