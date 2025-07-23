package Tests;

import registrosDTO.ClienteDTO;

public class TestClienteDTO {
	
	public static void main(String[] args) {
		
		ClienteDTO cli0 = new ClienteDTO(456, "De la Fuente", 123456, "VIP");
		ClienteDTO cli1 = new ClienteDTO(457, "Morales", 987654, "VIP");
		ClienteDTO cli2 = new ClienteDTO(458, "Santiago", 345765, "VIP");
		
		System.out.println(cli0.apellidos());
		System.out.println(cli0);
		System.out.println(cli1);
		System.out.println(cli2);
		
		
	}

}
