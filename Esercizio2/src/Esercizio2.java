
public class Esercizio2 {

	public static void main(String[] args) {

		Raccolta r = new Raccolta();
		
		int opzione = 1;
		
		switch(opzione) {
		case 1:
			//Esercizio 1: Conta da 1 a 10 stampando solo i numeri pari
			
			//Soluzione while:
			r.contaWhile();
			//Soluzione for:
			r.contaFor();
			break;
			
		case 2:
			//Esercizio 2: Conta da 10 a 1 stampando solo i numeri dispari
			
			//Soluzione while:
			r.contaContrarioDispariWhile();
			//Soluzione for:
			r.contaContrarioDispariFor();
			break;
			
		case 3:
			//Esercizio 3: Dichiarare due variabili intere e confrontarle per
			//capire quale delle due è maggiore, minore o se sono uguali.
			r.confrontoVariabili();
			break;
			
		case 4:
			//Esercizio 4: Fai la somma dei valori contati da 1 a 10 sfruttando
			//il ciclo for.
			r.sommaConteggio();
			break;
			
		default:
			System.out.println("L'opzione inserita non è tra quelle considerate.");
		}
		
	}

}
