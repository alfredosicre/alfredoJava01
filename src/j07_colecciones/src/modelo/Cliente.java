package modelo;

import java.util.Objects;

public class Cliente implements Comparable<Cliente> { // Comparable define el metodo natural de comparacion
	
	private int IdCliente;
	private String nombre;
	private String apellido1;
	private String apellido2;
	
	public int getIdCliente() {
		return IdCliente;
	}

	public void setIdCliente(int idCliente) {
		IdCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public Cliente(int idCliente, String nombre, String apellido1, String apellido2) {
		super();
		IdCliente = idCliente;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
	}

	@Override
	public int hashCode() {
		return Objects.hash(IdCliente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return IdCliente == other.IdCliente;
	}

	@Override
	public String toString() {
		return "IdCliente = " + IdCliente + ", Nombre= " + nombre + ", Apellido1= " + apellido1 + ", Apellido2= "
				+ apellido2;
	}

	@Override
	public int compareTo(Cliente o) {
		return this.IdCliente - o.IdCliente;
	}
	
	

}
