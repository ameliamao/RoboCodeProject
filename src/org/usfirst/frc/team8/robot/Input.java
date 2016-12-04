package org.usfirst.frc.team8.robot;

import edu.wpi.first.wpilibj.Joystick;

public class Input {
	Joystick fbjoystick;
	Joystick tjoystick;
	Joystick sjoystick;
	
	public Input(int portx, int porty, int portz){
		fbjoystick = new Joystick(portx);
		tjoystick = new Joystick(porty);
		sjoystick = new Joystick(portz);
		
	}
	public void update(){
		
	}

}
