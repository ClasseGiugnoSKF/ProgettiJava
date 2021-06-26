package view;

import java.util.Scanner;

import model.File;
import model.Testo;

public class GestioneIO {

	Scanner scan = new Scanner(System.in);
	
	public void stampaString(String messaggio) {
		System.out.print(messaggio);
	}
	
	public void stampaIntero(Integer valore) {
		System.out.print(""+valore);
	}
	
	public void stampaDouble(Double valore) {
		System.out.print(""+valore);
	}
	
	public void stampaBoolean(Boolean flag) {
		System.out.print(flag);
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
	
	public Boolean leggiBoolean(String messaggio) {
		System.out.print(messaggio);
		Boolean flag;
		if(scan.nextLine().equalsIgnoreCase("true")) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}
	
	public void menuPrincipale() {
		stampaString("1)Inserimento\n");
		stampaString("2)Stampa elenco\n");
		stampaString("3)Stampa scheda\n");
		stampaString("4)Esci\n\n");
	}
	
	public void menuSecondario() {
		stampaString("1)File\n");
		stampaString("2)Testo\n\n");
	}
	
	public void inserireFile(File f) {
		f.setNome(leggiStringa("Nome: "));
		f.setTipo(leggiStringa("Tipo: "));
		f.setDimensione(leggiDouble("Dimensione: "));
		f.setUltimaModifica(leggiStringa("Ultima modifica: "));
	}
	
	public void inserireTesto(Testo t) {
		inserireFile(t);
		t.setNumeroRighe(leggiIntero("Numero righe: "));
		t.setNumeroCaratteri(leggiIntero("Numero caratteri: "));
		t.setPseudoCodice(leggiBoolean("Pesudo-codice (true/false): "));
	}
	
	public void stampaFile(File f) {
		stampaString("Nome: " + f.getNome() + "\n");
		stampaString("Tipo: " + f.getTipo() + "\n");
		stampaString("Dimensione: ");
		stampaDouble(f.getDimensione());
		stampaString("\nUltima modifica: " + f.getUltimaModifica() + "\n");
	}
	
	public void stampaTesto(Testo t) {
		stampaFile(t);
		stampaString("Numero righe: ");
		stampaIntero(t.getNumeroRighe());
		stampaString("\n");
		stampaString("Numero caratteri: ");
		stampaIntero(t.getNumeroCaratteri());
		stampaString("\n");
		stampaString("Pseudo-codice: ");
		stampaBoolean(t.getPseudoCodice());
		stampaString("\n");
	}
	
}
