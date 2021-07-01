package view;

import java.util.HashMap;
import java.util.Scanner;

import model.Dipendente;
import model.Manager;
import model.Persona;

public class GestoreIO {

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
		stampaStringa("\n1) Inserisci\n");
		stampaStringa("2) Modifica\n");
		stampaStringa("3) Cancella\n");
		stampaStringa("4) Trova\n");		
		stampaStringa("5) Stampa elenco\n");
		stampaStringa("6) Stampa scheda\n");
		stampaStringa("7) Esci\n");
	}
	
	public void menuSecondario() {
		stampaStringa("\n1)Persona\n");
		stampaStringa("2)Dipendente\n");
		stampaStringa("3)Manager\n");		
	}
		
	public void inserisci(Persona p) {
		p.setNome(leggiStringa("Nome: "));
		p.setCognome(leggiStringa("Cognome: "));
		p.setEta(leggiIntero("Eta: "));
		p.setCodiceFiscale(leggiStringa("Codice fiscale: "));
		if(p instanceof Dipendente) {
			((Dipendente)p).setStipendio(leggiDouble("Stipendio: "));
		}
		if(p instanceof Manager) {
			((Manager)p).setLivello(leggiIntero("Livello funzionale: "));
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
		}
		if(p instanceof Manager) {
			stampaStringa("Livello funzionale: ");
			stampaIntero(((Manager)p).getLivello());
			stampaStringa("\n");
		}
	}
	
	// AGGIUSTA
	public void stampaRepositoryElenco(HashMap<String, Persona> repository) {
		for(String chiave: repository.keySet()) {
			stampaStringa(repository.get(chiave).toString());
			stampaStringa("\n");
		}
	}
	
	//AGGIUSTA
	public void stampaRepositoryScheda(HashMap<String, Persona> repository) {
		for(String chiave: repository.keySet()) {
			stampa(repository.get(chiave));
			stampaStringa("\n");
		}
	}
	
	public Persona duplica(Persona p) {
		Persona nuova;
		if(p instanceof Manager) {
			nuova = new Manager();
			((Manager)nuova).setLivello(((Manager)p).getLivello());
			((Manager)nuova).setStipendio(((Manager)p).getStipendio());
		}else if(p instanceof Dipendente) {
			nuova = new Dipendente();
			((Dipendente)nuova).setStipendio(((Dipendente)p).getStipendio());
		} else {
			nuova = new Persona();
		}
		nuova.setNome(p.getNome());
		nuova.setCognome(p.getCognome());
		nuova.setEta(p.getEta());
		nuova.setCodiceFiscale(p.getCodiceFiscale());
		return nuova;
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

		if(p instanceof Dipendente) {
			s = leggiStringa("Stipendio ["+((Dipendente)p).getStipendio()+"]: ");
			if(!s.equals("")) {
				((Dipendente)p).setStipendio(Double.parseDouble(s));
			}
		}
		
		if(p instanceof Manager) {
			s = leggiStringa("Livello funzionale ["+((Manager)p).getLivello()+"]: ");
			if(!s.equals("")) {
				((Manager)p).setLivello(Integer.parseInt(s));
			}			
		}
	}
	
	
}
