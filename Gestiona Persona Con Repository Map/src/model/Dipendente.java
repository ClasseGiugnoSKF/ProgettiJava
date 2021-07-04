package model;

public class Dipendente extends Persona {

	private Double stipendio;
	
	public Dipendente() {
		super();
	}
	
	public Dipendente(String nome, String cognome, Integer eta, String nazione, String luogoNascita, Double stipendio) {
		super();
		this.stipendio = stipendio;
	}
	
	public Double getStipendio() {
		return stipendio;
	}
	
	public void setStipendio(Double stipendio) {
		this.stipendio = stipendio;
	}
	
	@Override
	public String toString() {
		return super.toString()+","+stipendio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((stipendio == null) ? 0 : stipendio.hashCode());
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
		Dipendente other = (Dipendente) obj;
		if (stipendio == null) {
			if (other.stipendio != null)
				return false;
		} else if (!stipendio.equals(other.stipendio))
			return false;
		return true;
	}
}
