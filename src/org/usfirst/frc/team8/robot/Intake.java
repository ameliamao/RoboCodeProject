package org.usfirst.frc.team8.robot;

import edu.wpi.first.wpilibj.Talon;

public class Intake {
	Talon talon;
	enum State{NOTMOVING, MOVING};
	State state;
	
	public Intake(int port){
		talon = new Talon(port);
	}
	public void update(){
		switch(state){
		case MOVING: ;
		break;
		case NOTMOVING: ;
		break;
		}
		
	}
	public void init(){
		state = State.MOVING;
		
	}
	public void disable(){
		state = State.NOTMOVING;
		
	}

}
