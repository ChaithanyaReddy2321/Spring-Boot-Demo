package com.tricon.demoSpringBoot.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {
		
		public static void main(String[] args) throws SQLException {
			
			Connection con = getConnection();
			
			String query1 = "CREATE TABLE if not exists employee(id int , name varchar(20), int salary)";
			Statement smt1 = con.createStatement();
			smt1.executeQuery(query1);
			
			String query2 = "INSERT into employee values(1,'NikKlaus', 1000000)";
			String query3 = "INSERT into employee values(2,'Ellijah', 900000)";
			String query4 = "INSERT into employee values(3,'Hope', 900000)";

			smt1.executeQuery(query2);
			smt1.executeQuery(query3);
			smt1.executeQuery(query4);
			
			con.close();
		}
		
		public static Connection getConnection() {
			final String user = "postgres";
			final String url = "jdbc:postgresql://127.0.0.1:5432/postgres";
			final String password = "admin";
			Connection con = null;
			try{
				con = DriverManager.getConnection(url, user, password);
				System.out.println("Connection is established!");			
			} catch(SQLException e) {
				e.printStackTrace();
			}		
			return con;

		}

}
