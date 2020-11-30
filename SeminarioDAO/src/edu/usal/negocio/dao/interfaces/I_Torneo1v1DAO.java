package edu.usal.negocio.dao.interfaces;

import java.util.List;

import edu.usal.negocio.dominio.Partida;
import edu.usal.negocio.dominio.Torneo_1v1;


public interface I_Torneo1v1DAO {
	
	void altaTorneo(String torneo1); 
	void unirseTorneo(int id_torneo, String tag_jugador, int nro_slot); 
	List<Torneo_1v1> listarTorneos1v ();
	List<Partida> listarPartida(int idtorneo);
}
