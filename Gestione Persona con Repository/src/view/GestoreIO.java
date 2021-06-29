package view;

import java.util.Scanner;
import model.Persona;

public class GestoreIO {
	Scanner scan = new Scanner(System.in);
	
	public void stampaStringa(String messaggio) {
		System.out.print(messaggio);
	}
	
	public void stampaIntero(Integer valore) {
		System.out.print("" + valore);
	}
	
	public String leggiStringa(String messaggio) {
		stampaStringa(messaggio);
		return scan.nextLine();		
	}
	
	public Integer leggiIntero(String messaggio) {
		stampaStringa(messaggio);
		return Integer.parseInt(scan.nextLine());
	}
	
	public void menu() {
		stampaStringa("\n1) Inserimento\n");
		stampaStringa("2) Modifica\n");
		stampaStringa("3) Cancellazione\n");
		stampaStringa("4) Trova\n");
		stampaStringa("5) Stampa elenco\n");
		stampaStringa("6) Stampa scheda\n");
		stampaStringa("7) Esci\n\n");
	}

	public void inserisciPersona(Persona p) {
		p.setNome(leggiStringa("Nome: "));
		p.setCognome(leggiStringa("Cognome: "));
		p.setEta(leggiIntero("Eta: "));
		p.setCodiceFiscale(leggiStringa("Codice fiscale: "));
	}

	public void stampaPersona(Persona p) {
		stampaStringa("Nome: " + p.getNome() + "\n");
		stampaStringa("Cognome: " + p.getCognome() + "\n");
		stampaStringa("Eta: ");
		stampaIntero(p.getEta());
		stampaStringa("\n");
		stampaStringa("Codice fiscale: " + p.getCodiceFiscale() + "\n");
	}

	public void mascheraModifica(Persona p) {
		String s = leggiStringa("Nome ["+p.getNome()+"]: ");
		if(!s.equals("")) {
			p.setNome(s);
		}
		s = leggiStringa("Cognome ["+p.getCognome()+"]: ");
		if(!s.equals("")) {
			p.setCognome(s);
		}
		s = leggiStringa("Eta ["+p.getEta()+"]: ");
		if(!s.equals("")) {
			p.setEta(Integer.parseInt(s));
		}
		s = leggiStringa("Codice fiscale ["+p.getCodiceFiscale()+"]: ");
		if(!s.equals("")) {
			p.setCodiceFiscale(s);
		}
	}

}
