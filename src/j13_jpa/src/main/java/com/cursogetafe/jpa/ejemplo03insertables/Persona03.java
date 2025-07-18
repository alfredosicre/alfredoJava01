package com.cursogetafe.jpa.ejemplo03insertables;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "persona_04")
public class Persona03 implements Serializable {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // estoy diciendo que la clave primaria es idPersona
	private int idPersona;
	private String apellidos;
	private String apodo;
	private String nombre;
	private String dni;
	@Embedded
	@AttributeOverride(name = "tipoVia", column = @Column(name = "tipovia"))
	@AttributeOverride(name = "codigoPostal", column = @Column(name = "codigopostal"))
	private Domicilio dom;
	
	
	
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
	public Domicilio getDom() {
		return dom;
	}
	public void setDom(Domicilio dom) {
		this.dom = dom;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(apellidos, apodo, dni, dom, idPersona, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona03 other = (Persona03) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(apodo, other.apodo)
				&& Objects.equals(dni, other.dni) && Objects.equals(dom, other.dom) && idPersona == other.idPersona
				&& Objects.equals(nombre, other.nombre);
	}
	
	@Override
	public String toString() {
		return "Persona03 [idPersona=" + idPersona + ", apellidos=" + apellidos + ", apodo=" + apodo + ", nombre="
				+ nombre + ", dni=" + dni + ", dom=" + dom + "]";
	}
		

}
