package edu.usal.negocio.dao.implementacion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import edu.usal.negocio.dao.interfaces.I_UsuarioDAO;
import edu.usal.negocio.dominio.Torneo_1v1;
import edu.usal.negocio.dominio.Usuario;
import edu.usal.util.Conexion;

public class UsuarioDAO_ImplSQL implements I_UsuarioDAO {
	
	private static final String insertUsuario = "INSERT INTO Usuarios"
													+ "(nombre_usuario, apellido_usuario, tag_usuario, password_usuario, tipo_usuario)"
													+ "VALUES (?,?,?,?,?)";
	
	private static final String deleteUsuario = "DELETE FROM Usuarios WHERE tag_usuario = ?;";
	
	private static final String updateUsuario = "UPDATE Usuarios SET tag_usuario = ? WHERE nombre_usuario = ? AND apellido_usuario = ?;"; 
	
	private static final String updatePassword = "UPDATE Usuarios SET password_usuario = ? WHERE nombre_usuario = ? AND apellido_usuario = ? AND tag_usuario = ?;";
	
	private static final String datosUsuario = "SELECT nombre_usuario, apellido_usuario, tag_usuario WHERE tag_usuario = ?;"; 
	

	@Override
	public void altaUsuario(Usuario usuario) {
		
		Conexion objCon = new Conexion(); 
		
		try {
			PreparedStatement ps = objCon.conectar().prepareStatement(insertUsuario); 
			
			ps.setString(1, usuario.getNombre());
			ps.setString(2, usuario.getApellido());
			ps.setString(3, usuario.getTag());
			ps.setString(4, usuario.getPassword());
			ps.setString(5, usuario.getTipo_user());
			
			ps.executeUpdate(); 
			System.out.println("Insertado");
			
		} catch (Exception e) {
			System.out.println("No se pudo insertar");
			e.printStackTrace();
		}
		
	}

	@Override
	public void bajaUsuario(String tag) {
		
		Conexion objCon = new Conexion();
		
		try {
			
			PreparedStatement ps = objCon.conectar().prepareStatement(deleteUsuario);
			ps.setString(1, tag);
			ps.executeUpdate(); 
			System.out.println("Eliminado");
			
			
		} catch (Exception e) {
			System.out.println("No se elimino");
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateUsuario(Usuario usuario) {
		
		Conexion objCon = new Conexion();
	
		try {
			
			PreparedStatement ps = objCon.conectar().prepareStatement(updateUsuario);
			ps.setString(1, usuario.getTag());
			ps.setString(2, usuario.getNombre());
			ps.setString(3, usuario.getApellido());
			ps.executeUpdate();
			System.out.println("Usuario Actualizado");
			
			
			
		} catch (Exception e) {
			System.out.println("No se pudo actualizar");
			e.printStackTrace();
		}
		
	}

	@Override
	public void updatePassword(Usuario usuario) {
		
		Conexion objCon = new Conexion();
		
		try {
			PreparedStatement ps = objCon.conectar().prepareStatement(updatePassword);
			ps.setString(1, usuario.getPassword());
			ps.setString(2, usuario.getNombre());
			ps.setString(3, usuario.getApellido());
			ps.setString(4, usuario.getTag());
			ps.executeUpdate();
			System.out.println("Password Actualizada");
			
		} catch (Exception e) {
			System.out.println("No se pudo actualizar");
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Usuario> datosUsuario(String tag) {
		
		Conexion objCon = new Conexion();
		Statement stm = null; 
		
		try {
			stm = objCon.conectar().createStatement();
			ResultSet rst = stm.executeQuery("SELECT nombre_usuario, apellido_usuario FROM Usuarios WHERE tag_usuario = '"+ tag +"';");
			List<Usuario> usr1 = new ArrayList<Usuario>(); 
			
			while (rst.next()){
				
				Usuario us = new Usuario(); 
				us.setNombre(rst.getString("nombre_usuario"));
				us.setApellido(rst.getString("apellido_usuario"));
				us.setTag(tag);
				
				usr1.add(us);
			}
			
			System.out.println("Usuario X");
			stm.close();
			
			return usr1; 
			
			
		} catch (Exception e) {
			System.out.println("Devolver"); 
			e.printStackTrace();
		}
		return null;
		
	}
	
	

	

}
