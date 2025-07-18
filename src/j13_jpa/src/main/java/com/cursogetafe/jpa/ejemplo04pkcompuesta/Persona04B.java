package com.cursogetafe.jpa.ejemplo04pkcompuesta;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;


@Entity
@Table(name = "persona_03")
public class Persona04B implements Serializable {
	
	@EmbeddedId
	private dniB dni;
	
	private String nombre;
	
	// constructor por defecto
	public Persona04B() {}
	// constructor
	public Persona04B(dniB dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
	}

	
	public dniB getDni() {
		return dni;
	}

	public void setDni(dniB dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona04B other = (Persona04B) obj;
		return Objects.equals(dni, other.dni) && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Persona04B [dni=" + dni + ", nombre=" + nombre + "]";
	}
	
	
	
	
}