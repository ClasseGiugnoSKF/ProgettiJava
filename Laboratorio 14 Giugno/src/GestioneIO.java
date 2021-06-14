import java.util.Scanner;
public class GestioneIO {
	Scanner s = new Scanner(System.in);
	
	int menu() {
		return leggiIntero("*** MENU\n"
				+ "1) Contatore da 1 a 10 però l'utente deve scegliere se visualizzare una stampa in verticale o in orizzontale.\n"
				+ "2) Dato un vettore di interi stampare i numeri. L'utente deve scegliere se stampare i numeri pari o dispari\n"
				+ "3) Dato un vettore di interi, stampare il valore minimo e il valore massimo.\n"
				+ "4) Fare la somma e la media dei dati di un vettore di interi\n"
				+ "5) Verificare se una stringa è palindroma");
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
	
	void stampa(String messaggio) {
		System.out.println(messaggio);
	}
	
	void stampaInt(int num) {
		System.out.println(num);
	}
	
	void stampaErrore(String messaggio){
		System.err.println(messaggio);
	}
	
	
}
