//Tale classe deve offrire dei servizi, metodi.

public class Test {

	//Un metodo void non ha la keyword "return".
	//void � un tipo di ritorno che indica che il metodo non ritorna
	//nessun dato.
	void servizio1() {
		System.out.println("Grazie per aver usato il servizio1");
	}
	
	//Il metodo seguente ha come tipo di ritono string. Nei metodi
	//String � sempre un tipo di dato, ma nello specifico indica il
	//tipo di dato che ritorna il metodo.
	String servizio2() {
		return "Grazie per aver usato il servizio2";		
	}
	
	//Il metodo seguente ha come tipo di ritono int. Nei metodi
	//Int � sempre un tipo di dato, ma nello specifico indica il
	//tipo di dato che ritorna il metodo.
	int servizio3() {
		return 5;
	}
	
	void servizio4() {
		servizio1();
	}
	
}
