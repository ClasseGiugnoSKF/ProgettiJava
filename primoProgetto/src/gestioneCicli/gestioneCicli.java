package gestioneCicli;

public class gestioneCicli {

	public static void main(String[] args) {
		
		// In Java esistono 4 cicli: while, do-while, for, foreach.
		// Ciclo while
		
		/* while(condizione){
		 * 		istruzioni;
		 * }
		 */
		
		int contatore = 1;
		while(contatore <= 10) {
			System.out.println(contatore);
			contatore++;
		}
		
		// Ciclo do-while
		contatore = 1;
		do {
			System.out.println("do-while: "+contatore);
			contatore++;
		}while(false);
		
		while(contatore == 0) {
			System.out.println("Tanto non vengo letto.");
		}
		
		
		// Ciclo for
		/**
		 * for(inizializzazione, condizione, istruzione fine loop){
		 * 		istruzioni;
		 * }
		 * NB:
		 * step 1. inizializzo il contatore
		 * step 2. definisco la condizione
		 * step 3. leggo le istruzioni all'interno del for
		 * step 4. incremento di 1
		 */
		for(int i = 1; i<= 10;i++) {
			System.out.println(i);
		}

		
	}

}
