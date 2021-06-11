package esercizi;
import java.util.Scanner;

public class Esercizi {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		Raccolta r = new Raccolta();
		String risposta;
		do {
			r.menu();
			System.out.println("Scegli un'opzione: ");
			byte scelta = Byte.parseByte(i.nextLine());
			switch(scelta) {
			case 1:
				r.contaFor();
				r.contaWhile();
				break;
			case 2:
				r.contaForDispari();
				r.contaWhileDispari();
				break;
			case 3:
				r.confronto();
				break;
			case 4:
				r.contaSomma();
				break;
			default:
				System.out.println("Scegliere tra 1 / 2 / 3 / 4");
			}
			System.out.println("Continuare? (si/no)");
			risposta = i.nextLine();
		}while(risposta.equalsIgnoreCase("si"));
	}

}
