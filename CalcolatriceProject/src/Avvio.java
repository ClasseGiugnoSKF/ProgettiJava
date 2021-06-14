
public class Avvio {

	public static void main(String[] args) {

		GestioneIO g = new GestioneIO();
		Calcolatrice c = new Calcolatrice();
		String risposta = "";
		int numeroOperatori = 0;
		double operatore1 = 0.0;
		double operatore2 = 0.0;
		double operatore3 = 0.0;
				
		do {
			g.menu();
			switch(g.leggiIntero("Inserisci opzione:")) {
			case 1:
				numeroOperatori = g.leggiIntero("Vuoi sommare due o tre valore? (2/3)");
				operatore1 = g.leggiDecimale("Operatore1: ");
				operatore2 = g.leggiDecimale("Operatore2: ");
				if(numeroOperatori == 3) {
					operatore3 = g.leggiDecimale("Operatore3: ");
					g.stampa(c.somma(operatore1, operatore2, operatore3));
				} else {
					g.stampa(c.somma(operatore1, operatore2));
				}
				break;
				
			case 2:
				numeroOperatori = g.leggiIntero("Vuoi sottrarre due o tre valore? (2/3)");
				operatore1 = g.leggiDecimale("Operatore1: ");
				operatore2 = g.leggiDecimale("Operatore2: ");
				if(numeroOperatori == 3) {
					operatore3 = g.leggiDecimale("Operatore3: ");
					g.stampa(c.sottrazione(operatore1, operatore2, operatore3));
				} else {
					g.stampa(c.sottrazione(operatore1, operatore2));
				}				
				break;
				
			case 3:
				numeroOperatori = g.leggiIntero("Vuoi dividere due o tre valore? (2/3)");
				operatore1 = g.leggiDecimale("Operatore1: ");
				operatore2 = g.leggiDecimale("Operatore2: ");
				if(numeroOperatori == 3) {
					operatore3 = g.leggiDecimale("Operatore3: ");
					g.stampa(c.divisione(operatore1, operatore2, operatore3));
				} else {
					g.stampa(c.divisione(operatore1, operatore2));
				}
				break;
				
			case 4:
				numeroOperatori = g.leggiIntero("Vuoi moltiplicare due o tre valore? (2/3)");
				operatore1 = g.leggiDecimale("Operatore1: ");
				operatore2 = g.leggiDecimale("Operatore2: ");
				if(numeroOperatori == 3) {
					operatore3 = g.leggiDecimale("Operatore3: ");
					g.stampa(c.moltiplicazione(operatore1, operatore2, operatore3));
				} else {
					g.stampa(c.moltiplicazione(operatore1, operatore2));
				}				
				break;
				
			default:
				g.stampaErrore("L'opzione inserita non è valida!");
			}
			risposta = g.leggiStringa("Vuoi continuare? (si/no)");
		}while(risposta.equalsIgnoreCase("si"));
	}

}
