package model;

public class Libro {

	private Integer numeroPagine;
	private String autore;
	private String titolo;
	private String genere;
	private String edizione;
	private String codiceISBN;
	
	public Libro() {}
	
	public Libro(Integer numeroPagine, String autore, String titolo, 
			String genere, String edizione, String codiceISBN) {
		this.numeroPagine = numeroPagine;
		this.autore = autore;
		this.titolo = titolo;
		this.genere = genere;
		this.edizione = edizione;
		this.codiceISBN = codiceISBN;
	}
	
	public Integer getNumeroPagine() {
		return numeroPagine;
	}
	
	public void setNumeroPagine(Integer numeroPagine) {
		this.numeroPagine = numeroPagine;
	}
	
	public String getAutore() {
		return autore;
	}
	
	public void setAutore(String autore) {
		this.autore = autore;
	}
	
	public String getTitolo() {
		return titolo;
	}
	
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	public String getGenere() {
		return genere;
	}
	
	public void setGenere(String genere) {
		this.genere = genere;
	}
	
	public String getEdizione() {
		return edizione;
	}
	
	public void setEdizione(String edizione) {
		this.edizione = edizione;
	}
	
	public String getCodiceISBN() {
		return codiceISBN;
	}
	
	public void setCodiceISBN(String codiceISBN) {
		this.codiceISBN = codiceISBN;
	}

	@Override
	public String toString() {
		return numeroPagine+","+autore+","+titolo+","+genere+","+edizione+","+codiceISBN;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autore == null) ? 0 : autore.hashCode());
		result = prime * result + ((codiceISBN == null) ? 0 : codiceISBN.hashCode());
		result = prime * result + ((edizione == null) ? 0 : edizione.hashCode());
		result = prime * result + ((genere == null) ? 0 : genere.hashCode());
		result = prime * result + ((numeroPagine == null) ? 0 : numeroPagine.hashCode());
		result = prime * result + ((titolo == null) ? 0 : titolo.hashCode());
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
		Libro other = (Libro) obj;
		if (autore == null) {
			if (other.autore != null)
				return false;
		} else if (!autore.equals(other.autore))
			return false;
		if (codiceISBN == null) {
			if (other.codiceISBN != null)
				return false;
		} else if (!codiceISBN.equals(other.codiceISBN))
			return false;
		if (edizione == null) {
			if (other.edizione != null)
				return false;
		} else if (!edizione.equals(other.edizione))
			return false;
		if (genere == null) {
			if (other.genere != null)
				return false;
		} else if (!genere.equals(other.genere))
			return false;
		if (numeroPagine == null) {
			if (other.numeroPagine != null)
				return false;
		} else if (!numeroPagine.equals(other.numeroPagine))
			return false;
		if (titolo == null) {
			if (other.titolo != null)
				return false;
		} else if (!titolo.equals(other.titolo))
			return false;
		return true;
	}
}
