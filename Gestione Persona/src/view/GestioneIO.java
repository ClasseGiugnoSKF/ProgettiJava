package view;
import java.util.Scanner;
import model.Persona;

public class GestioneIO {
	Scanner s = new Scanner(System.in);
	
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
	
	public char leggiChar(String messaggio) {
		System.out.println(messaggio);
		char input = s.nextLine().charAt(0);
		return input;
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
	
	public void stampaPersona(Persona p) {
		System.out.println("Nome: "+p.getNome()+"\n"
				+ "Cognome: "+p.getCognome()+"\n"
				+ "Età: "+p.getEta()+"\n"
				+ "Codice Fiscale: "+p.getCf()+"\n"
				+ "Nazione: "+p.getNazione()+"\n"
				+ "Luogo di Nascita: "+p.getLuogoNascita());
	}
	
	public void stampaPersone(Persona[] p) {
		for(int i=0;i<p.length;i++) {
			if(p[i] != null) {
				System.out.println("Nome: "+p[i].getNome()+"\n"
						+ "Cognome: "+p[i].getCognome()+"\n"
						+ "Età: "+p[i].getEta()+"\n"
						+ "Codice Fiscale: "+p[i].getCf()+"\n"
						+ "Nazione: "+p[i].getNazione()+"\n"
						+ "Luogo di Nascita: "+p[i].getLuogoNascita());	
			}
		}
	}
	
	public void csvPersone(Persona[] p) {
		for(int i=0;i<p.length;i++) {
			if(p[i] != null) {
				stampa(p[i]+"\n*****");
			}
		}
	}
}
