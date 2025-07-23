package com.cursogetafe.agenda.modelo;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "contactos")
public class Contacto implements Comparable<Contacto>, Cloneable, Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idContacto;
	
	private String nombre;
	private String apellidos;
	private String apodo;
	
	private Domicilio dom;
	private Set<String> telefonos;
	private Set<String> correos;
	
	public Contacto() {
		telefonos = new LinkedHashSet<String>();
		correos = new LinkedHashSet<String>();
		dom = new Domicilio();
		
	}
	
	public Contacto(int idContacto, String nombre, String apellidos, String apodo, Domicilio dom) {
		this();
		this.idContacto = idContacto;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.apodo = apodo;
		this.dom = dom;
	}

	public int getIdContacto() {
		return idContacto;
	}
	public void setIdContacto(int idContacto) {
		this.idContacto = idContacto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	public Domicilio getDom() {
		return dom;
	}
	public void setDom(Domicilio dom) {
		this.dom = dom;
	}
	public Set<String> getTelefonos() {
		return telefonos;
	}
	public void setTelefonos(Set<String> telefonos) {
		this.telefonos = telefonos;
	}
	
	public void addTelefonos(String... telefonos) {
		for(String telefono : telefonos) {
			this.telefonos.add(telefono);
		}
	}
	
	public Set<String> getCorreos() {
		return correos;
	}
	public void setCorreos(Set<String> correos) {
		this.correos = correos;
	}
	
	public void addCorreos(String... correos) {
		for(String correo : correos) {
			this.correos.add(correo);
		}
	}
	
	@Override
	public int hashCode() {
		return idContacto;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contacto other = (Contacto) obj;
		return idContacto == other.idContacto;
	}
	@Override
	public String toString() {
		return "Contacto (" + idContacto + ", " + nombre + ", " + apellidos + ", " + apodo + ")";
	}

	@Override
	public int compareTo(Contacto o) {
		return this.idContacto - o.idContacto;
	}
	
	
}
