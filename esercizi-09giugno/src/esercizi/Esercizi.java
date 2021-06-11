package esercizi;

public class Esercizi {

	public static void main(String[] args) {
		/**
		 * Esercizio 1
		 * Uso di un ciclo for + indice della stringa per print della string
		 */
		String linea = "Ciao, come stai?";
		int indice = linea.length();
		
		for(int i=(indice-1);i>=0;i--) {
			System.out.print(linea.charAt(i));
		}
		/**
		 * Esercizio 2
		 */
		String linea2 = "Apelle figlio di Apollo ... fece una palla di pelle di pollo.";
		if(Character.isUpperCase(linea2.charAt(0))) {
			System.out.println("\n"+linea2);
		}
		/**
		 * Esercizio 3
		 */
		String linea3 = "AdeleMarioGiuseppeRosario";
		int indice3 = linea3.length();
		for(int k=0;k<indice3;k++) {
			if(linea3.charAt(k) >= 65 && linea3.charAt(k) <= 90) {
				System.out.println();
			}
			System.out.print(linea3.charAt(k));
		}
		
	}

}
