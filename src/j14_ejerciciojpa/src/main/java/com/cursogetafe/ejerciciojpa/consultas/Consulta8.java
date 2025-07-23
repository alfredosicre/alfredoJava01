package com.cursogetafe.ejerciciojpa.consultas;


import java.util.List;

import com.cursogetafe.ejerciciojpa.config.Config;
import com.cursogetafe.ejerciciojpa.modelo.ClienteDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;


public class Consulta8 { // listado de clientes DTO que han comprado discos sera el 8
	
	public static void main(String[] args) {
		
		cantClientes().forEach(System.out::println);
	}
	
	public static List<ClienteDTO> cantClientes(){
		
		String producto = "disco";
		
		EntityManager em = Config.getEmf().createEntityManager();
		
		// ver todos los clientes
		
//		String jpql = "select new com.cursogetafe.ejerciciojpa.modelo.ClienteCategoria(c.categoria, count(c.idRol)) from Cliente c group by c.categoria"; 
		String jpql = "select c.idRol, c.persona.apellidos, c.categoria, c.nroCliente from Cliente c join c.productos p where p.producto like :prod"; 
		
		TypedQuery<ClienteDTO> q = em.createQuery(jpql, ClienteDTO.class);
		q.setParameter("prod", "%" + producto + "%");
		
		return q.getResultList();

	}
}
