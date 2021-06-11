
public class Test {
	
	//Un metodo void non ha  la keyword "return"
	//Void è un tipo di ritorno che indica che il metodo non ritorna alcun dato
				void servizio1 () {
			System.out.println("Grazie per aver utilizzato il servizio1");
		}
	//Il metodo seguente ha come tipo di ritorno "String"
	//Questo significa che il metodo ritorna  un tipo di  dato stringa
		String servizio2() {
				return "Grazie per aver utilizzato il servizio2";
			}
	//Il metodo seguente ha come tipo di ritorno "Int"
	//Questo significa che il metodo ritorna  un tipo di  dato int
			int servizio3() {
				return 5;
				
			}
			void servizio4()  {
				servizio1();
				}
			//servizio1(); non posso chiamare questo metodo al di fuori di un altro metodo
		}

