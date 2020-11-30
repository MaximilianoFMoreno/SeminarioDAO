package edu.usal.negocio.dominio;

public class Torneo_1v1 extends Usuario{
	
	int id_torneo; 
	
	String jugador1; 
	String jugador2; 
	String jugador3; 
	String jugador4; 
	String jugador5; 
	String jugador6; 
	String jugador7; 
	String jugador8;
	int id_match1;
	int id_match2;
	int id_match3;
	int id_match4;
	int id_match5;
	int id_match6;
	int id_match7;
	String campeon_torneo;

	
	
	
	public Torneo_1v1() {}




	public Torneo_1v1(int id_torneo, String jugador1, String jugador2, String jugador3, String jugador4,
			String jugador5, String jugador6, String jugador7, String jugador8, int id_match1, int id_match2,
			int id_match3, int id_match4, int id_match5, int id_match6, int id_match7, String campeon_torneo) {
		super();
		this.id_torneo = id_torneo;
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
		this.jugador3 = jugador3;
		this.jugador4 = jugador4;
		this.jugador5 = jugador5;
		this.jugador6 = jugador6;
		this.jugador7 = jugador7;
		this.jugador8 = jugador8;
		this.id_match1 = id_match1;
		this.id_match2 = id_match2;
		this.id_match3 = id_match3;
		this.id_match4 = id_match4;
		this.id_match5 = id_match5;
		this.id_match6 = id_match6;
		this.id_match7 = id_match7;
		this.campeon_torneo = campeon_torneo;
	}




	public int getId_torneo() {
		return id_torneo;
	}




	public void setId_torneo(int id_torneo) {
		this.id_torneo = id_torneo;
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




	public String getJugador3() {
		return jugador3;
	}




	public void setJugador3(String jugador3) {
		this.jugador3 = jugador3;
	}




	public String getJugador4() {
		return jugador4;
	}




	public void setJugador4(String jugador4) {
		this.jugador4 = jugador4;
	}




	public String getJugador5() {
		return jugador5;
	}




	public void setJugador5(String jugador5) {
		this.jugador5 = jugador5;
	}




	public String getJugador6() {
		return jugador6;
	}




	public void setJugador6(String jugador6) {
		this.jugador6 = jugador6;
	}




	public String getJugador7() {
		return jugador7;
	}




	public void setJugador7(String jugador7) {
		this.jugador7 = jugador7;
	}




	public String getJugador8() {
		return jugador8;
	}




	public void setJugador8(String jugador8) {
		this.jugador8 = jugador8;
	}




	public int getId_match1() {
		return id_match1;
	}




	public void setId_match1(int id_match1) {
		this.id_match1 = id_match1;
	}




	public int getId_match2() {
		return id_match2;
	}




	public void setId_match2(int id_match2) {
		this.id_match2 = id_match2;
	}




	public int getId_match3() {
		return id_match3;
	}




	public void setId_match3(int id_match3) {
		this.id_match3 = id_match3;
	}




	public int getId_match4() {
		return id_match4;
	}




	public void setId_match4(int id_match4) {
		this.id_match4 = id_match4;
	}




	public int getId_match5() {
		return id_match5;
	}




	public void setId_match5(int id_match5) {
		this.id_match5 = id_match5;
	}




	public int getId_match6() {
		return id_match6;
	}




	public void setId_match6(int id_match6) {
		this.id_match6 = id_match6;
	}




	public int getId_match7() {
		return id_match7;
	}




	public void setId_match7(int id_match7) {
		this.id_match7 = id_match7;
	}




	public String getCampeon_torneo() {
		return campeon_torneo;
	}




	public void setCampeon_torneo(String campeon_torneo) {
		this.campeon_torneo = campeon_torneo;
	}




	@Override
	public String toString() {
		return "Torneo_1v1 [id_torneo=" + id_torneo + ", jugador1=" + jugador1 + ", jugador2=" + jugador2
				+ ", jugador3=" + jugador3 + ", jugador4=" + jugador4 + ", jugador5=" + jugador5 + ", jugador6="
				+ jugador6 + ", jugador7=" + jugador7 + ", jugador8=" + jugador8 + ", id_match1=" + id_match1
				+ ", id_match2=" + id_match2 + ", id_match3=" + id_match3 + ", id_match4=" + id_match4 + ", id_match5="
				+ id_match5 + ", id_match6=" + id_match6 + ", id_match7=" + id_match7 + ", campeon_torneo="
				+ campeon_torneo + "]";
	}
	
	
	
	





}
