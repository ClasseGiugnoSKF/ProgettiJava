
public class Algoritmi {

	GestioneIO g = new GestioneIO();
	
	void conta() {
		int contatore = 1;
		int scelta = 0;
		g.stampa("Preferisci la stampa in verticale o in orizzontale?");
		scelta = g.leggiIntero("Premi 1 per la scelta orizzontale \n"
				+ "Premi 2 per la scelta verticale");
		switch (scelta) {
		case 1:
			for(contatore=1; contatore<=10; contatore++) {
				g.stampaOrizzontale(contatore);
			}
			break;
		case 2:
			for(contatore=1; contatore<=10; contatore++) {
				g.stampaVerticale(contatore);
			}
			break;
		default:
			g.stampaErrore("Attenzione! Opzione non valida.");
		}
	}
	
	void stampaPariDispari() {
		int dim = g.leggiIntero("Quanti elementi vuoi inserire nel vettore?");
		int[] numero = new int[dim];
		g.stampa("Inserisci i valori del vettore");
		for(int i=0; i<dim; i++) {
			numero[i] = g.leggiIntero("");
		}
		int scelta = 0;
		g.stampa("Preferisci la stampa dei numeri pari o dispari?");
		scelta = g.leggiIntero("Premi 1 per i numeri pari \n"
				+ "Premi 2 per i numeri dispari");
		switch (scelta) {
			case 1:
				for(int i=0; i<dim; i++) {
					if((numero[i]%2) == 0) {
						g.stampa(numero[i]);
					}
				}
				break;
			case 2:
				for(int i=0; i<dim; i++) {
					if((numero[i]%2) == 1) {
						g.stampa(numero[i]);
					}
				}
				break;
			default:
				g.stampaErrore("Attenzione! Opzione non valida.");

		}		
	
	}
	
	void minMax() {
		int dim = g.leggiIntero("Quanti elementi vuoi inserire nel vettore?");
		int[] numero = new int[dim];
		g.stampa("Inserisci i valori del vettore");
		for(int i=0; i<dim; i++) {
			numero[i] = g.leggiIntero("");
		}

		int max = numero[0];
		int min = numero[0];
		for(int i=1; i<dim; i++) {
			if(numero[i]>max) {
				max = numero[i];
			}
			if(numero[i]<min) {
				min = numero[i];
			}
		}
		g.stampa("Il minimo è:");
		g.stampa(min);
		g.stampa("Il massimo è:");
		g.stampa(max);
	}
	
	void sommaMedia() {
		int dim = g.leggiIntero("Quanti elementi vuoi inserire nel vettore?");
		int[] numero = new int[dim];
		g.stampa("Inserisci i valori del vettore");
		for(int i=0; i<dim; i++) {
			numero[i] = g.leggiIntero("");
		}

		int somma = 0;
		for(int i=0; i<dim; i++) {
			somma += numero[i];
		}
		g.stampa("La somma è:");
		g.stampa(somma);
		g.stampa("La media è:");
		g.stampa(somma / numero.length);
	}
	
	void stringaPalindroma() {
		boolean flag = true;
		g.stampa("Inserisci una stringa:");
		String frase = g.leggiString("");
		String fraseSenzaSpazi = frase.replaceAll(" ", "");
		fraseSenzaSpazi = fraseSenzaSpazi.toLowerCase();
		
		for(int i=0; i<fraseSenzaSpazi.length()/2; i++) {
			if(fraseSenzaSpazi.charAt(i) != fraseSenzaSpazi.charAt(fraseSenzaSpazi.length()-1-i)) {
				g.stampa("La stringa non è palindroma!");
				flag = false;
				break;
			}
		}
		if(flag) {
			g.stampa("La stringa è palindroma");
		}
	}
	
}
