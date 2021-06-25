package view;
import java.util.Scanner;
import model.Alimento;
import model.Frutta;

public class GestioneIO {
	Scanner s = new Scanner(System.in);
	
	public void menu() {
		stampa("***** MENU\n"
				+ "1) Inserimento\n"
				+ "2) Visualizza Elenco\n"
				+ "3) Visualizza Scheda\n"
				+ "4) Esci");
	}
	
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
	
	public byte leggiByte(String messaggio) {
		System.out.println(messaggio);
		byte input = Byte.parseByte(s.nextLine());
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

	public void inserimentoA(Alimento a) {
		a.setTipo(leggiStringa("Che tipo di alimento è?: "));
		a.setCalorie(leggiIntero("Quante calorie ha?: "));
		a.setPeso(leggiDouble("Quanto pesa?: "));
		a.setPrezzo(leggiDouble("Quanto costa?: "));
	}
	
	public void inserimentoF(Frutta f) {
		inserimentoA(f);
		f.setColore(leggiStringa("Di che colore è?: "));
		f.setStagione(leggiStringa("In che stagione cresce?: "));
		f.setSapore(leggiStringa("Che sapore ha?: "));
		f.setProvenienza(leggiStringa("Di dove è?: "));
	}
	
	public void stampaAlimento(Alimento a) {
		stampa("*****\nTipo: "+a.getTipo()+"\n"
				+ "Calorie: "+a.getCalorie()+"\n"
				+ "Peso: "+a.getPeso()+"\n"
				+ "Prezzo: "+a.getPrezzo()+"€");
	}
	
	public void stampaFrutta(Frutta f) {
		stampaAlimento(f);
		stampa("Colore: "+f.getColore()+"\n"
				+ "Stagione: "+f.getStagione()+"\n"
				+ "Sapore: "+f.getSapore()+"\n"
				+ "Provenienza: "+f.getProvenienza());
	}
}