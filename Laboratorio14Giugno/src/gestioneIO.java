import java.util.Scanner;
public class gestioneIO {

	Scanner scan = new Scanner(System.in);

	int leggiIntero() {
		return Integer.parseInt(scan.nextLine());
	}

	void domanda(String messaggio) {
		System.out.println(messaggio);
	}

	void risultato(int risultato) {
		System.out.println(risultato);
	}

	void stampaOrizzontale(int numero) {
		System.out.print(numero+"\t");
	}

	void stampaVerticale(int numero) {
		System.out.println(numero);
	}

	void errore(String messaggio) {
		System.err.println(messaggio);
	}

	void stampaIntero(int numero) {
		System.out.println(numero);
	}

	String leggiStringa() {
		return scan.nextLine();
	}

	void menu() {
		System.out.println("Opzione 1: Conta fino a 10\n"
				+ "Opzione 2: Dato un vettore di interi e scegli se stampare i numeri pari o dispari\n"
				+ "Opzione 3: Dato un vettore di interi, stampa il valore minimo e il valore massimo\n"
				+ "Opzione 4: Dato un vettore di interi, fai la somma e la media dei valori\n"
				+ "Opzione 5: Verifica se una stringa è palindroma ");
	}








}
