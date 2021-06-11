package esercizi;

public class Raccolta {
	byte b;
	void contaWhile() {
		b = 1;
		while(b<=10) {
			if(b%2 == 0) {
				System.out.println(b);
			}
			b++;
		}		
	}
	
	void contaFor() {
		for(b=1;b<=10;b++) {
			if(b%2 == 0) {
				System.out.println(b);
			}
		}
	}
	
	void contaWhileDispari() {
		b = 10;
		while(b>=1) {
			if(b%2 == 1) {
				System.out.println(b);
			}
			b--;
		}		
	}
	
	void contaForDispari() {
		for(b=10;b>=1;b--) {
			if(b%2 == 1) {
				System.out.println(b);
			}
		}		
	}
	
	void confronto() {
		byte k = 5;
		b = 1;
		if(b == k) {
			System.out.println("Sono uguali.");
		} else if(b > k) {
			System.out.println("Il valore dentro b è maggiore di quello in k.");
		} else {
			System.out.println("Il valore dentro b è minore di quello in k.");
		}
	}
	
	void contaSomma() {
		b = 0;
		for(byte i=1;i<=10;i++) {
			System.out.println(b+=i);
		}
	}
}
