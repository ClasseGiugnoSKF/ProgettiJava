package model;

public class Automobile {

	private String marca;
	private String modello;
	private String targa;
	private String colore;
	private boolean assicurazione;
	private String annoImmatricolazione;
	private Integer cilindrata;
	private Float bollo;
	private boolean revisione;
	
	public Automobile() {}
	
	public Automobile(String marca, String modello, String targa, String colore,
					  boolean assicurazione, String annoImmatricolazione,
					  Integer cilindrata, Float bollo, boolean revisione) {
		this.marca = marca;
		this.modello = modello;
		this.targa = targa;
		this.colore = colore;
		this.assicurazione = assicurazione;
		this.annoImmatricolazione = annoImmatricolazione;
		this.cilindrata = cilindrata;
		this.bollo = bollo;
		this.revisione = revisione;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public boolean getAssicurazione() {
		return assicurazione;
	}

	public void setAssicurazione(boolean assicurazione) {
		this.assicurazione = assicurazione;
	}

	public String getAnnoImmatricolazione() {
		return annoImmatricolazione;
	}

	public void setAnnoImmatricolazione(String annoImmatricolazione) {
		this.annoImmatricolazione = annoImmatricolazione;
	}

	public Integer getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(Integer cilindrata) {
		this.cilindrata = cilindrata;
	}

	public Float getBollo() {
		return bollo;
	}

	public void setBollo(Float bollo) {
		this.bollo = bollo;
	}

	public boolean getRevisione() {
		return revisione;
	}

	public void setRevisione(boolean revisione) {
		this.revisione = revisione;
	}

	
}
