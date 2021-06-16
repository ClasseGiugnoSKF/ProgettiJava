
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
	
	// Algoritmo 6
	String[] creaVettoreStringa() {
		String[] vettore = new String[io.leggiIntero("Inserisci la dimensione del vettore: ")];
		for(int i=0;i<vettore.length;i++) {
			vettore[i]=io.leggiStringa("Inserisci nominativo n."+(i+1)+":");
		}
		return vettore;
	}
	
	void ricercaNome(String[] vettore) {
		String nome = io.leggiStringa("Chi vuoi cercare nell'array?");
		boolean risultato = false;
		for(int i=0;i<vettore.length;i++) {
			if(vettore[i].equalsIgnoreCase(nome)) {
				System.out.println(nome+" è stato trovato!");
				risultato = true;
				break;
			}
		}
		if(!risultato) {
			System.out.println(nome+" non trovato");
		}
	}
	
	// Algoritmo 7
	void swapVariabili() {
		int a = io.leggiIntero("Inserisci un valore nella variabile a: ");
		int b = io.leggiIntero("Inserisci un valore nella variabile b: ");
		
		io.stampa("***PRIMA\n"
				+ "a: "+a+
				"\nb: "+b);
		
		int temp = a;
		a = b;
		b = temp;
		
		io.stampa("***DOPO\n"
				+ "a: "+a+
				"\nb: "+b);
	}
	
	// Algoritmo 8
		void ordinamentoVettore() {
			int[] vettore = creaVettore(io.leggiIntero("Inserisci una dimensione: "));
			for(int i=0;i<vettore.length;i++) {
				int temp = vettore[i], temp2 = i;
				for(int k=i+1;k<vettore.length;k++) {
					if(vettore[k] < temp) {
						temp = vettore[k];
						temp2 = k;
					}
				}
				vettore[temp2] = vettore[i];
				vettore[i] = temp;
			}
		
			for(int b=0;b<vettore.length;b++) {
				System.out.println(vettore[b]);
			}
		}
		
		// Algoritmo 9
		void stampaAlfabeto() {
			byte i = 1;
			for(char lettera = 'A';lettera<='Z';lettera++) {
				if(!(lettera >= 'J' && lettera <= 'K' || lettera >= 'W' && lettera <= 'Y')) {
					if(i>7) {
						System.out.println();
						i=1;
					}
					System.out.print(lettera+" ");
					i++;
				}
			}
		}
		
		// Algoritmo 10
		void fibonacci() {
			int[] F = {0,1,1};
			for(int n=2;F[2]<100;) {
				int F2 = n-2;
				if(F2 < 3) {
					System.out.print(F[F2]+" ");
					n++;
				} else { // n diventa 5
					F[2] = F[1] + F[0];
					F[2] = F[2] + F[1];
					System.out.println(F[2]);
				}
			}
		}
		
		// Algoritmo 11
		void sommaCoppie(int[] vettore) {
			for(int i=0,cont=1;i<=vettore.length-1;i+=2,cont++) {
				io.stampa("Coppia n."+(cont)+" = "+(vettore[i] + vettore[i+1]));
			}
		}
		
		// Algoritmo 12
		void stampaVocali(String frase) {
			frase = frase.replaceAll(" ", "").toLowerCase();
			for(int i=0;i<frase.length();i++) {
				if(verificaVocali(frase.charAt(i))) {
					System.out.print(frase.charAt(i)+" ");
				}
			}
		}
		
		
		boolean verificaVocali(char carattere) {
			if(carattere == 'a' || carattere == 'e' || carattere == 'i' 
					|| carattere == 'o' || carattere == 'u') {
				return true;
			}
				return false;
		}
		
		// Algoritmo 13
		void stampaVocaliLim(String frase) {
			char[] vocali = new char[5];
			frase = frase.replaceAll(" ", "").toLowerCase();
			for(int i=0,inV=0;i<frase.length();i++) {
				if(verificaVocali(frase.charAt(i))) {
					boolean flag = true;
					for(int k=0;k<vocali.length;k++) {
						if(vocali[k] == frase.charAt(i)) {
							flag = false;
							break;
						}
					}
					if(flag) {
						vocali[inV] = frase.charAt(i);
						inV++;
						System.out.print(frase.charAt(i)+" ");
					}
				}
			}
		}
		
		// Algoritmo 14
		void contaVocali(String frase) {
			int cont = 0;
			for(int i=0;i<frase.length();i++) {
				if(verificaVocali(frase.charAt(i))) {
					cont++;
				}
			}
			System.out.println("\nNumero di vocali: "+cont);
		}
		
		// Algoritmo 15
		void sostituisciCarattere(String frase) {
			char lettera = io.leggiChar("Inserisci un carattere da sostituire con uno spazio nella frase.");
			frase = frase.replace(String.valueOf(lettera), " ");
			System.out.println(frase);
		}
		
		// Algoritmo 16
		char[] creaAlfabeto() {
			char[] alfabeto = new char[26];
			char gen = 'A';
			for(int i=0;gen<='Z';i++,gen++) {
				alfabeto[i] = gen;
			}
			return alfabeto;
		}
		
		void vettoreM(char[] alfabeto) {
			for(int i=0;alfabeto[i]<=77;i++) {
				if(alfabeto[i] == 77) {
					io.stampaNL(alfabeto[i]+".\n");
					break;
				}
				io.stampaNL(alfabeto[i]+",");
			}
		}
		
		void vettoreMP(char[] alfabeto) {
			for(int i=12;alfabeto[i] >=77 && alfabeto[i] < 80;i++) {
				if(alfabeto[i] == 79) {
					io.stampaNL(alfabeto[i]+".\n");
					break;
				}
				io.stampaNL(alfabeto[i]+",");
			}
		}
		
		void vettoreCGMP(char[] alfabeto) {
			for(int i=2;alfabeto[i] <= 80;i++) {
				if(alfabeto[i] == 80) {
					io.stampaNL(alfabeto[i]+".\n");
					break;
				} else if(alfabeto[i] >= 67 && alfabeto[i] <= 71 || alfabeto[i] >= 77) {
					io.stampaNL(alfabeto[i]+",");
				}
			}
		}
		
		void asteriscoSingolo() {
			for(int i=1;i<=6;i++) {
				for(int k=0;k<i;k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		void asteriscoPiramide() {
			for(int i=1;i<=13;i++) {
				if(i>7) {
					for(int k=0;k<=(13-i);k++) {
						System.out.print("*");
					}
				} else {
					for(int k=0;k<i;k++) {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		}
}
