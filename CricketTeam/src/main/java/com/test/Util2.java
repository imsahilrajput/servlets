package com.test;

import java.sql.Connection;
import java.sql.DriverManager;

public class Util2 {
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/allstates", "root", "password");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
