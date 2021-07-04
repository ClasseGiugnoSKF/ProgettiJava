package view;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import model.Dipendente;
import model.Manager;
import model.Persona;

public class GestioneIO {
	Scanner s = new Scanner(System.in);
	
	public void menu() {		
		stampa("***** MENU\n"
				+ "1) Inserimento\n"
				+ "2) Modifica\n"
				+ "3) Cancella\n"
				+ "4) Trova\n"
				+ "5) Visualizza Elenco\n"
				+ "6) Visualizza Scheda\n"
				+ "7) Esci");
	}
	
	public String leggiStringa(String messaggio) {
		System.out.println(messaggio);
		return s.nextLine();
	}
	
	public int leggiIntero(String messaggio) {
		System.out.println(messaggio);
		return Integer.parseInt(s.nextLine());
	}
	
	public byte leggiByte(String messaggio) {
		System.out.println(messaggio);
		return Byte.parseByte(s.nextLine());
	}
	
	public double leggiDouble(String messaggio) {
		System.out.println(messaggio);
		return Double.parseDouble(s.nextLine());
	}
	
	public char leggiChar(String messaggio) {
		System.out.println(messaggio);
		return s.nextLine().charAt(0);
	}
	
	public boolean leggiBool(String messaggio) {
		System.out.println(messaggio);
		if(s.nextLine().equalsIgnoreCase("si")) {
			return true;
		}
		return false;
	}
	
	public void stampa(String messaggio) {
		System.out.println(messaggio);
	}
	
	public void stampaNL(String messaggio) {
		System.out.print(messaggio);
	}
	
	public void stampaInt(int num) {
		System.out.println(num);
	}
	
	public void stampaErrore(String messaggio){
		System.err.println(messaggio);
	}
	
	public void creaMaschera(Persona p) {
		p.setNome(leggiStringa("Nome: "));
		p.setCognome(leggiStringa("Cognome: "));
		p.setEta(leggiIntero("Età: "));
		p.setNazione(leggiStringa("Nazione: "));
		p.setLuogoNascita(leggiStringa("Luogo di Nascita: "));
		if(p instanceof Dipendente) {
			((Dipendente) p).setStipendio(leggiDouble("Stipendio: "));
		}
		if(p instanceof Manager) {
			((Manager) p).setLivello(leggiIntero("Livello: "));
			((Manager) p).setAreaResp(leggiStringa("Responsabile dell'area: "));
		}
	}
	
	public Persona clonaMaschera(Persona p) {
		Persona c;
		if(p instanceof Manager) {
			c = new Manager();
			((Manager)c).setLivello(((Manager)p).getLivello());
			((Manager)c).setAreaResp(((Manager)p).getAreaResp());
		} else if(p instanceof Dipendente) {
			c = new Dipendente();
			((Dipendente)c).setStipendio(((Dipendente)p).getStipendio());
		} else {
			c = new Persona();
		}
		c.setNome(p.getNome());
		c.setCognome(p.getNome());
		c.setEta(p.getEta());
		c.setNazione(p.getNazione());
		c.setLuogoNascita(p.getLuogoNascita());
		return c;
	}
	
	public void modificaMaschera(Persona p) {
		String s = leggiStringa("Nome ["+p.getNome()+"]: ");
		if(!s.isEmpty()) {
			p.setNome(s);
		}
		s=leggiStringa("Cognome ["+p.getCognome()+"]: ");
		if(!s.isEmpty()) {
			p.setCognome(s);
		}
		s=leggiStringa("Età ["+p.getEta()+"]: ");
		if(!s.isEmpty()) {
			p.setEta(Integer.parseInt(s));
		}
		s=leggiStringa("Nazione ["+p.getNazione()+"]: ");
		if(!s.isEmpty()) {
			p.setNazione(s);
		}
		s=leggiStringa("Luogo di Nascita ["+p.getLuogoNascita()+"]: ");
		if(!s.isEmpty()) {
			p.setLuogoNascita(s);
		}
		if(p instanceof Dipendente) {
			s=leggiStringa("Stipendio ["+((Dipendente)p).getStipendio()+"]: ");
			if(!s.isEmpty()) {
				((Dipendente)p).setStipendio(Double.parseDouble(s));
			}
		}
		if(p instanceof Manager) {
			s=leggiStringa("Livello ["+((Manager)p).getLivello()+"]: ");
			if(!s.isEmpty()) {
				((Manager)p).setLivello(Integer.parseInt(s));
			}
			s=leggiStringa("Area Responsabile ["+((Manager)p).getAreaResp()+"]: ");
			if(!s.isEmpty()) {
				((Manager)p).setAreaResp(s);
			}
		}
	}
	
	public void stampaElenco(HashMap<String,Persona> pMap) {
		for(Object valori: pMap.values()) {
			System.out.println(valori);
		}
	}
	
	public void stampaScheda(HashMap<String,Persona> pMap) {
		for(Persona p: pMap.values()) {
			stampa("*****\nNome: "+p.getNome()+"\n"
					+ "Cognome: "+p.getCognome()+"\n"
					+ "Età: "+p.getEta()+" anni\n"
					+ "Nazione: "+p.getNazione()+"\n"
					+ "Luogo di Nascita: "+p.getLuogoNascita());	
			if(p instanceof Dipendente) {
				stampa("Stipendio: "+((Dipendente)p).getStipendio());
			}
			if(p instanceof Manager) {
				stampa("Livello: "+((Manager)p).getLivello()+"\n"
						+ "Area Responsabile: "+((Manager)p).getAreaResp());
			}
		}
	}
}