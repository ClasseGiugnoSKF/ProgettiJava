package model;

public class Persona {

	private String nome;
	private String cognome;
	private Integer eta;
	private String codiceFiscale;
	
	public Persona() {}
	
	public Persona(String nome, String cognome, Integer eta, String codiceFiscale) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.codiceFiscale = codiceFiscale;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Integer getEta() {
		return eta;
	}

	public void setEta(Integer eta) {
		this.eta = eta;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	
}
