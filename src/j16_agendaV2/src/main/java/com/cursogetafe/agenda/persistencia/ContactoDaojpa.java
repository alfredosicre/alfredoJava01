package com.cursogetafe.agenda.persistencia;

import java.util.HashSet;
import java.util.Set;
import java.io.Serializable;

import com.cursogetafe.agenda.config.Config;
import com.cursogetafe.agenda.modelo.Contacto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;

public class ContactoDaojpa implements ContactoDao {

	private EntityManagerFactory emf;
	private EntityManager em;
	
	public ContactoDaojpa() {
		emf = Config.getEmf();
		
	}
	
	public ContactoDaojpa(EntityManagerFactory emf) {
		this.emf = emf;
	}
	
	@Override
	public void insertar(Contacto c) {
		em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(c);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}
		em.close();
	}
	
	@Override
	public void actualizar(Contacto c) {
		em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(c);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}
		em.close();
	}
	
	// ELIMINAR UN CONTACTO QUE NOS DAN EL ID
	@Override
	public boolean eliminar(int idContacto) {
		em = emf.createEntityManager();
		Contacto eliminar = em.find(Contacto.class, idContacto);
		if(eliminar != null) {
			try {
				em.getTransaction().begin();
				em.remove(eliminar);
				em.getTransaction().commit();
				return true;
			} catch (Exception e) {
				e.printStackTrace(); // hacer un log en esta linea
				em.getTransaction().rollback();
				return false;
			}finally {
				em.close();
			}
		} else {
			return false;
		}
	}
	
	// ELIMINAR UN CONTACTO
	@Override
	public boolean eliminar(Contacto c) {
		return eliminar(c.getIdContacto());
	}

	
	// debe retornar los contactos con sus telefonos y correos
	@Override
	public Contacto buscar(int idContacto) {
		em = emf.createEntityManager();
		Contacto buscado = em.find(Contacto.class, idContacto);
		if(buscado != null) {
			buscado.getTelefonos().size();
			buscado.getCorreos().size();
		}
		em.close();
		return buscado;
	}
	
	// debe retornar los contactos sin telefono ni correos
	@Override
	public Set<Contacto> buscar(String cadena) {
		em = emf.createEntityManager();
		String jpql =
				"select c from Contacto c "
				+ "where c.nombre like :cad "
				+ "or c.apellidos like :cad "
				+ "or c.apodo like :cad";
		
		TypedQuery<Contacto> q = em.createQuery(jpql, Contacto.class);
		q.setParameter("cad", "%" + cadena + "%");
		
		HashSet<Contacto> resu = new HashSet<Contacto>(q.getResultList());
		em.close();
		return resu;
	}
	
	// debe retornar los contactos sin telefono ni correos
	@Override
	public Set<Contacto> buscarTodos() {
		em = emf.createEntityManager();
		String jpql = "select c from Contacto c";
		
		TypedQuery<Contacto> q = em.createQuery(jpql, Contacto.class);
	
		HashSet<Contacto> resu = new HashSet<Contacto>(q.getResultList());
		em.close();
		return resu;
	}

}
