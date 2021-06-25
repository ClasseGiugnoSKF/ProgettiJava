package control;

import model.Alimento;
import model.Frutta;
import view.GestoreIO;

public class Avvio {

	public static void main(String[] args) {

		GestoreIO g = new GestoreIO();
		Alimento[] alimenti = new Alimento[4];
		Frutta[] frutta = new Frutta[4];
		boolean flag = true;
		int indiceAlimenti = 0;
		int indiceFrutta = 0;
		
		do {
			g.menuPrincipale();
			switch(g.leggiIntero("Scegli un'opzione\n")) {
			case 1:
				g.menuSecondario();
				switch(g.leggiIntero("Scegli un'opzione\n")) {
				case 1:
					if(indiceAlimenti != alimenti.length) {
						alimenti[indiceAlimenti] = new Alimento();
						g.inserireAlimento(alimenti[indiceAlimenti]);
						indiceAlimenti++;
					} else {
						g.stampaStringa("Il vettore alimenti è pieno\n");
					}
					break;
				case 2:
					if(indiceFrutta != frutta.length) {
						frutta[indiceFrutta] = new Frutta();
						g.inserireFrutta(frutta[indiceFrutta]);
						indiceFrutta++;
					} else {
						g.stampaStringa("Il vettore frutta è pieno\n");
					}
					break;

				default:
					g.stampaStringa("L'opzione inserita non è valida\n");
				}
				break;
			case 2:
				g.menuSecondario();
				switch(g.leggiIntero("Scegli un'opzione\n")) {
				case 1:
					for(int i=0; i<indiceAlimenti; i++) {
						g.stampaStringa(alimenti[i].toString() +"\n");
					}
					break;
				case 2:
					for(int i=0; i<indiceFrutta; i++) {
						g.stampaStringa(frutta[i].toString() +"\n");
					}
					break;
				default:
					g.stampaStringa("L'opzione inserita non è valida\n");					
				}
				break;
			case 3:
				g.menuSecondario();
				switch(g.leggiIntero("Scegli un'opzione\n")) {
				case 1:
					for(int i=0; i<indiceAlimenti; i++) {
						g.stampaAlimento(alimenti[i]);
						g.stampaStringa("\n");
					}
					break;
				case 2:
					for(int i=0; i<indiceFrutta; i++) {
						g.stampaFrutto(frutta[i]);
						g.stampaStringa("\n");
					}
					break;
				default:
					g.stampaStringa("L'opzione inserita non è valida\n");					
				}
				break;
			case 4:
				g.stampaStringa("Fine programma\n");
				flag = false;
				break;
			default:
				g.stampaStringa("L'opzione inserita non è valida\n");				
			}
		}while(flag);
		
	}

}
