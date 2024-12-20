package gestioneNoleggio;

public class Auto {
	
	String codice;
	String marca;
	String modello;
	String categoria;
	boolean disponibilità;
	
	public Auto(String codice, String marca, String modello, String categoria) {
		
		this.codice = codice;
		this.marca = marca;
		this.modello = modello;
		this.categoria = categoria;
		this.disponibilità = true; 
	}
	
	public String codice(String codice) {
		return codice;
	}
	
	public boolean disponibilità() {
		return disponibilità;
	}
	
	public void cambioDisponibilità(boolean disponibilità) {
		this.disponibilità = disponibilità;
	}
	
	public String toString() {
		return "Codice identificativo: " + codice + " " + "Marca: " + marca + " " + "Modello: " + modello + " " + "Categoria: " + categoria + " " + "Disponibilità: " + disponibilità;
	}

}
