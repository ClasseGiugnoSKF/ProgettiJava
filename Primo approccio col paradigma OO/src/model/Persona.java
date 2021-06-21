package model;

//classe model:è una classe che modella una singola entità
//in tal caso modello un'entità persona, ovvero, modello il singolo individuo
//modello il GENERICO individuo
//una classe model Persona è una classe che archivia i dati sensibili di un individuo
public class Persona {
	
	//Variabile di classe
	//Variabile condivisa da tutti gli oggetti della classe,ovvero,
	//tutti gli oggetti accedono alla stessa cella di memoria
	private static String nazione;
	
	public static String getNazione() {
		return nazione;
	}

	public static void setNazione(String nazione) {
		Persona.nazione = nazione;
	}
	
	//Attributi sono detti: variabili di istanza/oggetto
	//Variabili globali (al di fuori di ogni metodo)
	//Ogni oggetto della classe avrà le sue celle esclusive
	private String nome;
	private String cognome;
	private Integer eta;
	private String cf;
	private String luogoNascita;
	
	
	//setter e getter obbligatoriamente pubblici
	//setter e getter sono conseguenza degli attributi privati in quanto unico modo per accedere
	//al loro contenuto
	
	//getter: metodo che consente di accedere ad una variabile di istanza
	//per prendere un dato precedentemente assegnato
	public String getNome() {
		return nome;
	}
	
	//setter: metodo che consente di accedere ad una variale di istanza
	//per effettuare una assegnazione
	public void setNome(String nome) {
		this.nome = nome; //il this si riferisce al generico oggetto
						  //che chiamerà il metodo setNome(String nome)
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Integer getEta() {
		return eta;
	}

	public void setEta(Integer eta) {
		this.eta = eta;
	}

	public String getCf() {
		return cf;
	}

	public void setCf(String cf) {
		this.cf = cf;
	}

	public String getLuogoNascita() {
		return luogoNascita;
	}

	public void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}

	

	
	
	
	
	

}
