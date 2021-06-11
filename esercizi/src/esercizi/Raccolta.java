package esercizi;

public class Raccolta {
	int contatore=1;
	
	void contaPari() {
		while(contatore<=10) {
			if(contatore%2==0) {
				System.out.println(contatore);
			}
			contatore++;
		}
	}
	
	void contaPari2() {
		for(contatore=1;contatore<=10;contatore++) {
			if(contatore%2==0) {
				System.out.println(contatore);
			}		
		}
	}
	
	void contaDispari1() {
		contatore=10;
		while(contatore>=1) {
			if(contatore%2!=0) {
				System.out.println(contatore);
			}
			contatore--;
		}
	}
	
	void contaDispari2() {
		for(contatore=10;contatore>=1;contatore--) {
			if(contatore%2!=0) {
				System.out.println(contatore);
			}	
		}
	}
	
	void confronto() {
		int num1=2;
		int num2=5;
		if (num1>num2){
			System.out.println("il maggiore è:"+num1);
			System.out.println("il minore è:"+num2);
		}
		else if(num1<num2){
			System.out.println("il maggiore è:"+num2);
			System.out.println("il minore è:"+num1);
		}	
		else {
			System.out.println("i numeri sono uguali");
		}
	}
	
	void somma() {
		int somma=0;
		for (contatore=1;contatore<=10;contatore++) {
			somma+=contatore;	
		}
		System.out.println(somma);
	}
}
