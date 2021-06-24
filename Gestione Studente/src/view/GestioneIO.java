package view;

import java.util.Scanner;

import model.Studente;

public class GestioneIO {

	Scanner scan = new Scanner(System.in);
	
	public void stampaStringa(String messaggio) {
		System.out.print(messaggio);
	}
	
	public void stampaIntero(Integer valore) {
		System.out.print(""+valore);
	}
	
	public void stampaFloat(Float valore) {
		System.out.print(""+valore);
	}
	
	public String leggiStringa(String messaggio) {
		System.out.print(messaggio);
		return scan.nextLine();
	}
	
	public Integer leggiIntero(String messaggio) {
		System.out.print(messaggio);
		return Integer.parseInt(scan.nextLine());
	}
	
	public Float leggiFloat(String messaggio) {
		System.out.print(messaggio);
		return Float.parseFloat(scan.nextLine());
	}
	
	public void inserireStudente(Studente s) {
		s.setNome(leggiStringa("Nome:"));
		s.setCognome(leggiStringa("Cognome:"));
		s.setDataNascita(leggiStringa("Data nascita:"));
		s.setMatricola(leggiStringa("Matricola:"));
		s.setNumeroEsamiSostenuti(leggiIntero("Numero esami sostenuti:"));
		s.setNumeroEsamiMancanti(leggiIntero("Numero esami mancanti:"));
		s.setMediaVoti(leggiFloat("Media voti:"));
	}
	
	public void stampaStudente(Studente s) {
		stampaStringa("Nome: ");
		stampaStringa(s.getNome()+"\n");
		stampaStringa("Cognome: ");
		stampaStringa(s.getCognome()+"\n");
		stampaStringa("Data nascita: ");
		stampaStringa(s.getDataNascita()+"\n");
		stampaStringa("Matricola: ");
		stampaStringa(s.getMatricola()+"\n");
		stampaStringa("Numero esami sostenuti: ");
		stampaIntero(s.getNumeroEsamiSostenuti());
		stampaStringa("\nNumero esami mancanti: ");
		stampaIntero(s.getNumeroEsamiMancanti());
		stampaStringa("\nMedia voti: ");
		stampaFloat(s.getMediaVoti());
		stampaStringa("\n");
	}
}
