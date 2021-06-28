package control;

import model.Dipendente;
import model.Persona;
import view.GestioneIO;

public class Avvio {

	public static void main(String[] args) {

		GestioneIO g = new GestioneIO();
		Persona[] persone = new Persona[g.leggiIntero("Inserisci dimensione array: ")];
		boolean flag = true;
		int indice = 0;
		
		do {
			g.menuPrincipale();
			switch(g.leggiIntero("Scegli un'opzione: ")) {
			case 1:
				g.menuSecondario();
				switch(g.leggiIntero("Scegli un'opzione: ")) {
				case 1:
					if(indice < persone.length) {
						persone[indice] = new Persona();
						g.inserisci(persone[indice]);
						indice++;
					} else {
						g.stampaStringa("Il vettore è pieno.\n");
					}
					break;
				case 2:
					if(indice < persone.length) {
						persone[indice] = new Dipendente();
						g.inserisci(persone[indice]);
						indice++;
					} else {
						g.stampaStringa("Il vettore è pieno.\n");
					}
					break;
				default:
					g.stampaStringa("L'opzione inserita non è valida.\n");
				}
				break;
				
			case 2:
				g.menuStampa();
				switch(g.leggiIntero("Scegli un'opzione: ")) {
				case 1:
					g.stampaArrayElenco(persone);
					g.stampaStringa("\n");
					break;
					
				case 2:
					g.stampaArrayScheda(persone);
					g.stampaStringa("\n");
					break;
					
				default:
					g.stampaStringa("L'opzione inserita non è valida.\n");
				}
				break;
			
			case 3:
				g.stampaStringa("Fine programma.\n");
				flag = false;
				break;
			default:
				g.stampaStringa("L'opzione inserita non è valida.\n");
			}
		}while(flag);
	}

}
