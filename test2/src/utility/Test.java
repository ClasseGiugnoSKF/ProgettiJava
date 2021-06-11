package utility;

public class Test {
	public void contaWhile () {
		int contatore = 1;
		while (contatore <= 10) {
			System.out.println(contatore++);
		}
	}
	
	public void contaFor ( ) {
		for (int contatore = 1; contatore <= 10; contatore++) {
			System.out.println(contatore);
			
		}
	}
public void saluto ( ) {
	System.out.println("Ciao mondo");
}
public void somma ( ) {
	int num1 = 2;
	int num2 = 3;
	System.out.println(num1 + num2);
}
public void divisione () {
	int num1 = 10;
	int num2 = 3;
	System.out.println((double)num1 / num2);
}
public int sommaRitornata () {
	int num1 = 2;
	int num2 = 3;
	return num1 + num2;
}
}
