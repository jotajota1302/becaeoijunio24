package edu.eoi.es;

import edu.eoi.es.dao.ProductDaoJpaImpl;
import edu.eoi.es.entity.Description;
import edu.eoi.es.entity.Product;

public class App {

	public static void main(String[] args) throws Exception {		
		
		
		
		ProductDaoJpaImpl daoJpaImpl=new ProductDaoJpaImpl();
		
		Product product=new Product();
		product.setName("TEST");
		product.setPrice(54.0);
		product.setStock(3);
		
		Description description= new Description();		
		description.setDescription("mi descripcion");
		
		product.setDescription(description);
		description.setProduct(product);
		
		daoJpaImpl.create(product);
		
//		Product p = daoJpaImpl.read(4);
//		
//		System.out.println(p.getDescription());
//		
//		DescriptionDaoJpaImpl descriptionDaoJpaImpl= new DescriptionDaoJpaImpl();
//		
//		Description d = descriptionDaoJpaImpl.read(p.getDescription());
//		
//		System.out.println(d.getDescription());
		
	
//		Menu menu= new Menu();
//		menu.printMenu();
					
//		Calendar cal1=Calendar.getInstance();
//			
//		ProductDaoJdbcImpl dao= new ProductDaoJdbcImpl();
//		
//		ProductDto p= dao.read(1);
//		
//		System.out.println(p.getName());
//		
//		Calendar cal2=Calendar.getInstance();
//		
//		 long tiempo = cal2.getTimeInMillis()-cal1.getTimeInMillis();
//		
//		System.out.println("ms : " + tiempo );
//		
//		p.setDescription("Nueva descripcion del producto 1");
//		
//		dao.updateProduct(p);
		
//		dao.deleteProduct(3);
		
//		cal1=Calendar.getInstance();
//		
//		ProductDaoJpaImpl dao2= new ProductDaoJpaImpl();
//		
//		Product producto = dao2.read(1);	
//		
//		System.out.println(producto.getName());	
//		
//		cal2=Calendar.getInstance();
//		
//		tiempo = cal2.getTimeInMillis()-cal1.getTimeInMillis();		
//
//		System.out.println("ms JPA: " + tiempo);
//		
//		cal1=Calendar.getInstance();
//		
//		dao2= new ProductDaoJpaImpl();
//		
//		producto = dao2.read(2);	
//		
//		System.out.println(producto.getName());	
//		
//		cal2=Calendar.getInstance();
//		
//		tiempo = cal2.getTimeInMillis()-cal1.getTimeInMillis();		
//
//		System.out.println("ms JPA: " + tiempo);
		
		
		
		
	}

}
