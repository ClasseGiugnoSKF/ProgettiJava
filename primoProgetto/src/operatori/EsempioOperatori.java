package operatori;

public class EsempioOperatori {

	public static void main(String[] args) {
		int a = 5;
		// somma esplicita
		a = a + 7;
		System.out.println(a);
		
		// somma con l'operatore unario +=
		a += 3; // equivalente dell'espressione a = a + 3
		System.out.println(a);
		
		// esempio di post-incremento
		a++; // equivalente dell'espressione a = a + 1
		System.out.println(a);
		
		// esempio di pre-incremento
		++a;
		System.out.println(a);
		
		//////////////////////////////////////////////
		
		int b = 3;
		System.out.println(b++); // il compilatore legge da sinistra verso destra, quindi prima visualizza
									// il contenuto di b e poi lo incrementa
		System.out.println(b);
		
		int c = 9; // il compilatore, in questo caso, prima incrementa e poi visualizza
		System.out.println(++c);
		
		// nota bene: si parla di incremento/decremento quando si aggiunge o si toglie 1;
		// si parla invece di totalizzatore quando aggiungi o togli un valore diverso da 1
		// esempio di totalizzatore:
		
		c = c + 11;
		
		//////////////////////////////////////////////
		
		// esempi di operatori relazionali
		
		int n1 = 8;
		int n2 = 10;
		
		System.out.println(n1 == n2);
		System.out.println(n1 > n2);
		System.out.println(n1 < n2);
		System.out.println(n1 >= n2);
		System.out.println(n1 <= n2);
		System.out.println(n1 != n2);
		
		// esempi di operatori logici
		
		System.out.println(n1 == n2 && n1 > n2 && n1 != n2); // siccome l'operatore AND è più restrittivo
		// basta un falso per avere tutto falso
		
		System.out.println(n1 == n2 || n1 > n2 || n1 != n2); // siccome l'operatore OR è meno restrittivo
		// basta un vero per avere tutto vero
		
		System.out.println(n1 == n2 && n1 > n2 || n1 != n2);
		
		System.out.println(n1 != n2 && n1 > n2 || n1 == n2);
		
		//////////////////////////////////////////////

		int valoreDaValutare = 15;
		
		if(valoreDaValutare > 15){
			System.out.println("Il valore è maggiore di 15");
		}

		if(valoreDaValutare >= 15){
			System.out.println("Il valore è maggiore o uguale di 15");
		}
		
		if(valoreDaValutare > 3 && valoreDaValutare < 20){
			System.out.println("Il valore è compreso tra 3 e 20 (esclusi)");
		}
		
		if(valoreDaValutare >= 15 && valoreDaValutare <= 20){
			System.out.println("Il valore è compreso tra 15 e 20 (compresi)");
		}
		
		if(valoreDaValutare < 16 || valoreDaValutare > 100){
			System.out.println("Il valore o è minore di 16 oppure maggiore di 100");
		}
		
		// aggiorno il contenuto di valoreDaValutare
		valoreDaValutare += 87;
		
		if(valoreDaValutare < 16 || valoreDaValutare > 100){
			System.out.println("Il valore o è minore di 16 oppure maggiore di 100");
		}
		
		// ampliamo la struttura condizionale con l'aggiunta di else if
		
		if(valoreDaValutare > 16 && valoreDaValutare < 20){
			System.out.println("Il valore è maggiore di 16 e minore di 20");
		} else if(valoreDaValutare >= 15 && valoreDaValutare <= 200){
			System.out.println("Il valore è compreso tra 15 e 200 (inclusi)");
		}
		// nota bene: solo uno dei blocchi di codice della struttura condizionale può essere letta
		// ma non entrambi
		
		if(valoreDaValutare > 16 && valoreDaValutare < 20){
			System.out.println("Il valore è maggiore di 16 e minore di 20");
		} else if(valoreDaValutare >= 20 && valoreDaValutare <= 30){
			System.out.println("Il valore è compreso tra 20 e 30 (inclusi)");
		} else {
			System.out.println("Il valore è maggiore di 30");
		}
		// nota bene: l'else si attiva a prescindere nel caso in cui le condizioni sovrastanti dovessero
		// risultare false
		
		// conclusione: una struttura condizionale non ammetterà la lettura di più di un blocco di codice;
		// si attiverà solo una delle possibili condizioni o l'else per esclusione
		
		valoreDaValutare = 10;
		
		if(valoreDaValutare > 10) {
			System.out.println("Il valore è maggiore di 10");
		} else if(valoreDaValutare == 10) {
			System.out.println("Il valore corrisponde a 10");
		} else if(valoreDaValutare != 10 || valoreDaValutare < 10) {
			System.out.println("Il valore o è diverso o minore di 10");
		} else if(valoreDaValutare > 100) {
			System.out.println("Il valore è maggiore di 100");
		} else {
			System.out.println("Mi attivo solo se nessuna delle condizioni di sopra sono vere");
		}
		
		//////////////////////////////////////////////

		// switch-case
		int opzione = 245;
		// le graffe vengono dette o blocco o implementazione
		switch(opzione) {
			case 1:
				System.out.println("opzione 1");
				break;
			case 2:
				System.out.println("opzione 2");
				break;
			case 3:
				System.out.println("opzione 3");
				break;
			default:
				System.out.println("l'opzione scelta non è tra quelle considerate");
		}
	}

}
