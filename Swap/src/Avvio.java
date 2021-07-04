
public class Avvio {

	public static void main(String[] args) {

		int a = 4;
		int b = 17;
		
		System.out.println("a prima: "+a);
		System.out.println("b prima: "+b);
		
		int temp = a;
		
		a = b;
		b = temp;
		
		System.out.println("a dopo: "+a);
		System.out.println("a dopo: "+b);
		
	}

}
