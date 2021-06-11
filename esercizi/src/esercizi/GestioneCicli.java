package esercizi;

import java.util.Scanner;

public class GestioneCicli {

	public static void main(String[] args) {
		Raccolta r = new Raccolta();
		Scanner s=new Scanner(System.in);
		String risposta="";

		do {
			System.out.println("Inserisci un opzione da 1 a 4");
			int opzione = Integer.parseInt(s.nextLine());

			switch (opzione) {
			case 1: 
				//ALGORITMO 1: CONTA DA 1 A 10 SIA CON IL WHILE CHE CON IL FOR STAMPANDO SOLO I PARI			
				r.contaPari();
				r.contaPari2();
				break;
			case 2:
				//CONTA DA 10 A 1 STAMPANDO SOLO I DISPARI SIA CON WHILE E CON FOR
				r.contaDispari1();
				r.contaDispari2();
				break;
			case 3: 
				//ALGORITMO 3: DICHIARARE 2 VARIABILI DI TIPO INTERO E CONFRONTARLE PER CAPIRE
				//MASSIMO, MINIMO O UGUALI
				r.confronto();
				break;			
				// ALGORITMO 4: FARE LA SOMMA DEI VALORI CONTATI DA 1 A 10 SFRUTTANDO IL CICLO FOR
			case 4:
				r.somma();
				break;
			default:
				System.out.println("Opzione non valida, selezionare un'opzione da 1 a 4");
			}
			System.out.println("Vuoi continuare?");
			risposta=s.nextLine();
		}
		while(risposta.equalsIgnoreCase("si"));
	}
}
