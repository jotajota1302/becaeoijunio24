package edu.eoi.es.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import edu.eoi.es.dto.Product;

//CRUD CREATE READ UPDATE DELETE
public class ProductDao {

	private Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/beca?serverTimezone=UTC&useSSL=false", "root",
				"root");
	}

	public void createProduct(Product product) throws SQLException {

		Connection connection = getConnection();

		String sql = "INSERT INTO productos (nombre,descripcion,precio,stock,categoria) VALUES (?,?,?,?,?)";

		PreparedStatement stm = connection.prepareStatement(sql);

		stm.setString(1, product.getName());
		stm.setString(2, product.getDescription());
		stm.setDouble(3, product.getPrice());
		stm.setInt(4, product.getStock());
		stm.setString(5, product.getCategory());

		stm.executeUpdate();

		connection.close();

	}

	public Product readProduct(int id) throws SQLException {

		Connection connection = getConnection();
		Product product = null;

		String sql = "SELECT id,nombre,descripcion,precio FROM productos WHERE ID=?";

		PreparedStatement stm = connection.prepareStatement(sql);
		stm.setInt(1, id);

		ResultSet rs = stm.executeQuery();

		while (rs.next()) {

			product = new Product();
			product.setId(rs.getInt("id"));
			product.setName(rs.getString("nombre"));
			product.setDescription(rs.getString("descripcion"));
			product.setPrice(rs.getDouble("precio"));

		}

		connection.close();

		return product;

	}

	public void updateProduct(Product product) throws Exception {

		Connection connection = getConnection();

		if (product.getId() == null) {
			throw new Exception("Id no presente");
		} else {

			String sql = "UPDATE productos SET descripcion=? WHERE ID=?";
			PreparedStatement stm = connection.prepareStatement(sql);
			stm.setString(1, product.getDescription());
			stm.setInt(2, product.getId());

			stm.executeUpdate();
		}

		connection.close();

	}

	public void deleteProduct(int id) throws SQLException {

		Connection connection = getConnection();

		String sql = "DELETE FROM productos WHERE id=?";
		PreparedStatement stm = connection.prepareStatement(sql);
		stm.setInt(1, id);

		stm.executeUpdate();

		connection.close();

	}

}
