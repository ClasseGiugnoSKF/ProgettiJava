package model;

public class Sfera extends Solido {

	private Double raggio;
	
	public Sfera() {
		super("Sfera");
	}
	
	public Sfera(Double pesoSpecifico, Double raggio) {
		super("Sfera");
		this.raggio = raggio;
	}

	@Override
	public Double volume() {
		return (4/3)*Math.PI*Math.pow(raggio, 3);
	}

	@Override
	public Double superfice() {
		return 4*Math.PI*Math.pow(raggio, 2);
	}

	public Double getRaggio() {
		return raggio;
	}

	public void setRaggio(Double raggio) {
		this.raggio = raggio;
	}

	@Override
	public String toString() {
		return super.toString()+","+raggio+","+volume()+","+superfice()+peso(getPesoSpecifico());
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
		Sfera other = (Sfera) obj;
		if (raggio == null) {
			if (other.raggio != null)
				return false;
		} else if (!raggio.equals(other.raggio))
			return false;
		return true;
	}
}
