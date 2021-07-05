package model;

public abstract class FiguraGeometrica {
	
	protected String nomeFigura;
	
	public abstract Double calcolaPerim();
	public abstract Double calcolaArea();

	public FiguraGeometrica() {
		super();
	}
	
	public FiguraGeometrica(String nomeFigura) {
		super();
		this.nomeFigura = nomeFigura;
	}
	
	public String getNomeFigura() {
		return nomeFigura;
	}
	
	public void setNomeFigura(String nomeFigura) {
		this.nomeFigura = nomeFigura;
	}
	
	@Override
	public String toString() {
		return nomeFigura;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeFigura == null) ? 0 : nomeFigura.hashCode());
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
		FiguraGeometrica other = (FiguraGeometrica) obj;
		if (nomeFigura == null) {
			if (other.nomeFigura != null)
				return false;
		} else if (!nomeFigura.equals(other.nomeFigura))
			return false;
		return true;
	}
}
