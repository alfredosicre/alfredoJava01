package agenda.config;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;


public class Config { // para proporcionarnos el modo DataSource en modo singel
	
	private static DataSource ds;
	
	// constructor privado, con esto hacemos que se se cree un objeto de esta clase
	private Config() {}
	
	
	public static DataSource getDataSource() {
		if(ds == null) {
			
			BasicDataSource bds = new BasicDataSource();
			Properties prop = getProp();
			bds.setUrl(prop.getProperty("bbdd.url"));
			bds.setUsername(prop.getProperty("bbdd.user"));
			bds.setPassword(prop.getProperty("bbdd.pass"));
			ds = bds;
			
		}
	return ds;
	}
	
	
	private static Properties getProp() { // leemos el fichero app.properties
		Properties prop = new Properties();
		try(FileReader fr = new FileReader("app.properties")) {
			prop.load(fr);
			
		}catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("No se puede leer el fichero de properties");
			
		}
		return prop;
	}

}
