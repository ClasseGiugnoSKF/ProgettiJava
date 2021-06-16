
public class Avvio {

	public static void main(String[] args) {

		Algoritmi a = new Algoritmi();
		GestioneIO g = new GestioneIO();
		
		do {
			g.menu();
			switch(g.leggiIntero("Scegli un'opzione:")) {
			case 1:
				a.conta();
				break;
			case 2:
				a.stampaPariDispari();
				break;
			case 3:
				a.minMax();
				break;
			case 4:
				a.sommaMedia();
				break;
			case 5:
				a.stringaPalindroma();
				break;
			case 6:
				a.cercaNominativo();
				break;
			case 7:
				a.swap();
				break;
			case 8:
				a.ordinamentoSwap();
				break;
			case 9:
				a.alfabeto();
				break;
			case 10:
				a.alfabetoAscii();
				break;
			case 11:
				a.alfabetoAsciiVariante();
				break;
			case 12:
				a.successioneFibonacci();
				break;
			default:
				g.stampaErrore("Attenzione! L'opzione non è valida.");
			}
			
		}while(g.leggiString("\nVuoi continuare?(si/no)").equalsIgnoreCase("si"));
	
		g.stampa("Fine programma!");
	}

}
