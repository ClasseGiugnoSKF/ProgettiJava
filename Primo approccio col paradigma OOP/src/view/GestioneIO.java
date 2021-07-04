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
	
	public void checkBools(boolean verifica) {
		if(verifica) {
			stampaNL("Si");
			return;
		}
		stampaNL("No");
	}
	
	public int passaggioPerValore(int a) {
		a=25;
		return a;
	}
	
	public void passaggioPerRiferimento(Persona p) {
		p.setNome("Mario");
		p.setCognome("Rossi");
	}
	
	// String e classi wrapper si comportano come dati primitivi, c'è bisogno del return
	public String test(String a) {
		a = "test";
		return a;
	}
	
	public Integer prova(Integer a) {
		a = 5;
		return a;
	}
}