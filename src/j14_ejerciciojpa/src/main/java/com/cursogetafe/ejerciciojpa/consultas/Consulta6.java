package com.cursogetafe.ejerciciojpa.consultas;

import java.util.List;

import com.cursogetafe.ejerciciojpa.config.Config;
import com.cursogetafe.ejerciciojpa.modelo.Cliente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class Consulta6 {
	
	public static void main(String[] args) {
		
		EntityManager em = Config.getEmf().createEntityManager();
		
		// buscar la cantidad de clientes por categoria
		
		String jpql = "select count(c.idRol), c.categoria from Cliente c group by c.categoria"; 
		
		List<Object[]> lista = em.createQuery(jpql, Object[].class).getResultList();
		
		for (Object[] objects : lista) {
			
			System.out.println(objects[0] + " : " + objects[1]);
			
		}
		
	}

}
