
package org.usfirst.frc.team8.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
   Input input;
   Shooter shooter;
   Intake intake;
   Drivetrain drivetrain;
   Controllers controllers;
	public Robot(){
		input = new Input(0,1,2);
		shooter = new Shooter(8);
		intake = new Intake(7);
		drivetrain = new Drivetrain(1,2,3,4);
		controllers= new Controllers(this);
		
	}
	
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    	shooter.init();
    	intake.init();
    	drivetrain.init();
    }
    	
       
    
    
	/**
	 * This autonomous (along with the chooser code above) shows how to select between different autonomous modes
	 * using the dashboard. The sendable chooser code works with the Java SmartDashboard. If you prefer the LabVIEW
	 * Dashboard, remove all of the chooser code and uncomment the getString line to get the auto name from the text box
	 * below the Gyro
	 *
	 * You can add additional auto modes by adding additional comparisons to the switch structure below with additional strings.
	 * If using the SendableChooser make sure to add them to the chooser code above as well.
	 */
    public void autonomousInit() {

    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
    
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
    	input.update();
    	shooter.update();
    	intake.update();
    	drivetrain.update();
        
    }
    
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
    public void disabledInit() {
    	shooter.disable();
    	intake.disable();
    	drivetrain.disable();
    }
    
    public void disabledPeriodic(){
    	shooter.disable();
    	intake.disable();
    	drivetrain.disable();
    }
    
}
