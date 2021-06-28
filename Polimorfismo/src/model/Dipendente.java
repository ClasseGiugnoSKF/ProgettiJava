package model;

public class Dipendente extends Persona{

	private Double stipendio;
	
	public Dipendente() {}
	
	public Dipendente(String nome, String cognome, Integer eta, String codiceFiscale, Double stipendio) {
		super(nome, cognome, eta, codiceFiscale);
		this.stipendio = stipendio;
	}
	
	public Double getStipendio() {
		return stipendio;
	}
	
	public void setStipendio(Double stipendio) {
		this.stipendio = stipendio;
	}
	
	@Override
	public String toString() {
		return super.toString() +","+ stipendio;
	}
	
}
