package controller;
import view.GestioneIO;
import model.Veicolo;
import model.Auto;
import model.AutoElettrica;
import model.VeicoloCRUD;

public class Avvio {

	public static void main(String[] args) throws Exception {
		GestioneIO io = new GestioneIO();
		VeicoloCRUD vc = new VeicoloCRUD();
		byte scelta;
		int chiave;
		do {
			io.menu();
			scelta = io.leggiByte("Quale operazione vuoi eseguire?: ");
			switch(scelta) {
			case 1:
				Veicolo v = null;
				switch(io.leggiByte("Vuoi inserire un veicolo (1), un auto (2) oppure un auto elettrica (3)?: ")) {
				case 1:
					v = new Veicolo();
					break;
				case 2:
					v = new Auto();
					break;
				case 3:
					v = new AutoElettrica();
					break;
				default:
					io.stampaErrore("Opzione invalida.");
				}
				if(v != null) {
					do {
						chiave = io.leggiIntero("Inserisci un ID numerico per il veicolo.");
						if(chiave == 0) {
							io.stampaErrore("Inserisci un intero valido.");
						}
					} while(chiave == 0);
					if(!vc.leggi().containsKey(chiave)) {
						io.creaMaschera(v);
						vc.inserisci(chiave, v);
					}
				}
				break;
			case 2:
				chiave = io.leggiIntero("Cerca un ID da modificare: ");
				if(vc.leggi(chiave)!=null) {
					if(io.leggiStringa("Utente trovato. Sicuro di voler modificarlo?").equalsIgnoreCase("si")) {
						v = io.clonaMaschera(vc.leggi(chiave));
						io.modificaMaschera(v);
						vc.modifica(chiave, v);
					}
					chiave = 0;
				}
				if(chiave != 0) {
					io.stampaErrore("Utente non trovato.");
				}
				break;
			case 3:
				chiave = io.leggiIntero("Cerca un ID da eliminare: ");
				if(vc.leggi(chiave)!=null) {
					if(io.leggiStringa("Utente trovato. Sicuro di voler eliminarlo? (Si/No)").equalsIgnoreCase("si")) {
						vc.rimuovi(chiave);
					}
					chiave = 0;
				}
				if(chiave != 0) {
					io.stampaErrore("Utente non trovato.");
				}
				break;
			case 4:
				chiave = io.leggiIntero("Cerca un ID da trovare: ");
				if(vc.leggi(chiave)!=null) {
					io.stampa("Utente trovato.");
					chiave = 0;
				}
				if(chiave != 0) {
					io.stampaErrore("Utente non trovato.");
				}
				break;
			case 5:
				io.stampaElenco(vc.leggi());
				break;
			case 6:
				io.stampaScheda(vc.leggi());
				break;
			case 7:
				io.stampa("Fine programma.");
			}
		} while(scelta!=7);
	}

}
