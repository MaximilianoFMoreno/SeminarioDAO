package edu.usal.negocio.dao.implementacion;

import java.sql.PreparedStatement;

import edu.usal.negocio.dao.interfaces.I_EquipoDAO;
import edu.usal.negocio.dominio.Equipo5;
import edu.usal.negocio.dominio.Usuario;
import edu.usal.util.Conexion;

public class EquipoDAO_ImplSQL implements I_EquipoDAO{
	
	private static final String insertEquipo = "INSERT INTO Equipos"
													+ "(nombre_equipo, capitan_equipo)"
													+ "VALUES (?,?)";
	
	
	private static final String deleteEquipo = "DELETE FROM Equipos WHERE nombre_equipo = ?;";
	
	private static final String insertJugador2 = "UPDATE Equipos SET jugador2_equipo = ? WHERE nombre_equipo = ?;";
	
	private static final String insertJugador3 = "UPDATE Equipos SET jugador3_equipo = ? WHERE nombre_equipo = ?;";
	
	private static final String insertJugador4 = "UPDATE Equipos SET jugador4_equipo = ? WHERE nombre_equipo = ?;";
	
	private static final String insertJugador5 = "UPDATE Equipos SET jugador5_equipo = ? WHERE nombre_equipo = ?;";
	
	

	@Override
	public void altaEquipo(String nombre_equipo5, Usuario capitan_equipo5) {
		
		Conexion objCon = new Conexion();
		
		
		try {
			
			PreparedStatement ps = objCon.conectar().prepareStatement(insertEquipo);
			ps.setString(1,nombre_equipo5);
			ps.setString(2, capitan_equipo5.getTag());
			
			ps.executeUpdate(); 
			System.out.println("Equipo Creado");
		
		} catch (Exception e) {
			
			System.out.println("No se creo el equipo");
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void bajaEquipo(String nombreEquipo) {
		
		Conexion objCon = new Conexion();
		
		try {
			
			PreparedStatement ps = objCon.conectar().prepareStatement(deleteEquipo);
			ps.setString(1, nombreEquipo);
			ps.executeUpdate();
			System.out.println("Equipo Eliminado");
			
		} catch (Exception e) {
			System.out.println("No se pudo eliminar el equipo");
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void expulsarJugador(String nEquipo, String tagJugador, int nro_jugador) {
	
		Conexion objCon = new Conexion();
		String aux_nJugador = null; 
		
		if (nro_jugador == 2) {
			aux_nJugador = "jugador2_equipo"; 
		}
		if (nro_jugador == 3) {
			aux_nJugador = "jugador3_equipo"; 
		}
		if (nro_jugador == 4) {
			aux_nJugador = "jugador4_equipo"; 
		}
		if (nro_jugador == 5) {
			aux_nJugador = "jugador5_equipo"; 
		}
		
		String updateJugador = "UPDATE Equipos SET " +aux_nJugador+ "= 'Disponible' WHERE nombre_equipo = ? AND jugador2_equipo = ? or jugador3_equipo = ? or jugador4_equipo = ? or jugador5_equipo = ?"; 
			
		try {
			
			PreparedStatement ps = objCon.conectar().prepareStatement(updateJugador);
			ps.setString(1, nEquipo);
			ps.setString(2, tagJugador);
			ps.setString(3, tagJugador);
			ps.setString(4, tagJugador);
			ps.setString(5, tagJugador);
			ps.executeUpdate();
			System.out.println("Se expulso al jugador");
			
		} catch (Exception e) {
			System.out.println("No se pudo expulsar al jugador");
			e.printStackTrace();
		}
		
	}

	@Override
	public void nuevoJugador2(String jugadorNuevo2, String nombre_equipo) {
		
		Conexion objCon = new Conexion();
		
			try {
			
			PreparedStatement ps = objCon.conectar().prepareStatement(insertJugador2);
			ps.setString(1, jugadorNuevo2);
			ps.setString(2, nombre_equipo);
			ps.executeUpdate();
			System.out.println("Jugador 2 insertado");
			
		} catch (Exception e) {
			System.out.println("No se pudo insetar el jugador 2");
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void nuevoJugador3(String jugadorNuevo3, String nombre_equipo) {
		
		Conexion objCon = new Conexion();
		
		try {
			
			PreparedStatement ps = objCon.conectar().prepareStatement(insertJugador3);
			ps.setString(1, jugadorNuevo3);
			ps.setString(2, nombre_equipo);
			ps.executeUpdate();
			System.out.println("Jugador 3 insertado");
			
		} catch (Exception e) {
			System.out.println("No se pudo insetar el jugador 3");
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public void nuevoJugador4(String jugadorNuevo4, String nombre_equipo) {
		
		Conexion objCon = new Conexion();
		
		try {
			
			PreparedStatement ps = objCon.conectar().prepareStatement(insertJugador4);
			ps.setString(1, jugadorNuevo4);
			ps.setString(2, nombre_equipo);
			ps.executeUpdate();
			System.out.println("Jugador 4 insertado");
			
		} catch (Exception e) {
			System.out.println("No se pudo insetar el jugador 4");
			e.printStackTrace();
		}
		
	}

	@Override
	public void nuevoJugador5(String jugadorNuevo5, String nombre_equipo) {
		
		Conexion objCon = new Conexion();
		
try {
			
			PreparedStatement ps = objCon.conectar().prepareStatement(insertJugador5);
			ps.setString(1, jugadorNuevo5);
			ps.setString(2, nombre_equipo);
			ps.executeUpdate();
			System.out.println("Jugador 5 insertado");
			
		} catch (Exception e) {
			System.out.println("No se pudo insetar el jugador 5");
			e.printStackTrace();
		}
		
	}

}
