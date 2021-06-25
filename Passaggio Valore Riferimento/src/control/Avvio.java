package control;

import model.Operazioni;
import model.Persona;

public class Avvio {

	public static void main(String[] args) {

		Operazioni o = new Operazioni();
		int intero1 = 5;
		Integer intero2 = 20;
		String parola = "Hello";
		Persona p = new Persona();
		
		System.out.println("Intero1 prima: " + intero1);
		o.passaggioPerValore(intero1);
		System.out.println("Intero1 dopo: " + intero1);

		System.out.println("Intero2 prima: " + intero2);
		o.passaggioPerValore(intero2);
		System.out.println("Intero2 dopo: " + intero2);
		
		System.out.println("Parola prima: " + parola);
		o.passaggioPerValore(parola);
		System.out.println("Parola dopo: " + parola);
		
		p.setNome("Mike");
		p.setCognome("Buongiorno");
		System.out.println("Persona prima: " + p);
		o.passaggioPerRiferimento(p);
		System.out.println("Persona dopo: " + p);
		
		
	}

}
