package model;

public class Cubo extends Solido {

	private Double lato;
	
	public Cubo() {
		super("Cubo");
	}
	
	public Cubo(Double pesoSpecifico, Double lato) {
		super("Cubo");
		this.lato = lato;
	}
	
	@Override
	public Double volume() {
		return Math.pow(lato, 3);
	}

	@Override
	public Double superfice() {
		return Math.pow(lato, 2)*6;
	}

	public Double getLato() {
		return lato;
	}

	public void setLato(Double lato) {
		this.lato = lato;
	}

	@Override
	public String toString() {
		return super.toString()+","+lato+","+volume()+","+superfice()+","+peso(getPesoSpecifico());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((lato == null) ? 0 : lato.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cubo other = (Cubo) obj;
		if (lato == null) {
			if (other.lato != null)
				return false;
		} else if (!lato.equals(other.lato))
			return false;
		return true;
	}
}
