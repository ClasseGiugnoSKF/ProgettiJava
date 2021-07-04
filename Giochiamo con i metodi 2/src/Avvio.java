import java.util.Scanner;
public class Avvio {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// oggetto/istanza di una classe (ambasciatore di una classe)
		// RaccoltaMetodi (classe) è un tipo reference
		RaccoltaMetodi rm = new RaccoltaMetodi();
		rm.metodo1();
		rm.metodo1Bis("Ciao", "Viktoria");
		rm.metodo1Tris("Ciao", "Pino", 20, true);
		int a = Integer.parseInt(s.nextLine());
		System.out.println(a);
	}

}
