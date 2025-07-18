package com.cursogetafe.jpa.ejemplo04pkcompuesta;

import java.io.Serializable;
import java.util.Objects;

public class dni implements Serializable{
	
	private int nroDoc;
	private char letraDoc;
	
	
	public dni(int nroDoc, char letraDoc) {
		super();
		this.nroDoc = nroDoc;
		this.letraDoc = letraDoc;
	}
	
	public dni() {}
	
	
	public int getNroDoc() {
		return nroDoc;
	}
	public void setNroDoc(int nroDoc) {
		this.nroDoc = nroDoc;
	}
	public char getLetraDoc() {
		return letraDoc;
	}
	public void setLetraDoc(char letraDoc) {
		this.letraDoc = letraDoc;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(letraDoc, nroDoc);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		dni other = (dni) obj;
		return letraDoc == other.letraDoc && nroDoc == other.nroDoc;
	}
	@Override
	public String toString() {
		return "dni [nroDoc=" + nroDoc + ", letraDoc=" + letraDoc + "]";
	}
	
	

}
