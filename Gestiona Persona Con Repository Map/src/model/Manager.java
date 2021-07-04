package model;

public class Manager extends Dipendente {

	private Integer livello;
	private String areaResp;
	
	public Manager() {}
	
	public Manager(String nome, String cognome, Integer eta, String nazione, String luogoNascita, 
			Double stipendio, Integer livello, String areaResp) {
		super();
		this.livello = livello;
		this.areaResp = areaResp;
	}
	
	public Integer getLivello() {
		return livello;
	}
	
	public void setLivello(Integer livello) {
		this.livello = livello;
	}
	
	public String getAreaResp() {
		return areaResp;
	}
	
	public void setAreaResp(String areaResp) {
		this.areaResp = areaResp;
	}
	
	@Override
	public String toString() {
		return super.toString()+","+livello+","+areaResp;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((areaResp == null) ? 0 : areaResp.hashCode());
		result = prime * result + ((livello == null) ? 0 : livello.hashCode());
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
		Manager other = (Manager) obj;
		if (areaResp == null) {
			if (other.areaResp != null)
				return false;
		} else if (!areaResp.equals(other.areaResp))
			return false;
		if (livello == null) {
			if (other.livello != null)
				return false;
		} else if (!livello.equals(other.livello))
			return false;
		return true;
	}
}
