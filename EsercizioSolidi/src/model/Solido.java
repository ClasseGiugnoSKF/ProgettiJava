package model;

public abstract class Solido {

	private Double pesoSpecifico;
	private String nomeSolido;
	
	public abstract Double volume();
	public abstract Double superfice();

	public Solido() {
		super();
	}
	
	public Solido(String nomeSolido) {
		this.nomeSolido = nomeSolido;
	}
	
	public Solido(String nomeSolido, Double pesoSpecifico) {
		super();
		this.pesoSpecifico = pesoSpecifico;
	}
	
	public Double peso(Double num) {
		return volume()*num;
	}
	
	public Double getPesoSpecifico() {
		return pesoSpecifico;
	}
	
	public void setPesoSpecifico(Double pesoSpecifico) {
		this.pesoSpecifico = pesoSpecifico;
	}
	
	public String getNomeSolido() {
		return nomeSolido;
	}
	public void setNomeSolido(String nomeSolido) {
		this.nomeSolido = nomeSolido;
	}
	
	@Override
	public String toString() {
		return nomeSolido+","+pesoSpecifico;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeSolido == null) ? 0 : nomeSolido.hashCode());
		result = prime * result + ((pesoSpecifico == null) ? 0 : pesoSpecifico.hashCode());
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
		Solido other = (Solido) obj;
		if (nomeSolido == null) {
			if (other.nomeSolido != null)
				return false;
		} else if (!nomeSolido.equals(other.nomeSolido))
			return false;
		if (pesoSpecifico == null) {
			if (other.pesoSpecifico != null)
				return false;
		} else if (!pesoSpecifico.equals(other.pesoSpecifico))
			return false;
		return true;
	}
}
