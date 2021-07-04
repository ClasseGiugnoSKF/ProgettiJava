package controller;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Scanner;
import model.Persona;
import model.PersonaCRUD;

public class Avvio {

	public static void main(String[] args) {
		ArrayList<Persona> persone=new ArrayList<>(); // arraylist originale
		Scanner input = new Scanner(System.in);
		Boolean error = true;
		
		persone.add(new Persona("Mario", "Rossi", 20));
		persone.add(new Persona("Giallo", "Cerchio", 30));
		persone.add(new Persona("Paolo", "Quadrato", 25));
		persone.add(new Persona("Peppo", "Blu", 27));
		persone.add(new Persona("Alessio", "Gialli", 22));
		persone.add(new Persona("Paolino", "Verdi", 21));
		persone.add(new Persona("Mario", "Rossi", 20));
		HashSet<Persona> personeSetNonOrdinato=new HashSet<Persona>(persone); //hashset dall'arraylist
		TreeSet<Persona> personeSetOrdinato=new TreeSet<Persona>(persone); //treeset dall'arraylist
		System.out.println("1) Elenco persona in ordine naturale");
		for(Persona persona:persone) {
			System.out.println(persona);
		}
		
		System.out.println("2) Elenco persone ordinato per nome");
		persone.sort((p1, p2) -> p1.getNome().compareTo(p2.getNome()));
		for(Persona persona:persone) {
			System.out.println(persona);
		}
		
		System.out.println("3) Elenco persone ordinato per età");
		persone.sort((p1, p2) -> p1.getEta().compareTo(p2.getEta()));
		for(Persona persona:persone) {
			System.out.println(persona);
		}
		
		System.out.println("4) Elenco persone ordinato per Cognome e Nome");
		persone.sort((p1, p2) -> (p1.getCognome()+p1.getNome()).compareTo((p2.getCognome()+p2.getNome())));
		for(Persona persona:persone) {
			System.out.println(persona);
		}
		
		System.out.println("--- Elenco persone non ordinato senza duplicati ---");
		for(Persona persona: personeSetNonOrdinato) {
			System.out.println(persona);
		}
		
		System.out.println("--- Elenco persone ordinato senza duplicati ---");
		for(Persona persona: personeSetOrdinato) {
			System.out.println(persona);
		}
		
		Map<String,String> saluti=new HashMap<String,String>();
		saluti.put("Buongiorno Italiano", "Buongiorno");
		saluti.put("Buonasera Italiano", "Buonasera");
		saluti.put("Buonanotte Italiano", "Buonanotte");
		saluti.put("Buongiorno Inglese", "Good morning");
		saluti.put("Buonasera Inglese", "Good evening");
		saluti.put("Buonanotte Inglese", "Good night");
		
		System.out.println("--- Conversione implicita ---");
		for(String chiave : saluti.keySet()) {
			System.out.println(chiave);
		}
		System.out.println("--- Conversione esplicita ---");
		Set<String> keys=saluti.keySet();
		for(String chiave : keys) {
			System.out.println((String)chiave);
		}
		SortedSet<String> keysUno = new TreeSet<String>(saluti.keySet());
		System.out.println("--- Chiavi ordinate ---");
		for(String chiave: keysUno) {
			System.out.println(chiave);
		}
		System.out.println("--- Valori object ---");
		for(Object valori : saluti.values()) {
			System.out.println((String)valori);
		}
		System.out.println("--- Valori collection ---");
		Collection<String> valori=saluti.values();
		for(String valore: valori) {
			System.out.println(valore);
		}
		Set<String> valoriSet=new TreeSet<String>(valori);
		System.out.println("--- Valori collection ordinata ---");
		for(String valore: valoriSet) {
			System.out.println(valore);
		}
//		System.out.println("Indica il saluto: ");
//		String saluto=input.nextLine();
//		System.out.println("Indica la lingua: ");
//		String lingua=input.nextLine();
//		System.out.println(saluti.get(saluto+" "+lingua));
		
		do {
			try {
				Integer.parseInt(input.nextLine());
				error = false;
			} catch(NumberFormatException e) {
				System.err.println("Fornisci un valore numerico intero!");
			}
		} while(error);
		
	}
}
