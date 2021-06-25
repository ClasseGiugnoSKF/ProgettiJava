package model;

public class Operazioni {

	public void passaggioPerValore(int valore) {
		valore = 10;
		System.out.println("Intero1 nel metodo: " + valore);
	}
	
	public void passaggioPerValore(Integer valore) {
		valore = 10;
		System.out.println("Intero2 nel metodo: " + valore);
	}
	
	public void passaggioPerValore(String parola) {
		parola = "Ciao";
		System.out.println("Parola nel metodo: " + parola);
	}

	public void passaggioPerRiferimento(Persona p) {
		p.setNome("Rosa");
		p.setCognome("Palmentieri");
		System.out.println("Persona nel metodo: " + p);
	
	}
	
	
}
