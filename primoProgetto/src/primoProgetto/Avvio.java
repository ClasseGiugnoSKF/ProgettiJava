package primoProgetto;

public class Avvio {
	public static void main(String[] args) {
		System.out.println("Elenco di variabili dichiarate ed inizializzate");
		// tipi primitivi: numeri interi
		byte by = 127;
		short s = 128;
		int i = 987302;
		long l = 845623621;
		
		// tipi primitivi: numeri decimali
		double d = 9.3;
		float f = 43892.232f;
		
		// tipi primitivi: caratteri
		char c1 = 65;
		char c2 = 'A';
		System.out.println(c1);
		System.out.println(c2);
		/* il println permette di visualizzare sulla console il contenuto
			di una cella di memoria il println permette anche di visualizzare direttamente 
			i dati nudi e crudi */
		c1 = 97;
		/* effettuo l'aggiornamento del contenuto della variabile in quanto sostituisco
			il 65 con il 97 */
		System.out.println(c1);
		
		// tipi primitivi: booleani
		boolean b1 = true;
		boolean b2 = false;
		
		// esempio dichiariazione ed ini. costante
		final int INTERO = 876;

		// esempio di immutabilità della costante
		// INTERO = 900; <- da direttamente errore perchè una costante è finale
		
		// esempio di tipo reference anomalo: String
		
		String nominativo = "Pino Mauro";
		String stringaVuota = "";
		String stringaConSpazio = " "; /* attenzione a non confondere una stringa vuota con una con spazio (uno spazio è un carattere con
											un suo codice ASCII */
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		int a = 5;
		a = a+a;
		/* quando ci ritroviamo davanti un'equazione come quella di sopra
		 * ci dobbiamo sempre aspettare due cose ovvero; a sinistra dell'uguale
		 * ci sia una cella aperta (che attende l'inserimento di un dato)
		 * mentre alla destra dell'uguale abbiamo un dato da inserire;
		 * in questo caso quindi, a sinistra abbiamo una cella identificata con la lettera 'a'
		 * che attende un dato in ingresso, mentre a destra sommiamo il contenuto stesso della
		 * cella identificata come 'a'
		 **/
		System.out.println(a);
		a = a+a;
		System.out.println(a);
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		int b = 17;
		b = b+3;
		// a sinistra b è la cella mentre a destra con b intendiamo il contenuto della cella a cui sommiamo 3
		System.out.println(b);
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		int n1 = 23;
		int n2 = 17;
		int risultato = n1 + n2;
		System.out.println(risultato);
		System.out.println(n1+n2);
		System.out.println(23+17);
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		int num1 = 29;
		double num2 = 7.8;
		int interoArrotondato = num1+(int)num2; // il cast farà sempre un'arrotondamento per difetto
		System.out.println(interoArrotondato);
		System.out.println(num1+num2);
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		int numero1 = 8;
		int numero2 = 3;
		// il compilatore se vede che facciamo una divisione tra due dati dello stesso tipo, quindi nel caso di due int, arrotonda per difetto
		System.out.println(numero1/numero2);
		System.out.println((double)numero1/numero2);
		
	}
}