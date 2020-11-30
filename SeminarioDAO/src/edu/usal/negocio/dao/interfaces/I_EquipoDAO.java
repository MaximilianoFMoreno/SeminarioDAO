package edu.usal.negocio.dao.interfaces;

import edu.usal.negocio.dominio.Equipo5;
import edu.usal.negocio.dominio.Usuario;

public interface I_EquipoDAO {
	
	void altaEquipo(String nombre_equipo5, Usuario capitan_equipo5);
	void bajaEquipo(String nombreEquipo);
	void expulsarJugador(String nEquipo, String tagJugador, int nro_jugador); 
	void nuevoJugador2(String jugadorNuevo2, String nombre_equipo);  //Lo voy a hacer insertando jugador por jugador, AGREGAR PARA EL RESTO DE LOS PLAYERS 
	void nuevoJugador3(String jugadorNuevo3, String nombre_equipo);
	void nuevoJugador4(String jugadorNuevo4, String nombre_equipo);
	void nuevoJugador5(String jugadorNuevo5, String nombre_equipo);
}
