package model;

public class Alimento {
	private String tipo;
	private int calorie;
	private Double peso;
	private Double prezzo;
	
	public Alimento() {}
	
	public Alimento(String tipo, int calorie, Double peso, Double prezzo) {
		this.tipo = tipo;
		this.calorie = calorie;
		this.peso = peso;
		this.prezzo = prezzo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCalorie() {
		return calorie;
	}

	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(Double prezzo) {
		this.prezzo = prezzo;
	}
	
	@Override
	public String toString() {
		return tipo+","+calorie+","+peso+","+prezzo;
	}
}
