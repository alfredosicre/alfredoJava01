package com.cursogetafe.ejerciciojpa.consultas;

import java.util.List;

import com.cursogetafe.ejerciciojpa.config.Config;
import com.cursogetafe.ejerciciojpa.modelo.Cliente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class Consulta01 {
	
	public static void main(String[] args) {
		
		EntityManager em = Config.getEmf().createEntityManager();
		
		// buscar todos los objetos de la clase clientes
		
		String jpql = "Select c from Cliente c";
		
		TypedQuery<Cliente> q = em.createQuery(jpql, Cliente.class);
		
		List<Cliente> clientes = q.getResultList();
		
		clientes.forEach(System.out::println);
	}

}
