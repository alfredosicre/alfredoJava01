package com.cursogetafe.jpa.ejemplo03insertables;

import com.cursogetafe.jpa.config.Config;
import jakarta.persistence.EntityManager;

public class Test01 {
	
	public static void main(String[] args) {
		
		EntityManager em = Config.getEmf().createEntityManager();
		
		Persona03 p = em.find(Persona03.class, 7);
		
		System.out.println(p);
		
	}

}
