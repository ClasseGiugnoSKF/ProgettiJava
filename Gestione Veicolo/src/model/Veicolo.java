package model;

public class Veicolo {
	
	private String marca;
	private String colore;
	private Double peso;
	private String tipo;
	private Double lunghezza;
	private Double altezza;
	
	public Veicolo() {}
	
	public Veicolo(String marca, String colore, Double peso, String tipo, Double lunghezza, Double altezza) {
		this.marca = marca;
		this.colore = colore;
		this.peso = peso;
		this.tipo = tipo;
		this.lunghezza = lunghezza;
		this.altezza = altezza;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getLunghezza() {
		return lunghezza;
	}

	public void setLunghezza(Double lunghezza) {
		this.lunghezza = lunghezza;
	}

	public Double getAltezza() {
		return altezza;
	}

	public void setAltezza(Double altezza) {
		this.altezza = altezza;
	}
	
	@Override
	public String toString() {
		return marca+","+colore+","+peso+","+tipo+","+lunghezza+","+altezza;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((altezza == null) ? 0 : altezza.hashCode());
		result = prime * result + ((colore == null) ? 0 : colore.hashCode());
		result = prime * result + ((lunghezza == null) ? 0 : lunghezza.hashCode());
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((peso == null) ? 0 : peso.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veicolo other = (Veicolo) obj;
		if (altezza == null) {
			if (other.altezza != null)
				return false;
		} else if (!altezza.equals(other.altezza))
			return false;
		if (colore == null) {
			if (other.colore != null)
				return false;
		} else if (!colore.equals(other.colore))
			return false;
		if (lunghezza == null) {
			if (other.lunghezza != null)
				return false;
		} else if (!lunghezza.equals(other.lunghezza))
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (peso == null) {
			if (other.peso != null)
				return false;
		} else if (!peso.equals(other.peso))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}
}
