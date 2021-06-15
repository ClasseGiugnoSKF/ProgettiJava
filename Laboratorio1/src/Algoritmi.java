
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
	
	
	//Dato un vettore di stringhe cercare un nominativo a scelta
	void cercaNominativo() {
		String[] elencoNominativi = {"Rosa", "Raffaele", "Fabrizio", "Federico", "Davide"};
		boolean flag = false;
		for(int i=0; i<elencoNominativi.length; i++) {
			if(elencoNominativi[i].equalsIgnoreCase("Davide")) {
				System.out.println("Nominativo trovato");
				flag = true;
				break;
			}
		}
		if(flag == false) {
			System.out.println("Nominativo non trovato");
		}
	}
	
	//Date due variabili intere, applicare l'algoritmo di swap
	//e stampare il prima e dopo lo scambio.
	void swap() {
		int a = 4;
		int b = 17;
		System.out.println("Prima dello swap");
		System.out.println("La variabile a contiene il valore " + a);
		System.out.println("La variabile b contiene il valore " + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("Dopo lo swap");
		System.out.println("La variabile a contiene il valore " + a);
		System.out.println("La variabile b contiene il valore " + b);		
	}
	
	//Dato un vettore di interi non ordinato, ordinarlo dal più piccolo
	//al più grande (Nota bene: usa l'algoritmo di swap)
	void ordinamentoSwap() {
		int[] numeri = {45, 16, 98, 2, 30};
		int temp = 0;
		System.out.println("Il vettore contiene i seguenti valori:");
		for(int i=0; i<numeri.length; i++) {
			System.out.print(numeri[i] + "  ");
		}
		System.out.println();
		boolean flag = false;
		for(int i=0; i<numeri.length-1; i++) {
			flag = false;
			for(int j=0; j<numeri.length-1; j++) {
				if(numeri[j] > numeri[j+1]) {
					temp = numeri[j];
					numeri[j] = numeri[j+1];
					numeri[j+1] = temp;
					flag = true;
				}
			}
			if(flag == false) {
				break;
			}
		}
		System.out.println("Il vettore ordinato è il seguente:");
		for(int i=0; i<numeri.length; i++) {
			System.out.print(numeri[i] + "  ");
		}
		System.out.println();
	}
	
	//Stampare una matrice 3x7 contenente le lettere dell'alfabeto
	//italiano.
	void alfabeto() {
		char[] alfabeto = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 
				'H', 'I', 'L', 'M', 'N', 'O', 'P',
				'Q', 'R', 'S', 'T', 'U', 'V', 'Z'};
		
		for(int i=0; i<alfabeto.length; i++) {
			System.out.print(alfabeto[i] + " ");
			if((i%7) == 6) {
				System.out.println();
			}
		}
		System.out.println();
	}
	
	//Risolvi l'esericzio precedente usando il codice ASCII
	void alfabetoAscii() {
		char c = 65;
		char[] lettereInglesi = {74, 75, 87, 88, 89};
		boolean flag = false;
		while(c <= 90) {
			for(int i=0; i<lettereInglesi.length; i++) {
				if(c == lettereInglesi[i]) {
					flag = true;
				}
			}
			if(!flag) {
				System.out.print(c + " ");
			}
			if(c == 71 || c == 80 || c == 90) {
				System.out.println();
			}
			c++;
			flag = false;
		}
	}
	
	void successioneFibonaccio() {
		long[] f = new long[3];
		f[0] = 0;
		f[1] = 1;
		f[2] = f[0] + f[1];
		int i = 0;
		System.out.print(f[0] + " " + f[1] + " " + f[2] + " ");
		while(f[2] < 1000) {
			f[i] = f[i+1];
			f[i+1] = f[i+2];
			f[i+2] = f[i] + f[i+1];
			System.out.print(f[i+2] + " ");
		}
		System.out.println();
	}
}
