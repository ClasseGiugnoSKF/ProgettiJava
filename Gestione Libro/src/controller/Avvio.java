package controller;
import model.Libro;
import model.LibroCRUD;
import view.GestioneIO;

public class Avvio {

	public static void main(String[] args) {
		GestioneIO io = new GestioneIO();
		LibroCRUD lc = new LibroCRUD();
		String cerca;
		byte scelta;

		do {
			io.menu();
			scelta = io.leggiByte("Quale operazione vuoi eseguire?: ");
			switch(scelta) {
			case 1:			
				lc.inserisci(new Libro(io.leggiIntero("Numero di pagine: "), io.leggiStringa("Autore: "),
						io.leggiStringa("Titolo: "), io.leggiStringa("Genere: "), io.leggiStringa("Edizione: "),
						io.leggiStringa("Codice ISBN: ")));
				break;
			case 2: //Modifica
				cerca = io.leggiStringa("Inserisci il codice ISBN da cercare: ");
				for(int i=0;i<lc.leggi().size();i++) {
					if(lc.leggi(i).getCodiceISBN().equals(cerca)) {
						io.sommarioLibro(lc.leggi(i));
						cerca = "";
						Libro l = io.duplicaMaschera(lc.leggi(i));
						io.modificaMaschera(l);
						if(io.leggiStringa("Sicuro di voler applicare le modifiche? (Si/No): ").equalsIgnoreCase("si")) {
							lc.modifica(i, l);
						} else {
							io.stampaErrore("Modifica annullata.");
						}
						break;
					}
				}
				if(!cerca.isEmpty()) {
					io.stampaErrore("Libro non trovato!");
				}
				break;
			case 3: //Cancella
				cerca = io.leggiStringa("Inserisci il codice ISBN da cercare: ");
				for(int i=0;i<lc.leggi().size();i++) {
					if(lc.leggi(i).getCodiceISBN().equals(cerca)) {
						io.sommarioLibro(lc.leggi(i));
						cerca = "";
						if(io.leggiStringa("Sicuro di voler cancellare il libro? (Si/No): ").equalsIgnoreCase("si")) {
							lc.rimuovi(i);
						} else {
							io.stampaErrore("Eliminazione annullata.");
						}
						break;
					}
				}
				if(!cerca.isEmpty()) {
					io.stampaErrore("Libro non trovato!");
				}
				break;
			case 4: //Trova
				cerca = io.leggiStringa("Inserisci il codice ISBN da cercare: ");
				for(int i=0;i<lc.leggi().size();i++) {
					if(lc.leggi(i).getCodiceISBN().equals(cerca)) {
						io.sommarioLibro(lc.leggi(i));
						cerca = "";
						break;
					}
				}
				if(!cerca.isEmpty()) {
					io.stampaErrore("Libro non trovato!");
				}
				break;
			case 5:
				io.visualizzaElenco(lc.leggi());
				break;
			case 6:
				io.visualizzaScheda(lc.leggi());
				break;
			case 7:
				io.stampa("Fine programma.");
			}
		}while(scelta!=7);
	}

}
