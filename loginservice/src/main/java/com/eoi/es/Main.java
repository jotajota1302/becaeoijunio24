package com.eoi.es;

import java.sql.SQLException;
import java.util.List;

import com.eoi.es.dao.OrderService;
import com.eoi.es.dto.Order;

public class Main {

	public static void main(String[] args) throws SQLException {
		
//		boolean correcto=false;
//		
//		System.out.println("User:" + args[0]);
//		System.out.println("Password:" + args[1]);	
//		
//		LoginDaoJdbcImpl daoJdbcImpl= new LoginDaoJdbcImpl();
//		
//		correcto=daoJdbcImpl.login(args[0], args[1]);
//		
//		if(correcto) {
//			System.out.println("El user y pw son correctos");
//		}else {
//			System.out.println("El user y pw son incorrectos");
//		}		
		
		OrderService service= new OrderService();
		
		List<Order> orders = service.findOrdersByUserMail("user7@example.com");
		
		orders.forEach(o->System.out.println(o));

	}

}
