package edu.usal.negocio.dominio;

public class Equipo5 {
	
	String nombre_equipo; 
	Usuario capitan; 
	Usuario miembro2; 
	Usuario miembro3; 
	Usuario miembro4; 
	Usuario miembro5;
	
	
	public Equipo5() {}



	public Equipo5(String nombre_equipo, Usuario capitan, Usuario miembro2, Usuario miembro3, Usuario miembro4,
			Usuario miembro5) {
		super();
		this.nombre_equipo = nombre_equipo;
		this.capitan = capitan;
		this.miembro2 = miembro2;
		this.miembro3 = miembro3;
		this.miembro4 = miembro4;
		this.miembro5 = miembro5;
	}



	public String getNombre_equipo() {
		return nombre_equipo;
	}



	public void setNombre_equipo(String nombre_equipo) {
		this.nombre_equipo = nombre_equipo;
	}



	public Usuario getCapitan() {
		return capitan;
	}



	public void setCapitan(Usuario capitan) {
		this.capitan = capitan;
	}



	public Usuario getMiembro2() {
		return miembro2;
	}



	public void setMiembro2(Usuario miembro2) {
		this.miembro2 = miembro2;
	}



	public Usuario getMiembro3() {
		return miembro3;
	}



	public void setMiembro3(Usuario miembro3) {
		this.miembro3 = miembro3;
	}



	public Usuario getMiembro4() {
		return miembro4;
	}



	public void setMiembro4(Usuario miembro4) {
		this.miembro4 = miembro4;
	}



	public Usuario getMiembro5() {
		return miembro5;
	}



	public void setMiembro5(Usuario miembro5) {
		this.miembro5 = miembro5;
	}



	@Override
	public String toString() {
		return "Equipo5 [nombre_equipo=" + nombre_equipo + ", capitan=" + capitan + ", miembro2=" + miembro2
				+ ", miembro3=" + miembro3 + ", miembro4=" + miembro4 + ", miembro5=" + miembro5 + "]";
	} 
	
	
}
