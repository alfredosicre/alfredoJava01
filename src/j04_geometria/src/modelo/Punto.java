package modelo; // tiene esta clase una asociacion de uso con la clase Figura.

	public class Punto {
		
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
			if(otro == null) return false;
			if(this == otro) return true;
			if (this.getClass() != otro.getClass()) return false;
			Punto p = (Punto)otro;
			return this.x == p.x && this.y == p.y;
		}
		
		@Override
		public String toString() {
			return "Punto (" + x + ", " + y + ")";
		}
	}
