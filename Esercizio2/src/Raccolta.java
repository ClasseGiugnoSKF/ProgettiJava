
public class Raccolta {

	void contaWhile() {		
		int contatore = 1;
		while(contatore <= 10) {
			if((contatore % 2) == 0) {
				System.out.print(contatore + "\t");
			}
			contatore++;
		}
		System.out.println();
	}


	void contaFor() {
		for(int i = 1; i <= 10; i++) {
			if((i % 2) == 0) {
				System.out.print(i + "\t");
			}
		}
		System.out.println();
	}

	
	void contaContrarioDispariWhile() {
		int contatore1 = 10;
		while(contatore1 >= 1) {
			if((contatore1 % 2) == 1) {
				System.out.print(contatore1 + "\t");
			}
			contatore1--;
		}
		System.out.println();
	}

	
	void contaContrarioDispariFor() {
		for(int i = 10; i >= 1; i--) {
			if((i % 2) == 1) {
				System.out.print(i + "\t");
			}
		}
		System.out.println();
	}
	
	
	void confrontoVariabili() {
		int var1 = 75;
		int var2 = 36;
		if(var1 > var2) {
			System.out.println("Var1 è maggiore di Var2");
		} else if (var1 < var2) {
			System.out.println("Var1 è minore di Var2");
		} else System.out.println("Var1 e Var2 sono uguali");
	}
	
	
	void sommaConteggio() {
		int somma = 0;
		for(int i = 1; i <= 10; i++) {
			somma = somma + i;
		}
		System.out.println(somma);
	}
	
}
