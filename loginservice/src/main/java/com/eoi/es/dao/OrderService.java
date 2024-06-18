package com.eoi.es.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.eoi.es.dto.Order;

public class OrderService {

	public List<Order> findOrdersByUserMail(String mail) throws SQLException {

		List<Order> orders = new ArrayList<Order>();

		// 1 -Hacer una llamada a BBDD para recuperar la lista de ordenes de un usuario
		// con ese mail

		Connection connection = null;
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/beca?serverTimezone=UTC", "root", "root");

		PreparedStatement statement = connection
				.prepareStatement("SELECT * FROM orders o,users u WHERE o.iduser=u.id AND u.mail=? ORDER BY date DESC");
		statement.setString(1, mail);

		ResultSet rs = statement.executeQuery();

		// 2-Recoger el resultado de la query(resultset) y crear objets de tipo order
		// con la informacion que nos devuelven
		// y meterlos en una lista

		while (rs.next()) {

			Order order = new Order();
			order.setCode(rs.getString("code"));
			order.setDate(rs.getDate("date"));
			order.setTotal(rs.getDouble("total"));
			order.setUser(rs.getString("user"));

			orders.add(order);
		}

		// 3-Ordenar la lista por fecha del pedido (+ nuevo a + antiguo)	
		// Collections.sort() pero como lo ordeno con la sql me ahorro trabajo
		
		return orders;

	}

}
