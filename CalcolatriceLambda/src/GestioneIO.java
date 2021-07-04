import java.util.Scanner;


public class GestioneIO {
	Scanner s = new Scanner(System.in);
	
	public void menu() {		
		stampa("***** MENU\n"
				+ "1) Addizione\n"
				+ "2) Sottrazione\n"
				+ "3) Moltiplicazione\n"
				+ "4) Divisione\n"
				+ "5) Potenza\n"
				+ "6) Radice\n"
				+ "7) Esagono\n"
				+ "8) Cerchio\n"
				+ "9) Esci");
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
		return Double.parseDouble(s.nextLine());
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
}