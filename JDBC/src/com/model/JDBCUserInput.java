package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCUserInput {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your Data Here");
		
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test");
			
			//This is test Java class
			//This is test Java class/This is test Java class
			String sql="insert into customer values(?,?,?,?)";
			
			System.out.println("Enter product id");
			
			int id=sc.nextInt();
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			System.out.println("Excepton handled");
			e.printStackTrace();
		}
		
		
		
		
	}

}
