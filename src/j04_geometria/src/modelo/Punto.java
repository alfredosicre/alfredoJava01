package modelo;

public abstract class Punto extends Figura {
	
	private double x;
	private double y;
	
	public Punto() {}
	
	public Punto(double x, double y) {
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
	
	public boolean equals(Object otro) {
		if(!super.equals(otro)) return false;
		Punto p = (Punto)otro;
		return this.x == p.x && this.y == p.y;
	}
	
	
	
	
}
