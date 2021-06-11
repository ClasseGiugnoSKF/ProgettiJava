
public class Avvio {

	public static void main(String[] args) {
		
		//Creo un oggetto della classe test per poter chiamare
		//nel metodo main() una funzionalità qualsiasi della
		//classe Test stessa.
		Test ambasciatore = new Test();
		ambasciatore.servizio1();
		ambasciatore.servizio2();
		ambasciatore.servizio3();
		ambasciatore.servizio4();
		
		System.out.println(ambasciatore.servizio2());
		System.out.println(ambasciatore.servizio3());
		
	}

}
