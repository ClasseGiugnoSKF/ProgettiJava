package view;
import java.util.Scanner;

import model.Alimento;
import model.Frutta;

public class GestoreIO {

	Scanner scan = new Scanner(System.in);
	
	public void stampaStringa(String messaggio) {
		System.out.print(messaggio);
	}
	
	public void stampaIntero(Integer valore) {
		System.out.print(valore);
	}
	
	public void stampaDouble(Double valore) {
		System.out.print(valore);
	}
	
	public String leggiStringa(String messaggio) {
		System.out.print(messaggio);
		return scan.nextLine();
	}
	
	public Integer leggiIntero(String messaggio) {
		System.out.print(messaggio);
		return Integer.parseInt(scan.nextLine());
	}
	
	public Double leggiDouble(String messaggio) {
		System.out.print(messaggio);
		return Double.parseDouble(scan.nextLine());
	}
	
	public void menuPrincipale() {
		stampaStringa("1)Inserimento\n");
		stampaStringa("2)Stampa elenco\n");
		stampaStringa("3)Stampa scheda\n");
		stampaStringa("4)Esci\n");
	}
	
	public void menuSecondario() {
		stampaStringa("1)Alimento\n");
		stampaStringa("2)Frutto\n");
	}
	
	public void stampaAlimento(Alimento a) {
		stampaStringa("Tipo: " + a.getTipo() + "\n");
		stampaStringa("Peso: ");
		stampaDouble(a.getPeso());
		stampaStringa("\n");
		stampaStringa("Calorie: ");
		stampaIntero(a.getCalorie());
		stampaStringa("\n");
		stampaStringa("Prezzo: ");
		stampaDouble(a.getPrezzo());
		stampaStringa("\n");
	}
	
	public void stampaFrutto(Frutta f) {
		stampaAlimento(f);
		stampaStringa("Colore: " + f.getColore() + "\n");
		stampaStringa("Stagione: " + f.getStagione() +"\n");
		stampaStringa("Sapore: " + f.getSapore() +"\n");
		stampaStringa("Provenienza: " + f.getProvenienza() +"\n");		
	}
	
	public void inserireAlimento(Alimento a) {
		a.setTipo(leggiStringa("Tipo: "));
		a.setPeso(leggiDouble("Peso: "));
		a.setCalorie(leggiIntero("Calorie: "));
		a.setPrezzo(leggiDouble("Prezzo: "));
	}

	public void inserireFrutta(Frutta f) {
		inserireAlimento(f);
		f.setColore(leggiStringa("Colore: "));
		f.setStagione(leggiStringa("Stagione: "));
		f.setSapore(leggiStringa("Sapore: "));
		f.setProvenienza(leggiStringa("Provenienza: "));
	}
}
