package com.cursogetafe.ejerciciojpa.modelo;

import java.io.Serializable;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "clientes")
public class Cliente extends Rol implements Serializable{

	
	private int nroCliente;
	private String categoria;
	
	@ManyToMany
	@JoinTable(name = "clientes_productos",
						joinColumns = @JoinColumn(name = "idrol"),
						inverseJoinColumns = @JoinColumn(name = "idProducto"))
	private List<Producto> productos;
	
	
	public Cliente(int nroCliente, String categoria, List<Producto> productos) {
		super();
		this.nroCliente = nroCliente;
		this.categoria = categoria;
		this.productos = productos;
	}

	public Cliente(){
		setRol("CLIENTE");
	}

	
	
	public int getNroCliente() {
		return nroCliente;
	}

	public void setNroCliente(int nroCliente) {
		this.nroCliente = nroCliente;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(categoria);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(categoria, other.categoria);
	}

	@Override
	public String toString() {
		return "Cliente [nroCliente=" + nroCliente + ", categoria=" + categoria;
	}
	
	
}
