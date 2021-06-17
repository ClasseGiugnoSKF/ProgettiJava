import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		gestioneIO io = new gestioneIO();
		Scanner s = new Scanner(System.in);
		raccoltaMetodi rm = new raccoltaMetodi();
		do {
			io.menu();
			switch(io.leggiIntero()) {

			case 1:
				rm.contatore();
				break;
			case 2:
				rm.vettore();
				break;
			case 3:
				rm.vettore2();
				break;
			case 4:
				rm.sommaMedia();
				break;
			case 5:
				rm.stringaPalindroma();
				break;
			case 6:
				rm.cercaUtente();
				break;
			case 7:
				rm.swap();
				break;
			case 8:
				rm.listaOrdinata();
				break;
			case 9:
				rm.alfabeto();
				break;
			case 10:
				rm.alfabetoASCII();
				break;
			case 11:
				rm.fibonacci();
				break;
			case 12:
				rm.testASCII();
				break;
			case 13:
				rm.sommaVettori();
				break;
			case 14:
				rm.estraiVocali();
				break;
			case 15:
				rm.estraiVocali2();
				break;
			case 16:
				rm.contaVocali();
				break;
			case 17:
				rm.letteraSostituita();
				break;
			case 18:
				rm.vettoreAlfabeto();
				break;
			case 19:
				rm.vettoreAlfabeto2();
				break;
			case 20:
				rm.vettoreAlfabeto3();
				break;
			case 21:
				rm.asterischi();
				break;
			case 22:
				rm.asterischi2();
				break;
			case 23:
				rm.conta();
				break;
			case 24:
				rm.matriceTabellina();
				break;
			case 25:
				rm.matriceGiorni();
				break;
			case 26:
				rm.matriceSlide();
				break;
			case 27:
				rm.matrice123();
				break;
			case 28:
				rm.Rosa();
				break;
			case 29:
				rm.matrice4x3();
				break;
			case 30:
				rm.Viktoria();
				break;
			case 31:
				rm.Viktoria2();
				break;
			default:
			}
			io.domanda("\nVuoi Continuare(SI/NO)");
		}while(io.leggiStringa().equalsIgnoreCase("si"));
		io.domanda("Il programma è terminato.");
	}
}
