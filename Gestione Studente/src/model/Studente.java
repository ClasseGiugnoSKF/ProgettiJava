package model;

public class Studente {

	private String nome;
	private String cognome;
	private String dataNascita;
	private String matricola;
	private Integer numeroEsamiSostenuti;
	private Integer numeroEsamiMancanti;
	private Float mediaVoti;
	
	public Studente() {}
	
	public Studente(String nome, String cognome, String dataNascita, String matricola,
					Integer numeroEsamiSostenuti, Integer numeroEsamiMancanti,
					Float mediaVoti) {
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.matricola = matricola;
		this.numeroEsamiSostenuti = numeroEsamiSostenuti;
		this.numeroEsamiMancanti = numeroEsamiMancanti;
		this.mediaVoti = mediaVoti;
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
	
	public String getDataNascita() {
		return dataNascita;
	}
	
	public void setDataNascita(String dataNascita) {
		this.dataNascita = dataNascita;
	}
	
	public String getMatricola() {
		return matricola;
	}
	
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	
	public Integer getNumeroEsamiSostenuti() {
		return numeroEsamiSostenuti;
	}
	
	public void setNumeroEsamiSostenuti(Integer numeroEsamiSostenuti) {
		this.numeroEsamiSostenuti = numeroEsamiSostenuti;
	}
	
	public Integer getNumeroEsamiMancanti() {
		return numeroEsamiMancanti;
	}
	
	public void setNumeroEsamiMancanti(Integer numeroEsamiMancanti) {
		this.numeroEsamiMancanti = numeroEsamiMancanti;
	}
	
	public Float getMediaVoti() {
		return mediaVoti;
	}
	
	public void setMediaVoti(Float mediaVoti) {
		this.mediaVoti = mediaVoti;
	}
}
