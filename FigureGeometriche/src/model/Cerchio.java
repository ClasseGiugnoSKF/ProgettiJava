package model;

public class Cerchio extends FiguraGeometrica {

	private Double raggio;
	
	public Cerchio() {
		super("Cerchio");
	}
	
	public Cerchio(Double raggio) {
		super("Cerchio");
		this.raggio = raggio;
	}
	
	@Override
	public Double calcolaPerim() {
		return 2*getRaggio()*Math.PI;
	}

	@Override
	public Double calcolaArea() {
		return Math.PI*Math.pow(getRaggio(), 2);
	}

	public Double getRaggio() {
		return raggio;
	}

	public void setRaggio(Double raggio) {
		this.raggio = raggio;
	}
	
	@Override
	public String toString() {
		return super.toString()+","+raggio+","+calcolaPerim()+","+calcolaArea();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((raggio == null) ? 0 : raggio.hashCode());
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
		Cerchio other = (Cerchio) obj;
		if (raggio == null) {
			if (other.raggio != null)
				return false;
		} else if (!raggio.equals(other.raggio))
			return false;
		return true;
	}
	
}
