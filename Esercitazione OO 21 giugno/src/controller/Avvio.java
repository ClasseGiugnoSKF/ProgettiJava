package controller;
import model.*;

public class Avvio {

	public static void main(String[] args) {
		Studente s1 = new Studente("Peppe", "Mauro", 17, "Chieti", "MRAPPP04A01C632W");
		Studente s2 = new Studente("Paolino", "Di Firenze", 17, "Chieti", "DFRPLN04A01C632F");
		Motorino m1 = new Motorino("D&G", "AXSH92SL", "Nero");
		Motorino m2 = new Motorino("CHEV", "ADS2A2SL", "Rosso");

		
		s1.stampaStudente();
		m1.setProprietario(s1);
		System.out.println("*************");
		m1.stampaMotorino();
		
		System.out.println("#####################################");
		
		s2.stampaStudente();
		m2.setProprietario(s2);
		System.out.println("*************");
		m2.stampaMotorino();
		
		/** DOMANDE E RISPOSTE
		 * 
		 * 1) Differenza tra: modificatore d'accesso public, private e default 
		 * 		
		 * 		Un modificatore d'accesso public rimuove ogni livello di protezione da, per esempio, una variabile
		 * 		d'istanza. Può essere pericoloso perchè potrebbe permette la manipolazione del flusso di dati.
		 *		
		 *		Un modificatore d'accesso private è la protezione massima e blocca l'accesso diretto
		 *		a variabili o metodi con tale modificatore ad eccezione della stessa classe d'appartenenza.
		 *		
		 * 		Un modificatore d'accesso private è una protezione intermedia e blocca l'accesso diretto
		 *		a variabili o metodi con tale modificatore ad eccezione di classi all'interno dello stesso
		 * 		package d'appartenenza.
		 *
		 * 2) Differenza tra variabile di classe e variabile d'istanza 
		 * 
		 * 		Una variabile di classe è una variabile statica, appartenente alla classe stessa e non ai singoli
		 * 		oggetti.
		 * 
		 * 		Una variabile d'istanza è una variabile non-statica, appartiene all'oggetto in generale
		 * 		ma che a differenza della variabile di classe, è unica e potenzialmente diversa
		 * 		per ogni singolo oggetto.
		 * 
		 * 3) Significato della keyword this 
		 * 
		 * 		La keyword this va letteralmente a significare 'questo' e concettualmente si riferisce
		 * 		a 'questo oggetto' quindi del singolo oggetto. this può essere utile nei getter e setter oppure
		 * 		nei costruttori parametrizzati per distinguire dati in entrata e le celle che contengono 
		 * 		gli attributi dell'oggetto.
		 * 
		 * 4) Che cosa è un costruttore di default
		 * 
		 *		Un costruttore di default è il costruttore creato dal compilatore in mancanza di un costruttore
		 *		implicito scritto dall'utente. Viene creato perchè c'è necessariamente bisogno di un
		 *		costruttore per far in modo che all'oggetto venga allocata un'area di memoria nella Heap Memory.
		 *
		 * 5) Differenza tra il costruttore di default e quello senza argomenti fatto dal programmatore
		 * 
		 * 		Anatomicamente essi, sono vuoti e quindi a quel livello uguali. Però concettualmente, uno è
		 * 		di default e quindi non visibile, perchè creato dal compilatore. Quello creato dal programmatore
		 * 		è invece visibile perchè scritto all'interno di una classe stessa.
		 *
		 *		Però un costruttore di default non verrà creato se è presente già un costruttore
		 *		parametrizzato o meno dal programmatore.
		 * 
		 * 6) Definizione di classe model (spiegare il perchè dei setter e dei getter)
		 * 
		 * 		La classe model serve a rappresentare un singolo oggetto, o un'entità sulla quale vogliamo operare.
		 * 		Potrebbe essere una classe chiamata Impiegati o Clienti o Prodotti e così via. Una classe model
		 * 		ha spesso o variabili di classe o di istanza, per singolo oggetto. Tali possono avere un diverso
		 * 		livello di accesso a seconda dai modificatori dati dal programmatore. Se si lavora con dati sensibili,
		 * 		per esempio i dati di una persona per una classe model di Persone, si utilizzerà il modificatore private.
		 * 		
		 * 		Il modificatore private ha un alto tasso di protezione, però chiude anche l'accesso da parte di altre
		 * 		classi il che sarebbe problematico per un programmatore, se non fosse per i getter e setter. I getter
		 * 		e setter fanno letteralmente da funzione di "get" o "set" (prendere o impostare), in modo da recuperare
		 * 		il valore di un attributo A di un'oggetto oppure di impostare / aggiornare il contenuto di un attributo A.
		 * 		
		 * 		I getter e setter sono metodi scritti all'interno della classe d'interesse, essi al contrario degli
		 * 		attributi con cui lavorano, utilizzano il modificatore public in modo da essere utilizzabili.
		 * 
		 * 7) Indicare i nomi delle aree di memoria gestite della JVM 
		 * 	
		 * 		Method Area è la memoria che si occupa delle Classi e di variabili di classe/statiche.
		 * 
		 * 		Heap Memory è la memoria che si occupa degli oggetti e di variabili d'istanza/non statiche.
		 * 
		 * 		Stack Memory è la memoria dedicata ai metodi.		
		 * 
		 * */
		
		
	}

}
