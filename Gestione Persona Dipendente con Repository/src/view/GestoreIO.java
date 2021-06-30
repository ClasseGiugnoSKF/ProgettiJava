package view;

import java.util.LinkedList;
import java.util.Scanner;

import model.Dipendente;
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
		System.out.print(""+ valore);
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
	
	public void menu() {
		stampaStringa("\n1) Inserimento\n");
		stampaStringa("2) Modifica\n");
		stampaStringa("3) Cancellazione\n");
		stampaStringa("4) Trova\n");
		stampaStringa("5) Stampa elenco\n");
		stampaStringa("6) Stampa scheda\n");
		stampaStringa("7) Esci\n\n");
	}
	
	public void menuSecondario() {
		stampaStringa("\n1)Persona\n");
		stampaStringa("2)Dipendente\n");
	}

	public void inserisciPersona(Persona p) {
		p.setNome(leggiStringa("Nome: "));
		p.setCognome(leggiStringa("Cognome: "));
		p.setEta(leggiIntero("Eta: "));
		p.setCodiceFiscale(leggiStringa("Codice fiscale: "));
		if(p instanceof Dipendente) {
			((Dipendente)p).setStipendio(leggiDouble("Stipendio: "));
		}
	}

	public void stampaPersona(Persona p) {
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
			s = leggiStringa("Stipendio [" +((Dipendente)p).getStipendio()+ "]: ");
			if(!s.equals("")) {
				((Dipendente)p).setStipendio(Double.parseDouble(s));
			}
		}
	}
	
	public void stampaListaElenco(LinkedList<Persona> lista) {
		for(int i=0; i<lista.size(); i++) {
			stampaStringa(lista.get(i).toString() + "\n");
		}
		stampaStringa("\n");
	}
	
	public void stampaListaScheda(LinkedList<Persona> lista) {
		for(int i=0; i<lista.size(); i++) {
			stampaPersona(lista.get(i));
			stampaStringa("\n");
		}
		stampaStringa("\n");
	}
	
	//Gli passo la persona da duplicare e ritorna
	//la nuova persona duplicata. Devo creare una copia.
	public Persona duplicaPersona(Persona p) {
		Persona nuovaPersona;
		if(p instanceof Dipendente) {
			nuovaPersona = new Dipendente();
			((Dipendente)nuovaPersona).setStipendio(((Dipendente)p).getStipendio());
		} else {
			nuovaPersona = new Persona();
		}
		nuovaPersona.setNome(p.getNome());
		nuovaPersona.setCognome(p.getCognome());
		nuovaPersona.setEta(p.getEta());
		nuovaPersona.setCodiceFiscale(p.getCodiceFiscale());
		
		return nuovaPersona;
	}

}
