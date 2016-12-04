package org.usfirst.frc.team8.robot;

import edu.wpi.first.wpilibj.Talon;

public class Drivetrain {
	Talon rightFront;
	Talon rightBack;
	Talon leftFront;
	Talon leftBack;
	enum State{MOVING, NOTMOVING};
	State state;

	public Drivetrain(int rFrontPort, int rBackPort, int lFrontPort, int lBackPort){
		rightFront = new Talon(rFrontPort);
		rightBack = new Talon(rBackPort);
		leftFront = new Talon(lFrontPort);
		leftBack = new Talon(lBackPort);
	}
	public void update(){
		switch(state) {
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
