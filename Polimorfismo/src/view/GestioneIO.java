package view;

import java.util.Scanner;

import model.Dipendente;
import model.Persona;

public class GestioneIO {
	Scanner scan = new Scanner(System.in);
	
	public void stampaStringa(String messaggio) {
		System.out.print(messaggio);
	}
	
	public void stampaIntero(Integer valore) {
		System.out.print("" + valore);
	}
	
	public void stampaDouble(Double valore) {
		System.out.println("" + valore);
	}
	
	public String leggiStringa(String messaggio) {
		stampaStringa(messaggio);
		return scan.nextLine();		
	}
	
	public Integer leggiIntero(String messaggio) {
		stampaStringa(messaggio);
		return Integer.parseInt(scan.nextLine());
	}
	
	public Double leggiDouble(String messaggio) {
		stampaStringa(messaggio);
		return Double.parseDouble(scan.nextLine());
	}
	
	public void menuPrincipale() {
		stampaStringa("\n1) Inserimento\n");
		stampaStringa("2) Stampa\n");
		stampaStringa("3) Esci\n");
	}
	
	public void menuSecondario() {
		stampaStringa("\n1)Persona");
		stampaStringa("\n2)Dipendente\n");
	}
	
	public void menuStampa() {
		stampaStringa("\n1)Elenco");
		stampaStringa("\n2)Scheda\n");		
	}
	
	public void inserisci(Persona p) {
		p.setNome(leggiStringa("Nome: "));
		p.setCognome(leggiStringa("Cognome: "));
		p.setEta(leggiIntero("Eta: "));
		p.setCodiceFiscale(leggiStringa("Codice fiscale: "));
		if(p instanceof Dipendente) {
			((Dipendente)p).setStipendio(leggiDouble("Stipendio: "));
		}
	}
	
	public void stampa(Persona p) {
		stampaStringa("Nome: " + p.getNome() + "\n");
		stampaStringa("Cognome: " + p.getCognome() + "\n");
		stampaStringa("Eta: ");
		stampaIntero(p.getEta());
		stampaStringa("\n");
		stampaStringa("Codice fiscale: " + p.getCodiceFiscale() + "\n");
		if(p instanceof Dipendente) {
			stampaStringa("Stipendio: ");
			stampaDouble(((Dipendente)p).getStipendio());
			stampaStringa("\n");
		}
	}
	
	public void stampaArrayElenco(Persona[] persone) {
		for(int i=0; i<persone.length; i++) {
			if(persone[i] != null) {
				stampaStringa(persone[i].toString() + "\n");
			}
		}
	}
	
	public void stampaArrayScheda(Persona[] persone) {
		for(int i=0; i<persone.length; i++) {
			if(persone[i] != null) {
				stampa(persone[i]);
				stampaStringa("\n");
			}
		}
	}
}
