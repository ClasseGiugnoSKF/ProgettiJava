public class Algoritmo {

	public static void main(String[] args) {
		String stringa = "Anna".toLowerCase();
		byte lim = (byte)stringa.length();
		boolean risultato = true;

		for(byte i=0;i<lim/2;i++) {
			if(stringa.charAt(i) != stringa.charAt(lim-i-1)) {
				System.out.println("La parola non è palindroma.");
				risultato = false;
				break;
			}
		}
		
		if(risultato) {
			System.out.println("La parola è palindroma.");
		}
	}
}
