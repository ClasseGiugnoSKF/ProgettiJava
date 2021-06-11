package controller;

import eccezioni.GestioneEccezione;

public class Avvio {
	
	public static void main(String[] args) {

		GestioneEccezione ge = new GestioneEccezione();
//		System.out.println(ge.getNumero());
		ge.controlloLunghezzaUser();
		
		
		
	}

}
