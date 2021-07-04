
public class Test {
	int a = 5;
	
	void metodo1() {
		System.out.println(a);
		a = 10;
		System.out.println(a);
	}
	
	void metodo2() {
		System.out.println(a);
		a = 15;
		System.out.println(a);
	}
	
	void metodo3() {
		int a = 300;
		System.out.println(a);
	}
	
	void metodo4() {
		int a = 20;
		
		if(a == 20) {
			int b = 30;
		}
/*		System.out.println(b); <- il compilatore non è in grado di vedere il contenuto di b,
 * 	 	in quanto la variabile
		è visibile solo nell'implementazione della struttura condizionale (if) */
		
		while(a == 20) {
			int c = 40;
		}
//		System.out.println(c); <- qui vale lo stesso discorso.
		
		/* Conclusione: ogni implementazione, 
		 * ovvero ogni coppia di parentesi graffe definisce un ambito di visiblità (scope) */
		
		/*
		do {
			int d = 50;   
		} while(d == 50) <- stesso discorso, la condizione while è all'infuori del do
		*/
	}
	
}
