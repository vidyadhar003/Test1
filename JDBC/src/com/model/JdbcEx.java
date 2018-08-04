package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vidyadhar", "root", "root");
			Statement stmt = con.createStatement();

			String sql = "insert into customer values(114,'raj',' Amalner')";

			System.out.println("Data insrted");

			stmt.executeUpdate(sql);

			ResultSet rs = stmt.executeQuery("select * from customer");

			while (rs.next()) {

				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));

			}

			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
