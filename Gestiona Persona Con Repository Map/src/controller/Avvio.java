package controller;
import model.PersonaCRUD;
import model.Persona;
import model.Dipendente;
import model.Manager;
import view.GestioneIO;

public class Avvio {

	public static void main(String[] args) {
		GestioneIO io = new GestioneIO();
		PersonaCRUD pc = new PersonaCRUD();
		
		byte scelta;
		do {
			io.menu();
			Persona p = null;
			String chiave;
			scelta = io.leggiByte("Scegli un'operazione: ");
			switch(scelta) {
			case 1: 
				// Inserimento
				switch(io.leggiByte("Vuoi inserire una persona (1), un dipendente (2) oppure un manager? (3): ")) {
				case 1:
					p = new Persona();
					break;
				case 2:
					p = new Dipendente();
					break;
				case 3:
					p = new Manager();
				}
				if(p!=null) {
					io.creaMaschera(p);
					do {
						chiave = io.leggiStringa("Inserisci il codice fiscale: ");
						if(chiave.isEmpty()) {
							io.stampaErrore("Fornire un codice fiscale!");
						}
					} while(chiave.isEmpty());
					pc.inserisci(chiave, p);
					chiave = "";
				}
				break;
			case 2: // Modifica
				chiave = io.leggiStringa("Inserisci il codice fiscale da cercare: ");
				if(pc.leggi(chiave) != null) {
					p = io.clonaMaschera(pc.leggi(chiave));
					io.modificaMaschera(p);
					if(io.leggiStringa("Sicuro di voler applicare le modifiche? (Si/No): ").equalsIgnoreCase("si")) {
						pc.rimuovi(chiave);
						pc.inserisci(io.leggiStringa("Inserisci il nuovo codice fiscale: "), p);
					}
					chiave = "";
				}
				if(!chiave.isEmpty()) {
					io.stampaErrore("Utente non trovato.");
				}
				break;
			case 3: // Cancella
				chiave = io.leggiStringa("Inserisci il codice fiscale da cercare: ");
				if(pc.leggi(chiave) != null) {
					if(io.leggiStringa("Sicuro di voler cancellare l'utente? (Si/No)").equalsIgnoreCase("si")) {
						pc.rimuovi(chiave);
					} else {
						io.stampaErrore("Operazione annullata.");
					}
					chiave = "";
				}
				if(!chiave.isEmpty()) {
					io.stampaErrore("Utente non trovato.");
				}
				break;
			case 4: // Trova
				chiave = io.leggiStringa("Inserisci il codice fiscale da cercare: ");
				if(pc.leggi(chiave) != null) {
					io.stampa("Utente trovato.");
					chiave = "";
				}
				if(!chiave.isEmpty()) {
					io.stampaErrore("Utente non trovato.");
				}
				break;
			case 5: // Visualizza Elenco
				io.stampaElenco(pc.leggi());
				break;
			case 6: // Visualizza Scheda
				io.stampaScheda(pc.leggi());
				break;
			case 7:
				io.stampa("Fine programma.");
			}
		}while(scelta!=7);
	}

}
