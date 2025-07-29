package com.cursogetafe.agenda.persistencia;

import static org.junit.jupiter.api.Assertions.*;

import java.beans.PersistenceDelegate;
import java.util.Set;

import org.hibernate.LazyInitializationException;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cursogetafe.agenda.modelo.Contacto;
import com.cursogetafe.agenda.modelo.Domicilio;
import com.cursogetafe.agenda.persistencia.ContactoDao;
import com.mysql.cj.exceptions.AssertionFailedException;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

class TestContactoDao {
	
	private static EntityManagerFactory emf;
	private static ContactoDao cDao;
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("agenda_test");
		cDao = new ContactoDaojpa(emf);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach // borramos los datos de la tabla contactos despues de añadir para que no de error.
	void tearDown() throws Exception {
		String jpql = "delete from Contacto"; 
		
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Query q = em.createQuery(jpql);
		q.executeUpdate();
		em.getTransaction().commit();
		
		em.close();
	}

	@Test // testea el constructor
	void testContactoDaojpa() {
		fail("Not yet implemented");
	}

	@Test
	void testInsertar() {
		Contacto nuevo = creaContacto(1);
		cDao.insertar(nuevo);
		
		nuevo.setApellidos("nuevoapellido");
		nuevo.addCorreos("nuevocorreo");
		nuevo.addTelefonos("nuevotelefono");
		
		cDao.actualizar(nuevo);
		
		Contacto otro = cDao.buscar(nuevo.getIdContacto());
		assertNotNull(otro);
		assertEquals("nuevoapellido", otro.getApellidos());
		assertEquals(2, otro.getCorreos().size());
		assertEquals(2, otro.getTelefonos().size());
	}

	@Test
	void testActualizar() {
		fail("Not yet implemented");
	}

	@Test
	void testEliminarInt() {
		Contacto nuevo = creaContacto(1);
		cDao.insertar(nuevo);
		
		assertTrue(cDao.eliminar(nuevo.getIdContacto())); // devuelve un true si elimina bien
		
		assertEquals(0, cDao.buscarTodos().size());
		
		// intentar eliminar uno que no existe
		Contacto noExiste = creaContacto(1);
		noExiste.setIdContacto(894);
		assertFalse(cDao.eliminar(noExiste));
	}

	@Test
	void testEliminarContacto() {
		
		Contacto nuevo = creaContacto(1);
		cDao.insertar(nuevo);
		
		assertTrue(cDao.eliminar(nuevo)); // devuelve un true si elimina bien
		
		assertEquals(0, cDao.buscarTodos().size());
		
		// intentar eliminar uno que no existe
		Contacto noExiste = creaContacto(1);
		noExiste.setIdContacto(894);
		assertFalse(cDao.eliminar(noExiste));
	}

	@Test
	void testBuscarInt() {
		Contacto nuevo = creaContacto(14);
		cDao.insertar(nuevo);
		
		int id = nuevo.getIdContacto();
		
		Contacto otro = cDao.buscar(id);
		assertNotNull(otro);
		assertEquals(id, otro.getIdContacto());
		assertEquals(14, otro.getCorreos().size());
		assertEquals(14, otro.getTelefonos().size());
	}
	
	@Test
	void testBuscarIntNoExiste() {
		assertNull(cDao.buscar(666));
	}

	@Test
	void testBuscarString() {
		for(int i = 1; i <= 100; i++) {
			cDao.insertar(creaContacto(i));
		}
		
		Set<Contacto> resu = cDao.buscar("nombre75");
		assertEquals(1, resu.size());
		
		resu = cDao.buscar("5");
		assertEquals(19, resu.size());
		
		resu = cDao.buscar("nom");
		assertEquals(100, resu.size());
		
		resu = cDao.buscar("ape");
		assertEquals(100, resu.size());
		
		resu = cDao.buscar("apo");
		assertEquals(100, resu.size());
		
	}	

	@Test
	void testBuscarTodos() {
		for(int i = 1; i <= 100; i++) {
			cDao.insertar(creaContacto(i));
		}
		Set<Contacto> resu = cDao.buscarTodos();
		assertEquals(100, resu.size());
		for(Contacto contacto : resu) {
			assertEquals("ciudad", contacto.getDom().getCiudad());
			assertThrows(LazyInitializationException.class, () -> contacto.getCorreos().size());
			assertThrows(LazyInitializationException.class, () -> contacto.getTelefonos().size());
		}
	}
	
	@Test
	void testBuscarTodosVacio() {
		Set<Contacto> resu = cDao.buscarTodos();
		assertEquals(0, resu.size());
	}
	
	
	private Contacto creaContacto(int nroContacto) {
		Domicilio dom = new Domicilio("tv", "via", nroContacto, nroContacto, "puerta", "cp", "ciudad", "prov");
		Contacto nuevo = new Contacto(0, "nombre" + nroContacto, "apellidos" + nroContacto, "apodo" + nroContacto, dom);
		
		for(int i = 1; i<=nroContacto; i++) {
			nuevo.addCorreos("correo"+i+"@test.test");
			nuevo.addTelefonos("666"+i);
		}
		
		return nuevo;
	}

}
