import java.util.Scanner;
public class GestioneIO {
	Scanner s = new Scanner(System.in);
	
	String leggiStringa(String messaggio) {
		System.out.println(messaggio);
		String input = s.nextLine();
		return input;
	}
	
	void stampaNL(String messaggio) {
		System.out.print(messaggio);
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
	
	// algoritmo 12 in poi
	
	boolean verificaVocali(char carattere) {
		if(carattere == 'a' || carattere == 'e' || carattere == 'i' 
				|| carattere == 'o' || carattere == 'u') {
			return true;
		}
			return false;
	}
	
	// algoritmo 15 in poi
	
	char leggiChar(String messaggio) {
		System.out.println(messaggio);
		char input = s.nextLine().charAt(0);
		return input;
	}
	
}
