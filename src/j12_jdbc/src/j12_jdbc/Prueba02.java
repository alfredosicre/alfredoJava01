package j12_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

public class Prueba02 {
	
	public static void main(String[] args) { // ejemplo de como ver unos registros en una BBDD
		
		BasicDataSource bds = new BasicDataSource();
		bds.setUrl("jdbc:mysql://localhost:3366/11_agenda");
		bds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		bds.setUsername("root");
		bds.setPassword("root");
		
		
		
		DataSource ds = bds;
		
		// creamos una conexion
		try (Connection cx = ds.getConnection()) { // al hacerlo de esta forma, no hace falta cerrar despues la BBDD
			
			PreparedStatement ps = cx.prepareStatement("select nombre, apellidos, apodo from contactos where idcontactos");
			
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("nombre") + " " + rs.getString("apellidos") + " - " + rs.getString("apodo"));
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
