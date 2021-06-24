package control;

import model.Studente;
import view.GestioneIO;

public class Avvio {

	public static void main(String[] args) {

		GestioneIO g = new GestioneIO();
		Studente[] studenti = new Studente[4];
		int indice = 0;
		
		do {
			studenti[indice] = new Studente();
			g.inserireStudente(studenti[indice]);			
			indice++;
			if(indice >= studenti.length) {
				break;
			}
		}while(g.leggiStringa("Vuoi inserire un nuovo studente?(si/no)").equalsIgnoreCase("si"));
	
		for(int i=0; i<indice; i++) {
			System.out.println("Dati studente " + (i+1));
			g.stampaStudente(studenti[i]);
		}
	}
}
