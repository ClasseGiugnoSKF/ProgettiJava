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
						"12) Stampa successione di Fibonacci\n" +
						"13) Somma coppie di interi\n" +
						"14) Stampa vocali con ripetizione\n" +
						"15) Stampa vocali senza ripetizione\n" +
						"16) Conta vocali in una stringa\n" +
						"17) Sostituisci lettera in una stringa con uno spazio\n" +
						"18) Stampare le lettere fino alla M\n" +
						"19) Stampare le lettere tra M (incluso) e P (escluso)\n" +
						"20) Stampare le lettere tra C e G e tra M e P (compresi)\n" +
						"21) Stampa asterischi\n" +
						"22) Stampa asterischi variante\n" +
						"23) Ricerca lineare\n" +
						"24) Ricerca dicotomica\n" +
						"25) Conta avanti e indietro\n" +
						"26) Matrice tabelline\n" +
						"27) Matrice temperature\n" +
						"28) Stampa matrice\n" +
						"29) Stampa matrice diagonale\n" +
						"30) Matrice trasposta\n";
		stampa(frase);
	}
	
}
