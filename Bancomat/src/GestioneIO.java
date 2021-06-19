import java.util.Scanner;

public class GestioneIO {
	Scanner s = new Scanner(System.in);
	
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
	
	int ritornaIntero(String valore) {
		return Integer.parseInt(valore);
	}
}