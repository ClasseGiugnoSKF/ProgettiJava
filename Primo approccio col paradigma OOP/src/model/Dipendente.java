package model;

public class Dipendente extends Persona { //Dipendente Figlia di Persona
	
	private Double stipendio;
	private String areaResp;
	
	public Double getStipendio() {
		return stipendio;
	}
	
	public void setStipendio(Double stipendio) {
		this.stipendio = stipendio;
	}
	
	public String getAreaResp() {
		return areaResp;
	}
	
	public void setAreaResp(String areaResp) {
		this.areaResp = areaResp;
	}
	
	@Override //è il meccanismo 
	public void saluto() {
		System.out.println("Ciao a tutti, sono una persona, che lavora alla faccia vostra! >:)");
	}
	
	public void salutoDelPadre() {
		super.saluto();
	}
	
	public Dipendente() {
		super();
	}
	
	public Dipendente(String nome, String cognome, Integer eta, String cf, String luogoNascita, Double stipendio, String areaResp) {
		super(nome,cognome,eta,cf,luogoNascita);
		this.stipendio=stipendio;
		this.areaResp=areaResp;
	}

	public String toString() {
		return super.toString()+","+stipendio+","+areaResp;
	}
	
}
