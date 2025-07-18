
package com.cursogetafe.jpa.ejemplo07herenciasingletable;

import jakarta.persistence.EntityManager;
import com.cursogetafe.jpa.config.Config;

public class Test01 {
	
	public static void main(String[] args) {
		
		EntityManager em = Config.getEmf().createEntityManager();
		
		Circulo02 c = em.find(Circulo02.class, 44);
		
		System.out.println(c);	
		
//		Rectangulo02 r = new Rectangulo02(1,2,3,4);
//		em.getTransaction().begin();
//		em.persist(r);
//		em.getTransaction().commit();
		
	}

}
