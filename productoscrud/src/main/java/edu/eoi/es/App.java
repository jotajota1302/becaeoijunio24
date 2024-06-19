package edu.eoi.es;

import edu.eoi.es.dao.ProductDaoJpaImpl;
import edu.eoi.es.entity.Product;

public class App {

	public static void main(String[] args) throws Exception {
	
//		Menu menu= new Menu();
//		menu.printMenu();
		
//		ProductDao dao= new ProductDao();
//		
//		Product p= dao.readProduct(1);
//		
//		System.out.println(p.getName());
//		
//		p.setDescription("Nueva descripcion del producto 1");
//		
//		dao.updateProduct(p);
		
//		dao.deleteProduct(3);
		
		ProductDaoJpaImpl dao= new ProductDaoJpaImpl();
		
		Product producto = dao.read(1);
		
		System.out.println(producto.getName());
		
	}

}
