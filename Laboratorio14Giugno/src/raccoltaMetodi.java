
public class raccoltaMetodi {
	gestioneIO io = new gestioneIO();

	void contatore() {
		io.domanda("Digita 1 per stampare in orizzontale o 2 per stampare in verticale");
		int opzione = io.leggiIntero();

		switch(opzione) {

		case 1:		
			for(int a = 0;a<=10;a++) {
				io.stampaOrizzontale(a);
			}
			break;

		case 2:
			for(int a = 0;a<10;a++) {
				io.stampaVerticale(a);	
			}
			break;
		default:
			io.errore("Seleziona un'opzione valida!");
		}
	}

	void vettore() {
		io.domanda("Inserisci dimensione del vettore");		

		int[] vettore = new int [io.leggiIntero()];

		io.domanda("Inserire i valori del vettore");
		for(int i=0;i<vettore.length;i++) {
			vettore[i]=io.leggiIntero();
		}

		io.domanda("Digita 1 per stampare i numeri pari o 2 per stampare i numeri dispari");
		int opzione = io.leggiIntero();

		switch(opzione) {

		case 1:		
			for(int i=0;i<vettore.length;i++) {
				if(vettore[i] % 2==0) {
					io.stampaIntero(vettore[i]);
				}
			}
			break;

		case 2:
			for(int i=0;i<vettore.length;i++) {
				if(vettore[i] % 2==1) {
					io.stampaIntero(vettore[i]);
				}				
			}
			break;
		default:
			io.errore("Seleziona un'opzione valida!");
		}
	}

	void vettore2() {
		io.domanda("Inserisci dimensione del vettore");		

		int[] vettore = new int [io.leggiIntero()];

		io.domanda("Inserire i valori del vettore");
		for(int i=0;i<vettore.length;i++) {
			vettore[i]=io.leggiIntero();
		}

		int minimo, massimo;
		minimo = massimo = vettore[0];		
		for(int i=1; i < vettore.length;i++) {
			if(vettore[i] > massimo) {
				massimo = vettore[i];
			}else if(vettore[i]<minimo) {
				minimo = vettore[i];
			}
		}
		io.domanda("il minimo è:"+minimo+"\nIl massimo è:"+massimo);
	}

	void sommaMedia() {
		io.domanda("Inserisci dimensione del vettore");		

		int[] vettore = new int [io.leggiIntero()];

		io.domanda("Inserire i valori del vettore");
		for(int i=0;i<vettore.length;i++) {
			vettore[i]=io.leggiIntero();
		}
		int somma = 0;
		int media = 0;
		for(int i=0;i < vettore.length;i++) {
			somma += vettore[i];
		}
		media = somma/vettore.length;
		io.domanda("La somma è:"+somma+"\nLa media è:"+media);
	}

	void stringaPalindroma() {
		io.domanda("Inserisci una stringa");
		String frase = io.leggiStringa();
		String s = frase.replaceAll(" ", "").toLowerCase();
		boolean b = true;

		for(int i = 0; i< s.length()/2; i++) {
			if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
				io.errore("La stringa non è palindroma!!");
				b = false;
			}
		}
		if(b) {
			io.domanda("La stringa è palindroma!!");
		}
	}
}
