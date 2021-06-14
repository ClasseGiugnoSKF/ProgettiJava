
public class Avvio {

	public static void main(String[] args) {
		GestioneIO io = new GestioneIO();
		Calcolatrice calc  = new Calcolatrice();
		String risposta;
		String richiesta = "Inserisci un numero: ";
		do {
			switch(io.leggiStringa("Selezionare quale operazione eseguire. "
				+ "(Addizione/Sottrazione/Moltiplicazione/Divisione)").toLowerCase()) {
			case "addizione":
				String tre = io.leggiStringa("Vuoi inserire un terzo numero? (Si/No)");
				if(tre.equalsIgnoreCase("si")) {
					System.out.println(calc.addizione(io.leggiDecimale(richiesta)
							, io.leggiDecimale(richiesta), io.leggiDecimale(richiesta)));
				} else {
					System.out.println(calc.addizione(io.leggiDecimale(richiesta)
							, io.leggiDecimale(richiesta)));
				}
				break;
			case "sottrazione":
				String tre2 = io.leggiStringa("Vuoi inserire un terzo numero? (Si/No)");
				if(tre2.equalsIgnoreCase("si")) {
					System.out.println(calc.sottrazione(io.leggiDecimale(richiesta)
							, io.leggiDecimale(richiesta), io.leggiDecimale(richiesta)));
				} else {
					System.out.println(calc.sottrazione(io.leggiDecimale(richiesta)
							, io.leggiDecimale(richiesta)));
				}				
				break;
			case "moltiplicazione":
				String tre3 = io.leggiStringa("Vuoi inserire un terzo numero? (Si/No)");
				if(tre3.equalsIgnoreCase("si")) {
					System.out.println(calc.moltiplicazione(io.leggiDecimale(richiesta)
							, io.leggiDecimale(richiesta), io.leggiDecimale(richiesta)));
				} else {
					System.out.println(calc.moltiplicazione(io.leggiDecimale(richiesta)
							, io.leggiDecimale(richiesta)));
				}	
				break;
			case "divisione":
				String tre4 = io.leggiStringa("Vuoi inserire un terzo numero? (Si/No)");
				if(tre4.equalsIgnoreCase("si")) {
					System.out.println(calc.divisione(io.leggiDecimale(richiesta)
							, io.leggiDecimale(richiesta), io.leggiDecimale(richiesta)));
				} else {
					System.out.println(calc.divisione(io.leggiDecimale(richiesta)
							, io.leggiDecimale(richiesta)));
				}	
				break;
			default:
				io.stampaErrore("Errore! Scelta errata. Cliccare INVIO.");
			}
			risposta = io.leggiStringa("Vuoi continuare? (Si/No)");
		} while(risposta.equalsIgnoreCase("si"));
		
	}

}
