import java.util.Scanner;
public class operazioni {

	public static void main(String[] args) {
		Calcolatrice rm = new Calcolatrice();
		Scanner s = new Scanner(System.in);
		gestoreIO io = new gestoreIO();
		String risposta = "";				

		do {
			//System.out.println("Inserisci una opzione da 1 a 4:");
			//io.leggiStringa(risposta);
			//int opzione = Integer.parseInt((io.leggiStringa("Inserisci una opzione da 1 a 4:")));
			switch (io.leggiIntero("Inserisci \n1 per sommare \n2 per sottrare \n3 per moltiplicare \n4 per dividere")) {

			case 1: 
				if (io.tipoMetodo() == 2) {					
					io.risultato(rm.somma(io.leggiDecimale("Inserisci il primo valore"), io.leggiDecimale("Inserisci il secondo valore")));
				}else {					
					io.risultato(rm.somma(io.leggiDecimale("Inserisci il primo valore"), io.leggiDecimale("Inserisci il secondo valore"), io.leggiDecimale("Inserisci il terzo valore")));
				}
				break;

			case 2:
				if (io.tipoMetodo() == 2) {
					io.risultato(rm.sottrazione(io.leggiDecimale("Inserisci il primo valore"), io.leggiDecimale("Inserisci il secondo valore")));					
				}else {
					io.risultato(rm.sottrazione(io.leggiDecimale("Inserisci il primo valore"), io.leggiDecimale("Inserisci il secondo valore"),io.leggiDecimale("Inserisci il terzo valore")));
				}

				break;

			case 3:
				if (io.tipoMetodo() == 2) {
					io.risultato(rm.moltiplicazione(io.leggiDecimale("Inserisci il primo valore"), io.leggiDecimale("Inserisci il secondo valore")));					
				}else {
					io.risultato(rm.moltiplicazione(io.leggiDecimale("Inserisci il primo valore"), io.leggiDecimale("Inserisci il secondo valore"),io.leggiDecimale("Inserisci il terzo valore")));
				}
				break;

			case 4:
				if (io.tipoMetodo() == 2) {
					io.risultato(rm.divisione(io.leggiDecimale("Inserisci il primo valore"), io.leggiDecimale("Inserisci il secondo valore")));					
				}else {
					io.risultato(rm.divisione(io.leggiDecimale("Inserisci il primo valore"), io.leggiDecimale("Inserisci il secondo valore"),io.leggiDecimale("Inserisci il terzo valore")));
				}
				break;

			default:
				io.errore("Inserisci un valore adatto!");;
			}
			risposta=io.leggiStringa("Vuoi Continuare?");

		} while (risposta.equalsIgnoreCase("si"));
		io.errore("Il programma è terminato");
	}
}
