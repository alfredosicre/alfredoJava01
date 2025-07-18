package com.cursogetafe.jpa.ejemplo04pkcompuesta;

import com.cursogetafe.jpa.config.Config;
import jakarta.persistence.EntityManager;

public class TestB {
	
	public static void main(String[] args) {
		
		EntityManager em = Config.getEmf().createEntityManager();
		
		// consultar un registro
		Persona04B p = em.find(Persona04B.class, new dniB(12121212, 'A'));
		
		System.out.println(p);
		
		// crear un registro
		Persona04B nuevo = new Persona04B(new dniB(99999901, 'Z'), "ZZZZZZZZZZZ");
		
		em.getTransaction().begin();
		em.persist(nuevo);
		em.getTransaction().commit();
		
	}

}
