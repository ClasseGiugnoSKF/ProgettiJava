package view;
import java.util.ArrayList;
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
				+ "5) Duplica\n"
				+ "6) Visualizza Elenco\n"
				+ "7) Visualizza Scheda\n"
				+ "8) Esci");
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
	
	public void sommarioP(Persona p) {
		stampa(p.getCodiceFiscale()+" - "+p.getNome()+" "+p.getCognome()+" è stato trovato.");
	}
	
	public void inserisci(Persona p) {
		p.setNome(leggiStringa("Nome: "));
		p.setCognome(leggiStringa("Cognome: "));
		p.setEta(leggiIntero("Età: "));
		p.setCodiceFiscale(leggiStringa("Codice Fiscale: "));
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
	
	public void modifica(Persona p) {
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
		s=leggiStringa("Codice Fiscale ["+p.getCodiceFiscale()+"]: ");
		if(!s.isEmpty()) {
			p.setCodiceFiscale(s);
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
	
	public void stampaElenco(ArrayList<Persona> pList) {
		for(int i=0;i<pList.size();i++) {
			System.out.println(pList.get(i));
		}
	}
	
	public void stampaScheda(ArrayList<Persona> pList) {
		for(int i=0;i<pList.size();i++) {
			if(pList.get(i) != null) {
				stampa("*****\nNome: "+pList.get(i).getNome()+"\n"
						+ "Cognome: "+pList.get(i).getCognome()+"\n"
						+ "Età: "+pList.get(i).getEta()+" anni\n"
						+ "Codice Fiscale: "+pList.get(i).getCodiceFiscale()+"\n"
						+ "Nazione: "+pList.get(i).getNazione()+"\n"
						+ "Luogo di Nascita: "+pList.get(i).getLuogoNascita());	
				if(pList.get(i) instanceof Dipendente) {
					stampa("Stipendio: "+((Dipendente)pList.get(i)).getStipendio());
				}
				if(pList.get(i) instanceof Manager) {
					stampa("Livello: "+((Manager)pList.get(i)).getLivello()+"\n"
							+ "Area Responsabile: "+((Manager)pList.get(i)).getAreaResp());
				}
			}
		}
	}
	
	public Persona duplicaPersona(Persona p) {
		Persona p1;
		if(p instanceof Manager) {
			p1 = new Manager();
			((Manager)p1).setStipendio(((Manager) p).getStipendio());
			((Manager)p1).setLivello(((Manager) p).getLivello());
			((Manager) p1).setAreaResp(((Manager) p).getAreaResp());
		} else if(p instanceof Dipendente) {
			p1 = new Dipendente();
			((Dipendente) p1).setStipendio(((Dipendente) p).getStipendio());
		} else {
			p1 = new Persona();
		}
		p1.setNome(p.getNome());
		p1.setCognome(p.getCognome());
		p1.setEta(p.getEta());
		p1.setCodiceFiscale(p.getCodiceFiscale());
		p1.setNazione(p.getNazione());
		p1.setLuogoNascita(p.getLuogoNascita());
		return p1;
	}
}