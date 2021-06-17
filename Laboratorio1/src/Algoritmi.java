import java.util.Random;
import java.util.Scanner;

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
				g.stampa("Nominativo trovato");
				flag = true;
				break;
			}
		}
		if(flag == false) {
			g.stampa("Nominativo non trovato");
		}
	}
	
	//Date due variabili intere, applicare l'algoritmo di swap
	//e stampare il prima e dopo lo scambio.
	void swap() {
		int a = 4;
		int b = 17;
		g.stampa("Prima dello swap");
		g.stampa("La variabile a contiene il valore " + a);
		g.stampa("La variabile b contiene il valore " + b);
		int temp = a;
		a = b;
		b = temp;
		g.stampa("Dopo lo swap");
		g.stampa("La variabile a contiene il valore " + a);
		g.stampa("La variabile b contiene il valore " + b);		
	}
	
	//Dato un vettore di interi non ordinato, ordinarlo dal più piccolo
	//al più grande (Nota bene: usa l'algoritmo di swap)
	void ordinamentoSwap() {
		int[] numeri = {45, 16, 98, 2, 30};
		int temp = 0;
		g.stampa("Il vettore contiene i seguenti valori:");
		for(int i=0; i<numeri.length; i++) {
			g.stampa(numeri[i] + "  ");
		}
		g.stampa("\n");
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
		g.stampa("Il vettore ordinato è il seguente:");
		for(int i=0; i<numeri.length; i++) {
			g.stampa(numeri[i] + "  ");
		}
		g.stampa("\n");
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
					break;
				}
			}
			if(!flag) {
				System.out.print(c + " ");
			}
			if(c == 71 || c == 80) {
				System.out.println();
			}
			c++;
			flag = false;
		}
	}

	void alfabetoAsciiVariante() {
		for(char c=65; c<=90; c++) {			
			if(c!=74 && c!=75 && c!=87 && c!=88 && c!=89) {
				System.out.print(c + " ");				
			}
			if(c==71 || c==80) {
				System.out.println();
			}	
		}
	}
	
	//Stampa i numeri della successione di Fibonacci
	void successioneFibonacci() {
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
	}
	
	//Somma a due a due otto interi di un vettore, indicando l'i-esima
	//coppia per ogni somma.
	void sommaCoppie() {
		int[] numeri = new int[8];
		g.stampa("Inserisci 8 interi");
		for(int i=0; i<numeri.length; i++) {
			numeri[i] = g.leggiIntero("Inserisci valore:");
		}
		for(int i=0; i<numeri.length; i+=2) {
			g.stampa("Coppia n." + (i/2+1));
			g.stampa(numeri[i] + numeri[i+1]);
		}
	}

	//Estrarre le vocali da una frase e stampale (con ripetizione)
	void vocaliRipetizione() {
		String frase = g.leggiString("Inserisci una frase");
		for(int i=0; i<frase.length(); i++) {
			switch(String.valueOf(frase.charAt(i)).toLowerCase()) {
			case "a":
				g.stampa(frase.charAt(i) + " ");
				break;
			case "e":
				g.stampa(frase.charAt(i) + " ");
				break;
			case "i":
				g.stampa(frase.charAt(i) + " ");
				break;
			case "o":
				g.stampa(frase.charAt(i) + " ");
				break;
			case "u":
				g.stampa(frase.charAt(i) + " ");
				break;
			}
		}
	}
	
	//Estrai le vocali da una frase e stampala (senza ripetizioni)
	void vocaliSenzaRipetizioni() {
		String frase = g.leggiString("Inserisci una frase").toLowerCase();
		if(frase.contains("a")) {
			g.stampa("a");
		}
		if(frase.contains("e")) {
			g.stampa("e");
		}
		if(frase.contains("i")) {
			g.stampa("i");
		}
		if(frase.contains("o")) {
			g.stampa("o");
		}
		if(frase.contains("u")) {
			g.stampa("u");
		}
	}
	
	//Conta numero di vocali in una stringa
	void contaVocali() {
		String frase = g.leggiString("Inserisci una stringa");
		int contatore = 0;
		for(int i=0; i<frase.length(); i++) {
			switch(String.valueOf(frase.charAt(i)).toLowerCase()) {
			case "a":
				contatore++;
				break;
			case "e":
				contatore++;
				break;
			case "i":
				contatore++;
				break;
			case "o":
				contatore++;
				break;
			case "u":
				contatore++;
				break;
			}
		}
		g.stampa("Il numero di vocali presenti nella stringa è " + contatore);
	}

	//Scegliere la lettera di una stringa da sostituire con uno spazio
	void sostituisciLettera() {
		String frase = g.leggiString("Inserisci una stringa");
		String s = g.leggiString("Quale lettera vuoi sostituire con uno spazio?");
		g.stampa(frase.replace(s, " "));
	}
	
	//Creare un vettore di char con le lettere dell'alfabeto e visualizzare
	//in orizzontale tutte le lettere minori o uguali di 'M'. Le lettere
	//devono essere separate da una virgola e l'ultima lettera deve terminare
	//con un punto.
	void lettereAlfabeto() {
		char [] lettere = new char[13];
		int contatore = 0;
		for(char i=65; i<=77; i++) {
			lettere[contatore] = i;
			if(i==77) {
				System.out.println(lettere[contatore] + ".");
			} else {
				System.out.print(lettere[contatore] + ",");
				contatore++;
			}
		}
	}

	//Lettere compre tra 'M' (incluso) e 'P' (escluso)
	void lettereAlfabeto2() {
		char [] lettere = new char[3];
		int contatore = 0;
		for(char i=77; i<80; i++) {
			lettere[contatore] = i;
			if(i==79) {
				System.out.println(lettere[contatore] + ".");
			} else {
				System.out.print(lettere[contatore] + ",");
				contatore++;
			}
		}
	}

	//Lettere compre tra 'C' (compreso) e 'G' (compreso) ed
	//'M' (compreso) e 'P' (compreso)
	void lettereAlfabeto3() {
		char [] lettere = new char[9];
		int contatore = 0;
		for(char i=67; i<=80; i++) {
			lettere[contatore] = i;
			if(i==71) {
				i += 5;
			}
			if(i==80) {
				System.out.println(lettere[contatore] + ".");
			} else {
				System.out.print(lettere[contatore] + ",");
				contatore++;
			}
		}
	}
	
	void stampaAsterischi1() {
		int iterazioni = 1;
		while(iterazioni <= 6) {
			for(int i=0; i<iterazioni; i++) {
				System.out.print("*");
			}
			System.out.println();
			iterazioni++;
		}
	}
	
	void stampaAsterischi2() {
		int iterazioni = 1;
		int numAsterischi = 1;
		while(iterazioni <= 11) {
			for(int i=0; i<numAsterischi; i++) {
				System.out.print("*");
			}
			System.out.println();
			if(iterazioni<6) {
				numAsterischi++;
			} else {
				numAsterischi--;
			}
			iterazioni++;
		}
	}
	
	//Ricerca lineare
	void ricercaLineare() {
		int[] numeri = new int[g.leggiIntero("Inserisci dimensione vettore:")];
		g.stampa("Inserisci i valori.");
		for(int i=0; i<numeri.length; i++) {
			numeri[i] = g.leggiIntero("Inserisci valore:");
		}
		int elementoCercato = g.leggiIntero("Quale elemento vuoi cercare?");

		boolean flag = false;
		for(int i=0; i<numeri.length; i++) {
			if(numeri[i] == elementoCercato) {
				g.stampa("Elemento trovato");
				flag = true;
			}
		}
		if(!flag) {
			g.stampa("Elemento non trovato");
		}
	}
	
	//Ricerca dicotomica
	//Ricorda il vettore deve essere ordinato.
	void ricercaBinaria() {
		int[] numeri = new int[g.leggiIntero("Inserisci dimensione vettore:")];
		g.stampa("Inserisci i valori.");
		for(int i=0; i<numeri.length; i++) {
			numeri[i] = g.leggiIntero("Inserisci valore:");
		}
		int elementoCercato = g.leggiIntero("Quale elemento vuoi cercare?");

		int min = 0;
		int max = numeri.length-1;
		int mezzo = 0;
		boolean flag = false;
		while(!flag && min<=max) {
			mezzo = (max+min)/2;
			if(numeri[mezzo] == elementoCercato)
				flag = true;
			if(numeri[mezzo] > elementoCercato)
				max = mezzo - 1;
			else
				min = mezzo + 1;
		}
		if(flag)
			g.stampa("Elemento trovato nella posizione " + mezzo);
		else
			g.stampa("Elemento non trovato");
	}

	void contaAvantiIndietro(int inizio, int fine) {
		int numeroIterazioni;
		if(inizio < fine)
			numeroIterazioni = fine-inizio;
		else
			numeroIterazioni = inizio-fine;
		for(int i=0; i<=numeroIterazioni; i++) {
			if(inizio > fine)
				System.out.println(inizio - i);
			else
				System.out.println(inizio + i);
		}
	}
	
	//Creare una matrice 10x10 dove ogni riga rappresenta una
	//tabellina. (Nota bene: usare un array multidimensionale)
	void matriceTabelline() {
		int [][] tabelline = new int[10][10];
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				tabelline[i][j] = (i+1)*(j+1);
			}
		}
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				System.out.print(tabelline[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	//Creare una matrice 8x5 contenente giorni e temperature
	void matriceTemperature() {
		String [] primaRiga = {"Giorno   ", "[h]:0-6  ", "[h]:7-13 ", "[h]:14-19", "[h]:20-0 "};
		String [] primaColonna = {"Lunedì   ", "Martedì  ", "Mercoledì", 
				"Giovedì  ", "Venerdì  ", "Sabato   ", "Domenica "};
		int [][] temperature = new int[7][4];
		Random random = new Random();
		
		for(int i=0; i<7; i++) {
			for(int j=0; j<4; j++) {
				temperature[i][j] = random.nextInt(40);
			}
		}
		
		//Stampa prima riga
		for(int i=0; i<primaRiga.length; i++) {
			System.out.print(primaRiga[i] + "\t");
		}
		System.out.println();
		
		//Stampa resto della matrice
		for(int i=0; i<temperature.length; i++) {
			System.out.print(primaColonna[i] + "\t");
			for(int j=0; j<temperature[0].length; j++) {
				System.out.print(temperature[i][j] + "\t\t");
			}
			System.out.println();
		}
	}

	//Crea matrice e stampala.
	void matrice() {
		int[][] matrix = new int[3][3];
		matrix[0][0] = 13;
		matrix[0][1] = 24;
		matrix[0][2] = 89;
		matrix[1][0] = 56;
		matrix[1][1] = 30;
		matrix[1][2] = 11;
		matrix[2][0] = 78;
		matrix[2][1] = 12;
		matrix[2][2] = 3;
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}	
	}

	//Matrice diagonale
	void matriceDiagonale() {
		int[][] matrix = new int[3][3];
		matrix[0][0] = 1;
		matrix[1][1] = 2;
		matrix[2][2] = 3;

		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	//Matrice trasposta
	void matriceTrasposta() {
		Scanner scan = new Scanner(System.in);
		int numeroRighe = g.leggiIntero("Inserisci numero righe");
		int numeroColonne = g.leggiIntero("Inserisci numero colonne");
		char[][] matrix = new char[numeroRighe][numeroColonne];
		//Lettura matrice
		g.stampa("Inserisci i valori della matrice");
		for(int i=0; i<numeroRighe; i++) {
			for(int j=0; j<numeroColonne; j++) {
				System.out.print("matrix[" +i+ "][" +j+ "]= ");
				matrix[i][j] = scan.nextLine().charAt(0);
			}
		}
		//Stampa matrice
		System.out.println("La matrice inserita è:");
		for(int i=0; i<numeroRighe; i++) {
			for(int j=0; j<numeroColonne; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		//Stampa matrice trasposta
		System.out.println("La matrice trasposta è:");
		for(int i=0; i<numeroRighe; i++) {
			for(int j=0; j<numeroColonne; j++) {
				System.out.print(matrix[j][i] + " ");
			}
			System.out.println();
		}
		scan.close();
	}
	
	
}
