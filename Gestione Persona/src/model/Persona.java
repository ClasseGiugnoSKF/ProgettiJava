package model;

public class Persona {
	
	private String nome;
	private String cognome;
	private String cf;
	private String nazione;
	private String luogoNascita;
	private Integer eta;
	
	public Persona() {}
	
	public Persona(String nome, String cognome, Integer eta, String cf, String nazione, String luogoNascita) {
		this.nome=nome;
		this.cognome=cognome;
		this.eta=eta;
		this.cf=cf;
		this.nazione=nazione;
		this.luogoNascita=luogoNascita;
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

	public String getCf() {
		return cf;
	}
	
	public void setCf(String cf) {
		this.cf = cf;
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

	public Integer getEta() {
		return eta;
	}
	
	public void setEta(Integer eta) {
		this.eta = eta;
	}
	
	@Override
	public String toString() {
		return nome+","+cognome+","+eta+","+cf+","+nazione+","+luogoNascita;
	}
}
