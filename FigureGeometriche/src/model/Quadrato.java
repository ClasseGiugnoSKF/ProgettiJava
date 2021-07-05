package model;

public class Quadrato extends FiguraGeometrica {

	private Double lato;
	
	public Quadrato() {
		super();
		this.nomeFigura = "Quadrato";
	}
	
	public Quadrato(Double lato) {
		super();
		this.nomeFigura = "Quadrato";
		this.lato = lato;
	}
	
	@Override
	public Double calcolaPerim() {
		return lato*4;
	}

	@Override
	public Double calcolaArea() {
		return lato*lato;
	}

	public Double getLato() {
		return lato;
	}

	public void setLato(Double lato) {
		this.lato = lato;
	}

	@Override
	public String toString() {
		return super.toString()+","+lato+","+calcolaPerim()+","+calcolaArea();
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
		Quadrato other = (Quadrato) obj;
		if (lato == null) {
			if (other.lato != null)
				return false;
		} else if (!lato.equals(other.lato))
			return false;
		return true;
	}
	
}
