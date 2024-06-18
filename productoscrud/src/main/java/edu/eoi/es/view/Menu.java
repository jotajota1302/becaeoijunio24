package edu.eoi.es.view;

import java.util.Scanner;

import edu.eoi.es.dto.Product;
import edu.eoi.es.service.ProductService;

public class Menu {

	private ProductService productService = new ProductService();

	public void printMenu() {

		System.out.println("Bienvenido a mi app, selecciona una opcion");
		System.out.println("1-Crear Producto");

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int opcion = scan.nextInt();

		switch (opcion) {
		case 1:

			// recuperar los datos por consola

			Product product = new Product();
			product.setName("TEST");
			product.setDescription("DESRIPCION");
			product.setPrice(100.0);
			product.setStock(3);

			String response = productService.insertProduct(product);
			System.out.println(response);
			break;

		default:
			break;
		}

		printMenu();
	}

}
