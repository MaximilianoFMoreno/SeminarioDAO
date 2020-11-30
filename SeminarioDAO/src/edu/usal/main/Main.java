package edu.usal.main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import edu.usal.negocio.dao.implementacion.EquipoDAO_ImplSQL;
import edu.usal.negocio.dao.implementacion.LoginDAO_ImplSQL;
import edu.usal.negocio.dao.implementacion.Torneo1DAO_ImplSQL;
import edu.usal.negocio.dao.implementacion.UsuarioDAO_ImplSQL;
import edu.usal.negocio.dominio.Equipo5;
import edu.usal.negocio.dominio.Torneo_1v1;
import edu.usal.negocio.dominio.Usuario;
import edu.usal.util.Conexion;

public class Main {

	public static void main(String[] args) throws SQLException{
		
		Conexion objCon = new Conexion(); 		
		System.out.println(objCon.conectar());
		
		/*
		 * PRUEBA ALTA DE USUARIOS
		UsuarioDAO_ImplSQL us = new UsuarioDAO_ImplSQL(); 
		Usuario user = new Usuario("maxi2","moreno2","polak2","hola2","Jugador"); 	
		us.altaUsuario(user);
		*/
		
		/*
		 * PRUEBA BAJA DE USUARIOS
		UsuarioDAO_ImplSQL us = new UsuarioDAO_ImplSQL(); 
		us.bajaUsuario("polak2");
		*/
		
		/*
		 * PRUEBA DE UPDATE USUARIO 
		UsuarioDAO_ImplSQL us = new UsuarioDAO_ImplSQL(); 
		Usuario user = new Usuario("maxi2","moreno2","polakito2","hola2","Jugador");
		us.updateUsuario(user);
		*/
		
		/*
		 * PRUEBA DE ACTUALIZAR CONTRASEÑA
		UsuarioDAO_ImplSQL us = new UsuarioDAO_ImplSQL(); 
		Usuario user = new Usuario("maxi2","moreno2","polakito2","chau1","Jugador");
		us.updatePassword(user);
		*/
		
		/*
		 * PRUEBA ALTA EQUIPO
		EquipoDAO_ImplSQL eq = new EquipoDAO_ImplSQL(); 
		Usuario userCapi = new Usuario(); 
		userCapi.setTag("Kubar");
		eq.altaEquipo("INDIRECTED", userCapi);
		*/
		
		/*
		 * PRUEBA ELIMINAR EQUIPO
		EquipoDAO_ImplSQL eq = new EquipoDAO_ImplSQL(); 
		eq.bajaEquipo("INDIRECTED");
		*/
		
		/*
		 * PRUEBA EXPULSAR JUGADOR DE EQUIPO
		EquipoDAO_ImplSQL eq = new EquipoDAO_ImplSQL();
		eq.expulsarJugador("Willys", "AsG", 4);
		*/
		
		/*
		 *  PRUEBA AGREGAR JUGADOR 2
		 *  -El resto de los jugadores usan la arquitectura. 
		EquipoDAO_ImplSQL eq = new EquipoDAO_ImplSQL();
		eq.nuevoJugador2("Kovic", "LvA Gaming3");
		*/
		
		/*
		 *  PRUEBA ALTA DE TORNEOS
		Torneo1DAO_ImplSQL tr = new Torneo1DAO_ImplSQL(); 
		tr.altaTorneo("Torneo 2");
		*/
		
		/*
		 *  PRUEBA UNIRSE JUGADOR A TORNEO
		Torneo1DAO_ImplSQL tr = new Torneo1DAO_ImplSQL(); 
		tr.unirseTorneo(1, "Eliot", 8);
		*/
		
		
		/*
		 *  PRUEBA LISTAR TORNEOS
		Torneo1DAO_ImplSQL tr = new Torneo1DAO_ImplSQL();
		List<Torneo_1v1> tra = tr.listarTorneos1v(); 
		
		for (Torneo_1v1 torneo_1v1 : tra) {
			System.out.println(torneo_1v1.toString());
		}
		*/
		
		/*
		 * PRUEBA VALIDACION TIPO USUARIO F
		 
		LoginDAO_ImplSQL usq = new LoginDAO_ImplSQL(); 
		//Usuario us = new Usuario(); 
		//us.setTipo_user("polak");
		usq.vtipoUsuario("polak");
		/*
		try {
			if(usq.vtipoUsuario(us.getTipo_user()) == false){
				System.out.println("jugador");
			}
		} catch (SQLException e) {
			System.out.println("No anda");
			e.printStackTrace();
		} 
		*/
		
		/* PRUEBA TRAER DATOS DEL USUARIO
		
		UsuarioDAO_ImplSQL us = new UsuarioDAO_ImplSQL();
		//us.datosUsuario("polak");
		List<Usuario> lus = us.datosUsuario("polak");
		
		
		for (Usuario usuario : lus) {
			System.out.println(usuario.getNombre());
			System.out.println(usuario.getApellido());
			System.out.println(usuario.getTag());
		}
		
		*/
		
		
		
		
	
	}

}
