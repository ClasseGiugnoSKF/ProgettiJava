package controller;
import java.util.Scanner;

import utility.Test;
public class Avvio {

	public static void main(String[] args) {
		Test ambasciatore = new Test ();
		Scanner ambasciatoreScan= new Scanner (System.in);
		// struttura switch case per lo sviluppo di un menù
		System.out.println("Scegli un opzione:");
		
		int scelta=ambasciatoreScan.nextInt();
		switch (scelta) {
		case 1: 
			ambasciatore.contaWhile();
			break;
		case 2:
			ambasciatore.contaFor();
			break;
		case 3: 
			ambasciatore.saluto();
			break;
		case 4: 
			ambasciatore.somma();
			break;
		case 5:
			ambasciatore.divisione();
			break;
		case 6: 
			int somma = ambasciatore.sommaRitornata();
			System.out.println(somma);
			break;
		default: 
			System.err.println("Attenzione!L'opzione scelta non è valida");
			



		}





		///////////////////////////////////

		//Il for si avvale di 4 step
		//primo step inizializzo il contatore
		//secondo step è la condizione
		//terzo step lettura dell'algoritmo del for
		//contatore ++






	}


}
