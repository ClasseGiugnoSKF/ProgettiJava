package model;

import java.util.Objects;

public class Manager extends Dipendente{

	private Integer livello;
	
	public Manager() {
		super();
	}
	
	public Manager(String nome, String cognome, Integer eta, String codiceFiscale, Double stipendio, Integer livello) {
		super(nome, cognome, eta, codiceFiscale, stipendio);
		this.livello = livello;
	}

	public Integer getLivello() {
		return livello;
	}

	public void setLivello(Integer livello) {
		this.livello = livello;
	}
	
	@Override
	public String toString() {
		return super.toString() +","+ livello;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(livello);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof Manager)) {
			return false;
		}
		Manager other = (Manager) obj;
		return Objects.equals(livello, other.livello);
	}
	
}
