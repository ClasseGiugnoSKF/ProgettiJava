package model;

public class Studente {
	
	private static String nazione = "Italia", scuola = "Liceo Alibaba";
	private String nome, cognome, luogoNascita, cf;
	private Integer eta;
	
	public Studente(String nome, String cognome, Integer eta, String luogoNascita, String cf) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.luogoNascita = luogoNascita;
		this.cf = cf;
	}
	
	public void stampaStudente() {
		System.out.println("Nome: "+nome+"\n"
				+ "Cognome: "+cognome+"\n"
				+ "Età: "+eta+"\n"
				+ "Luogo di Nascita: "+luogoNascita+"\n"
				+ "Codice Fiscale: "+cf+"\n"
				+ "Nazione: "+nazione+"\n"
				+ "Scuola: "+scuola);
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
}
