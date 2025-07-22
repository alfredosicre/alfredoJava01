package com.cursogetafe.ejerciciojpa.consultas;

import com.cursogetafe.ejerciciojpa.config.Config;
import com.cursogetafe.ejerciciojpa.modelo.Cliente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class Consulta3 {
	
	public static void main(String[] args) {
		
		// buscar clientes de una categoria determinada con un apellido determinado
		
		String categoria = "ESPORADICO";
		String apellidos = "Ramirez";
		
		EntityManager em = Config.getEmf().createEntityManager();
		
		String jpql = "select c from Cliente c where c.categoria = :cat and c.persona.apellidos = :ape"; // lo que va despues de los dos puntos es el nombre de un parametro
		
		TypedQuery<Cliente> q = em.createQuery(jpql, Cliente.class);
		q.setParameter("cat", categoria);
		q.setParameter("ape", apellidos);
		
		q.getResultList().forEach(System.out::println);
		
		System.out.println("------------------------");
		System.out.println();
		
		
		
	}

}
