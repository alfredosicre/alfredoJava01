package modelo;

public abstract class Figura { // abstract puede tener metodos abstractos, sin cuerpo, las clases que hereden deben implementar
	// sus propios metodos
	
	private double x;
	private double y;
	
	public Figura() {};
	
	public Figura(double x, double y) {
		
		this.x = x;
		this.y = y;
		
	}
	
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	
	// metodo del area que son abstractos
	public abstract double area();
	
	// metodo del perimetro que son abstractos
	public abstract double perimetro();
	
	// metodo del diametro del circulo
	public abstract double diametro();
	
	// metodo para el Centro de Masas.
	public static Punto centroMasas(Figura... figs) { // hago una llamada a la clase Punto para el calculo
		var sumX = .0; // acumulador de sumas
		var sumY = .0;
		var sumArea = .0;
		for(int i = 0; i < figs.length; i++) {
			sumX += figs[i].area() * figs[i].getX();
			sumY += figs[i].area() * figs[i].getY();
			sumArea += figs[i].area();
		}
		return new Punto(sumX/sumArea, sumY/sumArea);
	}
	
	
	public boolean equals(Object otro) {
		
		if(otro == null) return false;
		if(this == otro) return true;
		if (this.getClass() != otro.getClass()) return false;
		Figura otra = (Figura) otro;
		return this.x == otra.x && this.y == otra.y;
		
	}

	@Override
	public String toString() {
		return "Figura [x=" + x + ", y=" + y + "]";
	}
	
}
