package edu.eoi.es;

public class Vehiculo {
	
	private Motor m;	

	public Vehiculo(Motor m) {
		this.m=m;
	}

	public int getRevolucionesMotor() {
		return m.getRevoluciones();
	}
}
