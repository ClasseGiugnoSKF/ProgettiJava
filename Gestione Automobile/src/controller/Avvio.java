package controller;
import model.Automobile;
import view.GestioneIO;

public class Avvio {

	public static void main(String[] args) {
		GestioneIO io = new GestioneIO();
		
		Automobile[] automobili = new Automobile[io.leggiIntero("Fino a quante automobili vorresti poter archiviare?")];
		String risposta = "";
		
		do {
			for(int i=0;i<automobili.length;i++) {
				automobili[i] = new Automobile();
				io.inserisciAuto(automobili[i]);
				if(io.leggiStringa("Vuoi inserire altre automobili? (Si/No)").equalsIgnoreCase("no")) break;
			}
			if(io.leggiStringa("Vuoi stampare? (Si/No)").equalsIgnoreCase("si")) {
				io.stampaAutomobili(automobili);
				io.csvAutomobili(automobili);
			}
			risposta = io.leggiStringa("Vuoi continuare? (Si/No)");
		} while(risposta.equalsIgnoreCase("si"));
		
	}

}
