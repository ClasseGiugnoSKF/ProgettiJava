
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
			default:
				g.stampaErrore("Attenzione! L'opzione non è valida.");
			}
			
		}while(g.leggiString("Vuoi continuare?(si/no)").equalsIgnoreCase("si"));
	
		g.stampa("Fine programma!");
	}

}
