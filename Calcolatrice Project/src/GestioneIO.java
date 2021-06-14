import java.util.Scanner;
public class GestioneIO {
	Scanner s = new Scanner(System.in);
	String leggiStringa(String messaggio) {
		System.out.println(messaggio);
		String stringa2 = s.nextLine();
		return stringa2;
	}
	
	int leggiIntero(String messaggio) {
		System.out.println(messaggio);
		int intero = Integer.parseInt(s.nextLine());
		return intero;
	}
	
	double leggiDecimale(String messaggio) {
		System.out.println(messaggio);
		double decimale = Double.parseDouble(s.nextLine());
		return decimale;
	}
	
	void stampaErrore(String errore) {
		System.err.println(errore);
	}
	
}
