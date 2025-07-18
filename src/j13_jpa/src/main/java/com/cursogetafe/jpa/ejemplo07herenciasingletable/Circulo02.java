package com.cursogetafe.jpa.ejemplo07herenciasingletable;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("CIRCULO")
public class Circulo02 extends Figura02 {
	
	@Column(name = "r")
	private double radio;
	
	public Circulo02() {}
	
	
	// hacemos el constructor
	public Circulo02(double x, double y, double radio) {
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
		Circulo02 c = (Circulo02)otro;
		return this.radio == c.radio;	
	}

	@Override
	public String toString() {
		return "Circulo [getX()=" + getX() + ", getY()=" + getY() + ", radio=" + radio + "]";
	}
	
	
}
