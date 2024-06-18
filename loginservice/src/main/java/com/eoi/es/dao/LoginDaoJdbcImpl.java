package com.eoi.es.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDaoJdbcImpl {

	public boolean login(String user, String password) throws SQLException {

		Connection connection = null;
		boolean present = false;

		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/beca?serverTimezone=UTC", "root", "root");

		PreparedStatement statement = connection.prepareStatement("SELECT * FROM users where user=? and password=?");
		statement.setString(1, user);
		statement.setString(2, password);

		ResultSet rs = statement.executeQuery();

		while (rs.next()) {
			present = true;
		}

		return present;

	}

}
