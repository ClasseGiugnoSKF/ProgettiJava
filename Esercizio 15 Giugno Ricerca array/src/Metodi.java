import java.util.Scanner;

public class Metodi {
	Scanner input = new Scanner(System.in);

	String leggiStringa(String messaggio) {
		System.out.println(messaggio);
		String stringa = input.nextLine();
		return stringa;
	}
	
	int leggiIntero(String messaggio) {
		System.out.println(messaggio);
		int intero = Integer.parseInt(input.nextLine());
		return intero;
	}
	
	String[] creaVettoreStringa() {
		String[] vettore = new String[leggiIntero("Inserisci la dimensione del vettore: ")];
		for(int i=0;i<vettore.length;i++) {
			System.out.println("Inserisci nominativo n."+(i+1)+":");
			vettore[i]=input.nextLine();
		}
		return vettore;
	}
	
	void ricercaNome(String[] vettore) {
		String nome = leggiStringa("Chi vuoi cercare nell'array?");
		boolean risultato = false;
		for(int i=0;i<vettore.length;i++) {
			if(vettore[i].equalsIgnoreCase(nome)) {
				System.out.println(nome+" è stato trovato!");
				risultato = true;
				break;
			}
		}
		if(!risultato) {
			System.out.println(nome+" non trovato");
		}
	}
}
