package edu.usal.negocio.dao.implementacion;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import edu.usal.negocio.dao.interfaces.I_LoginDAO;
import edu.usal.negocio.dominio.Usuario;
import edu.usal.util.Conexion;

public class LoginDAO_ImplSQL implements I_LoginDAO {

	@Override
	public boolean vLogin(String usuario, String password) throws SQLException {
		
		String validarUser = "SELECT tag_usuario, password_usuario FROM Usuarios WHERE tag_usuario = '"+usuario+"' AND password_usuario = '"+password+"' ";
		
		Conexion objCon = new Conexion();
		Statement stm = null; 
		
		stm = objCon.conectar().createStatement();
		ResultSet r=stm.executeQuery(validarUser);
		
		int x = 0; 
		
		while(r.next()){
			x++; 
		}
		if (x==0) {
			System.out.println("No hay usuario");
			return false; 
			
		}else{
			System.out.println("Usuario Encontrado");
			return true; 
		}
	}

	@Override
	public boolean vtipoUsuario(String usuario) throws SQLException {
		
		String validartipoUsuario = "SELECT tipo_usuario FROM Usuarios WHERE tag_usuario = '"+usuario+"' "; 
		
		Conexion objCon = new Conexion();
		Statement stm = null; 
		
		stm = objCon.conectar().createStatement();
		ResultSet r=stm.executeQuery(validartipoUsuario);
	
		String aux = "Jugador"; 
		aux = r.getString("tipo_usuario"); 
			
			if(aux == "Jugador"){
				System.out.println("Usuario Jugador");
				return false; 	
			}else{
				System.out.println("Admin");
				return true; 
			}
			
		
			
		
	}

}
