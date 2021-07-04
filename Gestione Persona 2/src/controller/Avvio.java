package controller;
import model.Persona;
import view.GestioneIO;

public class Avvio {

	public static void main(String[] args) {
		GestioneIO io = new GestioneIO();
		Persona[] pVet = new Persona[3];
		byte pCont = 0;
		byte scelta;
		
		do {
			io.menu();
			scelta = io.leggiByte("Quale operazione vuoi eseguire?");
			switch(scelta) {
			case 1:
				if(pCont < pVet.length) {
					pVet[pCont] = new Persona();
					io.inserisciP(pVet[pCont]);
					pCont++;
				} else {
					Boolean flag = false;
					for(int x=0;x<pVet.length;x++) {
						if(pVet[x].getCodiceFiscale() == null) {
							io.inserisciP(pVet[x]);
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
				String cerca = io.leggiStringa("Inserisci il codice fiscale di chi stai cercando: ");
				for(int i=0;i<pVet.length;i++) {
					if(pVet[i] != null && pVet[i].getCodiceFiscale() != null) {
						if(pVet[i].getCodiceFiscale().equalsIgnoreCase(cerca)) {
							io.sommarioP(pVet[i]);
							io.inserisciP(pVet[i]);
							cerca = "";
							break;
						}
					}
				}
				if(!cerca.isEmpty()) {
					io.stampaErrore(cerca+" non è stato trovato.");
				}				
				break;
			case 3:
				cerca = io.leggiStringa("Inserisci il codice fiscale di chi stai cercando: ");
				for(int i=0;i<pVet.length;i++) {
					if(pVet[i] != null && pVet[i].getCodiceFiscale() != null) {
						if(pVet[i].getCodiceFiscale().equalsIgnoreCase(cerca)) {
							io.sommarioP(pVet[i]);
							io.cancellaP(pVet[i]);
							io.stampaErrore("Utente cancellato.");
							cerca = "";
							break;
						}
					} 
				}
				if(!cerca.isEmpty()) {
					io.stampaErrore(cerca+" non è stato trovato.");
				}	
				break;
			case 4:
				cerca = io.leggiStringa("Inserisci il codice fiscale di chi stai cercando: ");
				for(int i=0;i<pVet.length;i++) {
					if(pVet[i] != null && pVet[i].getCodiceFiscale() != null) {
						if(pVet[i].getCodiceFiscale().equalsIgnoreCase(cerca)) {
							io.sommarioP(pVet[i]);
							cerca = "";
							break;
						}
					}
				}
				if(!cerca.isEmpty()) {
					io.stampaErrore(cerca+" non è stato trovato.");
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
		}while(scelta < 7);
	}
}
