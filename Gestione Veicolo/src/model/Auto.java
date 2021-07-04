package model;
import java.util.Date;

public class Auto extends Veicolo {
	
	private Integer cilindrata;
	private boolean cambioAutomatico;
	private Integer cavalli;
	private Date immatricolazione;
	
	public Auto() {
		super();
	}
	
	public Auto(String marca, String colore, Double peso, String tipo, Double lunghezza,
			Double altezza, Integer cilindrata, boolean cambioAutomatico, Integer cavalli, Date immatricolazione) {
		super();
		this.cilindrata = cilindrata;
		this.cambioAutomatico = cambioAutomatico;
		this.cavalli = cavalli;
		this.immatricolazione = immatricolazione;
	}

	public Integer getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(Integer cilindrata) {
		this.cilindrata = cilindrata;
	}

	public boolean getCambioAutomatico() {
		return cambioAutomatico;
	}

	public void setCambioAutomatico(boolean cambioAutomatico) {
		this.cambioAutomatico = cambioAutomatico;
	}

	public Integer getCavalli() {
		return cavalli;
	}

	public void setCavalli(Integer cavalli) {
		this.cavalli = cavalli;
	}

	public Date getImmatricolazione() {
		return immatricolazione;
	}

	public void setImmatricolazione(Date immatricolazione) {
		this.immatricolazione = immatricolazione;
	}

	@Override
	public String toString() {
		return super.toString()+","+cilindrata+","+cambioAutomatico+","+cavalli+","+immatricolazione;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (cambioAutomatico ? 1231 : 1237);
		result = prime * result + ((cavalli == null) ? 0 : cavalli.hashCode());
		result = prime * result + ((cilindrata == null) ? 0 : cilindrata.hashCode());
		result = prime * result + ((immatricolazione == null) ? 0 : immatricolazione.hashCode());
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
		Auto other = (Auto) obj;
		if (cambioAutomatico != other.cambioAutomatico)
			return false;
		if (cavalli == null) {
			if (other.cavalli != null)
				return false;
		} else if (!cavalli.equals(other.cavalli))
			return false;
		if (cilindrata == null) {
			if (other.cilindrata != null)
				return false;
		} else if (!cilindrata.equals(other.cilindrata))
			return false;
		if (immatricolazione == null) {
			if (other.immatricolazione != null)
				return false;
		} else if (!immatricolazione.equals(other.immatricolazione))
			return false;
		return true;
	}
}
