package view;
import java.util.ArrayList;
import java.util.Scanner;

import model.Libro;

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
	
	public void modificaMaschera(Libro l) {
		String s = leggiStringa("Numero pagine ["+l.getNumeroPagine()+"]: ");
		if(!s.isEmpty()) {
			l.setNumeroPagine(Integer.parseInt(s));
		}
		s = leggiStringa("Autore ["+l.getAutore()+"]: ");
		if(!s.isEmpty()) {
			l.setAutore(s);
		}
		s = leggiStringa("Titolo ["+l.getTitolo()+"]: ");
		if(!s.isEmpty()) {
			l.setTitolo(s);
		}
		s = leggiStringa("Genere ["+l.getGenere()+"]: ");
		if(!s.isEmpty()) {
			l.setGenere(s);
		}
		s = leggiStringa("Edizione ["+l.getEdizione()+"]: ");
		if(!s.isEmpty()) {
			l.setEdizione(s);
		}
		s = leggiStringa("Codice ISBN ["+l.getCodiceISBN()+"]: ");
		if(!s.isEmpty()) {
			l.setCodiceISBN(s);
		}
	}
	
	public Libro duplicaMaschera(Libro l) {
		Libro l1 = new Libro();
		l1.setCodiceISBN(l.getCodiceISBN());
		l1.setAutore(l.getAutore());
		l1.setEdizione(l.getEdizione());
		l1.setGenere(l.getGenere());
		l1.setNumeroPagine(l.getNumeroPagine());
		l1.setTitolo(l.getTitolo());
		return l1;
	}
	
	public void sommarioLibro(Libro l) {
		stampa("Libro trovato. - "+l.getCodiceISBN()+" - "+l.getTitolo());
	}
	
	public void visualizzaElenco(ArrayList<Libro> l) {
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
	}
	
	public void visualizzaScheda(ArrayList<Libro> l) {
		for(int i=0;i<l.size();i++) {
			stampa("Titolo: "+l.get(i).getTitolo()+"\n"
					+ "Genere: "+l.get(i).getGenere()+"\n"
					+ "Autore: "+l.get(i).getAutore()+"\n"
					+ "Edizione: "+l.get(i).getEdizione()+"\n"
					+ "Numero di pagine: "+l.get(i).getNumeroPagine()+"\n"
					+ "Codice ISBN: "+l.get(i).getCodiceISBN());
		}
	}
}