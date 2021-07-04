package model;

public class Motorino {
	
	private String marca, targa, colore;
	private Studente proprietario;
	
	public Motorino(String marca, String targa, String colore) {
		this.marca = marca;
		this.targa = targa;
		this.colore = colore;
	}
	
	public void setProprietario(Studente s) {
		this.proprietario = s;
	}
	
	public void stampaMotorino() {
		System.out.println("Marca: "+marca+"\n"
				+ "Targa: "+targa+"\n"
				+ "Colore: "+colore+"\n"
				+ "Proprietario: "+proprietario.getNome()+" "+proprietario.getCognome());
	}
}
