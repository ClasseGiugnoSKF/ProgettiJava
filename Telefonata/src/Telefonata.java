import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Telefonata {

	Scanner scan = new Scanner(System.in);
	
	String[] rubrica() {
		String [] rubricaNumeri = {"3892018374", 
				"3331845109", "3351749220", 
				"3395678199", "3338901873", "3895656777"};
		return rubricaNumeri;
	}
	
	void stampaRubrica() {
		for(int i=0; i<rubrica().length; i++) {
			System.out.println(rubrica()[i]);
		}
	}
	
	boolean cercaNumero(String numeroCercato) {
		boolean numeroTrovato = false;
		for(int i=0; i<rubrica().length; i++) {
			if(numeroCercato.equals(rubrica()[i])) {
				numeroTrovato = true;
				break;
			}
		}
		return numeroTrovato;
	}
	
	boolean composizioneNumero() {
		Random r = new Random();
		return r.nextBoolean();
	}
	
	String comunicaMessaggio() {
		return scan.nextLine();
	}
	
	void richiama() throws InterruptedException {
		//Imposto attesa di 5 secondi tra una chiamata e l'altra.
		System.out.println("Attendiamo 5 secondi.");
		System.out.println(". . .");
		TimeUnit.SECONDS.sleep(5);
	}
	
}
