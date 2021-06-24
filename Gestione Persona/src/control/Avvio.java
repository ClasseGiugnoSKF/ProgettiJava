package control;

import model.Persona;
import view.GestoreIO;

public class Avvio {

	public static void main(String[] args) {

		GestoreIO g = new GestoreIO();
		
		Persona[] persone = new Persona[4];
		int contatore = 0;
		
		do {
			g.stampaStringa("Inserisci dati persona:");
			g.stampaStringa("\n");
			persone[contatore] = new Persona();
			g.inserirePersona(persone[contatore]);
			g.stampaStringa("Indirizzo dell'oggetto persona p è " + persone[contatore] +"\n");
			contatore++;
			if(contatore>=persone.length) {
				break;
			}
		}while(g.leggiStringa("Vuoi creare una nuova persona?(si/no)").equalsIgnoreCase("si"));

		g.stampaStringa("Di seguito riportiamo le persone inserite.\n");
		//Stampa vettore di persone
		for(int i=0; i<contatore; i++) {
			g.stampaStringa("La persona " +i+ " è:\n");
			g.stampaStringa("Nome: " + persone[i].getNome() +"\n");
			g.stampaStringa("Cognome: " + persone[i].getCognome() +"\n");
			g.stampaStringa("Eta: " + persone[i].getEta() +"\n");
			g.stampaStringa("Codice fiscale: " + persone[i].getCodiceFiscale() +"\n");
			g.stampaStringa("\n");
		}
		//Questo for poteva essere fatto in modo alternativo:
		//potevi fare in modo che i arrivasse fino a persone.length
		//e poi nel for metti un if(persone[i]!=null) {stampa}
	}
}
