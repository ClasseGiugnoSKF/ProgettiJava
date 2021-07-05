package model;

public class Rettangolo extends FiguraGeometrica {

	private Double base;
	private Double altezza;
	
	public Rettangolo() {
		super("Cerchio");
	}
	
	public Rettangolo(Double base, Double altezza) {
		super("Cerchio");
		this.base = base;
		this.altezza = altezza;
	}
	
	@Override
	public Double calcolaPerim() {
		return (base+altezza)*2;
	}

	@Override
	public Double calcolaArea() {
		return base*altezza;
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getAltezza() {
		return altezza;
	}

	public void setAltezza(Double altezza) {
		this.altezza = altezza;
	}
	
	@Override
	public String toString() {
		return super.toString()+","+base+","+altezza+","+calcolaPerim()+","+calcolaArea();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((altezza == null) ? 0 : altezza.hashCode());
		result = prime * result + ((base == null) ? 0 : base.hashCode());
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
		Rettangolo other = (Rettangolo) obj;
		if (altezza == null) {
			if (other.altezza != null)
				return false;
		} else if (!altezza.equals(other.altezza))
			return false;
		if (base == null) {
			if (other.base != null)
				return false;
		} else if (!base.equals(other.base))
			return false;
		return true;
	}

}
