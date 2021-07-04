package controller;
import model.Persona;
import view.GestioneIO;

public class Avvio {

	public static void main(String[] args) {
		
		GestioneIO io = new GestioneIO();
		String risposta = "Si";
		Persona[] persone = new Persona[10];
		do {
			io.stampa("*** INSERISCI I TUOI DATI");
			for(int i=0;i<persone.length;i++) {
				persone[i] = new Persona(io.leggiStringa("Inserisci nome: "), io.leggiStringa("Inserisci cognome: "),
						io.leggiIntero("Inserisci età: "), io.leggiStringa("Inserisci Codice Fiscale: "), 
						io.leggiStringa("Insersci nazione: "), io.leggiStringa("Inserisci luogo di nascita: "));
				if(io.leggiStringa("Vuoi aggiungere altri utenti? (Si/No)").equalsIgnoreCase("No"))break;
			}
			risposta = io.leggiStringa("Vuoi stampare? (Si/No)");
			if(risposta.equalsIgnoreCase("Si")) {
				io.stampaPersone(persone);
				io.csvPersone(persone);
			}
			risposta = io.leggiStringa("Vuoi continuare? (Si/No)");
		} while(risposta.equalsIgnoreCase("si"));
	}

}
