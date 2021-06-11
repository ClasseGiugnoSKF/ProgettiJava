package esercizi;

public class Esercizi {

	public static void main(String[] args) {
		byte scelta = 1;
		Raccolta r = new Raccolta();
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

	}

}
