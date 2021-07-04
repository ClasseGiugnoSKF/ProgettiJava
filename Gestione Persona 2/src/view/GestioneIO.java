package view;
import java.util.Scanner;
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
		String input = s.nextLine();
		return input;
	}
	
	public int leggiIntero(String messaggio) {
		System.out.println(messaggio);
		int input = Integer.parseInt(s.nextLine());
		return input;
	}
	
	public byte leggiByte(String messaggio) {
		System.out.println(messaggio);
		byte input = Byte.parseByte(s.nextLine());
		return input;
	}
	
	public double leggiDouble(String messaggio) {
		System.out.println(messaggio);
		double input = Double.parseDouble(s.nextLine());
		return input;
	}
	
	public char leggiChar(String messaggio) {
		System.out.println(messaggio);
		char input = s.nextLine().charAt(0);
		return input;
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
	}
	
	public void cancellaP(Persona p) {
		p.setNome(null);
		p.setCognome(null);
		p.setEta(0);
		p.setCodiceFiscale(null);
		p.setNazione(null);
		p.setLuogoNascita(null);
	}
	
	public void sommarioP(Persona p) {
		stampa(p.getCodiceFiscale()+" - "+p.getNome()+" "+p.getCognome()+" è stato trovato.");
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
			if(pVet[i] != null && pVet[i].getCodiceFiscale() != null) {
				stampa("Nome: "+pVet[i].getNome()+"\n"
						+ "Cognome: "+pVet[i].getCognome()+"\n"
						+ "Età: "+pVet[i].getEta()+" anni\n"
						+ "Codice Fiscale: "+pVet[i].getCodiceFiscale()+"\n"
						+ "Nazione: "+pVet[i].getNazione()+"\n"
						+ "Luogo di Nascita: "+pVet[i].getLuogoNascita()+"\n");	
			}
		}
		

		
	}	
}