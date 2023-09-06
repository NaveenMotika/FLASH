package com.nt.dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectonConnect{
	private static Connection con;
	static {
		  try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","9652");
		} catch (Exception cnfe) {
			cnfe.printStackTrace();
		} 
	  }
	public static Connection getCon() {
		return con;
	}
	
}
