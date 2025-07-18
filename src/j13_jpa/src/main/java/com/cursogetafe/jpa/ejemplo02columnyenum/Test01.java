package com.cursogetafe.jpa.ejemplo02columnyenum;

import com.cursogetafe.jpa.config.Config;

import jakarta.persistence.EntityManager;

public class Test01 {
	
	public static void main(String[] args) {
		
		EntityManager em = Config.getEmf().createEntityManager();
		
		// consultar en la tabla personas un registro
		Persona02 p = em.find(Persona02.class, 7);
		if(p != null)
			 System.out.println(p);
		 else
			 System.out.println("Esta persona no existe");
		
		// insertar en la tabla personas un nuevo registro
		Persona02 nuevo = new Persona02(0, "Otra persona nueva", "mas nuevo");
		nuevo.setGenero(Genero.MASC); // esto es para actualizar el campo de genero
		em.getTransaction().begin();
		em.persist(nuevo);
		em.getTransaction().commit();
		
		em.close();
	}

}
