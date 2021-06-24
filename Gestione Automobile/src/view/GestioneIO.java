package view;

import java.util.Scanner;

import model.Automobile;

public class GestioneIO {
	
	Scanner scan = new Scanner(System.in);

	public void stampaString(String messaggio) {
		System.out.println(messaggio);
	}
	
	public void stampaIntero(Integer valore) {
		System.out.println("" + valore);
	}
	
	public void stampaDecimale(Float valore) {
		System.out.println("" + valore);
	}
	
	public void stampaBooleano(boolean flag) {
		System.out.println(flag);
	}
	
	public String leggiStringa(String messaggio) {
		System.out.print(messaggio);
		return scan.nextLine();
	}
	
	public Integer leggiIntero(String messaggio) {
		System.out.print(messaggio);
		return Integer.parseInt(scan.nextLine());
	}

	public Float leggiDecimale(String messaggio) {
		System.out.print(messaggio);
		return Float.parseFloat(scan.nextLine());
	}
	
	public boolean leggiBooleano(String messaggio) {
		System.out.print(messaggio);
		boolean flag;
		if(scan.nextLine().equalsIgnoreCase("true")) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}
	
	public void inserireAutomobile(Automobile a) {
		a.setMarca(leggiStringa("Inserisci marca:"));
		a.setModello(leggiStringa("Inserisci modello:"));
		a.setTarga(leggiStringa("Inserisci targa:"));
		a.setColore(leggiStringa("Inserisci colore:"));
		a.setAssicurazione(leggiBooleano("Inserisci assicurazione (true/false):"));
		a.setAnnoImmatricolazione(leggiStringa("Inserisci anno assicurazione:"));
		a.setCilindrata(leggiIntero("Inserisci cilindrata:"));
		a.setBollo(leggiDecimale("Inserisci prezzo bollo:"));
		a.setRevisione(leggiBooleano("Inserisci revisione (true/false)"));
	}
	
	public void stampaAutomobile(Automobile a) {
		stampaString(a.getMarca());
		stampaString(a.getModello());
		stampaString(a.getTarga());
		stampaString(a.getColore());
		stampaBooleano(a.getAssicurazione());
		stampaString(a.getAnnoImmatricolazione());
		stampaIntero(a.getCilindrata());
		stampaDecimale(a.getBollo());
		stampaBooleano(a.getRevisione());	
	}
}
