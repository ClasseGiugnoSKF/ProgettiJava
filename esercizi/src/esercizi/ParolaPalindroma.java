package esercizi;

public class ParolaPalindroma {

	public static void main(String[] args) {
		String stringa = "Anna".toLowerCase();
		int lim = (int)stringa.length();
		boolean risultato = true;

		for(int i=0;i<lim/2;i++) {
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
