package controller;
import model.Cerchio;
import model.FiguraGeometrica;
import model.FiguraGeometricaCRUD;
import model.Quadrato;
import model.Rettangolo;
import model.Triangolo;
import view.GestioneIO;

public class Avvio {

	public static void main(String[] args) {
		GestioneIO io = new GestioneIO();
		FiguraGeometricaCRUD fc = new FiguraGeometricaCRUD();
		byte scelta;
		int i = -1;
		do {
			io.menu();
			scelta = io.leggiByte("Quale operazione vuoi eseguire?");
			switch(scelta) {
			case 1:
				FiguraGeometrica figura = null;
				switch(io.leggiByte("Vuoi inserire un cerchio (1), un quadrato (2), un rettangolo (3) oppure un triangolo? (4)")) {
				case 1:
					figura = new Cerchio();
					break;
				case 2:
					figura = new Quadrato();
					break;
				case 3:
					figura = new Rettangolo();
					break;
				case 4:
					figura = new Triangolo();
				}
				if(figura!=null) {
					io.creaMaschera(figura);
					fc.inserisci(figura);
				}
				break;
			case 2:
				io.stampaScheda(fc.leggi(),io.leggiByte("Vuoi cercare un cerchio (1), un quadrato (2), "
						+ "un rettangolo (3) oppure un triangolo? (4)"));
				i = io.leggiIntero("Quale elemento vuoi selezionare?: ");
				break;
			case 3:
				if(i!= -1 && io.leggiStringa("Sicuro di voler modificare la entry? (Si/No)").equalsIgnoreCase("si")) {
					figura = io.clonaMaschera(fc.leggi(i));
					io.modificaMaschera(figura);
					fc.modifica(i, figura);
					i= -1;
				}
				break;
			case 4:
				if(i!= -1 && io.leggiStringa("Sicuro di voler rimuovere la entry? (Si/No)").equalsIgnoreCase("si")) {
					fc.rimuovi(i);
					i= -1;
				}
				break;
			case 5:
				io.stampaElenco(fc.leggi(), io.leggiByte("Vuoi visualizzare i cerchi (1), i quadrati (2), "
						+ "i rettangoli (3) oppure i triangoli? (4)"));
				break;
			case 6:
				io.stampaScheda(fc.leggi(), io.leggiByte("Vuoi visualizzare i cerchi (1), i quadrati (2), "
						+ "i rettangoli (3) oppure i triangoli? (4)"));
				break;
			case 7:
				io.stampa("Fine programma.");
			}
		}while(scelta!=7);
	}

}
