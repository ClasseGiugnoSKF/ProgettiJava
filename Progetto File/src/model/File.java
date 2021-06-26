package model;

public class File {

	private String nome;
	private String tipo;
	private Double dimensione;
	private String ultimaModifica;
	
	public File() {}
	
	public File(String nome, String tipo, Double dimensione, String ultimaModifica) {
		this.nome = nome;
		this.tipo = tipo;
		this.dimensione = dimensione;
		this.ultimaModifica = ultimaModifica;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Double getDimensione() {
		return dimensione;
	}
	
	public void setDimensione(Double dimensione) {
		this.dimensione = dimensione;
	}
	
	public String getUltimaModifica() {
		return ultimaModifica;
	}
	
	public void setUltimaModifica(String ultimaModifica) {
		this.ultimaModifica = ultimaModifica;
	}
	
	@Override
	public String toString() {
		return nome +","+ tipo +","+ dimensione +","+ ultimaModifica;
	}
	
}
