package edu.es.eoi.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.eoi.es.entity.Product;
import edu.eoi.es.service.ProductService;


@WebServlet("/MiPrimerServlet")
public class MiPrimerServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		ProductService service= new ProductService();
		Product producto = service.findProduct(Integer.valueOf(request.getParameter("id")));
		
		response.getWriter().append("Served at: ").append(producto.toString());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
