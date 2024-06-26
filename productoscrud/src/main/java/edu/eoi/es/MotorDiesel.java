package edu.eoi.es;

public class MotorDiesel implements Motor{
	
	int currentRPM=75;

	public void acelerar() {
	}

	public int getRevoluciones() {
		
		return currentRPM;
	}
}