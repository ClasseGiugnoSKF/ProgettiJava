package Esercizi;

import java.util.Scanner;

public class Test {

	Scanner input = new Scanner(System.in);

	public void menu() {
		System.out.println("****MENU****");
		System.out.println("1) Stampa una parola al contrario");
		System.out.println("2) Verifica se la parola inizia per maiuscola");
		System.out.println("3) Converte una stringa di nominativi in singole stringhe");	
		System.out.println("4) Termina Programma");
	}

	public void Esercizio1() {
		System.out.println("Inserisci una parola:");
		String string_originale = input.nextLine();
		String stringa_invertita = "";				

		for (int i = string_originale.length() - 1; i >= 0; i--){
			stringa_invertita = stringa_invertita + string_originale.charAt(i);
		}
		System.out.println(stringa_invertita);
	}

	public void Esercizio2() {
		System.out.println("Inserisci una parola:");
		String var = input.nextLine();

		if(var.charAt(0) >= 65 && var.charAt(0) <= 90 ) {
			System.out.println("La parola inizia per maiuscola");
		}
		else {
			System.out.println("La parola non comincia per maiuscola");
		}
	}

	public void Esercizio3() {
		System.out.println("Inserisci una lista di nominativi separati da una virgola o da uno spazio:");
		String nominativi = input.nextLine();

		String[] array2 = nominativi.split(",|\s");// ,|\= sia una virgola che una spazio
		for(int contatore = 0; contatore < array2.length; contatore++) {
			System.out.println(array2[contatore]);
		}
	}


}
