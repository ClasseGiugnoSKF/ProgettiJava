package model;

//classe model: è una classe che modella una singola entità
//in tal caso modello un'entità persona, ovvero, modello il singolo individuo
//modello il GENERICO individuo
//una classe model Persona è una classe che archivia i dati sensibili di un individuo
public class Persona {
	
	//Variabile di classe
	//Variabile condivisa da tutti gli oggetti della classe, 
	//ovvero, tutti gli oggetti accedono alla stessa cella di memoria
	private static String nazione;
	
	//Attributi sono detti: variabili di istanza
	//Variabili globali (al di fuori di ogni metodo)
	//Ogni oggetto della classe avrà le sue celle esclusive
	private String nome;
	private String cognome;
	private Integer eta;
	private String cf;
	private String luogoNascita;
	
	public static String getNazione() {
		return nazione;
	}

	public static void setNazione(String nazione) {
		Persona.nazione = nazione;
	}
	
	//setter e getter devono essere pubblici
	
	//getter: metodo che consente di accedere ad una variabile di istanza
	//per prendere un dato precedentemente assegnato
	public String getNome() {
		return nome;
	}
	
	//setter: metodo che consente di accedere ad una variabile di istanza per effettuare una assegnazione.
	public void setNome(String nome) {
		this.nome = nome;
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
	
	//Overload/sovraccarico dei costruttori
	//il costruttore senza argomenti
	//Regole del costruttore:
	//1)Stesso nome della classe
	//2)Non hanno tipo di ritorno (nè void e nè altro)
	public Persona() {}
	
	//costruttore parametrizzato, ovvero, un costruttore  con uno o più argomenti
	public Persona(String nome) {
		this.nome=nome;
	}
	
	public Persona(String nome, String cognome) {
		this.nome=nome;
		this.cognome=cognome;
	}
	
	public Persona(String nome, String cognome, Integer eta) {
		this.nome=nome;
		this.cognome=cognome;
		this.eta=eta;
	}
	
	public Persona(String nome, String cognome, Integer eta, String cf, String luogoNascita) {
		this.nome=nome;
		this.cognome=cognome;
		this.eta=eta;
		this.cf=cf;
		this.luogoNascita=luogoNascita;
	}
	
	public void saluto() {
		System.out.println("Ciao a tutti, sono una persona, ma non lavoro! :(");
	}
	
	@Override
	public String toString() {
		return nome+","+cognome+","+eta;
	}
}
