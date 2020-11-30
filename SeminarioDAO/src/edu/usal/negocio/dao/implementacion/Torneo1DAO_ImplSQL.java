package edu.usal.negocio.dao.implementacion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import edu.usal.negocio.dao.interfaces.I_Torneo1v1DAO;
import edu.usal.negocio.dominio.Partida;
import edu.usal.negocio.dominio.Torneo_1v1;
import edu.usal.util.Conexion;

public class Torneo1DAO_ImplSQL implements I_Torneo1v1DAO {
	
	
	private static final String insertTorneo = "INSERT INTO Torneos1v (Nombre_torneo) VALUES (?);"; 
	
	@Override
	public void altaTorneo(String torneo1) {
		
		Conexion objCon = new Conexion(); 
		
		try {
			
			PreparedStatement ps = objCon.conectar().prepareStatement(insertTorneo); 
			ps.setString(1, torneo1);
			ps.executeUpdate(); 
			System.out.println("Torneo de 1v1 creado");
			
			
		} catch (Exception e) {
			
			System.out.println("No se pudo insertar");
			e.printStackTrace();
			
		}
		
	}

	@Override
	public void unirseTorneo(int id_torneo, String tag_jugador, int nro_slot) {
		
		Conexion objCon = new Conexion();
		String aux_slotTorneo = null; 
		
		if (nro_slot == 1) {
			
			aux_slotTorneo = "Jugador1_torneo"; 
		}
		
		if (nro_slot == 2) {
			
			aux_slotTorneo = "Jugador2_torneo"; 
		}
		
		if (nro_slot == 3) {
			
			aux_slotTorneo = "Jugador3_torneo"; 
		}
		
		if (nro_slot == 4) {
			
			aux_slotTorneo = "Jugador4_torneo"; 
		}
		
		if (nro_slot == 5) {
			
			aux_slotTorneo = "Jugador5_torneo"; 
		}
		
		if (nro_slot == 6) {
			
			aux_slotTorneo = "Jugador6_torneo"; 
		}
		
		if (nro_slot == 7) {
			
			aux_slotTorneo = "Jugador7_torneo"; 
		}
		
		if (nro_slot == 8) {
			
			aux_slotTorneo = "Jugador8_torneo"; 
		}
		
		String unirseTorneo = "UPDATE Torneos1v SET " + aux_slotTorneo + " = ? WHERE ID_Tabla = ?;"; 
		
		
		try {
			
			PreparedStatement ps = objCon.conectar().prepareStatement(unirseTorneo);
			ps.setString(1, tag_jugador);
			ps.setInt(2, id_torneo);
			ps.executeUpdate();
			System.out.println("Jugador se unio al torneo");
			
		} catch (Exception e) {
			
			System.out.println("No se pudo unir al torneo");
			e.printStackTrace();
		}
		
		
	}

	@Override
	public List<Torneo_1v1> listarTorneos1v() {
		
		Conexion objCon = new Conexion();
		Statement stm = null; 
		List<Torneo_1v1> trn1 = new ArrayList<Torneo_1v1>(); 
		try {
			stm = objCon.conectar().createStatement();
			
			ResultSet rst = stm.executeQuery("SELECT * FROM Torneos1v");  
			while (rst.next()) {
				
				Torneo_1v1 torneo = new Torneo_1v1(); 
				
				
				torneo.setId_torneo(rst.getInt("ID_Tabla")); 
				torneo.setJugador1(rst.getString("Jugador1_torneo"));
				torneo.setJugador2(rst.getString("Jugador2_torneo"));
				torneo.setJugador3(rst.getString("Jugador3_torneo"));
				torneo.setJugador4(rst.getString("Jugador4_torneo"));
				torneo.setJugador5(rst.getString("Jugador5_torneo"));
				torneo.setJugador6(rst.getString("Jugador6_torneo"));
				torneo.setJugador7(rst.getString("Jugador7_torneo"));
				torneo.setJugador8(rst.getString("Jugador8_torneo"));
				
				
				trn1.add(torneo); 
			}
			
			System.out.println("Lista de Torneos");
			stm.close();
			
			
			return trn1; 
			
			
		} catch (Exception e) {
			
			System.out.println("No se pudo imprimir"); 
			e.printStackTrace();
		}
		
		
		return null;
	}

	@Override
	public List<Partida> listarPartida(int idtorneo) {
		
		Conexion objCon = new Conexion();
		Statement stm = null; 
		List<Partida> prt1 = new ArrayList<Partida>();
		
		
		try {
			
			stm = objCon.conectar().createStatement();
			
			ResultSet rst = stm.executeQuery("SELECT * FROM Partidas WHERE IDtorneo_partida = '" +idtorneo+ "';"); 
			
			while (rst.next()) {
				
				Partida pr = new Partida(); 
				pr.setId_partida(rst.getInt("ID_Partida"));
				pr.setJugador1(rst.getString("Jugador1_partida"));
				pr.setJugador2(rst.getString("Jugador2_partida"));
				pr.setFecha(rst.getString("Fecha_partida"));
				pr.setGanador(rst.getString("Ganador_partida"));
				pr.setIdtorneo(idtorneo);
				
				prt1.add(pr); 
				}
			System.out.println("Lista de Partidas");
			stm.close();
			
			return prt1; 
			
		} catch (Exception e) {
			System.out.println("No se pudo hacer");
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	
	
	
	

}
