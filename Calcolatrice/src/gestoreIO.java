import java.util.Scanner;
public class gestoreIO {

	String leggiStringa(String suggerimento) {
		System.out.println(suggerimento);
		Scanner leggi = new Scanner(System.in);
		String ls = leggi.nextLine();
		return ls;
	}

	void risultato(double somma) {
		System.out.println(somma);
	}

	int leggiIntero(String messaggio) {
		System.out.println(messaggio);
		Scanner leggi = new Scanner(System.in);
		int li = Integer.parseInt(leggi.nextLine());
		return li;
	}

	double leggiDecimale(String messaggio) {
		System.out.println(messaggio);
		Scanner leggi = new Scanner(System.in);
		double ld = Double.parseDouble(leggi.nextLine());
		return ld;
	}

	int tipoMetodo() {
		System.out.println("Vuoi effettuare una operazione a 2 o 3 fattori ?");
		Scanner leggi = new Scanner(System.in);
		int risposta = Integer.parseInt(leggi.nextLine());
		System.out.println("Inserisci i valori per l'operazione");
		return risposta;
	}

	void errore(String errore) {
		System.err.println(errore);
	}
}
