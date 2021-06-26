package model;

public class Testo extends File{
	
	private Integer numeroRighe;
	private Integer numeroCaratteri;
	private Boolean pseudoCodice;
	
	public Testo() {
		super();
	}
	
	public Testo(String nome, String tipo, Double dimensione, String ultimaModifica,
				Integer numeroRighe, Integer numeroCaratteri, Boolean pseudoCodice) {
		super(nome, tipo, dimensione, ultimaModifica);
		this.numeroRighe = numeroRighe;
		this.numeroCaratteri = numeroCaratteri;
		this.pseudoCodice = pseudoCodice;
	}
	
	public Integer getNumeroRighe() {
		return numeroRighe;
	}
	
	public void setNumeroRighe(Integer numeroRighe) {
		this.numeroRighe = numeroRighe;
	}
	
	public Integer getNumeroCaratteri() {
		return numeroCaratteri;
	}
	
	public void setNumeroCaratteri(Integer numeroCaratteri) {
		this.numeroCaratteri = numeroCaratteri;
	}
	
	public Boolean getPseudoCodice() {
		return pseudoCodice;
	}
	
	public void setPseudoCodice(Boolean pseudoCodice) {
		this.pseudoCodice = pseudoCodice;
	}
	
	@Override
	public String toString() {
		return super.toString() +","+ numeroRighe +","+ numeroCaratteri +","+ pseudoCodice;
	}
}
