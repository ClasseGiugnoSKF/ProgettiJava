package model;

public class Animale {

	private String specie, sesso, areaZoo;
	private Integer eta, peso;
	private Double altezza;
	private boolean aggressivo;
	
	public Animale() {}
	
	public Animale(String specie, String sesso, String areaZoo, Integer eta, Integer peso, Double altezza, boolean aggressivo) {
		this.specie = specie;
		this.sesso = sesso;
		this.areaZoo = areaZoo;
		this.eta = eta;
		this.peso = peso;
		this.altezza = altezza;
		this.aggressivo = aggressivo;
	}

	public void setSesso(String sesso) {
		this.sesso = sesso;
	}

	public void setAreaZoo(String areaZoo) {
		this.areaZoo = areaZoo;
	}

	public void setEta(Integer eta) {
		this.eta = eta;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	public void setAltezza(Double altezza) {
		this.altezza = altezza;
	}

	public void setAggressivo(boolean aggressivo) {
		this.aggressivo = aggressivo;
	}

	public String getSpecie() {
		return specie;
	}

	public String getSesso() {
		return sesso;
	}

	public String getAreaZoo() {
		return areaZoo;
	}

	public Integer getEta() {
		return eta;
	}

	public Integer getPeso() {
		return peso;
	}

	public Double getAltezza() {
		return altezza;
	}

	public boolean getAggressivo() {
		return aggressivo;
	}
}
