package esercizi;

public class Esercizi {

	public static void main(String[] args) {
		// esercizio 1
		
		double d = 2.3;
		d=(int)d;
		int dArrotondato= (int)d;
	
		System.out.println(dArrotondato==d);
		
		// esercizio 2
		
		if ( dArrotondato >= 5 && dArrotondato <= 30 ) {
			System.out.println("il valore è compreso tra 5 e 30");
		}
		
		else {
			System.out.println("il valore non è compreso tra 5 e 30");
		}
		
		// esercizio 3 primo syso: 6 secondo: 8 terzo: 7
		int a = 7;
		--a;
		System.out.println(a++);
		++a;
		a--;
		a++;
		System.out.println(a--);
		System.out.println(a);
	
		// esercizio 4 
		int a1=0;
		a1= a1+1; 
		System.out.println(a1);
		a1+=1;
		System.out.println(a1);
		a1++;
		System.out.println(a1);
		
		// esercizio 5 confronto 2 valori interi e stampo il maggiore
		int num1=4;
		int num2=5;
		
		if (num1>num2){
			System.out.println(num1);
		}
		
		else {
			System.out.println(num2);
		}	
		
	}

}
