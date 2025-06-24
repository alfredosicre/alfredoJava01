package modelo;

public class Circulo extends Figura{

	private double radio;
	
	// hacemos el constructor
	public Circulo(double x, double y, double radio) {
		super(x, y);
		this.radio = radio;
		}
	
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	// calculo del diametro
	@Override
	public double diametro() {
		return radio * 2;
	}
	// calculo del area del circulo
	@Override
	public double area() {
		return Math.PI * Math.pow(radio, 2);
	}
	// calculo del perimetro
	@Override
	public double perimetro() {
		return 2 * Math.PI * radio;
	}

	@Override
	public boolean equals(Object otro) {
		if(!super.equals(otro)) return false;
		Circulo c = (Circulo)otro;
		return this.radio == c.radio;	
	}

	@Override
	public String toString() {
		return "Circulo [getX()=" + getX() + ", getY()=" + getY() + ", radio=" + radio + "]";
	}

	
	
	
	
	
}
