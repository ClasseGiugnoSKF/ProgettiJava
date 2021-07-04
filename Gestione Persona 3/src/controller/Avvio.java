package controller;
import model.*;
import view.GestioneIO;

public class Avvio {

	public static void main(String[] args) {
		GestioneIO io = new GestioneIO();
		Persona[] pVet = new Persona[3];
		byte pCont = 0;
		byte scelta;
		do {
			io.menu();
			scelta = io.leggiByte("Scegli un'operazione: ");
			switch(scelta) {
			case 1:
				switch(io.leggiIntero("Vuoi inserire una persona (1), un dipendente (2) o un manager (3)?: ")) {
				case 1:
					if(pCont < pVet.length) {
						pVet[pCont] = new Persona();
						io.inserisciP(pVet[pCont]);
						pCont++;
					} else {
						Boolean flag = false;
						for(int i=0;i<pVet.length;i++) {
							if(pVet[i].getCodiceFiscale() == null) {
								pVet[i] = new Persona();
								io.inserisciP(pVet[i]);
								flag = true; 
								break;
							}
						}
						if(!flag) {
							io.stampaErrore("Hai raggiunto il limite massimo di persone!");
						}
					}
					break;
				case 2:
					if(pCont < pVet.length) {
						pVet[pCont] = new Dipendente();
						io.inserisciP(pVet[pCont]);
						pCont++;
					} else {
						Boolean flag = false;
						for(int i=0;i<pVet.length;i++) {
							if(pVet[i].getCodiceFiscale() == null) {
								pVet[i] = new Dipendente();
								io.inserisciP(pVet[i]);
								flag = true; 
								break;
							}
						}
						if(!flag) {
							io.stampaErrore("Hai raggiunto il limite massimo di persone!");
						}
					}
					break;
				case 3:
					if(pCont < pVet.length) {
						pVet[pCont] = new Manager();
						io.inserisciP(pVet[pCont]);
						pCont++;
					} else {
						Boolean flag = false;
						for(int i=0;i<pVet.length;i++) {
							if(pVet[i].getCodiceFiscale() == null) {
								pVet[i] = new Manager();
								io.inserisciP(pVet[i]);
								flag = true; 
								break;
							}
						}
						if(!flag) {
							io.stampaErrore("Hai raggiunto il limite massimo di persone!");
						}
					}
				}
				break;
			case 2:
				String cerca = io.leggiStringa("Digita un codice fiscale da cercare: ");
				if(!cerca.isEmpty()) {
					for(int i=0;i<pVet.length;i++) {
						if(pVet[i] != null && pVet[i].getCodiceFiscale().equals(cerca)) {
							io.sommarioP(pVet[i]);
							io.mascheraModifica(pVet[i]);
							break;
						}
					}	
				}
				break;
			case 3:
				cerca = io.leggiStringa("Digita un codice fiscale da cercare: ");
				for(int i=0;i<pVet.length;i++) {
					if(pVet[i] != null && pVet[i].getCodiceFiscale().equals(cerca)) {
						io.sommarioP(pVet[i]);
						if(io.leggiStringa("Sicuro di voler cancellare l'utente? (Si/No)").equalsIgnoreCase("si")) {
							io.cancellaMaschera(pVet[i]);
						}
						break;
					}
				}
				break;
			case 4:
				cerca = io.leggiStringa("Digita un codice fiscale da cercare: ");
				for(int i=0;i<pVet.length;i++) {
					if(pVet[i] != null && pVet[i].getCodiceFiscale().equals(cerca)) {
						io.sommarioP(pVet[i]);
						cerca = "";
						break;
					}
				}
				if(!cerca.isEmpty()) {
					io.stampaErrore("Utente non trovato!");
				}
				break;
			case 5:
				io.elencoP(pVet);
				break;
			case 6:
				io.stampaScheda(pVet);
				break;
			case 7:
				io.stampa("Fine programma.");
			}
		} while(scelta<7);
	}

}
