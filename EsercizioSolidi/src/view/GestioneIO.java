package view;
import java.util.HashMap;
import java.util.Scanner;

import model.Cubo;
import model.Sfera;
import model.Solido;
import model.TerzaEccezione;

public class GestioneIO {
	Scanner s = new Scanner(System.in);
	
	public void menu() {		
		stampa("***** MENU\n"
				+ "1) Inserimento\n"
				+ "2) Stampa\n"
				+ "3) Esci");
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
		double valore = 0;
		Boolean flag;
		do {
			flag = false;
			try {
				valore = Double.parseDouble(s.nextLine());
				if(valore<=0) {
					throw new TerzaEccezione();
				}
			} catch(TerzaEccezione | NumberFormatException e) {
				flag=true;
				System.err.println(e.getMessage()+": Inserire un valore maggiore di zero.");
			}
		} while(flag);
		return valore;
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
	
	public void creaMaschera(Solido s) {
		if(s instanceof Cubo) {
			((Cubo)s).setLato(leggiDouble("Inserisci il lato: "));
		} else {
			((Sfera)s).setRaggio(leggiDouble("Inserisci il raggio: "));
		}
		s.setPesoSpecifico(leggiDouble("Inserisci il peso specifico: "));
	}
	
	public void stampaScheda(HashMap<String,Solido> sMap) {
		for(Solido valori: sMap.values()) {
			stampa("*****\nSolido: "+valori.getNomeSolido()+"\n"
					+ "Peso Specifico: "+valori.getPesoSpecifico());
			if(valori instanceof Cubo) {
				stampa("Lato: "+((Cubo)valori).getLato()+"\n"
						+ "Volume: "+((Cubo)valori).volume()+"\n"
						+ "Superfice: "+((Cubo)valori).superfice());
			} else if(valori instanceof Sfera) {
				stampa("Raggio: "+((Sfera)valori).getRaggio()+"\n"
						+ "Volume: "+((Sfera)valori).volume()+"\n"
						+ "Superfice: "+((Sfera)valori).superfice());
			}
			stampa("Peso: "+(valori.peso(valori.getPesoSpecifico())));
		}
	}
	
	public void stampaElenco(HashMap<String,Solido> sMap) {
		for(Solido valori: sMap.values()) {
			System.out.println(valori);
		}
	}
}