package edu.usal.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	
public Connection conectar(){
		
		Connection con = null;
		
		try {
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
			con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=Seminario","Maxi","123456");
			
			if (con.isValid(0)) {
				System.out.println("Conexion Establecida");	
				
			}
			
		} catch (Exception e) {
			System.out.println("No se pudo conectar");
			e.printStackTrace();
		}
		
		return con;
		
		
	}

}
