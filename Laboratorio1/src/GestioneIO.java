import java.util.Scanner;

public class GestioneIO {

	Scanner scan = new Scanner(System.in);
	
	void stampa(String testo) {
		System.out.println(testo);
	}
	
	void stampa(int numero) {
		System.out.println(numero);
	}
	
	void stampaErrore(String testo) {
		System.err.println(testo);
	}
	
	void stampaVerticale(int numero) {
		System.out.println(numero);
	}
	
	void stampaOrizzontale(int numero) {
		System.out.print(numero + "\t");
	}
	
	String leggiString(String testo) {
		stampa(testo);
		return scan.nextLine();
	}
	
	int leggiIntero(String testo) {
		stampa(testo);
		return Integer.parseInt(scan.nextLine());
	}
	
	void menu() {
		String frase = "1) Conta da 1 a 10;\n" +
						"2) Stampa numeri pari o dispari di un vettore\n" +
						"3) Stampa valore minimo e massimo di un vettore\n" +
						"4) Calcola somma e media un vettore di interi\n" +
						"5) Verifica se una stringa è palindroma\n" +
						"6) Cerca nominativo in un elenco\n" +
						"7) Scambio di due variabili\n" +
						"8) Ordinamento di un vettore di interi\n" +
						"9) Stampa matrice 3x7 con alfabeto\n" +
						"10) Stampa matrice 3x7 con alfabeto (ASCII)\n" +
						"11) Stampa matrice 3x7 con alfabeto (ASCII variante)\n" +
						"12)Stampa successione di FIbonacci";
		stampa(frase);
	}
	
}
