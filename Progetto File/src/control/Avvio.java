package control;

import model.File;
import model.Testo;
import view.GestioneIO;

public class Avvio {

	public static void main(String[] args) {

		GestioneIO g = new GestioneIO();
		File[] file = new File[3];
		Testo[] testi = new Testo[3];
		int indiceFile = 0;
		int indiceTesto = 0;
		boolean flag = true;
		
		do {
			g.menuPrincipale();
			switch(g.leggiIntero("Sceglli un'opzione: ")) {
			case 1:
				g.menuSecondario();
				switch(g.leggiIntero("Scegli un'opzione: ")) {
				case 1:
					if(indiceFile != file.length) {
						file[indiceFile] = new File();
						g.inserireFile(file[indiceFile]);
						indiceFile++;
					} else {
						g.stampaString("Il vettore di File è pieno.\n\n");
					}
					break;
					
				case 2:
					if(indiceTesto != testi.length) {
						testi[indiceTesto] = new Testo();
						g.inserireTesto(testi[indiceTesto]);
						indiceTesto++;
					} else {
						g.stampaString("Il vettore di Testi è pieno.\n\n");
					}
					break;
					
				default:
					g.stampaString("L'opzione inserita non è corretta.\n\n");
				}
				break;
				
			case 2:
				g.menuSecondario();
				switch(g.leggiIntero("Scegli un'opzione: ")) {
				case 1:
					for(int i=0; i<indiceFile; i++) {
						g.stampaString(file[i].toString() + "\n");
					}
					break;
				case 2:
					for(int i=0; i<indiceTesto; i++) {
						g.stampaString(testi[i].toString() + "\n");
					}
					break;
				default:
					g.stampaString("L'opzione inserita non è corretta.\n\n");
				}
				break;
				
			case 3:
				g.menuSecondario();
				switch(g.leggiIntero("Scegli un'opzione: ")) {
				case 1:
					for(int i=0; i<indiceFile; i++) {
						g.stampaFile(file[i]);
						g.stampaString("\n");
					}
					break;
				case 2:
					for(int i=0; i<indiceTesto; i++) {
						g.stampaTesto(testi[i]);
						g.stampaString("\n");
					}
					break;
				default:
					g.stampaString("L'opzione inserita non è corretta.\n\n");
				}
				break;
				
			case 4:
				g.stampaString("Fine programma\n");
				flag = false;
				break;
				
			default:
				g.stampaString("L'opzione inserita non è valida.");
			}
			
		}while(flag);
	}

}
