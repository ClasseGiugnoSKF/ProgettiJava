package utility;

public class Raccolta {

	int contatore = 1;
	int contatore2 = 10;
	int somma = 0;
	
	public void menu() {
		System.out.println("****MENU****");
		System.out.println("1) conta da 1 a 10 con il ciclo while");
		System.out.println("2) conta da 1 a 10 con il ciclo for");
		
	}

	public void contaWhile() {
		while(contatore <= 10) {
			if(contatore % 2 == 0)
				System.out.println(contatore);
			contatore++;
		}
	}

	public void contaFor() {
		for(int x = 1; x <= 10; x++) {
			if(x % 2 == 0)
				System.out.println(x);					
		}
	}

	public void contaWhile2() {
		while(contatore2 >= 1) {
			if(contatore2 % 2 != 0)
				System.out.println(contatore2);
			contatore2--;
		}
	}

	public void contaFor2() {
		for(int x = 10; x >= 1; x--) {
			if(x % 2 != 0)
				System.out.println(x);
		}
	}

	public void contaMaggiore() {
		if(contatore > contatore2) {
			System.out.println("contatore è maggiore di contatore2");								
		}else if(contatore < contatore2) {
			System.out.println("contatore2 è maggiore di contatore");
		}else {
			System.out.println("i due contatori hanno valore uguale");
		}
	}

	public void contaSomma() {		
		for(int a = 1; a <= 10; a++) {
			System.out.println(a);
			somma += a;
		}
		System.out.println(somma);
	}
}
