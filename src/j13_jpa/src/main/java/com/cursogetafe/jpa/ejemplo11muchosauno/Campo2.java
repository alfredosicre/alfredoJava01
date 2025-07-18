package com.cursogetafe.jpa.ejemplo11muchosauno;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "campos")
public class Campo2 implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCampo;
	private String campo;
	private String direccion;
	
	@OneToMany(mappedBy = "campo")
	private Set<Partido2> partidos;
	
	public Set<Partido2> getPartidos() {
		return partidos;
	}
	public void setPartidos(Set<Partido2> partidos) {
		this.partidos = partidos;
	}
	public int getIdCampo() {
		return idCampo;
	}
	public void setIdCampo(int idCampo) {
		this.idCampo = idCampo;
	}
	public String getCampo() {
		return campo;
	}
	public void setCampo(String campo) {
		this.campo = campo;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(idCampo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Campo2 other = (Campo2) obj;
		return idCampo == other.idCampo;
	}
	@Override
	public String toString() {
		return "Campo [idCampo=" + idCampo + ", campo=" + campo + ", direccion=" + direccion + "]";
	}
	
}
