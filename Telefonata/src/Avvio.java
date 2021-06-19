import java.util.Scanner;

public class Avvio {

	public static void main(String[] args) {

		Telefonata t = new Telefonata();
		Scanner scan = new Scanner(System.in);
		
		//Mostro la rubrica.
		System.out.println("La rubrica contiene i seguenti numeri:");
		t.stampaRubrica();
		
		//Richiesta numero da chiamare.
		System.out.println("Inserisci il numero da chiamare:");
		String numeroDaChiamare = scan.nextLine();
		int numeroChiamate = 0;
		boolean numeroOccupato = true;
		
		//Ricerca numero in rubrica.
		if(t.cercaNumero(numeroDaChiamare)) {
			//Composizione numero.
			System.out.println("Compongo il numero ...");
			do {
				if(t.composizioneNumero()) {
					//Comunico messaggio
					System.out.println("Qualcuno ha risposto.");
					System.out.println("Inserisci l'informazione da comunicare:");
					System.out.println("Il messaggio comunicato è: " + t.comunicaMessaggio());
					numeroOccupato = false;
					break;
				} else {
					try {
						//Richiamo
						System.out.println("Il numero risulta occupato.");
						System.out.println("Faccio un altro tentativo di chiamata");
						t.richiama();
						numeroChiamate++;
					}catch(InterruptedException e) {
						System.out.println("Eccezione InterruptException");
					}
				}
			}while(numeroOccupato && numeroChiamate<3);
		}else{
			System.out.println("Il numero cercato non è presente in rubrica.");
		}
		
		System.out.println("Telefonata terminata.");
		scan.close();
		
	}

}
