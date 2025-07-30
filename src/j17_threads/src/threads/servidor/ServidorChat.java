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
		private PrintWriter out;
		
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
					
				this.out = out;
				
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
				out.println();
				help();
				sala.put(user, this);
				cant++;
				log(user + " se ha conectado");
				log("hay " + cant + " usuarios en la sala");
				
				difusion("SRV:" + user + " se ha conectado");
				
				String linea;
				while((linea = in.readLine()) != null) {
					
					if(linea.length() > 0 && linea.charAt(0) == '@') { // mensaje privado
						if(linea.contains(" ")) {
							String userDestino = linea.substring(1, linea.indexOf(" "));
							String mensaje = linea.substring(linea.indexOf(" ") + 1);
							if(sala.containsKey(userDestino)) {
								sala.get(userDestino).out.println("Privado de " + user + ": " + mensaje);
							} else {
								out.println(userDestino + " no esta conectado");
							}
						}else {
							out.println("Formato incorrecto, no se ha enviado el mensaje");
						}
					}else { // no es un mensaje privado
						switch(linea.toLowerCase()) {
						case "-w", "who":
							for(String usr : sala.keySet()) {
								out.println("SER: " + usr);
							}
							break;
						case "-h", "help":
							help();
							break;
						default:
							difusion(user + ": " + linea);
						}
					}
					
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
		
		private void difusion(String mje) {
			for(AtiendeCliente cli : sala.values()) {
				cli.out.println(mje);
			}
		}
		private void help() {
			out.println("Ayuda del Chat");
			out.println("----------------------------------------");
			out.println("-q: terminar sesion");
			out.println("-h: mostrar esta ayuda");
			out.println("-w: consultar usuarios");
			out.println("@Usuario mensaje: para mensajes privados");
			out.println("----------------------------------------");
		}
	}
	
	public static void main(String[] args) {	 
		new ServidorChat(1234).start();
	}

}
