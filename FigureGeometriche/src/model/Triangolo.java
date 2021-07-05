package model;

public class Triangolo extends FiguraGeometrica {

	private Double lato1;
	private Double lato2;
	private Double lato3;
	
	public Triangolo() {
		super("Cerchio");
	}
	
	public Triangolo(Double lato1, Double lato2, Double lato3) {
		super("Cerchio");
		this.lato1 = lato1;
		this.lato2 = lato2;
		this.lato3 = lato3;
	}
	
	@Override
	public Double calcolaPerim() {
		if(lato1 == lato2 && lato2 == lato3) {
			return lato1*3;
		}
		return lato1+lato2+lato3;
	}

	@Override
	public Double calcolaArea() {
		Double p = calcolaPerim();
		return Math.sqrt((p*(p-lato1)*(p-lato2)*(p-lato3)));
	}
	
	public Double getLato1() {
		return lato1;
	}

	public void setLato1(Double lato1) {
		this.lato1 = lato1;
	}

	public Double getLato2() {
		return lato2;
	}

	public void setLato2(Double lato2) {
		this.lato2 = lato2;
	}

	public Double getLato3() {
		return lato3;
	}

	public void setLato3(Double lato3) {
		this.lato3 = lato3;
	}

	@Override
	public String toString() {
		return super.toString()+","+lato1+","+lato2+","+lato3+","+calcolaPerim()+","+calcolaArea();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((lato1 == null) ? 0 : lato1.hashCode());
		result = prime * result + ((lato2 == null) ? 0 : lato2.hashCode());
		result = prime * result + ((lato3 == null) ? 0 : lato3.hashCode());
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
		Triangolo other = (Triangolo) obj;
		if (lato1 == null) {
			if (other.lato1 != null)
				return false;
		} else if (!lato1.equals(other.lato1))
			return false;
		if (lato2 == null) {
			if (other.lato2 != null)
				return false;
		} else if (!lato2.equals(other.lato2))
			return false;
		if (lato3 == null) {
			if (other.lato3 != null)
				return false;
		} else if (!lato3.equals(other.lato3))
			return false;
		return true;
	}

}
