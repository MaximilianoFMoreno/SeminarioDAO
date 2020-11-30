package edu.usal.negocio.dominio;

public class Usuario {
	
	String nombre; 
	String apellido; 
	String tag; 
	String password; 
	String tipo_user;	
	
	public Usuario() {}


	public Usuario(String nombre, String apellido, String tag, String password, String tipo_user) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.tag = tag;
		this.password = password;
		this.tipo_user = tipo_user;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getTag() {
		return tag;
	}


	public void setTag(String tag) {
		this.tag = tag;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getTipo_user() {
		return tipo_user;
	}


	public void setTipo_user(String tipo_user) {
		this.tipo_user = tipo_user;
	}


	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", tag=" + tag + ", password=" + password
				+ ", tipo_user=" + tipo_user + "]";
	} 
	
	
	
	
	

}
