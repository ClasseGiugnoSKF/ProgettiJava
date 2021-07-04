package view;
import java.util.Scanner;
import model.Mammifero;
import model.Cane;

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

	public void inserisci(Mammifero m) {
		m.setNomeSpecie(leggiStringa("Inserisci il nome della razza: "));
		m.setSesso(leggiStringa("Inserisci il sesso dell'animale: "));
		m.setEta(leggiIntero("Inserisci l'età dell'animale: "));
		m.setLunghezza(leggiDouble("Inserisci la lunghezza dell'animale in metri: "));
		m.setAltezza(leggiDouble("Inserisci l'altezza dell'animale in metri: "));
		m.setPeso(leggiDouble("Inserisci il peso dell'animale in chilogrammi: "));
		m.setLongevita(leggiIntero("Che aspettative di vita ha l'animale? (in anni): "));
		m.setAlimentazione(leggiStringa("L'animale è onnivoro, carnivoro o erbivoro?: "));
		m.setAcquatico(leggiBool("L'animale è acquatico?: (Si/No)"));
		if(m instanceof Cane) {
			((Cane)m).setNomeCane(leggiStringa("Qual è il suo nome?: "));
			((Cane)m).setCacciatore(leggiBool("E' un cane da caccia? (Si/No): "));
			((Cane)m).setPedigree(leggiBool("Ha il pedigree? (Si/No): "));
		}
	}

	public void stampa(Mammifero m) {
		stampa("Specie: "+m.getNomeSpecie()+"\n"
				+ "Sesso: "+m.getSesso()+"\n"
				+ "Età: "+m.getEta()+"\n"
				+ "Lunghezza: "+m.getLunghezza()+" m\n"
				+ "Altezza: "+m.getAltezza()+" m\n"
				+ "Peso: "+m.getPeso()+" kg\n"
				+ "Longevità: "+m.getLongevita()+" anni\n"
				+ "Alimentazione: "+m.getAlimentazione()+"\n"
				+ "Acquatico: "+m.getAcquatico());
		if(m instanceof Cane) {
			stampa("Nome del cane: "+((Cane)m).getNomeCane()+"\n"
					+ "Cane da caccia: "+((Cane)m).getCacciatore()+"\n"
					+ "Pedigree: "+((Cane)m).getPedigree());
		}	
	}
	
}