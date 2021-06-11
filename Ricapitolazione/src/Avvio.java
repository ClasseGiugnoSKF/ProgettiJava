//Ricapitolazione

public class Avvio {

	public static void main(String[] args) {

		System.out.println("Ciao a tutti!");
		
		String contenitore = "Ciao a tutti!";
		System.out.println(contenitore);		//Stampa il contenuto della
												//variabile contenitore.
		int numero1 = 10;
		int numero2 = 4;
		System.out.println(numero1/numero2);
		System.out.println((double)numero1/numero2);
		double d = (double)numero2;
		System.out.println(d);
	
		byte b = (byte)d;
		System.out.println(b);
		
		//Operatori unari
		//+=, -=, /=, *=, %=
		int a = 15;
		int c = 2;
		System.out.println("Operatore %: " + a%c);
		int x = a + 2;
		System.out.println(x);
		a = a + 5;
		a += 5;
		System.out.println(a++);
		System.out.println(++a);
		a--;
		--a;
		
		//Operatori relazionali.
		//==,<,>,>=,<=,!=
		int num1 = 5;
		int num2 = 7;
		System.out.println(num1 > num2);
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		System.out.println(num1 < num2);
		
		//Operatori logici.
		//AND (&&), OR (||), NOT (!)
		boolean bool = true;
		
		System.out.println(!bool);
		if(num1 != num2 || num1 > num2) {
			System.out.println("num1 diverso da num2 oppure num1 maggiore di num2");
		}
		
	}

}
