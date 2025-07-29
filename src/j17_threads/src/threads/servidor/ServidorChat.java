package threads.servidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import javax.swing.text.DateFormatter;

public class ServidorChat {
	
	private int puerto;
	public ServidorChat(int puerto) {
		this.puerto = puerto;
	}
	
	public void start() {
		
		System.out.println("Servidor esperando conexiones...");
		try(ServerSocket server = new ServerSocket(puerto)){
			while(true) {
				Socket cliente = server.accept();
				new AtiendeCliente(cliente);
			}
			
		} catch (IOException e) {
			System.err.println("No se puede abrir el puerto: " + puerto);
		}
	}
	
	private class AtiendeCliente implements Runnable {
		private Socket socket;
		private String user;
		
		private static int cant;
		private static Map<String, AtiendeCliente> sala = new HashMap<>();
		
		public AtiendeCliente(Socket socket) {
			this.socket = socket;
			new Thread(this).start();
		}
		
		@Override
		public void run() {
			
			log("¡¡Nuevo cliente conectado!!");
			
			try(PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
				BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
					
				out.println("Binvenido al nuevo servicio de chat...");
				
				out.println("Por favor, identificate: ");
				user = in.readLine();
				user = user.replace(" ", "_");
				
				while(sala.containsKey(user) || user.length() == 0) {
					out.println("El usuario es incorrecto o no existe");
					out.println("Por favor, identificate: ");
					user = in.readLine();
				}
				
				out.println(user + " ya estas en la sala");
				sala.put(user, this);
				cant++;
				log(user + " se ha conectado");
				log("hay " + cant + " usuarios en la sala");
				
				String linea;
				while((linea = in.readLine()) != null) {
					out.println("SRV: " + linea);
				}
				
				} catch (IOException e) {
					e.printStackTrace();
				}
			
		}
		private void log(String mje) {
			System.out.println(now() + " - " + mje);
		}
		private String now() {
			LocalDateTime ahora = LocalDateTime.now();
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");
			return dtf.format(ahora);
		}
	}
	
	public static void main(String[] args) {	 
		new ServidorChat(1234).start();
	}

}
