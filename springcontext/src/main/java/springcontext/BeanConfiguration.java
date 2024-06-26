package springcontext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

	@Bean
	public MyBean getMyBean() {

		return new MyBean();
	}

	@Bean
	public Motor getMotor() {

		return new Motor();

	}

	@Bean
	public Vehiculo getVehiculo() {

		return new Vehiculo();
	}

}
