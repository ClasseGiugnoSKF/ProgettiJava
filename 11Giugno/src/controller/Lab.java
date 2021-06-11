package controller;
import utility.Raccolta;
import java.util.Scanner;
public class Lab {

	public static void main(String[] args) {

		Raccolta r = new Raccolta();
		Scanner ambasciatoreScan = new Scanner(System.in);				
		String rispostaUtente;

		do {
			r.menu();
			System.out.println("Scegli un'opzione:");
			int scelta = Integer.parseInt(ambasciatoreScan.nextLine());

			switch(scelta) {

			case 1:
				r.contaWhile();
				break;

			case 2:
				r.contaFor();
				break;

			case 3:
				r.contaWhile2();
				break;

			case 4:
				r.contaFor2();
				break;

			case 5:
				r.contaMaggiore();
				break;

			case 6:
				r.contaSomma();
				break;

			default:
				System.err.println("Attenzione! L'opzione selezionata non è valida!");
			}
			System.out.println("Chiamare nuovamente il menù? si/premi un tasto qualunque");
			rispostaUtente = ambasciatoreScan.nextLine();
		}while (rispostaUtente.equalsIgnoreCase("si"));




		//NB! step1: inizializzo il contatore 
		//step2: definisco la condizione 
		//step3: leggo le istruzioni all'interno del for
		//step4: incremento di 1

	}
}


