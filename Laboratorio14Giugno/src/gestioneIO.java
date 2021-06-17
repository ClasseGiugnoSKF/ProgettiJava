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
		System.out.print(risultato+" ");
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
				+ "Opzione 5: Verifica se una stringa è palindroma \n"
				+ "Opzione 6: Cerca un utente a tua scelta\n"
				+ "Opzione 7: Fai uno swap\n"
				+ "Opzione 8: Dato un vettore di interi non ordinato, ordinarlo dal più piccolo al più grande.\n"
				+ "Opzione 9: Stampa una matrice 3x7 contenente le lettere dell'alfabeto I T A L I A N O.\n"
				+ "Opzione 10: Stampa una matrice 3x7 contenente le lettere dell'alfabeto I T A L I A N O(usando il code ASCII.\n"
				+ "Opzione 11: Successione di Fibonacci\n"
				+ "Opzione 12: Stampa una matrice 3x7 contenente le lettere dell'alfabeto I T A L I A N O\n"
				+ "Opzione 13: Somma a due a due otto interi di un vettore, indicando l'i-esima coppia per ogni somma. \n"
				+ "Opzione 14: Estrai le vocali da una frase e stampale(è possibile stampare più volte la stessa vocale).\n"
				+ "Opzione 15: Estrai le vocali da una frase e stampale(ogni vocale deve essere ripetuta una sola volta).\n"
				+ "Opzione 16: Conta il numero di vocali in una stringa.\n"
				+ "Opzione 17: Scegliere la lettera di una stringa da sostituire con uno spazio.\n"
				+ "Opzione 18: Creare un vettore di char con le lettere dell'alfabeto e visualizzare in orizzontale\r\n"
				+ "tutte le lettere minori o uguale a 'M'\n"
				+ "Opzione 19: Creare un vettore di char con le lettere dell'alfabeto e visualizzare in orizzontale\r\n"
				+ "tutte le lettere comprese tra 'M'(inclusa) e 'P'\n"
				+ "Opzione 20: Creare un vettore di char con le lettere dell'alfabeto e visualizzare in orizzontale\r\n"
				+ "tutte le lettere comprese tra 'C'(inclusa) e 'G'(inclusa) e 'M'(inclusa) 'P'(inclusa).\n"
				+ "Opzione 21: Asterisci senza ritorno\n"
				+ "Opzione 22: Asterischi con ritorno\n"
				+ "Opzione 23: Contatore\n"
				+ "Opzione 24: Matrice tabelline\n"
				+ "Opzione 25: Matrice temperature\n"
				+ "Opzione 26: Matrice Slide\n"
				+ "Opzione 27: Matrice 123 diagonale\n"
				+ "Opzione 28: Matrice scelta dall'utente e stampa l'inverso\n"
				+ "Opzione 29: Matrice 4x3\n"
				+ "Opzione 30: Determinante di una matrice 2x2\n"
				+ "");
	}
}
