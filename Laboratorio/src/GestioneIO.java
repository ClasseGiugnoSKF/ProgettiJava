import java.util.Scanner;
public class GestioneIO {
	Scanner s = new Scanner(System.in);
	
	int menu() {
		return leggiIntero("*** MENU\n"
				+ "1) Contatore da 1 a 10 però l'utente deve scegliere se visualizzare una stampa in verticale o in orizzontale.\n"
				+ "2) Dato un vettore di interi stampare i numeri. L'utente deve scegliere se stampare i numeri pari o dispari\n"
				+ "3) Dato un vettore di interi, stampare il valore minimo e il valore massimo.\n"
				+ "4) Fare la somma e la media dei dati di un vettore di interi\n"
				+ "5) Verificare se una stringa è palindroma\n"
				+ "6) Dato un vettore di stringhe, cercare un nominativo a scelta\n"
				+ "7) Date due variabili di tipo int applicare l'algoritmo dello scambio (swap). Stampare il prima e dopo lo scambio.\n"
				+ "8) Dato un vettore di interi non ordinato, ordinarlo dal più piccolo al più grande. NB: si consiglia l'uso dell'algoritmo dello swap\n"
				+ "9) Stampa una matrice 3x7 contenente le lettere dell'alfabeto ITALIANO. NB: non è richiesto l'array multidimensionale\n"
				+ "10) Sequenza di Fibonacci\n"
				+ "11) Somma a due a due, otto interi di un vettore, indicando l'i-esima coppia per ogni somma\n"
				+ "12) Estrai le vocali da una frase e stampale (è possibile stampare più volte la stessa vocale)\n"
				+ "13) Estrai le vocali ed ogni vocale può essere stampate solo una volta\n"
				+ "14) Contare il numero di vocali in una stringa\n"
				+ "15) Scegliere la lettera di una stringa da sostituire con uno spazio\n"
				+ "16) Vettore char, visualizzare lettere minori o uguali ad M\n"
				+ "17) Vettore char, visualizzare lettere comprese tra M (inclusa) e P (esclusa)\n"
				+ "18) Vettore char, visualizzare lettere tra C (inclusa) e G (inclusa) ed M e P (inclusi)\n"
				+ "19) Crea una semi piramide di asterischi\n"
				+ "20) Crea una piramide intera di asterischi");
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
	
	
}
