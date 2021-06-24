package model;

public class Automobile {

	private String modello, marca, colore, annoImmatricolazione, cilindrata;
	private boolean assicurazione, revisione;
	private Integer prezzoBollo;
	
	public String getModello() {
		return modello;
	}
	
	public void setModello(String modello) {
		this.modello = modello;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getColore() {
		return colore;
	}
	
	public void setColore(String colore) {
		this.colore = colore;
	}
	
	public String getAnnoImmatricolazione() {
		return annoImmatricolazione;
	}
	
	public void setAnnoImmatricolazione(String annoImmatricolazione) {
		this.annoImmatricolazione = annoImmatricolazione;
	}
	
	public String getCilindrata() {
		return cilindrata;
	}
	
	public void setCilindrata(String cilindrata) {
		this.cilindrata = cilindrata;
	}
	
	public boolean isAssicurazione() {
		return assicurazione;
	}
	
	public void setAssicurazione(boolean assicurazione) {
		this.assicurazione = assicurazione;
	}
	
	public boolean isRevisione() {
		return revisione;
	}
	
	public void setRevisione(boolean revisione) {
		this.revisione = revisione;
	}
	
	public Integer getPrezzoBollo() {
		return prezzoBollo;
	}
	
	public void setPrezzoBollo(Integer prezzoBollo) {
		this.prezzoBollo = prezzoBollo;
	}
}
