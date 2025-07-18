package com.cursogetafe.jpa.ejemplo11muchosauno;

import com.cursogetafe.jpa.config.Config;

import jakarta.persistence.EntityManager;

public class Test2 {
	
	public static void main(String[] args) {
		
		EntityManager em = Config.getEmf().createEntityManager();
		
		Partido2 p = em.find(Partido2.class, 4);
		System.out.println(p);
		
		Campo2 c = em.find(Campo2.class, 1);
		System.out.println(c);
		System.out.println("-----------");
		System.out.println(c.getPartidos());
		
	}

}
