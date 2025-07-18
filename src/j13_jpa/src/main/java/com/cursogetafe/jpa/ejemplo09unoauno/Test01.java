package com.cursogetafe.jpa.ejemplo09unoauno;

import com.cursogetafe.jpa.config.Config;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class Test01 {
	
	public static void main(String[] args) {
		
		// consulta de una persona
		EntityManagerFactory emf = Config.getEmf();
		EntityManager em = emf.createEntityManager();
		
		 Contacto c = em.find(Contacto.class, 9);
		 if(c != null)
			 System.out.println(c);
		 else
			 System.out.println("Esta persona no existe");
		 c.setApodo("TioMolesto");
		 // sigue currando
		 
		 //Domicilio d = em.find(Domicilio.class, 3);
		 
//		 Persona nueva = new Persona(0,"Ape nuevo", "Nombre nuevo");
//		 em.getTransaction().begin();
//		 em.persist(nueva);
//		 em.getTransaction().commit();
		 
		 em.close();
		 
	}
	
}
