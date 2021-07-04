import java.util.Scanner;
public class Avvio {

	public static void main(String[] args) {
		
//		Test t = new Test();
//		t.visualizzaVettore();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci la dimensione del vettore: ");
		String[] nominativi = new String[Integer.parseInt(input.nextLine())];
		for(int i=0;i<nominativi.length;i++) {
			System.out.println("Inserisci nominativo n."+(i+1)+":");
			nominativi[i]=input.nextLine();
		}
		System.out.println("La dimensione del vettore è pari a: "+nominativi.length);
		for(int i=0;i<nominativi.length;i++) {
			System.out.print(nominativi[i]+" ");
		}
	}

}
