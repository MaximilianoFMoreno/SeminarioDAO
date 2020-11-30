package edu.usal.negocio.dominio;

public class Partida {
	
	
	int id_partida; 
	String jugador1; 
	String jugador2; 
	String fecha; 
	String ganador; 
	int idtorneo;
	
	
	public Partida() {
	}


	public Partida(int id_partida, String jugador1, String jugador2, String fecha, String ganador, int idtorneo) {
		super();
		this.id_partida = id_partida;
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
		this.fecha = fecha;
		this.ganador = ganador;
		this.idtorneo = idtorneo;
	}


	public int getId_partida() {
		return id_partida;
	}


	public void setId_partida(int id_partida) {
		this.id_partida = id_partida;
	}


	public String getJugador1() {
		return jugador1;
	}


	public void setJugador1(String jugador1) {
		this.jugador1 = jugador1;
	}


	public String getJugador2() {
		return jugador2;
	}


	public void setJugador2(String jugador2) {
		this.jugador2 = jugador2;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public String getGanador() {
		return ganador;
	}


	public void setGanador(String ganador) {
		this.ganador = ganador;
	}


	public int getIdtorneo() {
		return idtorneo;
	}


	public void setIdtorneo(int idtorneo) {
		this.idtorneo = idtorneo;
	}


	@Override
	public String toString() {
		return "Partida [id_partida=" + id_partida + ", jugador1=" + jugador1 + ", jugador2=" + jugador2 + ", fecha="
				+ fecha + ", ganador=" + ganador + ", idtorneo=" + idtorneo + "]";
	} 
	
	
	
	
	

}
