
public class RaccoltaMetodi {
	
	void metodo1() {
		System.out.println("Ciao a tutti!!!");
		// void -> non c'è la keyword return
	}
	
	void metodo1Bis(String saluto, String nome) {
		System.out.println(saluto+" "+nome);
	}
	
	// Maschio: true, Femmina: false
	void metodo1Tris(String saluto, String nome, int eta, boolean sesso) {
		String sessoStringa;
		if(sesso) {
			sessoStringa = "Maschile";
		} else {
			sessoStringa = "Femminile";
		}
		System.out.println("****"+saluto+" "+nome+", di anni: "+eta+
				", di sesso: "+sessoStringa+"****");
	}
	
	// Un metodo che ritorna un dato, diventa egli stesso il dato ritornato
	String metodo2() {
		return "Ciao a tutti!!!";
	}
	
	int metodo3() {
		return 113;
	}
	
	boolean metodo4() {
		return true;
	}
}
