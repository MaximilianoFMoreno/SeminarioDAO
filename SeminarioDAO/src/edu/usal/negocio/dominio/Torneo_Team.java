package edu.usal.negocio.dominio;

public class Torneo_Team {
	
	int id_torneoT; 
	Equipo5 team1; 
	Equipo5 team2; 
	Equipo5 team3; 
	Equipo5 team4; 
	Equipo5 team5; 
	Equipo5 team6; 
	Equipo5 team7; 
	Equipo5 team8;
	
	
	public Torneo_Team() {}


	public Torneo_Team(int id_torneoT, Equipo5 team1, Equipo5 team2, Equipo5 team3, Equipo5 team4, Equipo5 team5,
			Equipo5 team6, Equipo5 team7, Equipo5 team8) {
		super();
		this.id_torneoT = id_torneoT;
		this.team1 = team1;
		this.team2 = team2;
		this.team3 = team3;
		this.team4 = team4;
		this.team5 = team5;
		this.team6 = team6;
		this.team7 = team7;
		this.team8 = team8;
	}


	public int getId_torneoT() {
		return id_torneoT;
	}


	public void setId_torneoT(int id_torneoT) {
		this.id_torneoT = id_torneoT;
	}


	public Equipo5 getTeam1() {
		return team1;
	}


	public void setTeam1(Equipo5 team1) {
		this.team1 = team1;
	}


	public Equipo5 getTeam2() {
		return team2;
	}


	public void setTeam2(Equipo5 team2) {
		this.team2 = team2;
	}


	public Equipo5 getTeam3() {
		return team3;
	}


	public void setTeam3(Equipo5 team3) {
		this.team3 = team3;
	}


	public Equipo5 getTeam4() {
		return team4;
	}


	public void setTeam4(Equipo5 team4) {
		this.team4 = team4;
	}


	public Equipo5 getTeam5() {
		return team5;
	}


	public void setTeam5(Equipo5 team5) {
		this.team5 = team5;
	}


	public Equipo5 getTeam6() {
		return team6;
	}


	public void setTeam6(Equipo5 team6) {
		this.team6 = team6;
	}


	public Equipo5 getTeam7() {
		return team7;
	}


	public void setTeam7(Equipo5 team7) {
		this.team7 = team7;
	}


	public Equipo5 getTeam8() {
		return team8;
	}


	public void setTeam8(Equipo5 team8) {
		this.team8 = team8;
	}


	@Override
	public String toString() {
		return "Torneo_Team [id_torneoT=" + id_torneoT + ", team1=" + team1 + ", team2=" + team2 + ", team3=" + team3
				+ ", team4=" + team4 + ", team5=" + team5 + ", team6=" + team6 + ", team7=" + team7 + ", team8=" + team8
				+ "]";
	} 
	

}
