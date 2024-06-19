package edu.eoi.es;

import java.time.LocalDate;
import java.util.Calendar;

import edu.eoi.es.dao.ProductDao;
import edu.eoi.es.dao.ProductDaoJpaImpl;
import edu.eoi.es.dto.ProductDto;
import edu.eoi.es.entity.Product;

public class App {

	public static void main(String[] args) throws Exception {
	
//		Menu menu= new Menu();
//		menu.printMenu();
					
		Calendar cal1=Calendar.getInstance();
			
		ProductDao dao= new ProductDao();
		
		ProductDto p= dao.read(1);
		
		System.out.println(p.getName());
		
		Calendar cal2=Calendar.getInstance();
		
		 long tiempo = cal2.getTimeInMillis()-cal1.getTimeInMillis();
		
		System.out.println("ms : " + tiempo );
//		
//		p.setDescription("Nueva descripcion del producto 1");
//		
//		dao.updateProduct(p);
		
//		dao.deleteProduct(3);
		
		cal1=Calendar.getInstance();
		
		ProductDaoJpaImpl dao2= new ProductDaoJpaImpl();
		
		Product producto = dao2.read(1);	
		
		System.out.println(producto.getName());	
		
		cal2=Calendar.getInstance();
		
		tiempo = cal2.getTimeInMillis()-cal1.getTimeInMillis();		

		System.out.println("ms JPA: " + tiempo);
		
		cal1=Calendar.getInstance();
		
		dao2= new ProductDaoJpaImpl();
		
		producto = dao2.read(4);	
		
		System.out.println(producto.getName());	
		
		cal2=Calendar.getInstance();
		
		tiempo = cal2.getTimeInMillis()-cal1.getTimeInMillis();		

		System.out.println("ms JPA: " + tiempo);
		
	}

}
