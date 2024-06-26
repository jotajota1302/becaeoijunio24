package edu.eoi.es;

public class MotorGasolina implements Motor{
	
	int currentRPM=100;

	public void acelerar() {
	}

	public int getRevoluciones() {
		
		return currentRPM;
	}
}