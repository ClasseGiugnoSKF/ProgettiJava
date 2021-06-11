package esercizi;

public class Esercizi2 {

	public static void main(String[] args) {
		// programma contrario che data una
		 //stringa la stampa al contrario es: ciao stampato al contrario
		
		String stringa = "deserto";
	    char[] car = stringa.toCharArray();
	      for(int i = car.length - 1; i >= 0; i--)
	         System.out.print(car[i]);
		
	     // programma che data  una stringa, se essa comincia con la lettera maiuscola
	     // la stampa, altrimenti no
	      
	    String stringa1 = "Ciao mondo";
	    if(stringa1.charAt(0)>= 65 && stringa1.charAt(0)<=90) {
	    	System.out.println(stringa1);
	    	
	    }
	    	
	      
	      
	}

}
