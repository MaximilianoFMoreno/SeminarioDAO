package edu.usal.negocio.dao.interfaces;

import java.util.List;

import edu.usal.negocio.dominio.Usuario;

public interface I_UsuarioDAO {
	
	void altaUsuario(Usuario usuario); 
	void bajaUsuario(String tag); 
	void updateUsuario(Usuario usuario); 
	void updatePassword(Usuario usuario); 
	List<Usuario> datosUsuario(String tag);

}
