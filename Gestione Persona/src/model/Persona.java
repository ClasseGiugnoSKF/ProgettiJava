package model;

public class Persona {

	private String nome, cognome, cf, nazione, luogoNascita;
	private Integer eta;
	
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

	public String getCognome() {
		return cognome;
	}

	public String getCf() {
		return cf;
	}

	public String getNazione() {
		return nazione;
	}

	public String getLuogoNascita() {
		return luogoNascita;
	}

	public Integer getEta() {
		return eta;
	}
	
	
	
}
