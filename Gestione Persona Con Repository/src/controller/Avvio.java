package controller;
import java.util.ArrayList;
import model.Dipendente;
import model.Manager;
import model.Persona;
import view.GestioneIO;

public class Avvio {

	public static void main(String[] args) {
		GestioneIO io = new GestioneIO();
		ArrayList<Persona> pList = new ArrayList<Persona>();
		byte scelta;
		
		do {
			io.menu();
			scelta = io.leggiByte("Quale operazione vuoi eseguire?: ");
			switch(scelta) {
			case 1:
				Persona p = null;
				switch(io.leggiIntero("Vuoi inserire una persona (1), un dipendente (2) o un manager? (3)")) {
				case 1:
					p = new Persona();
					break;
				case 2:
					p = new Dipendente();
					break;
				case 3:
					p = new Manager();
					break;
				default:
					io.stampaErrore("Opzione non valida.");
				}
				if(p != null) {
					io.inserisci(p);
					pList.add(p);
				}
				break;
			case 2:
				String cerca = io.leggiStringa("Inserisci il codice fiscale da cercare: ");
				for(int i=0;i<pList.size();i++) {
					if(pList.get(i).getCodiceFiscale().equals(cerca)) {
						io.sommarioP(pList.get(i));
						cerca = "";
						io.modifica(pList.get(i));
						break;
					}
				}
				if(!cerca.isEmpty()) {
					io.stampaErrore("Utente non trovato!");
				}
				break;
			case 3:
				cerca = io.leggiStringa("Inserisci il codice fiscale da cercare: ");
				for(int i=0;i<pList.size();i++) {
					if(pList.get(i).getCodiceFiscale().equals(cerca)) {
						io.sommarioP(pList.get(i));
						cerca = "";
						if(io.leggiStringa("Sicuro di voler eliminare l'utente?: (Si/No)").equalsIgnoreCase("si")) {
							pList.remove(i);
						}
						break;
					}
				}
				if(!cerca.isEmpty()) {
					io.stampaErrore("Utente non trovato!");
				}
				break;
			case 4:
				cerca = io.leggiStringa("Inserisci il codice fiscale da cercare: ");
				for(int i=0;i<pList.size();i++) {
					if(pList.get(i).getCodiceFiscale().equals(cerca)) {
						io.sommarioP(pList.get(i));
						cerca = "";
						break;
					}
				}
				if(!cerca.isEmpty()) {
					io.stampaErrore("Utente non trovato!");
				}
				break;
			case 5:
				cerca = io.leggiStringa("Inserisci il codice fiscale da cercare: ");
				for(int i=0;i<pList.size();i++) {
					if(pList.get(i).getCodiceFiscale().equals(cerca)) {
						io.sommarioP(pList.get(i));
						cerca = "";
						Persona p1 = io.duplicaPersona(pList.get(i));
						io.modifica(p1);
						if(io.leggiStringa("Vuoi confermare la modifica? (Si/No)").equalsIgnoreCase("si")) {
							pList.set(i, p1);
						} else {
							io.stampaErrore("Modifica annullata.");
						}
						break;
					}
				}
				if(!cerca.isEmpty()) {
					io.stampaErrore("Utente non trovato!");
				}
				break;
			case 6:
				io.stampaElenco(pList);
				break;
			case 7:
				io.stampaScheda(pList);
				break;
			case 8:
				io.stampa("Fine programma.");
			}
		}while(scelta<8);
	}

}
