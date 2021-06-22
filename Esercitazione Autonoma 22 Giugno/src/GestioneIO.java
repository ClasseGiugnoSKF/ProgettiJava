import java.util.Scanner;
public class GestioneIO {
	Scanner s = new Scanner(System.in);

	int menu() {
		return leggiIntero("*** MENU\n"
				+ "1) Scrivere un programma StampaZigZag che, dato un array di 10 numeri interi contenente valori a piacere,\n"
				+ "ne stampa gli elementi secondo il seguente ordine: il primo, l’ultimo, il secondo, il penultimo, il terzo, il terz’ultimo, ecc.\n"
				+ "2) Leggere 2 vettori di interi e verificare se i valori nelle posizioni dispari coincidono.\n"
				+ "3) Rombo di asterischi, la grandezza deve essere decisa dall'utente.\n"
				+ "4) Data una frase verificarne il numero di consonanti e vocali, e dire se ci sono più vocali o consonanti.\n"
				+ "5) Verifica se una frase è palindroma(con input dell'utente).\n"
				+ "6) Data una matrice di stringhe che contiene titoli e quantità di pagine,stampare i libri che hanno meno di 100 pagine.\n"
				+ "7) Trovare la somma di tutti i multipli di 3 o 5 al di sotto di 1000.\n"
				+ "8) Dato un vettore di nominativi stamparli in ordine da quello che contiene meno caratteri a quello che ne contiene di più.\n"
				+ "9) Stampare il fattoriale di 5.\n"
				+ "10) Verifica se una parola è palindroma.\n"
				+ "11) Data una matrice quadrata di dimensione e valori scelti dall'utente,calcolane il determinante.\n"
				+ "12) Data la lunghezza in interi di un cateto di un triangolo rettangolo isoscele, stampalo su schermo con gli asterischi.");
	}
	
	String leggiStringa(String messaggio) {
		System.out.println(messaggio);
		String input = s.nextLine();
		return input;
	}

	int leggiIntero(String messaggio) {
		System.out.println(messaggio);
		int input = Integer.parseInt(s.nextLine());
		return input;
	}

	char leggiChar(String messaggio) {
		System.out.println(messaggio);
		char input = s.nextLine().charAt(0);
		return input;
	}

	void stampa(String messaggio) {
		System.out.println(messaggio);
	}

	void stampaNL(String messaggio) {
		System.out.print(messaggio);
	}

	void stampaInt(int num) {
		System.out.println(num);
	}

	void stampaErrore(String messaggio){
		System.err.println(messaggio);
	}

	void stampaVettoreString(String[] vettore) {
		for(int i=0;i<vettore.length;i++) {
			System.out.println(vettore[i]);
		}
	}
	
	void stampaMatriceInteri(int[][] matrice) {
		for(int i=0;i<matrice.length;i++) {
			System.out.print("[ ");
			for(int k=0;k<matrice.length;k++) {
				System.out.print(matrice[i][k]+" ");
			}
			System.out.print("]\n");
		}
	}
}
