package controller;
import utility.Test;
public class Avvio {

	public static void main(String[] args) {
		Test ambasciatore = new Test ();
		ambasciatore.contaWhile();
		///////////////////////////////////
		ambasciatore.contaFor();
			//Il for si avvale di 4 step
		//primo step inizializzo il contatore
		//secondo step è la condizione
		//terzo step lettura dell'algoritmo del for
		//contatore ++
		ambasciatore.saluto();
		ambasciatore.somma();
		ambasciatore.divisione();
		int somma = ambasciatore.sommaRitornata();
	    System.out.println(somma);
		

	}

}
