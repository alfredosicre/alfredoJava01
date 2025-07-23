package com.cursogetafe.agenda.persistencia;

import java.util.Set;

import com.cursogetafe.agenda.modelo.Contacto;

public interface ContactoDao {

	public void insertar(Contacto c);
	
	public void actualizar(Contacto c);
	
	public boolean eliminar(int idContacto);
	
	public boolean eliminar(Contacto c);
	
	public Contacto buscar(int idContacto);
	
	
	
	public Set<Contacto> buscar(String cadena);

	public Set<Contacto> buscarTodos();
	
}
