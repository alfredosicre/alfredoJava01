package com.cursogetafe.jpa.ejemplo04pkcompuesta;

import com.cursogetafe.jpa.config.Config;
import jakarta.persistence.EntityManager;

public class Test01 {
	
	public static void main(String[] args) {
		
		EntityManager em = Config.getEmf().createEntityManager();
		
		// consultar un registro
		Persona04 p = em.find(Persona04.class, new dni(12121212, 'A'));
		
		System.out.println(p);
		
		// crear un registro
		Persona04 nuevo = new Persona04(88888888, 'Z', "PPPPPPPP");
		em.getTransaction().begin();
		em.persist(nuevo);
		em.getTransaction().commit();
		
	}

}
