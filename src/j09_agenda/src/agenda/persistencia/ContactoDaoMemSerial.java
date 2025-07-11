package agenda.persistencia;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import agenda.modelo.Contacto;
import agenda.util.Contactos;

public class ContactoDaoMemSerial implements ContactoDao {

	private Map<Integer, Contacto> almacen;
	private int proximoId;
	
	private final String FICH_ALM = "almacen.dat";
	private final String FICH_I = "id.dat";
	
	
	
	public ContactoDaoMemSerial() {
		almacen = new HashMap<Integer, Contacto>();
		proximoId = 1;
		cargaInicial();
	}
	
	private void cargaInicial() {
		for (Contacto c : Contactos.generaContactos()) {
			insertar(c);
		}
		grabar();
	}
	
	private void grabar() {
		try(FileOutputStream fosAlm = new FileOutputStream(FICH_ALM);
				FileOutputStream fosId = new FileOutputStream(FICH_I)){
				ObjectOutputStream oosAlm = new ObjectOutputStream(fosAlm);
				ObjectOutputStream oosId = new ObjectOutputStream(fosId);
				
				oosAlm.writeObject(almacen);
				oosId.writeInt(proximoId);
			
		}catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	

	@Override
	public void insertar(Contacto c) {
		c.setIdContacto(proximoId++);
		almacen.put(c.getIdContacto(), c);
	}

	@Override
	public void actualizar(Contacto c) {
		almacen.replace(c.getIdContacto(), c);
	}

	@Override
	public boolean eliminar(int idContacto) {
		return almacen.remove(idContacto) != null;
	}

	@Override
	public boolean eliminar(Contacto c) {
		return eliminar(c.getIdContacto());
	}

	@Override
	public Contacto buscar(int idContacto) {
		return almacen.get(idContacto);
	}

	@Override
	public Set<Contacto> buscar(String cadena) {
		cadena = cadena.toLowerCase();
		Set<Contacto> resu = new HashSet<Contacto>();
		for(Contacto contacto : almacen.values()) {
			if(contacto.getApellidos().toLowerCase().contains(cadena) 
					|| contacto.getApodo().toLowerCase().contains(cadena) 
					|| contacto.getNombre().toLowerCase().contains(cadena)) {
				resu.add(contacto);
			}
		}
		return resu;
	}

	@Override
	public Set<Contacto> buscarTodos() {
		return new HashSet<Contacto>(almacen.values());
	}

}
