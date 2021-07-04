package controller;
import model.*; //specifichiamo il percorso da cui recuperare una classe
import view.GestioneIO;

public class Avvio {

	public static void main(String[] args) {
		GestioneIO io = new GestioneIO();
		
		Persona p1 = new Persona("Rosa","Palmentieri");
		int a = 5;
		System.out.println(p1);
		
		// Passaggio per Valore
		System.out.println("Prima: "+a);
		a=io.passaggioPerValore(a);
		System.out.println("Dopo: "+a);
		
		//Passaggio per Riferimento
		System.out.println("Prima: "+p1);
		io.passaggioPerRiferimento(p1);
		System.out.println("Dopo: "+p1);
		
		// String e classi wrapper anche se reference si comportano
		//come dati primitivi quindi fanno passaggi per valore
		String al = "aaa";
		System.out.println(al);
		al = io.test(al);
		System.out.println(al);
		
//		p1.saluto();
//		Persona p2 = new Persona("Federico", "Er Siculo", 22); //Federico Er Siculo
//		Persona p3 = new Persona("Nicola", "Esposito l'Afragolese", 20, "nicespafra5454544545454", "A"); //Fabrizio Er Catullo
//		Persona p4 = new Persona("Davide", "Sorrentino");
//		Dipendente d1 = new Dipendente("Carmela", "Ambrosio", 20, "XZCIUDFS8AD3", "Napoli", 200.00, "Produzione");
//		d1.setNome("Carmela");
//		System.out.println(d1.getNome());
//		Manager m1 = new Manager();
//		m1.setNome("Peppe");
//		System.out.println(m1.getNome());
//		m1.saluto();
//		d1.saluto();
//		d1.salutoDelPadre();
		
//		p1.setNome("Rosa");
//		p2.setNome("Federico");
//		p3.setNome("Nicola");
		
//		Persona.setNazione("Italia");
		
//		System.out.println(p1.getNome());
//		System.out.println(p2.getNome()+", "+p2.getCognome()+", "+p2.getEta());
//		System.out.println(p3.getNome());
//		System.out.println(p4.getNome());
		
//		System.out.println(p1.getNazione());
//		System.out.println(p2.getNazione());
//		System.out.println(p3.getNazione());
		
		System.out.println(Persona.getNazione());
		
		Persona.setNazione("Burkina Faso");
//		System.out.println(p1.getNazione());
//		System.out.println(p2.getNazione());
//		System.out.println(p3.getNazione());
		
		System.out.println(Persona.getNazione());
	}
}
