package view;
import java.util.Scanner;
import model.Animale;

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
	
	public void stampaAnimali(Animale[] animale) {
			for(int i=0;i<animale.length;i++) {
				if(animale[i] != null) {
					stampaNL("Specie: "+animale[i].getSpecie()+"\n"
							+ "Sesso: "+animale[i].getSesso()+"\n"
							+ "Età: "+animale[i].getEta()+"\n"
							+ "Peso: "+animale[i].getPeso()+" kg\n"
							+ "Altezza: "+animale[i].getAltezza()+"m\n"
							+ "Area Zoo: "+animale[i].getAreaZoo()+"\n"
							+ "Tendenze Aggressive: ");
					checkBools(animale[i].getAggressivo());
					stampaNL("\n");
				}
			}
		}
	
	public void csvAnimali(Animale[] a) {
		for(int i=0;i<a.length;i++) {
			if(a[i] != null) {
				stampa(a[i]+"\n*****");
			}
		}
	}
}

