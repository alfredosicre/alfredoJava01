package com.cursogetafe.ejerciciojpa.consultas;

import com.cursogetafe.ejerciciojpa.config.Config;
import com.cursogetafe.ejerciciojpa.modelo.Cliente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class Consulta5 {
	
	public static void main(String[] args) {
		
		EntityManager em = Config.getEmf().createEntityManager();
		
		// busca todos los clientes con todos sus datos que por defecto entan en modo eager.
		// No carga los productos LAZY
		// para cargar los datos de las personas, realiza una consulta por cada rol
		
		String jpql1 = "select c from Cliente c"; 
		
		// Realiza una consulta con join a personas con todos los datos
		// No carga los productos (LAZY)
		
		String jpql2 = "select c from Cliente c join fetch c.persona left join fetch c.productos ";
		
		// Realiza una sola consulta de clientes join roles join personas join clientes_productos join productos
		// Devuelve los productos en modo eager
		
		String jpql3 = "select c from Cliente c join fetch c.persona left join fetch c.productos "; // fech lo convierte a eager, en la misma consulta lo carga todo
		
		TypedQuery<Cliente> q = em.createQuery(jpql3, Cliente.class);
		
		for (Cliente cli : q.getResultList()) {
			
			System.out.println(cli);
			System.out.println("/t" + cli.getProductos());
		}
		
	}

}
