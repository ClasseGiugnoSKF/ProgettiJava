package model;

public class Persona {
	
	private String nome;
	private String cognome;
	private Integer eta;
	private String codiceFiscale;
	private String nazione;
	private String luogoNascita;
	
	public Persona() {}
	
	public Persona(String nome, String cognome, Integer eta, String codiceFiscale, String nazione, String luogoNascita) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.codiceFiscale = codiceFiscale;
		this.nazione = nazione;
		this.luogoNascita = luogoNascita;
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

	public String getNazione() {
		return nazione;
	}

	public void setNazione(String nazione) {
		this.nazione = nazione;
	}

	public String getLuogoNascita() {
		return luogoNascita;
	}

	public void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}
	
	@Override
	public String toString() {
		if(codiceFiscale != null) {
			return nome+","+cognome+","+eta+","+codiceFiscale+","+nazione+","+luogoNascita;
		}
		return "";
	}
}
