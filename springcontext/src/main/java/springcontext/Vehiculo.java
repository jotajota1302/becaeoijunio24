package springcontext;

import org.springframework.beans.factory.annotation.Autowired;

public class Vehiculo {

	@Autowired
	private Motor m;
		
	public void acelerar() {
		
		System.out.println("acelero " + m.getRevoluciones());
		
	}

	public Motor getM() {
		return m;
	}

	public void setM(Motor m) {
		this.m = m;
	}
	
	
}
