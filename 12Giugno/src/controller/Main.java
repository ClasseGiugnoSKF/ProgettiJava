package controller;
import Esercizi.Test;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Test a = new Test();
		int scelta = 0;

		do {
			a.menu();
			System.out.println("Scegli un'opzione:");
			scelta = Integer.parseInt(input.nextLine());
			switch(scelta) {

			case 1:
				a.Esercizio1();
				break;

			case 2:
				a.Esercizio2();
				break;

			case 3:
				a.Esercizio3();
				break;

			case 4:
				System.out.println("Programma Terminato");
				break;

			default:
				System.err.println("Seleziona un'opzione valida! (1/2/3/4)");
			}
		}while(scelta != 4);
		input.close();
	}
}
