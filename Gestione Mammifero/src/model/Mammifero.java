package model;

public class Mammifero {
	private String nomeSpecie;
	private String sesso;
	private int eta;
	private double lunghezza;
	private double altezza;
	private double peso;
	private boolean acquatico;
	private int longevita;
	private String alimentazione;	
	
	public Mammifero() {}
	
	public Mammifero(String nomeSpecie, String sesso, int eta, double lunghezza, double altezza, double peso, int longevita,
			String alimentazione, boolean acquatico) {
		this.nomeSpecie = nomeSpecie;
		this.sesso = sesso;
		this.eta = eta;
		this.lunghezza = lunghezza;
		this.altezza = altezza;
		this.peso = peso;
		this.longevita = longevita;
		this.alimentazione = alimentazione;	
		this.acquatico = acquatico;
	}
	
	public String getNomeSpecie() {
		return nomeSpecie;
	}
	
	public void setNomeSpecie(String nomeSpecie) {
		this.nomeSpecie = nomeSpecie;
	}
	
	public String getSesso() {
		return sesso;
	}
	
	public void setSesso(String sesso) {
		this.sesso = sesso;
	}
	
	public int getEta() {
		return eta;
	}
	
	public void setEta(int eta) {
		this.eta = eta;
	}
	
	public double getLunghezza() {
		return lunghezza;
	}
	
	public void setLunghezza(double lunghezza) {
		this.lunghezza = lunghezza;
	}
	
	public double getAltezza() {
		return altezza;
	}
	
	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public boolean getAcquatico() {
		return acquatico;
	}
	
	public void setAcquatico(boolean acquatico) {
		this.acquatico = acquatico;
	}
	
	public int getLongevita() {
		return longevita;
	}
	
	public void setLongevita(int longevita) {
		this.longevita = longevita;
	}
	
	public String getAlimentazione() {
		return alimentazione;
	}
	
	public void setAlimentazione(String alimentazione) {
		this.alimentazione = alimentazione;
	}
	
	@Override
	public String toString() {
		return nomeSpecie+","+sesso+","+eta+","+lunghezza+","+altezza+","+peso+","+longevita+","+alimentazione+","+acquatico;
	}
}
