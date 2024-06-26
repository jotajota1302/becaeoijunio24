package edu.eoi.es;

import java.util.Arrays;
import java.util.Date;

import edu.eoi.es.dao.OrderDaoJpaImpl;
import edu.eoi.es.entity.Description;
import edu.eoi.es.entity.Order;
import edu.eoi.es.entity.Product;
import edu.eoi.es.service.ProductService;

public class App {

	public static void main(String[] args) throws Exception {

//		OrderDaoJpaImpl daoJpaImpl = new OrderDaoJpaImpl();
//
//		Order order = new Order();
//		order.setCode("ORDER123");
//
//		Product product1 = new Product();
//		product1.setName("Product 1");
//		product1.setPrice(20.0);
//		product1.setStock(5);
//
//		Description description1 = new Description();
//		description1.setDescription("Description for Product 1");
//		description1.setDate(new Date());
//		description1.setUser("user1");
//
//		product1.setDescription(description1);
//		description1.setProduct(product1);
//		product1.setOrder(order);
//
//		Product product2 = new Product();
//		product2.setName("Product 2");
//		product2.setPrice(15.0);
//		product2.setStock(10);
//
//		Description description2 = new Description();
//		description2.setDescription("Description for Product 2");
//		description2.setDate(new Date());
//		description2.setUser("user2");
//
//		product2.setDescription(description2);
//		description2.setProduct(product2);
//		product2.setOrder(order);
//
//		order.setProducts(Arrays.asList(product1, product2));
//
//		daoJpaImpl.create(order);
		
//		System.out.println("Te busco el producto " + args[0]);
//		
//		ProductService productService=new ProductService();
//		
//		System.out.println(productService.findProduct(7));
		
		Vehiculo vehiculo1= new Vehiculo(new MotorDiesel());
		Vehiculo vehiculo2= new Vehiculo(new MotorGasolina());
		Vehiculo vehiculo3= new Vehiculo(new MotorElectrico());
		
	}

}
