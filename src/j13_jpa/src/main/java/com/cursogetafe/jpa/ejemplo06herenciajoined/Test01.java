
package com.cursogetafe.jpa.ejemplo06herenciajoined;

import jakarta.persistence.EntityManager;
import com.cursogetafe.jpa.config.Config;

public class Test01 {
	
	public static void main(String[] args) {
		
		EntityManager em = Config.getEmf().createEntityManager();
		
		Circulo c = em.find(Circulo.class, 67);
		
		System.out.println(c);	
		
		Rectangulo r = new Rectangulo(1,2,3,4);
		em.getTransaction().begin();
		em.persist(r);
		em.getTransaction().commit();
		
	}

}
