import java.util.Scanner;

public class GestioneIO {

	Scanner scan = new Scanner(System.in);
	
	void stampa(String testo) {
		System.out.println(testo);
	}
	
	void stampaErrore(String testo) {
		System.err.println(testo);
	}
	
	void stampa(double d) {
		System.out.println(d);
	}
	
	void menu() {
		 String s = "Scegli una opzione: \n" +
				"1) Somma valori \n" +
				"2) Sottrai valori \n" +
				"3) Dividi valori \n" +
				"4) Moltiplica valori \n";
		 stampa(s);
	}
		
	String leggiStringa(String testo) {
		stampa(testo);
		return scan.nextLine();
	}
	
	int leggiIntero(String testo) {
		stampa(testo);
		return Integer.parseInt(scan.nextLine());		
	}
	
	double leggiDecimale(String testo) {
		stampa(testo);
		return Double.parseDouble(scan.nextLine());
	}

}
