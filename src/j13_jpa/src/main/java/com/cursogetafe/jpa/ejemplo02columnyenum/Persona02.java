package com.cursogetafe.jpa.ejemplo02;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
// si la tabla se llama de diferente forma es: @Table(name = "persona")
@Table(name = "personas")
public class Persona02 implements Serializable {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // estoy diciendo que la clave primaria es isPersona
	@Column(name = "id_persona")
	private int idPersona;
	@Column(name = "p_apellidos")
	private String apellidos;
	@Column(name = "p_apodo")
	private String apodo;
	@Column(name = "p_nombre")
	private String nombre;
	@Column(name = "p_dni")
	private String dni;
	
	
	@Enumerated(EnumType.STRING)
	@Column(name = "p_sexo")
	private Genero genero;
	
	public Persona02() {}
	
	// constructor
	public Persona02(int idPersona, String apellidos, String nombre) {
		super();
		this.idPersona = idPersona;
		this.apellidos = apellidos;
		this.nombre = nombre;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	// get y set de Genero
	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idPersona);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona02 other = (Persona02) obj;
		return idPersona == other.idPersona;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", apellidos=" + apellidos + ", apodo=" + apodo + ", nombre="
				+ nombre + ", dni=" + dni + "]";
	}


}
