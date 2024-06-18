package edu.eoi.es.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import edu.eoi.es.dto.Product;


//CRUD CREATE READ UPDATE DELETE
public class ProductDao {		
	
		
	public void createProduct(Product product) throws SQLException {
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/beca?serverTimezone=UTC&useSSL=false", "root", "root");
		
		String sql="INSERT INTO productos (nombre,descripcion,precio,stock,categoria) VALUES (?,?,?,?,?)";
		
		PreparedStatement stm=connection.prepareStatement(sql);
		
		stm.setString(1,product.getName());
		stm.setString(2,product.getDescription());
		stm.setDouble(3,product.getPrice());
		stm.setInt(4,product.getStock());
		stm.setString(5,product.getCategory());
		
		stm.executeUpdate();
		
		connection.close();
		
	}

}
