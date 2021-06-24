package view;
import java.util.Scanner;
import model.Automobile;

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
	
	public void inserisciAuto(Automobile a) {
		a.setModello(leggiStringa("Inserisci il modello dell'automobile: "));
		a.setMarca(leggiStringa("Inserisci la marca dell'automobile: "));
		a.setColore(leggiStringa("Inserisci il colore dell'automobile: "));
		a.setAnnoImmatricolazione(leggiStringa("Inserisci l'anno di immatricolazione dell'auto: "));
		a.setCilindrata(leggiStringa("Inserisci la cilindrata: "));
		a.setPrezzoBollo(leggiIntero("Inserisci il prezzo del bollo: "));
		a.setAssicurazione(leggiBool("E' assicurata l'auto? (Si/No)"));
		a.setRevisione(leggiBool("L'auto ha la revisione? (Si/No)"));
	}
	
	public void checkBools(boolean verifica) {
		if(verifica) {
			stampaNL("Si");
			return;
		}
		stampaNL("No");
	}
	
	public void stampaAutomobili(Automobile[] auto) {
			for(int i=0;i<auto.length;i++) {
				if(auto[i] != null) {
					stampaNL("Modello: "+auto[i].getModello()+"\n"
							+ "Marca: "+auto[i].getMarca()+"\n"
							+ "Colore: "+auto[i].getColore()+"\n"
							+ "Anno di Immatricolazione: "+auto[i].getAnnoImmatricolazione()+"\n"
							+ "Cilindrata: "+auto[i].getCilindrata()+"\n"
							+ "Prezzo del Bollo: "+auto[i].getPrezzoBollo()+"\n"
							+ "Assicurazione: ");
							checkBools(auto[i].isAssicurazione());
							stampaNL("\nRevisione: ");
							checkBools(auto[i].isRevisione());
							stampaNL("\n*****\n");
				}
			}
		}
	
}

