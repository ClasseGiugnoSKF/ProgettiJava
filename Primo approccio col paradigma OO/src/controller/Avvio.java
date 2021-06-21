package controller;

import model.Persona;

public class Avvio {

	public static void main(String[] args) {

		Persona p1 = new Persona(); //Rosa Palmentieri
		Persona p2 = new Persona(); //Federico Er Siculo
		Persona p3 = new Persona(); //Fabrizio Er Catullo
		
		Persona.setNazione("Italia");
		p1.setNome("Rosa");
		p2.setNome("Federico");
		p3.setNome("Nicola");
		
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
