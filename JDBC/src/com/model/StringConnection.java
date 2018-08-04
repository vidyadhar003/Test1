package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StringConnection {

	public static void main(String[] args) {

		Connection con = null;

		String url = "jdbc:mysql://localhost:3306/test";
		//String db = "test";
		String user = "root";
		String pass = "root";
		String driver = "com.mysql.jdbc.Driver";

		try {
			Class.forName(driver);

			DriverManager.setLoginTimeout(10);
			System.out.println("Connection Login timeout : " + DriverManager.getLoginTimeout() + " sec");

			con = DriverManager.getConnection(url , user, pass);

			System.out.println("Conection is created");

			con.close();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
