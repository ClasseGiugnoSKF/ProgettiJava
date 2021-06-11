
public class Avvio {
	public static void main(String[] args) {
		/* creo un oggetto della classe Test per poter chiamare nel metodo
		 * main una funzionalità qualsiasi della classe Test stessa */
		Test ambasciatore = new Test();
		ambasciatore.servizio1();
		System.out.println(ambasciatore.servizio2());
		System.out.println(ambasciatore.servizio3());
		ambasciatore.servizio4();
	}
}
