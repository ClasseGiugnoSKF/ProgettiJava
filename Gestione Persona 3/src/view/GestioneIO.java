package view;
import java.util.Scanner;
import model.*;

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
	
	public void inserisciP(Persona p) {
		p.setNome(leggiStringa("Inserisci il nome della persona: "));
		p.setCognome(leggiStringa("Inserisci il cognome della persona: "));
		p.setEta(leggiIntero("Inserisci l'età della persona: "));
		p.setCodiceFiscale(leggiStringa("Inserisci il codice fiscale della persona: "));
		p.setNazione(leggiStringa("Inserisci la nazione della persona: "));
		p.setLuogoNascita(leggiStringa("Inserisci il luogo di nascita della persona: "));
		if(p instanceof Dipendente) {
			((Dipendente)p).setStipendio(leggiDouble("Quanto guadagna la persona?: "));
		}
		if(p instanceof Manager) {
			((Manager)p).setLivello(leggiIntero("Che livello di permessi ha il manager?: "));
			((Manager)p).setAreaResp(leggiStringa("Di quale area è responsabile?: "));
		}
	}
	
	public void elencoP(Persona[] pVet) {
		for(int i=0;i<pVet.length;i++) {
			if(pVet[i] != null) {
				System.out.println(pVet[i]);
			}
		}
	}
	
	public void stampaScheda(Persona[] pVet) {
		for(int i=0;i<pVet.length;i++) {
			if(pVet[i] != null) {
				stampa("*****\nNome: "+pVet[i].getNome()+"\n"
						+ "Cognome: "+pVet[i].getCognome()+"\n"
						+ "Età: "+pVet[i].getEta()+" anni\n"
						+ "Codice Fiscale: "+pVet[i].getCodiceFiscale()+"\n"
						+ "Nazione: "+pVet[i].getNazione()+"\n"
						+ "Luogo di Nascita: "+pVet[i].getLuogoNascita());	
				if(pVet[i] instanceof Dipendente) {
					stampa("Stipendio: "+((Dipendente)pVet[i]).getStipendio()+"€");
				}
				if(pVet[i] instanceof Manager) {
					stampa("Livello: "+((Manager)pVet[i]).getLivello()+"\n"
							+ "Area Responsabile: "+((Manager)pVet[i]).getAreaResp());
				}
			}
		}
	}
	
	public void sommarioP(Persona p) {
		stampa(p.getCodiceFiscale()+" - "+p.getNome()+" "+p.getCognome()+" è stato trovato.");
	}
	
	public void mascheraModifica(Persona p) {
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
		stampa("Utente modificato.");
	}
	
	public void cancellaMaschera(Persona p) {
		p.setNome(null);
		p.setCognome(null);
		p.setEta(null);
		p.setCodiceFiscale(null);
		p.setNazione(null);
		p.setLuogoNascita(null);
		p = null;
		if(p instanceof Dipendente) {
			((Dipendente) p).setStipendio(null);
		}
		if(p instanceof Manager) {
			((Manager) p).setLivello(null);
			((Manager) p).setAreaResp(null);
		}
		stampa("Utente cancellato.");
	}
}