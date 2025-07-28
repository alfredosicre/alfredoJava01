package strings.ejercicios.ej07;

public class Ejercicios07 {
	
	//Ej 01 y 02
//	Pedir al usuario una cadena y decir si empieza por el carácter ‘H’.
//	Como el anterior, pero sin importar si es mayúscula o minúscula.
	public static boolean comienzaConH(String cad) {
		return cad.toUpperCase().startsWith("H");
	}
	
	//Ej 03
//	Elabora un método que escriba todos los caracteres de una cadena cada uno en una línea.
	public static void deletrea (String cad) {
		for (int i = 0; i < cad.length(); i++) {
			System.out.println(cad.charAt(i));
		}
	}
	
	//Ej 04
//	Pedir al usuario una frase y un carácter, y decir si la frase contiene ese carácter.
	public static boolean contains(String cad, char letra) {
		return cad.toLowerCase().contains((letra + "").toLowerCase());
	}
	
	//Ej 05
//	Método que pida un carácter c y un número n y que devuelva una cadena con c repetido n veces. 
//		Ej: repite(‘a’, 4) debe retornar “aaaa”
	public static String repite(char letra, int cant) {
		String resu = "";
		for (int i = 1; i <= cant; i++) {
			resu += letra;
		}
		return resu;
	}
	
	//Ej 05 B
	public static String repiteB(char letra, int cant) {
		return ("" + letra).repeat(cant);
	}
	
	//Ej 06
//	Método que cuente el número de veces que aparece un carácter en una cadena.
	public static int cuentaCaracter(String cad, char letra) {
		int cant = 0;
		for (int i = 0; i < cad.length(); i++) {
			if(cad.toLowerCase().charAt(i) == Character.toLowerCase(letra))
				cant++;
		}
		return cant;
	}
	
	//Ej07
//	Método que reciba una cadena y retorne el número de vocales que contiene.
	public static int cuentaVocales(String cad) {
		cad = cad.toLowerCase();
		int cant = 0;
		for (int i = 0; i < cad.length(); i++) {
			if("aeiou".contains("" + cad.charAt(i)))
				cant++;
		}
		return cant;
	}
	
	//Ej08
//	Desarrollar un método que reciba una cadena y retorne otra con la original invertida.
	public static String invierte(String cad) {
		String inv = "";
		for (int i = cad.length() - 1; i >= 0; i--) {
			inv += cad.charAt(i);
		}
		return inv;
	}
	
	//Ej09
//	Desarrollar un método que indique si una palabra es un palíndromo.
//		Modificarlo para que indique si una frase es un palíndromo.
	public static boolean esPalindromo(String frase) {
		frase = frase.toLowerCase().replace(" ", "");
		return frase.equals(invierte(frase));
	}
	
	//Ej09 b
	public static boolean esPalindromoB(String frase) {
		frase = frase.toLowerCase().replace(" ", "");
		int l = 0, r = frase.length() - 1;
		boolean esPalindromo = true;
		while(l < r && esPalindromo) {
			if(frase.charAt(l) != frase.charAt(r))
				esPalindromo = false;
			l++;
			r--;
		}
		return esPalindromo;
	}
	
	//Ej10
//	Desarrollar un método que, dada una cadena, retorne su sigla, es decir, la primera letra de cada palabra 
//		en mayúsculas. Por ejemplo, si recibe ’Universal serial bus’ debe devolver ’USB’.
	public static String sigla(String nombre) {
		nombre = nombre.toUpperCase().replaceAll(" +", " ").trim();
		String sigla = "" + nombre.charAt(0);
		int proximo = 1;
		while((proximo = nombre.indexOf(" ", proximo)) != -1) {
			sigla += nombre.charAt(++proximo);
		}
		return sigla;
	}
	
	//Ej11
//	Desarrollar un método que reciba una cadena y un carácter e inserte el carácter entre cada letra de la cadena.
//		Ej: “separar” y ’-’ debería retornar “s-e-p-a-r-a-r”
	public static String separa(String cad, char sep) {
		String nueva = "";
		int largo = cad.length();
		if(largo > 0) {
			nueva = "" + cad.charAt(0);
			for (int i = 1; i < largo; i++) {
				nueva = nueva + sep + cad.charAt(i);
			}
		}
		return nueva;
	}
	
	//Ej12
//	Desarrollar un método que reciba una cadena e inserte un carácter cada 3 caracteres. 
//		Por ejemplo: “1921680012” y ‘.’, debe retornar “192.168.001.2”
	public static String inserta3(String cad, char sep) {
		String nueva = "";
		int ant = 0;
		for (int i = 3; i < cad.length(); i += 3) {
			nueva += cad.substring(ant, i) + sep;
			ant = i;
		}
		return nueva + cad.substring(ant);
	}
	
	//Ej13
//	Haga otra versión del método, pero que reciba una cadena, un carácter y la cantidad de dígitos entre las que 
//		se debe insertar el carácter. 
	public static String inserta(String cad, char sep, int cant) {
		String nueva = "";
		int ant = 0;
		for (int i = cant; i < cad.length(); i += cant) {
			nueva += cad.substring(ant, i) + sep;
			ant = i;
		}
		return nueva + cad.substring(ant);
	}
	
	//Ej14
//	Desarrolle un método llamado capitalize que ponga en mayúsculas cada palabra de una frase recibida como parámetro. 
//		Por ej: si se recibe “Congreso internacional de programación de String”, debe devolver, 
//		“Congreso Internacional De Programación De String”. 
//		Utilice Character.toUpperCase(char c)
	public static String capitalize(String cad) {
		cad = cad.trim().replaceAll(" +", " ").toLowerCase();
		String resu = "";
		int ant = 1;
		if (cad.length() > 0) {
			resu = "" + Character.toUpperCase(cad.charAt(0));
			int posEspacio = cad.indexOf(" ");
			while(posEspacio != -1) {
				resu += cad.substring(ant, posEspacio + 1);
				resu += Character.toUpperCase(cad.charAt(posEspacio + 1));
				ant = posEspacio + 2;
				posEspacio = cad.indexOf(" ", ant);
			}
		}
		return resu + cad.substring(ant);
	}
	
	//Ej15
//	Desarrolle un método que reciba una cadena con una expresión de una operación simple (+, -, *, /) 
//		con dos operandos y retorne el resultado como double.
	public static double calcula(String exp) {
		exp = exp.replace(" ","");
		double resu = 0; 
		int posOperador = -1;
		int i;
		String operadores = "+-*/";
		for (i = 0; i < 4 && posOperador == -1; i++) {
			posOperador = exp.indexOf(operadores.charAt(i));
		}
		double n1 = Double.parseDouble(exp.substring(0, posOperador));
		double n2 = Double.parseDouble(exp.substring(posOperador + 1));
		
		switch (operadores.charAt(i - 1)) {
		case '+':
			resu = n1 + n2;
			break;
		case '-':
			resu = n1 - n2;
			break;
		case '*':
			resu = n1 * n2;
			break;
		case '/':
			resu = n1 / n2;
			break;
		}
		return resu;
	}
	
	//Ej17
//	Pedir al usuario una frase y un carácter, y decir en qué posiciones está ese carácter, o indicar que no está 
//		si procede. No se puede usar indexOf o similar.
	public static void posCaracter(String cad, char c) {
		boolean encontrado = false;
		for (int i = 0; i < cad.length(); i++) {
			if (cad.charAt(i) == c) {
				System.out.println(i);
				encontrado = true;
			}
		}
		if (!encontrado)
			System.out.println(cad + " no contiene " + c);
	}
	
	//Ej17 a
//	Repite el ejercicio anterior, pero usando indexOf.
	public static void indexOf(String cad, char c) {
		int pos = -1;
		boolean encontrado = false;
		while ((pos = cad.indexOf(c, pos+1)) != -1) {
			System.out.println(pos);
			encontrado = true;
		}
		if (!encontrado)
			System.out.println(cad + " no contiene " + c);
	}
	
	//Ej18
//	Método que reciba una cadena y la transforme sustituyendo todos los espacios por * 
//		(sin usar replace ni replaceAll).
	public static String cambiaEspacios(String cad, char c) {
		String resu = "";
		for (int i = 0; i < cad.length(); i++) {
			char actual = cad.charAt(i);
			resu += actual == ' ' ? c : actual;
		}
		return resu;
	}
	
	//Ej19
//	Método que reciba una cadena y un carácter y la retorne pero sólo hasta la primera aparición del carácter dado 
//		(sin incluirlo). No se puede utilizar indexOf.
	public static String extrae(String cad, char c) {
		String resu = "";
		boolean encontrado = false;
		for (int i = 0; i < cad.length() && !encontrado; i++) {
			char actual = cad.charAt(i);
			if (actual == c)
				encontrado = true;
			else
				resu += actual;
		}
		return resu;
	}

	//Ej19 con substring
	public static String extraeV2(String cad, char c) {
		int pos = -1;
		for (int i = 0; i < cad.length() && pos == -1; i++) {
			if (cad.charAt(i) == c)
				pos = i;
		}
		return pos != -1 ? cad.substring(0, pos) : cad;
	}
	
	//Ej19 a con indexof y substring
	public static String extraeV3(String cad, char c) {
		int pos = cad.indexOf(c);
		return pos != -1 ? cad.substring(0, pos) : cad;
	}
	
	//Ej20
//	Pedir una frase y eliminar las vocales. No se puede usar replace ni replaceAll.
	public static String eliminaVocales(String cad) {
		String resu = "";
		for (int i = 0; i < cad.length(); i++) {
			char actual = cad.charAt(i);
			if ("aeiouAEIOU".indexOf(actual) == -1)
				resu += actual;
		}
		return resu;
	}
	
	//Ej20 a
//	Repite el ejercicio anterior usando replace.
	public static String eliminaVocalesV2(String cad) {
		return cad.replaceAll("[aeiouAEIOU]", "");
	}
	
	//Ej21
//	Método que sustituya mayúsculas por minúsculas y minúsculas por mayúsculas en una frase. 
//	Utilizar Character.toUpperCase(char c) y Character.toLowerCase(char c).
	public static String cambiaMayusculasMinusculas(String cad) {
		String resu = "";
		for (int i = 0; i < cad.length(); i++) {
			char actual = cad.charAt(i);
			if (actual >= 65 && actual <=90)
				actual = Character.toLowerCase(actual);
			else
				actual = Character.toUpperCase(actual);
			resu += actual;
		}
		return resu;
	}

	//Ej21V2
	public static String cambiaMayusculasMinusculasV2(String cad) {
		String resu = "";
		for (int i = 0; i < cad.length(); i++) {
			char actual = cad.charAt(i);
			if (actual >= 65 && actual <=90)
				actual += 32;
			else
				actual -= 32;
			resu += actual;
		}
		return resu;
	}
	
	//Ej22
//	Método que reciba una cadena y comprueba si el balanceo de paréntesis es correcto 
//		(se abren y se cierran correctamente).
	public static boolean parentesisOk(String exp) {
		boolean balanceoOk = true;
		int cantAbiertos = 0;
		for (int i = 0; i < exp.length() && balanceoOk; i++) {
			char actual = exp.charAt(i);
			switch(actual) {
				case '(':
					cantAbiertos++;
					break;
				case ')':
					if (cantAbiertos > 0)
						cantAbiertos--;
					else
						balanceoOk = false;
			}
		}
		return balanceoOk && cantAbiertos == 0;
	}
	
	//Ej23
//	Método que retorne cuántas palabras de menos de 3 letras tiene una frase, considerando como separador
//		de palabras únicamente el inicio de cadena, el espacio y el fin de cadena.
	public static int cuentaPalabras(String frase, int tam) {
		int cont = 0;
		frase = frase.trim().replaceAll(" +", " ");
		int ant = 1;
		if (frase.length() > 0) {
			int posEspacio = frase.indexOf(" ");
			while(posEspacio != -1) {
				if (posEspacio - ant + 1 < tam) {
					cont++;
				}
				ant = posEspacio + 2;
				posEspacio = frase.indexOf(" ", ant);
			}
		}
		if (frase.length() - ant < tam)
			cont++;
		return cont;
	}
	
	//Ej23
//	Utilizando split y arrays
	public static int cuentaPalabrasConArrays(String frase, int tam) {
		int cont = 0;
		frase = frase.trim().replaceAll(" +", " ");
		String[] palabras = frase.split(" ");
		for (int i = 0; i < palabras.length; i++) {
			if (palabras[i].length() < tam)
				cont++;
		}
		return cont;
	}
	
	//Ej24
//	Método que reciba dos cadenas y las junte carácter a carácter. 
//	Es decir, si recibe “pata” y “coco” el resultado es “pcaotcao”. Las cadenas tienen que ser del mismo tamaño.
	public static String juntarIguales(String cad1, String cad2) {
		String resu = "";
		for (int i = 0; i < cad1.length(); i++) {
			resu = resu + cad1.charAt(i) + cad2.charAt(i);
		}
		return resu;
	}
	
	//Ej24a
//	Mejorar el anterior para que no importe que las palabras sean de distinto tamaño. Es decir, 
//		si recibe “patata” y “coco” el resultado sería “pcaotcaota”, 
//		añadiendo la cadena sobrante directamente al final.
	public static String juntar(String cad1, String cad2) {
		String resu = "";
		int mayor = Math.max(cad1.length(), cad2.length());
		for (int i = 0; i < mayor; i++) {
			resu += cad1.length() > i ? cad1.charAt(i) : "";
			resu += cad2.length() > i ? cad2.charAt(i) : "";
		}
		return resu;
	}
	
	//Ej26
//	Método que elimina los caracteres en blanco al principio de una cadena. No puedes usar trim.
	public static String trimInicio(String cad) {
		int inicio = 0;
		while(inicio < cad.length() && cad.charAt(inicio) == ' ')
			inicio++;
		return cad.substring(inicio);
	}
	
	//Ej26a
//	Método que elimina los caracteres en blanco al principio de una cadena. No puedes usar trim.
	public static String trimFinal(String cad) {
		int fin = cad.length() - 1;
		while(fin > 0 && cad.charAt(fin) == ' ')
			fin--;
		return cad.substring(0, fin + 1);
	}
	
	//Ej26b
//	Otro que quite los caracteres en blanco a la izquierda y a la derecha de una cadena. No puedes usar trim.
	public static String trim(String cad) {
		return trimInicio(trimFinal(cad));
	}
	
	//Ej27
//	Método que reciba una cadena de caracteres, donde en lugar de ñ se han utilizado los caracteres ny. 
//	Crear una nueva cadena de caracteres sustituyendo ny por ñ. No puedes usar replace.
	public static String reemplazaNy(String cad) {
		String resu = "";
		String cadMinus = cad.toLowerCase();
		int pos = cadMinus.indexOf("ny");
		int ant = 0;
		while(pos != -1) {
			System.out.println(ant + " - " + pos);
			resu += cad.substring(ant, pos) + (cad.charAt(pos) == 'n' ? 'ñ' : 'Ñ');
			ant = pos + 2;
			pos = cadMinus.indexOf("ny", ant);
		}
		return resu + cad.substring(ant);
	}
	
	//Ej28
//	Método que reciba una cadena y dos caracteres y reemplace en la cadena todas las ocurrencias 
//	del primer carácter por el segundo. Sin utilizar replace.
	public static String replace(String cad, char c, char r) {
		String resu = "";
		for (int i = 0; i < cad.length(); i++) {
			char actual = cad.charAt(i);
			resu += actual == c ? r : actual;
		}
		return resu;
	}
	
	//Ej30
//	Dada una cadena de entrada, comprobar si es una contraseña FUERTE o DÉBIL. Se considera que una contraseña 
//		es fuerte si contiene 8 o más caracteres, y entre ellos al menos hay una mayúscula, una minúscula, 
//		un signo de puntuación y un dígito. Tener en cuenta los valores decimales de los caracteres UNICODE.
	public static boolean passwordOk(String pwd) {
		boolean largo = pwd.length() >= 8;
		boolean mayuscula = false;
		boolean minuscula = false;
		boolean signo = false;
		boolean digito = false;
		char actual;
		
		for (int i = 0; i < pwd.length(); i++) {
			actual = pwd.charAt(i);
			mayuscula |= actual >= 65 && actual <= 90;
			minuscula |= actual >= 97 && actual <= 122;
			signo |= actual >= 33 && actual <= 47 || actual >= 58 && actual <= 64 || actual == 95; 
			digito |= actual >= 48 && actual <= 57; 
		}
		return largo && mayuscula && minuscula && signo && digito;
	}
	
	public static boolean passwordOkV2(String pwd) {
		boolean largo = pwd.length() >= 8;
		boolean mayuscula = false;
		boolean minuscula = false;
		boolean signo = false;
		boolean digito = false;
		char actual;
		
		for (int i = 0; i < pwd.length(); i++) {
			actual = pwd.charAt(i);
			mayuscula |= Character.isUpperCase(actual);
			minuscula |= Character.isLowerCase(actual);
			signo |= "!\\\"#$%&'()*+-./:;z=>?@_".indexOf(actual) != -1; 
			digito |= Character.isDigit(actual); 
		}
		return largo && mayuscula && minuscula && signo && digito;
	}
	
	
	
	public static void main(String[] args) {
		// Test01 - 02
//		System.out.println(comienzaConH("hola que tal"));
//		System.out.println(comienzaConH("Hola que tal"));
//		System.out.println(comienzaConH("Adios"));
		
		// Test03
//		deletrea("Hola que tal");
		
		// Test04
//		System.out.println(contains("hola que tal", 'q'));
//		System.out.println(contains("hola que tal", 'h'));
//		System.out.println(contains("hola que tal", 'l'));
//		System.out.println(contains("hola que tal", 'j'));
		
		//Test05
//		System.out.println(repite('a', 4));
//		System.out.println(repiteB('a', 4));
		
		//Test06
//		System.out.println(cuentaCaracter("Ali Baba y los 40 Ladrones", 'a'));
//		System.out.println(cuentaCaracter("Ali Baba y los 40 Ladrones", 'A'));
		
		//Test07
//		System.out.println(cuentaVocales("murcielago"));
//		System.out.println(cuentaVocales("MURCIELAGO"));
//		System.out.println(cuentaVocales("albañil"));
		
		//Test08
//		System.out.println(invierte("Hola que tal"));
		
		//Test09
//		System.out.println(esPalindromo("Dabale arroz a la zorra el   Abad"));
//		System.out.println(esPalindromoB("Dabale arroz a la zorra el   Abad"));
//		System.out.println(esPalindromo("No"));
//		System.out.println(esPalindromoB("No"));
//		System.out.println(esPalindromo("a"));
//		System.out.println(esPalindromoB("a"));
//		System.out.println(esPalindromo("aa"));
//		System.out.println(esPalindromo("aa"));
//		System.out.println(esPalindromo("Ana"));
//		System.out.println(esPalindromoB("Ana"));
		
		//Test10
//		System.out.println(sigla(" Universal   serial   bus   "));
		
		//Test11
//		System.out.println(separa("separar", '-'));
//		System.out.println(separa("", '-'));
//		System.out.println(separa("a", '-'));
//		System.out.println(separa("aa", '-'));
		
		//Test12
//		System.out.println(inserta3("192168210", '.'));
//		System.out.println(inserta3("1921682102", '.'));
//		System.out.println(inserta3("19216821021", '.'));
//		System.out.println(inserta3("192168210212", '.'));
		
		//Test13
//		System.out.println(inserta("192168210", '.', 3));
//		System.out.println(inserta("1921682102", '.', 3));
//		System.out.println(inserta("19216821021", '.', 3));
//		System.out.println(inserta("192168210212", '.', 3));
//		System.out.println(inserta("192168210", '.', 2));
//		System.out.println(inserta("1921682102", '.', 2));
//		System.out.println(inserta("19216821021", '.', 2));
//		System.out.println(inserta("192168210212", '.', 2));
//		System.out.println(inserta("192168210", '.', 1));
//		System.out.println(inserta("1921682102", '.', 1));
//		System.out.println(inserta("19216821021", '.', 1));
//		System.out.println(inserta("192168210212", '.', 1));
		
		//Test14
//		System.out.println(capitalize("  CONGRESO    Internacional    DE programacion   de  string"));
//		System.out.println(capitalize("CONGRESO"));

		//Test15
//		System.out.println("127.5 - 1.8 = " + calcula("127.5 - 1.8"));
//		System.out.println("127.5 * 1.8 = " + calcula("127.5 * 1.8"));
//		System.out.println("127.5 / 1.8 = " + calcula("127.5 / 1.8"));
//		System.out.println("127.5 + 1.8 = " + calcula("127.5 + 1.8"));
		
//		//Test17
//		posCaracter("Hola que tal", 'a');
//		posCaracter("Hola que tal", 'x');
//		//Test17 a
//		indexOf("Hola que tal", 'a');
//		indexOf("Hola que tal", 'x');
		
		//Test18
//		System.out.println(cambiaEspacios("hola que tal ", '*'));
		
//		//Test19
//		System.out.println(extrae("hola que tal", 'q'));
//		System.out.println(extrae("hola que tal", 'x'));
//		//Test19V2
//		System.out.println(extraeV2("hola que tal", 'q'));
//		System.out.println(extraeV2("hola que tal", 'x'));
//		//Test19V2
//		System.out.println(extraeV3("hola que tal", 'q'));
//		System.out.println(extraeV3("hola que tal", 'x'));
		
//		//Test20
//		System.out.println(eliminaVocales("MURCIELAGO"));
//		System.out.println(eliminaVocales("Murcielago"));
//		System.out.println(eliminaVocales("jdk"));
//		//Test20 a
//		System.out.println(eliminaVocalesV2("MURCIELAGO"));
//		System.out.println(eliminaVocalesV2("Murcielago"));
//		System.out.println(eliminaVocalesV2("jdk"));
		
//		//Test21
//		System.out.println(cambiaMayusculasMinusculas("Hola Que Tal"));
//		System.out.println(cambiaMayusculasMinusculas("hola"));
//		System.out.println(cambiaMayusculasMinusculas("HOLA"));
//		//Test21V2
//		System.out.println(cambiaMayusculasMinusculasV2("Hola Que Tal"));
//		System.out.println(cambiaMayusculasMinusculasV2("hola"));
//		System.out.println(cambiaMayusculasMinusculasV2("HOLA"));
		
//		//Test22
//		System.out.println(parentesisOk(")("));
//		System.out.println(parentesisOk("()"));
//		System.out.println(parentesisOk("(128*5) + ((3-9)-2)"));
//		System.out.println(parentesisOk("(128*5) + ((3-9)-2"));
		
		//Test23
//		System.out.println(cuentaPalabras("Hola", 3));
//		System.out.println(cuentaPalabras("Ho", 3));
//		System.out.println(cuentaPalabras("Ho que ta", 3));
//		System.out.println(cuentaPalabras("Ho qu ta", 3));
//
//		System.out.println(cuentaPalabrasConArrays("Hola", 3));
//		System.out.println(cuentaPalabrasConArrays("Ho", 3));
//		System.out.println(cuentaPalabrasConArrays("Ho que ta", 3));
//		System.out.println(cuentaPalabrasConArrays("Ho qu ta", 3));
		
		//Test24
//		System.out.println(juntarIguales("pata", "coco"));
		
		//Test24 a
//		System.out.println(juntar("pata", "coco"));
//		System.out.println(juntar("patata", "coco"));
//		System.out.println(juntar("co", "patata"));
		
//		//Test26
//		System.out.println("#" + trimInicio("      Hola que tal  ") + "#");
//		System.out.println("#" + trimInicio("      Hola que tal") + "#");
//		System.out.println("#" + trimInicio("Hola que tal  ") + "#");
//		System.out.println("#" + trimInicio("Hola que tal") + "#");
//		
//		//Test26a
//		System.out.println("#" + trimFinal("      Hola que tal  ") + "#");
//		System.out.println("#" + trimFinal("      Hola que tal") + "#");
//		System.out.println("#" + trimFinal("Hola que tal  ") + "#");
//		System.out.println("#" + trimFinal("Hola que tal") + "#");
//		
//		//Test26b
//		System.out.println("#" + trim("      Hola que tal  ") + "#");
//		System.out.println("#" + trim("      Hola que tal") + "#");
//		System.out.println("#" + trim("Hola que tal  ") + "#");
//		System.out.println("#" + trim("Hola que tal") + "#");

		//Test27
//		System.out.println(reemplazaNy("anyo"));
//		System.out.println(reemplazaNy("CARINYO"));
//		System.out.println(reemplazaNy("nyonyo"));
//		System.out.println(reemplazaNy("nyny"));
//		System.out.println(reemplazaNy("nyNY"));
		
		//Test28
//		System.out.println(replace("hola que tal", 'a', '#'));
//		System.out.println(replace("hola que tal", 'l', '#'));
//		System.out.println(replace("hola que tal", 'h', '#'));
//		System.out.println(replace("hola que tal", 'x', '#'));

		//Test30
//		System.out.println(passwordOk("hola"));
//		System.out.println(passwordOk("Hola"));
//		System.out.println(passwordOk("Hola1_"));
//		System.out.println(passwordOk("Hola1_Adios"));
//		System.out.println(passwordOk("hola1_adios"));
//		System.out.println();
//		System.out.println(passwordOkV2("hola"));
//		System.out.println(passwordOkV2("Hola"));
//		System.out.println(passwordOkV2("Hola1_"));
//		System.out.println(passwordOkV2("Hola1_Adios"));
//		System.out.println(passwordOkV2("hola1_adios"));

	}
}
