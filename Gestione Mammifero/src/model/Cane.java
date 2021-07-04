package model;

public class Cane extends Mammifero {

	private String nomeCane;
	private boolean cacciatore;
	private boolean pedigree;
	
	public Cane() {
		super();
	}
	
	public Cane(String nomeSpecie, String sesso, int eta, double lunghezza, double altezza, double peso, int longevita, 
			byte alimentazione, boolean acquatico, String nomeCane, boolean cacciatore, boolean pedigree) {
		super();
		this.nomeCane = nomeCane;
		this.cacciatore = cacciatore;
		this.pedigree = pedigree;
	}
	
	public String getNomeCane() {
		return nomeCane;
	}
	
	public void setNomeCane(String nomeCane) {
		this.nomeCane = nomeCane;
	}
	
	public boolean getCacciatore() {
		return cacciatore;
	}
	
	public void setCacciatore(boolean cacciatore) {
		this.cacciatore = cacciatore;
	}
	
	public boolean getPedigree() {
		return pedigree;
	}
	
	public void setPedigree(boolean pedigree) {
		this.pedigree = pedigree;
	}
	
	@Override
	public String toString() {
		return super.toString()+","+nomeCane+","+cacciatore+","+pedigree;
	}
}
