package com.cursogetafe.agenda.config;

import com.cursogetafe.agenda.persistencia.ContactoDao;
import com.cursogetafe.agenda.persistencia.ContactoDaoMem;
import com.cursogetafe.agenda.persistencia.ContactoDaoMemSerial;
import com.cursogetafe.agenda.persistencia.ContactoDaojpa;
import com.cursogetafe.agenda.persistencia.ContactoDaoJDBC;

public class beanFactory {
	
	public static ContactoDao getContactoDao() {
		
		String tipoDao = Config.getProp().getProperty("dao");
		return switch (tipoDao) {
		case "mem" -> new ContactoDaoMem();
		case "serial" -> new ContactoDaoMemSerial();
		case "jdbc" -> new ContactoDaoJDBC();
		default -> new ContactoDaojpa();
		};
	}

}
