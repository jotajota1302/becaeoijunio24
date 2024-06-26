package edu.eoi.es;

public class MotorElectrico implements Motor{
	
	int currentRPM=150;

	public void acelerar() {
	}

	public int getRevoluciones() {
		
		return currentRPM;
	}
}