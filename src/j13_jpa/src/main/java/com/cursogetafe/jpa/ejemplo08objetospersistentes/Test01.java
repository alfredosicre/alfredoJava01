package com.cursogetafe.jpa.ejemplo08objetospersistentes;

import com.cursogetafe.jpa.config.Config;
import com.cursogetafe.jpa.ejemplo01mapeosimple.Persona;

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
		 p.setApodo("TioMolesto");
		 // sigue currando
		 
		 Persona nueva = new Persona(0,"Ape nuevo", "Nombre nuevo");
		 em.getTransaction().begin();
		 em.persist(nueva);
		 em.getTransaction().commit();
		 
		 em.close();
		 
	}
	
}
