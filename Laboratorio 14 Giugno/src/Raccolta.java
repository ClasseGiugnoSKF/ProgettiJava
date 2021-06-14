
public class Raccolta {
	GestioneIO io = new GestioneIO();
	
	// Algoritmo #1
	void stampaConta() {
		switch(io.leggiIntero("\"Vuoi visualizzare in verticale (1) oppure in orizzontale (2)? Rispondere con un numero!\"")) {
		case 1:
			for(int i = 1;i<=10;i++) {
				io.stampaInt(i);
			}
			break;
		case 2:
			for(int i = 1;i<=10;i++) {
				System.out.print(i + "\t");
			}
		}
	}
	
	// Algoritmo #2
	void stampaNumeri() {
		int[] array = creaVettore(io.leggiIntero("\"Di che dimensione vuoi il vettore?\""));
		switch(io.leggiIntero("Vuoi stampare i numeri pari (1) o dispari (2)?: ")) {
		case 1:
			for(int i=0;i<array.length;i++) {
				if(array[i]%2 == 0) {
					io.stampaInt(array[i]);
				}
			}
			break;
		case 2:
			for(int i=0;i<array.length;i++) {
				if(array[i]%2 == 1) {
					io.stampaInt(array[i]);
				}
			}
		}
	}
	
	int[] creaVettore(int dim) {
		int[] vettore = new int[dim];
		for(int i=0;i<dim;i++) {
			vettore[i] = io.leggiIntero("Inserisci un numero da inserire nel vettore "
					+ "(ne rimangono da inserire "+(dim-i)+"): ");
		}
		return vettore;
	}
	
	// Algoritmo 3
	void stampaMinMax() {
		int[] vettore = creaVettore(io.leggiIntero("Di che dimensione vuoi il vettore?"));
		if(vettore.length < 2) {
			io.stampaErrore("Il vettore è troppo piccolo per avere un minimo ed un massimo!");
		} else {
			int min, max;
			min = max = vettore[0];
			for(int i=1;i<vettore.length;i++) {
				if(vettore[i] > max) {
					max = vettore[i];
				} else if (vettore[i] < min) {
					min = vettore[i];
				}
			}
			io.stampa("Il minimo è: "+min+"\nIl massimo è: "+max);
		}
	}
	
	// Algoritmo 4
	void sommaMedia() {
		int vettore[] = creaVettore(io.leggiIntero("Inserisci la dimensione del vettore: "));
		int somma = 0;
		for(int i=0;i<vettore.length;i++) {
			somma+=vettore[i];
		}
		io.stampa("La somma del vettore è: "+somma+"\nLa media del vettore è: "+(somma/vettore.length));
	}
	
	// Algoritmo 5
	void verificaPalindroma() {
		String parola = io.leggiStringa("Inserisci una parola da verificare per palindromia: ");
		parola = parola.replaceAll(" ", "").toLowerCase();
		boolean risultato = true;
		for(int i=0;i<parola.length()/2;i++) {
			if(parola.charAt(i) != parola.charAt(parola.length() - 1 - i)) {
				io.stampaErrore("La parola non è palindroma.");
				risultato = false;
				break;
			}
		}
		if(risultato) {
			io.stampa("La parola è palindroma.");
		}
	}
}
