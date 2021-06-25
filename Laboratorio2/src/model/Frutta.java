package model;

public class Frutta extends Alimento{

	private String colore;
	private String stagione;
	private String sapore;
	private String provenienza;
	
	public Frutta() {
		super();
	}
	
	public Frutta(String tipo, Double peso, Integer calorie, Double prezzo, String colore, String stagione, String sapore, String provenienza) {
		super(tipo, peso, calorie, prezzo);
		this.colore = colore;
		this.stagione = stagione;
		this.sapore = sapore;
		this.provenienza = provenienza;
	}
	
	public String getColore() {
		return colore;
	}
	
	public void setColore(String colore) {
		this.colore = colore;
	}
	
	public String getStagione() {
		return stagione;
	}
	
	public void setStagione(String stagione) { 
		this.stagione = stagione;
	}
	
	public String getSapore() {
		return sapore;
	}
	
	public void setSapore(String sapore) {
		this.sapore = sapore;
	}
	
	public String getProvenienza() {
		return provenienza;
	}
	
	public void setProvenienza(String provenienza) {
		this.provenienza = provenienza;
	}
	
	@Override
	public String toString() {
		return super.toString() + colore +","+ stagione +","+ sapore +","+ provenienza;
	}
	
}
