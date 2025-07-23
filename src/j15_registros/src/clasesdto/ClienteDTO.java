package clasesdto;

import java.util.Objects;


public class ClienteDTO {
	
	private int idCliente;
	private String apellidos;
	private int nroCliente;
	private String categoria;
	
	public ClienteDTO(int idCliente, String apellidos, int nroCliente, String categoria) {
		super();
		this.idCliente = idCliente;
		this.apellidos = apellidos;
		this.nroCliente = nroCliente;
		this.categoria = categoria;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
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

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, categoria, idCliente, nroCliente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClienteDTO other = (ClienteDTO) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(categoria, other.categoria)
				&& idCliente == other.idCliente && nroCliente == other.nroCliente;
	}

	@Override
	public String toString() {
		return "ClienteDTO [idCliente=" + idCliente + ", apellidos=" + apellidos + ", nroCliente=" + nroCliente
				+ ", categoria=" + categoria + "]";
	}
	
	

}
