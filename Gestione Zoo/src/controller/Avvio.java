package controller;
import model.Animale;
import view.GestioneIO;

public class Avvio {

	public static void main(String[] args) {
		GestioneIO io = new GestioneIO();
		String risposta = "";
		Animale[] animali = new Animale[io.leggiIntero("Quanti animali vuoi archiviare?")];
		do {
			for(int i=0;i<animali.length;i++) {
				animali[i] = new Animale(io.leggiStringa("Di che specie è l'animale?: "), io.leggiStringa("Di che sesso è?: "),
						io.leggiStringa("In che area dello zoo è situato?: "), io.leggiIntero("Quanti anni ha?: "), 
						io.leggiIntero("Quanto pesa? (kg): "), io.leggiDouble("Quanto è alto? (m): "),
						io.leggiBool("Mostra comportamenti aggressivi?"));
				if(io.leggiStringa("Vuoi aggiungere un altro animale?: (Si/No)").equalsIgnoreCase("no")) break;
			}
			if(io.leggiStringa("Vuoi stampare?: (Si/No)").equalsIgnoreCase("si")) {
				io.stampaAnimali(animali);
				io.csvAnimali(animali);
			}
			risposta = io.leggiStringa("Vuoi continuare?: (Si/No)");
		} while(risposta.equalsIgnoreCase("si"));
	}

}
