package control;

import java.util.LinkedList;

import model.Persona;
import view.GestoreIO;

public class Avvio {

	public static void main(String[] args) {

		GestoreIO g = new GestoreIO();
		LinkedList<Persona> listaPersone = new LinkedList<Persona>();
		boolean trovato = false;
		String codiceFiscale;
		boolean flag = true;
		
		do {
			g.menu();
			switch(g.leggiIntero("\nScegli un'opzione:")) {
			case 1:
				//INSERIMENTO
				listaPersone.add(new Persona());
				g.inserisciPersona(listaPersone.getLast());
				break;
			case 2:
				//MODIFICA
				if(!listaPersone.isEmpty()) {
					codiceFiscale = g.leggiStringa("Inserisci il codice fiscale della persona che vuoi modificare: ");
					for(int i=0; i<listaPersone.size(); i++) {
						if(listaPersone.get(i).getCodiceFiscale().equalsIgnoreCase(codiceFiscale)) {
							g.mascheraModifica(listaPersone.get(i));
							listaPersone.set(i, listaPersone.get(i));
							trovato = true;
							g.stampaStringa("La persona è stata modificata con successo.\n");
						}
					}
					if(!trovato) {
						g.stampaStringa("La persona che vuoi modificare non è presente nella lista.\n");
					}
					trovato = false;
				} else {
					g.stampaStringa("La lista è vuota.\n");
				}
				break;
			case 3:
				//CANCELLAZIONE
				if(!listaPersone.isEmpty()) {
					codiceFiscale = g.leggiStringa("Inserisci il codice fiscale della persona che vuoi cancellare: ");
					for(int i=0; i<listaPersone.size(); i++) {
						if(listaPersone.get(i).getCodiceFiscale().equalsIgnoreCase(codiceFiscale)) {
							listaPersone.remove(i);
							trovato = true;
							g.stampaStringa("La persona è stata rimossa con successo.\n");
						}
					}
					if(!trovato) {
						g.stampaStringa("La persona che vuoi eliminare non è presente nella lista.\n");
					}
					trovato = false;
				} else {
					g.stampaStringa("La lista è già vuota.\n");
				}
				break;
			case 4:
				//TROVA
				if(!listaPersone.isEmpty()) {
					codiceFiscale = g.leggiStringa("Inserisci il codice fiscale della persona che stai cercando: ");
					for(int i=0; i<listaPersone.size(); i++) {
						if(listaPersone.get(i).getCodiceFiscale().equalsIgnoreCase(codiceFiscale)) {
							g.stampaStringa("La persona da te cercata è:\n");
							g.stampaStringa(listaPersone.get(i).toString() + "\n");
							trovato = true;
						}
					}
					if(!trovato) {
						g.stampaStringa("La persona che stai cercando non è presente nella lista.\n");
					}
					trovato = false;
				} else {
					g.stampaStringa("La lista è vuota.\n");
				}
				break;
			case 5:
				//STAMPA ELENCO
				if(!listaPersone.isEmpty()) {
					for(int i=0; i<listaPersone.size(); i++) {
						g.stampaStringa(listaPersone.get(i).toString() + "\n");
					}
					g.stampaStringa("\n");
				} else {
					g.stampaStringa("La lista è vuota.\n");
				}
				break;
			case 6:
				//STAMPA SCHEDA
				if(!listaPersone.isEmpty()) {
					for(int i=0; i<listaPersone.size(); i++) {
						g.stampaPersona(listaPersone.get(i));
						g.stampaStringa("\n");
					}
					g.stampaStringa("\n");
				} else {
					g.stampaStringa("La lista è vuota.\n");
				}
				break;
			case 7:
				g.stampaStringa("Fine programma.\n");
				flag = false;
				break;
			default:
				g.stampaStringa("L'opzione inserita non è valida.\n");
			}
			
		}while(flag);
	}

}
