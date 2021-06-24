package control;

import model.Automobile;
import view.GestioneIO;

public class Avvio {

	public static void main(String[] args) {

		GestioneIO g = new GestioneIO();
		Automobile[] automobili = new Automobile[4];
		int indice = 0;
		
		//Lettura vettore automobili
		do {
			g.stampaString("Inserisci automobile.");
			automobili[indice] = new Automobile();
			g.inserireAutomobile(automobili[indice]);
			indice++;
			if(indice >= automobili.length) {
				break;
			}
		} while(g.leggiStringa("Vuoi inserire una nuova persona?(si/no)").equalsIgnoreCase("si"));
		
		//Stampa vettore automobili
		for(int i=0; i<indice; i++) {
			g.stampaString("L'automobile " +i+ " è:");
			g.stampaAutomobile(automobili[i]);
			g.stampaString("");
		}
		
	}

}
