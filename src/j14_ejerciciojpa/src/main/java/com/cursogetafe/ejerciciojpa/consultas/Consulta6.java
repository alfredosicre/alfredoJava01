package com.cursogetafe.ejerciciojpa.consultas;


import java.util.List;

import com.cursogetafe.ejerciciojpa.config.Config;
import com.cursogetafe.ejerciciojpa.modelo.ClienteCategoria;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;


public class Consulta6 {
	
	public static void main(String[] args) {
		
		cantClientesPorCategoria().forEach(System.out::println);
	}
	
	public static List<ClienteCategoria> cantClientesPorCategoria(){
		
		EntityManager em = Config.getEmf().createEntityManager();
		
		// buscar la cantidad de clientes por categoria
		
//		String jpql = "select new com.cursogetafe.ejerciciojpa.modelo.ClienteCategoria(c.categoria, count(c.idRol)) from Cliente c group by c.categoria"; 
		String jpql = "select c.categoria, count(c.idRol) from Cliente c group by c.categoria"; 
		
		TypedQuery<ClienteCategoria> q = em.createQuery(jpql, ClienteCategoria.class);
		
		return q.getResultList();

	}
}
