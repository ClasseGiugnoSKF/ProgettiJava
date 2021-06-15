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
			default:
			}
			io.domanda("Vuoi Continuare(SI/NO)");
		}while(io.leggiStringa().equalsIgnoreCase("si"));
		io.domanda("Il programma è terminato.");
	}
}
