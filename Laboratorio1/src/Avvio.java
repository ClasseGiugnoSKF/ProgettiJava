
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
			case 13:
				a.sommaCoppie();
				break;
			case 14:
				a.vocaliRipetizione();
				break;
			case 15:
				a.vocaliSenzaRipetizioni();
				break;
			case 16:
				a.contaVocali();
				break;
			case 17:
				a.sostituisciLettera();
				break;
			case 18:
				a.lettereAlfabeto();
				break;
			case 19:
				a.lettereAlfabeto2();
				break;
			case 20:
				a.lettereAlfabeto3();
				break;
			case 21:
				a.stampaAsterischi1();
				break;
			case 22:
				a.stampaAsterischi2();
				break;
			case 23:
				a.ricercaLineare();
				break;
			case 24:
				a.ricercaBinaria();
				break;
			case 25:
				a.contaAvantiIndietro(4, 10);
				a.contaAvantiIndietro(15, 5);
				break;
			default:
				g.stampaErrore("Attenzione! L'opzione non è valida.");
			}
			
		}while(g.leggiString("\nVuoi continuare?(si/no)").equalsIgnoreCase("si"));
	
		g.stampa("Fine programma!");
	}

}
