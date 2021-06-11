
public class Test {
	//un metodo void non ha la keyword "return"
	//void è un tipo di ritorno che indica che il metodo non ritorna alcun dato
	void servizio1() {
		System.out.println("Grazie per aver usato il servizio1!");
	}

	//il metodo seguente ha come tipo di ritorno String
	//questo significa che il metodo ritornerà un dato di tipo stringa
	String servizio2() {
		return "Grazie per aver usato il servizio2!";
	}

	//il metodo seguente ha come tipo di ritorno int
	//questo significa che il metodo ritornerà un dato di tipo int
	int servizio3() {
		return 5;
	}

	void servizio4() {
		servizio1();
	}

	//servizo1(); non posso chiamare questo metodo al di fuori di un altro metodo



}
