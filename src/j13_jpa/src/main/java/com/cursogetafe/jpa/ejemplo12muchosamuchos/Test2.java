package com.cursogetafe.jpa.ejemplo12muchosamuchos;

import com.cursogetafe.jpa.config.Config;
import jakarta.persistence.EntityManager;

public class Test2 {
	
	public static void main(String[] args) {
		
		EntityManager em = Config.getEmf().createEntityManager();
		
		Jugador j = em.find(Jugador.class, 5);
		System.out.println(j);
		
		System.out.println(j.getEquipos());
		
	}

}
