package model;

import java.util.Date;

public class AutoElettrica extends Auto {

	private Double autonomia;
	private boolean guidaAutomatica;
	private Double tempoRicarica;
	
	public AutoElettrica() {}
	
	public AutoElettrica(String marca, String colore, Double peso, String tipo, Double lunghezza,
			Double altezza, Integer cilindrata, boolean cambioAutomatico, Integer cavalli, Date immatricolazione,
			Double autonomia, boolean guidaAutomatica, Double tempoRicarica) {
		super();
		this.autonomia = autonomia;
		this.guidaAutomatica = guidaAutomatica;
		this.tempoRicarica = tempoRicarica;
	}

	public Double getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(Double autonomia) {
		this.autonomia = autonomia;
	}

	public boolean getGuidaAutomatica() {
		return guidaAutomatica;
	}

	public void setGuidaAutomatica(boolean guidaAutomatica) {
		this.guidaAutomatica = guidaAutomatica;
	}

	public Double getTempoRicarica() {
		return tempoRicarica;
	}

	public void setTempoRicarica(Double tempoRicarica) {
		this.tempoRicarica = tempoRicarica;
	}
	
	@Override
	public String toString() {
		return super.toString()+","+autonomia+","+guidaAutomatica+","+tempoRicarica;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((autonomia == null) ? 0 : autonomia.hashCode());
		result = prime * result + (guidaAutomatica ? 1231 : 1237);
		result = prime * result + ((tempoRicarica == null) ? 0 : tempoRicarica.hashCode());
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
		AutoElettrica other = (AutoElettrica) obj;
		if (autonomia == null) {
			if (other.autonomia != null)
				return false;
		} else if (!autonomia.equals(other.autonomia))
			return false;
		if (guidaAutomatica != other.guidaAutomatica)
			return false;
		if (tempoRicarica == null) {
			if (other.tempoRicarica != null)
				return false;
		} else if (!tempoRicarica.equals(other.tempoRicarica))
			return false;
		return true;
	}
}
