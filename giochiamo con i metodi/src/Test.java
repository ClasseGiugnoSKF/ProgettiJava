
public class Test {
	// Un metodo void non ha la keyword 'return'
	// void è un tipo di ritorno che indica che il metodo non ritorna alcun dato
	void servizio1() {
		System.out.println("Grazie per aver usato il servizio1");
	}
	
	// Il metodo ha come ritorno un dato di tipo String
	// questo significa che il metodo ritorna un dato di tipo Stringa
	String servizio2() {
		return "Grazie per aver usato il servizio2";
	}
	
	// Il metodo ha come ritorno un dato di tipo Int
	// questo significa che il metodo ritorna un dato di tipo Int
	int servizio3() {
		return 5;
	}
	
	void servizio4() {
		servizio1();
	}
//	servizio1(); <- non posso chiamare questo metodo all'infuori di un altro metodo
}
