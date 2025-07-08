package sets;

import java.util.Set;
import java.util.TreeSet;

import modelo.Cliente;

public class Test04ComparatorCliente {
	
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente(15, "Adriana", "Jimenez", "Perez");
		Cliente c2 = new Cliente(123, "May", "Gonzalez", "Muñoz");
		Cliente c3 = new Cliente(168, "Maria", "Perez", "Gomez");
		Cliente c4 = new Cliente(516, "Ana", "Fuentes", "Del Rio");
		
		Set<Cliente> set = new TreeSet<Cliente>();
		
		set.add(c1);
		set.add(c2);
		set.add(c3);
		set.add(c4);
		
		for(Cliente cliente : set) {
			System.out.println(cliente);
		}
		
		System.out.println();
		
		Set<Cliente> set02 = new TreeSet<Cliente>(Cliente.getComparatorApellidos());
		
		set02.addAll(set);
		
		for(Cliente cliente : set02) {
			System.out.println(cliente);
		}
		System.out.println();
		
	}

}
