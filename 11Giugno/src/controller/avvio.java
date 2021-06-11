package controller;
import utility.Test;
public class avvio {

	public static void main(String[] args) {
		Test ambasciatore = new Test();
			ambasciatore.saluto();
			int somma = ambasciatore.sommaRitornata();
			System.out.println(somma);
	}

		
	
}
