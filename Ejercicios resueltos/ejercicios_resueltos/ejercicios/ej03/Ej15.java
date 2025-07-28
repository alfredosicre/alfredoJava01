package ejercicios.ej03;

import java.util.Scanner;

//Solicite al usuario dos fechas (día1, mes1, año1, día2, mes2, año2), indicar el tiempo transcurrido en días entre ambas, 
//	sin tener en cuenta años bisiestos.

public class Ej15 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		System.out.println("DIAS ENTRE FECHAS");
		System.out.println("-----------------");
		
		int diaD, mesD, anyoD, diaH, mesH, anyoH; 
		int cantDias = 0;
		
		System.out.println("Ingresa fecha Inicial");
		System.out.print("Dia: ");
		diaD = tec.nextInt();
		System.out.print("Mes: ");
		mesD = tec.nextInt();
		System.out.print("Anyo: ");
		anyoD = tec.nextInt();
		
		System.out.println("Ingresa fecha Final");
		System.out.print("Dia: ");
		diaH = tec.nextInt();
		System.out.print("Mes: ");
		mesH = tec.nextInt();
		System.out.print("Anyo: ");
		anyoH = tec.nextInt();
		
		if (esFechaCorrecta(diaD, mesD, anyoD) && esFechaCorrecta(diaH, mesH, anyoH)) {
			if (esAnterior(diaD, mesD, anyoD, diaH, mesH, anyoH)) {
				cantDias = diasTranscurridos(diaH, mesH, anyoH) - diasTranscurridos(diaD, mesD, anyoD);
				System.out.printf("Desde %02d/%02d/%d hasta %02d/%02d/%d han transcurrido %d días.\n", diaD, mesD, anyoD, diaH, mesH, anyoH, cantDias);
			} else
				System.out.println("La fecha final no es posterior a la inicial");
						
		} else
			System.out.println("Alguna de las fechas es incorrecta");
		
	}
	
	public static boolean esFechaCorrecta(int dia, int mes, int anyo) {
		return mes >= 1 && mes <= 12 && dia >= 1 && dia <= diasDelMes(mes, anyo) && anyo > 1800;
	}
	
	public static boolean esAnterior (int diaD, int mesD, int anyoD, int diaH, int mesH, int anyoH) {
		if (anyoH < anyoD)
			return false;
		
		if (anyoH == anyoD) {
			if (mesH < mesD)
				return false;
			if (mesH == mesD)
				if(diaH < diaD)
					return false;
		}
		return true;
	}
	
	public static int diasDelMes(int mes, int anyo) {
		if (mes == 2)
			if (esBisiesto(anyo))
				return 29;
			else
				return 28;
		
		if(mes == 4 || mes == 6 || mes == 9 || mes == 11)
			return 30;

		return 31;
	}
	
	public static boolean esBisiesto(int anyo) {
		return anyo % 4 == 0 && (anyo % 100 != 0 || anyo % 400 == 0);
	}
	
	// Calcula los dias transcurridos desde el 1/1/1800 hasta la fecha recibida, sin tener en cuenta los bisiestos
	public static int diasTranscurridos (int dia, int mes, int anyo) {
		int cantDias = 0;
		switch(mes) {
		case 12:
			cantDias += 30;
		case 11:
			cantDias += 31;
		case 10:
			cantDias += 30;
		case 9:
			cantDias += 31;
		case 8:
			cantDias += 31;
		case 7:
			cantDias += 30;
		case 6:
			cantDias += 31;
		case 5:
			cantDias += 30;
		case 4:
			cantDias += 31;
		case 3:
			cantDias += 28;
		case 2:
			cantDias += 31;
		case 1:
			cantDias += dia;
		}
		cantDias += (anyo - 1800) * 365;
		
		return cantDias;
	}
}
