package com.cursogetafe.jpa.ejemplo01;

import com.cursogetafe.jpa.config.Config;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;


public class Test01 {
	
	public static void main(String[] args) {
		
		// consulta de una persona
		EntityManagerFactory emf = Config.getEmf();
		EntityManager em = emf.createEntityManager();
		
		 Persona p = em.find(Persona.class, 12);
		 if(p != null)
			 System.out.println(p);
		 else
			 System.out.println("Esta persona no existe");
		 em.close();
		
	}
	
}
