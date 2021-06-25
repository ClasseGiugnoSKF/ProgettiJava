package model;

public class Alimento {

	private String tipo;
	private Double peso;
	private Integer calorie;
	private Double prezzo;
	
	public Alimento() {}
	
	public Alimento(String tipo, Double peso, Integer calorie, Double prezzo) {
		this.tipo = tipo;
		this.peso = peso;
		this.calorie = calorie;
		this.prezzo = prezzo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Double getPeso() {
		return peso;
	}
	
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	public Integer getCalorie() {
		return calorie;
	}
	
	public void setCalorie(Integer calorie) {
		this.calorie = calorie;
	}
	
	public Double getPrezzo() {
		return prezzo;
	}
	
	public void setPrezzo(Double prezzo) {
		this.prezzo = prezzo;
	}
	
	@Override
	public String toString() {
		return tipo +","+ peso +","+ calorie +","+ prezzo;
	}
}
