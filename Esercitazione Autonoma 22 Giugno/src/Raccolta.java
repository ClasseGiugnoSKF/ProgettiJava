
public class Raccolta {
	GestioneIO io = new GestioneIO();
	
	void algoritmo1() {
		int[] array = {4,21,56,12,34,53,12,54,20,10};
		for(int i=0;i<array.length/2;i++) {
			System.out.println(array[i]+" "+array[array.length-1-i]);
		}
	}
	
	void algoritmo2() {
		int[] array1 = {6,23,91,30,12};
		int[] array2 = {4,23,50,50,04};
		
		for(int i=1;i<array1.length;i+=2) {
			if(array1[i] == array2[i]) {
				System.out.println("La posizione ["+i+"] coincide!");
			}
		}		
	}
	
	void algoritmo3() {
		int n = io.leggiIntero("Quanto righe vuoi che sia lungo il rombo?");
		int spazio = n-1;
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=spazio;k++) {
				System.out.print(" ");
			}
			for(int l=1;l<=i*2-1;l++) {
				System.out.print("*");
			}
			spazio--;
			System.out.println("");
		}
		spazio = 1;
		for(int i=1;i<=n-1;i++) {
			for(int k=1;k<=spazio;k++) {
				System.out.print(" ");
			}
			for(int l=1;l<=(n*2-1)-2*i;l++) {
				System.out.print("*");
			}
			spazio++;
			System.out.println();
		}		
	}

	void algoritmo4() {
		String frase = "Goooooooal";
		frase = frase.toLowerCase();
		if(frase.contains(" ") || frase.contains(",") || frase.contains(".")) {
			frase = frase.replaceAll(" |,|\\.", ""); //regex : | <- or , \\. <- per i punti, . rimuove tutto
		}
		int vocali = 0;
		int consonanti = 0;
		for(int i=0;i<frase.length();i++) {
			if(frase.charAt(i) >= 97 && frase.charAt(i) <= 122) {
				if(frase.charAt(i) == 97 || frase.charAt(i) == 101 || frase.charAt(i) == 105 ||
						frase.charAt(i) == 111 || frase.charAt(i) == 117) {
					vocali++;
				} else {
					consonanti++;
				}
			}
		}
		System.out.println("Vocali: "+vocali+"\nConsonanti: "+consonanti);
		if(consonanti > vocali) {
			System.out.println("Ci sono più consonanti che vocali");
			return;
		}
		System.out.println("Ci sono più vocali che consonanti.");		
	}
	
	void algoritmo5() {
		String frase = io.leggiStringa("Inserisci una frase: ").toLowerCase().replaceAll("\\.|,| ", "");
		for(int i=0;i<frase.length()/2;i++) {
			if(frase.charAt(i) != frase.charAt(frase.length()-1-i)) {
				System.out.println("La frase non è palindroma.");
				frase = "";
				break;
			}
		}
		if(!frase.equals("")) {
			System.out.println("La frase è palindroma.");
		}		
	}
	
	void algoritmo6() {
		String[][] matrice = {
				{"Harry", "Lenny", "Benny", "Accade a Milano"},
				{"220", "25", "110", "50"}
		};
		
		for(int i=0;i<matrice[0].length;i++) {
			if(Integer.parseInt(matrice[1][i]) < 100){
				System.out.println(matrice[0][i]);
			}
		}	
	}
	
	void algoritmo7() {
		int somma = 0;
		for(int i=1;i<=1000;i++) {
			if(i%3 == 0 || i%5 == 0) {
				somma+=i;
			}
		}
		System.out.println(somma);	
	}
	
	void algoritmo8() {
		String[] nominativi = {"Alberto", "Mario", "Peppo", "Salvatore", "Cinzia"};
		
		for(int i=0;i<nominativi.length;i++) {
			String temp = "";
			for(int k=(i+1);k<nominativi.length;k++) {
				if(nominativi[k].length() < nominativi[i].length()) {
					temp = nominativi[i];
					nominativi[i] = nominativi[k];
					nominativi[k] = temp;
				}
			}
		}
		io.stampaVettoreString(nominativi);		
	}
	
	void algoritmo9() {
		int fattoriale = 1;
		for(int i=2;i<=5;i++) {
			fattoriale*=i;
		}
		System.out.println(fattoriale);	
	}
	
	void algoritmo10() {
		String parola = "";
		do {
			parola = io.leggiStringa("Inserisci una parola: ").toLowerCase();
					if(parola.contains(",") || parola.contains(".") || parola.contains(" ")){
						io.stampaErrore("Inserire una parola, non una frase!");
					}
		} while(parola.contains(",") || parola.contains(".") || parola.contains(" "));
		
		for(int i=0;i<parola.length()/2;i++) {
			if(parola.charAt(i) != parola.charAt(parola.length()-1-i)) {
				System.out.println("La frase non è palindroma.");
				parola = "";
				break;
			}
		}
		
		if(!parola.equals("")) {
		System.out.println("La frase è palindroma.");
	}		
	}
	
	void algoritmo11() {
		int dim = io.leggiIntero("Di che dimensione vuoi la tua matrice?");
		int[][] matrice = new int[dim][dim];
		
		for(int i=0;i<matrice.length;i++) {
			for(int k=0;k<matrice.length;k++) {
				matrice[i][k] = io.leggiIntero("Inserisci il varole per la riga n."+i+" e colonna n."+k);
			}
		}
		
		io.stampaMatriceInteri(matrice);
		
		if(dim < 3) {
			io.stampa("Determinante: "+((matrice[0][0]*matrice[1][1])-(matrice[0][1]*matrice[1][0])));
			return;
		}
		
		io.stampa("Determinante: "+ (matrice[0][0] * ( ( matrice[1][1] * matrice[2][2] ) - ( matrice[1][2] * matrice[2][1] )	
				) - (matrice[1][0] * ( ( matrice[0][1] * matrice[2][2] ) - ( matrice[0][2] * matrice[2][1] )))	
				+ (matrice[2][0] * ( ( matrice[0][1] * matrice[1][2] ) - ( matrice[0][2] * matrice[1][1] )))));		
	}
	
	void algoritmo12() {
		int cateto = 5;
		
		for(int i=0;i<cateto;i++) {
			System.out.print("*");
			if(i > 0) {
				for(int s=1;s<=i+2;s++) {
					System.out.print(" ");
				}
				System.out.print("*");
			} else {
				System.out.print(" *");
			}
			System.out.println("");
		}
		for(int i=1;i<=cateto;i++) {
			System.out.print("* ");
		}		
	}
}
