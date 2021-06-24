package view;

import java.util.Scanner;

import model.Persona;

public class GestoreIO {

	Scanner scan = new Scanner(System.in);
	
	public String leggiStringa(String messaggio) {
		System.out.print(messaggio);
		return scan.nextLine();
	}
	
	public Integer leggiIntero(String messaggio) {
		System.out.print(messaggio);
		return Integer.parseInt(scan.nextLine());
	}
	
	public void stampaStringa(String messaggio) {
		System.out.print(messaggio);
	}
	
	public void stampaStringa(Integer valore) {
		System.out.print(""+valore);
	}
	
	public void inserirePersona(Persona p) {
		p.setNome(leggiStringa("Nome: "));
		p.setCognome(leggiStringa("Cognome: "));
		p.setEta(leggiIntero("Eta: "));
		p.setCodiceFiscale(leggiStringa("Codice fiscale: "));
	}
}
