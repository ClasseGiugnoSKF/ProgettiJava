import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

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

	void cercaUtente() {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci la dimensione del vettore: ");
		String[] nominativi = new String[Integer.parseInt(input.nextLine())];

		for(int i=0;i<nominativi.length;i++) {
			System.out.println("Inserisci nominativo n."+(i+1)+":");
			nominativi[i]=input.nextLine();
		}

		System.out.println("Quale utente desideri cercare ?");
		String nome = input.nextLine();
		boolean flag = false;

		for(int i=0;i<nominativi.length;i++) {
			if(nominativi[i].equalsIgnoreCase(nome)) {
				System.out.println("Utente trovato");
				flag = true;
				break;
			}
		}if(!flag) {
			System.out.println("Utente non trovato");
		}
	}

	void swap() {
		io.domanda("Inserire i 2 valori desiderati:");
		int a = io.leggiIntero();
		int b= io.leggiIntero();
		io.domanda("I valori attuali sono:\n"
				+ ""+"a="+a+" "+"b="+b);
		io.domanda("Si desidera scambiare i due valori?(SI/NO)");
		String risposta = io.leggiStringa();
		if(risposta.equalsIgnoreCase("si")) {
			int temp=a;
			a=b;
			b=temp;
			io.domanda("I valori dopo lo scambio sono:\n"
					+ "a="+a+" "+"b="+b);
		}else {
			io.domanda("La funzione è terminata.");
		}
	}

	void listaOrdinata() {
		io.domanda("Inserisci dimensione del vettore");		

		int[] vettore = new int [io.leggiIntero()];

		io.domanda("Inserire i valori del vettore");
		for(int i=0;i<vettore.length;i++) {
			vettore[i]=io.leggiIntero();
		}			

		int temp;

		for(int i=0;i<vettore.length;i++) {
			for(int j = 0; j<vettore.length ;j++) {
				if(vettore[i]<vettore[j]) {
					temp = vettore [i];
					vettore[i]=vettore[j];
					vettore[j]=temp;
				}
			}
		}
		for(int i=0;i<vettore.length;i++) {
			System.out.println(vettore[i]);
		}
	}

	void alfabeto(){

		String alfabeto = "ABCDEFG HILMNOP QRSTUVZ";
		String lettere1;
		String lettere2;
		String lettere3;
		String[] alfabetoDiviso = alfabeto.split(" ");

		lettere1=alfabetoDiviso[0];
		lettere2=alfabetoDiviso[1];
		lettere3=alfabetoDiviso[2];
		System.out.println(lettere1+"\n"+lettere2+"\n"+lettere3);
	}

	void alfabetoASCII() {
		char c = 65;
		char[] lettereInglesi = {74,75,87,88,89};
		boolean flag = false;

		while(c<=90) {
			for(int i=0;i<lettereInglesi.length;i++) {
				if(c==lettereInglesi[i]) {
					flag=true;
					break;
				}
			}
			if(!flag) {
				System.out.print(c+" ");
			}
			if(c==71||c==80||c==90) {
				System.out.println();
			}
			c++;
			flag=false;
		}
	}

	void fibonacci() {
		long[] f = new long[3];
		f[0]=0;
		f[1]=1;
		f[2]=f[0]+f[1];
		int i = 0;

		System.out.print(f[0]+" "+f[1]+" "+f[2]+" ");

		while(f[2]<1000) {
			f[i]=f[i+1];
			f[i+1]=f[i+2];
			f[i+2]=f[0]+f[1];
			System.out.print(f[i+2]+" ");
		}
		System.out.println();
	}

	void testASCII() {
		char c = 65;
		boolean flag=false;
		while(c<=90) {
			if(c == 74||c== 75||c== 87||c== 88||c== 89) {
				flag=true;
			}
			if(flag==false) {
				System.out.print(c+" ");			
			}
			if(c==71||c==80||c==90) {
				System.out.println();
			}
			c++;
			flag=false;
		}
	}

	void testASCII2() {
		boolean flag=false;
		for(char c = 65;c<=90;c++) {
			if(c == 74||c== 75||c== 87||c== 88||c== 89) {
				flag=true;
			}
			if(flag==false) {
				System.out.print(c+" ");			
			}
			if(c==71||c==80||c==90) {
				System.out.println();
			}
			flag=false;
		}
	}

	void sommaVettori() {
		io.domanda("Inserisci dimensione del vettore\n"
				+ "ATTENZIONE!!,inserisci un numero PARI");		

		int[] vettore = new int [io.leggiIntero()];

		io.domanda("Inserire i valori del vettore");
		for(int i=0;i<vettore.length;i++) {
			vettore[i]=io.leggiIntero();
		}
		for(int i=0;i<vettore.length;i++) {
			io.risultato(vettore[i]+vettore[i+1]);	
			i++;
		}
	}

	void estraiVocali() {
		io.domanda("Inserisci una stringa");
		String frase = io.leggiStringa();
		String s = frase.toLowerCase();
		//char vocali = 97,101,105,111,117;
		for(int i = 0; i< s.length(); i++) {
			if(s.charAt(i)==97||s.charAt(i)==101||s.charAt(i)==105||s.charAt(i)==111||s.charAt(i)==117) {
				System.out.print(s.charAt(i)+" ");
			}
		}
	}

	void estraiVocali2(){
		io.domanda("Inserisci una stringa");
		String frase = io.leggiStringa();
		String s = frase.toLowerCase();

		io.domanda("Le vocali presenti in questa stringa sono:");
		if(s.contains("a")) {
			System.out.print("a");
		}
		if(s.contains("e")) {
			System.out.print("e");
		}
		if(s.contains("i")) {
			System.out.print("i");
		}
		if(s.contains("o")) {
			System.out.print("o");
		}
		if(s.contains("u")) {
			System.out.print("u");
		}		
	}

	void contaVocali() {
		io.domanda("Inserisci una stringa");
		String frase = io.leggiStringa();
		String s = frase.toLowerCase();
		int contatore = 0;
		int contatoreFinale;	
		for(int i = 0; i< s.length(); i++) {
			if(s.charAt(i)==97||s.charAt(i)==101||s.charAt(i)==105||s.charAt(i)==111||s.charAt(i)==117) {
				contatore++;				
			}	
		}
		contatoreFinale=contatore;
		System.out.print("Ci sono "+contatoreFinale+" vocali in questa stringa");
	}

	void letteraSostituita() {
		io.domanda("Inserisci una stringa");
		String frase = io.leggiStringa();
		String f = frase.toLowerCase();
		io.domanda("Scegli una lettera da sostituire");
		String lettera = io.leggiStringa();
		String l = lettera.toLowerCase();

		for(int i = 0; i< f.length(); i++) {
			if(f.contains(l)) {
				System.out.println(f.replaceAll(l, " "));
				break;
			}
		}
	}

	void vettoreAlfabeto() {
		char[] alfabeto = {65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90};

		for(char i =0;i<alfabeto.length;i++) {
			while(alfabeto[i] <= 77) {	
				System.out.print(alfabeto[i]);
				break;
			}
			if(alfabeto[i]==77) {
				System.out.print(".");
			}else if (alfabeto[i]<77) {
				System.out.print(",");
			}
		}
	}

	void vettoreAlfabeto2() {
		char[] alfabeto = {65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90};

		for(char i =0;i<alfabeto.length;i++) {
			while(alfabeto[i] >= 77 && alfabeto[i]<80) {	
				System.out.print(alfabeto[i]);
				break;
			}
			if(alfabeto[i]==79) {
				System.out.print(".");
			}else if (alfabeto[i]>=77&&alfabeto[i]<79) {
				System.out.print(",");
			}
		}
	}

	void vettoreAlfabeto3() {
		char[] alfabeto = {65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90};
		//67-71 77-80
		for(char i =0;i<alfabeto.length;i++) {
			while(alfabeto[i] >= 67 && alfabeto[i]<=71 || alfabeto[i] >= 77 && alfabeto[i]<=80 ) {	
				System.out.print(alfabeto[i]);
				break;
			}
			if(alfabeto[i]==80) {
				System.out.print(".");
			}else if (alfabeto[i] >= 67 && alfabeto[i]<=71 || alfabeto[i] >= 77 && alfabeto[i]<80) {
				System.out.print(",");
			}
		}
	}

	void asterischi() {
		io.domanda("Quante righe vuoi che ci siano?");        
		int righe = io.leggiIntero();

		for(int i = 1; i<righe;++i) {
			for(int j = 1; j <= i; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	void asterischi2() {       

		io.domanda("Quante righe vuoi che ci siano?");        
		int righe = io.leggiIntero();   

		for (int i = 1; i <= righe; i++) {
			for (int j = 1; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}	                 
		for (int i = righe-1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}	       	       	         	  
	}					

	void conta() {
		io.domanda("Insersci due valori");	
		int inizio = io.leggiIntero();
		int fine =io.leggiIntero();	

		if(inizio<fine) {
			for(int i =inizio;i<=fine;i++) {
				System.out.println(i);
			}
		}else if (inizio>fine){
			for(int i =inizio; i>=fine;i--) {
				System.out.println(i);
			}
		}		
	}

	void matriceTabellina() {
		int[][] matrice = new int[10][10];
		for(int r=0;r<10;r++) {
			System.out.println();
			for(int c=0;c<10;c++) {
				matrice[r][c]=(r+1)*(c+1);
				System.out.print(matrice[r][c]+" ");
			}
		}
	}

	void matriceGiorni() {
		String[] g = {"Giorno","[h]:0-6" ,"[h]:7-13" ,"[h]:14-19", "[h]:20-0"};
		String[] giorni = {"Lunedì","Martedì","Mercoledì","Giovedì","Venerdì","Sabato","Domenica"};
		int[][] temperature = new int[7][4];	

		for(int r=0;r<5;r++) {	
			System.out.print(g[r]+" ");
		}
		System.out.println();
		for(int c=0;c<7;c++) {
			System.out.print(giorni[c]+" ");
			for(int z=0;z<4;z++) {
				temperature[c][z]=(int)(Math.random()*35);
				System.out.print(temperature[c][z]+" "+" ");
			}
			System.out.println(" ");
		}		
	}

	void matriceSlide() {
		int[][] matrix = new int[3][3];
		matrix[0][0]= 13;
		matrix[0][1]= 24;
		matrix[0][2]= 89;
		matrix[1][0]= 56;
		matrix[1][1]= 30;
		matrix[1][2]= 11;
		matrix[2][0]= 78;
		matrix[2][1]= 12;
		matrix[2][2]= 3;

		for(int r=0;r<matrix.length;r++) {
			System.out.println();
			for(int c=0;c<matrix[r].length;c++) {
				System.out.print(matrix[r][c]+" ");
			}
		}
	}

	void matrice123() {
		int[][] matrix= new int[3][3];
		matrix[0][0]= 1;
		matrix[1][1]= 2;
		matrix[2][2]= 3;

		for(int r=0;r<matrix.length;r++) {
			System.out.println();
			for(int c=0;c<matrix[r].length;c++) {
				System.out.print(matrix[r][c]+" ");
			}
		}
	}

	void Rosa() {
		io.domanda("Inserisci dimensione della matrice (righe/colonne)");		
		int[][] matrice = new int [io.leggiIntero()][io.leggiIntero()];
		io.domanda("Inserire i valori della matrice");
		for(int r=0;r<matrice.length;r++) {		
			for(int c=0;c<matrice[r].length;c++) {
				io.domanda("Inserire il valore matrcie["+r+"]["+c+"]");
				matrice[r][c] = io.leggiIntero();				
			}
		}
		for(int r=0;r<matrice.length;r++) {
			System.out.println();
			for(int c=0;c<matrice[r].length;c++) {			
				System.out.print(matrice[r][c]+" ");
			}
		}
		System.out.println();
		io.domanda("Questa è la stampa all'inverso");		
		for(int r=0;r<matrice[0].length;r++) {
			System.out.println();
			for(int c=0;c<matrice.length;c++) {			
				System.out.print(matrice[c][r]+" ");		
			}
		}		
	}

	void matrice4x3() {

		int[][] matrix = {
				{5,7,9},
				{8,13,23},
				{41,77,12},
				{89,18,33},
		};		
		for(int r=0;r<matrix.length;r++) {		
			for(int c=0;c<matrix.length-1;c++) {
				System.out.print(matrix[r][c]+" ");
			}
			System.out.println();
		}	
	}

	void Viktoria() {
		int[][] matrix = {
				{1,2},//a,b
				{3,4} //c,d
		};
		//det= ad-bc
		int det;
		int m1;
		int m2;
		for(int r=0;r<matrix.length;r++) {		
			for(int c=0;c<matrix[r].length;c++) {
				System.out.print(matrix[r][c]+" ");			
			}
			System.out.println();
		}
		io.domanda("Il determinante è");
		m1=matrix[0][0]*matrix[1][1];
		m2=matrix[0][1]*matrix[1][0];
		det=m1-m2;
		System.out.println(det);
	}

	void Viktoria2() {
		int det;
		int m1;
		int m2;
		int m3;
		int m4;
		int m5;
		int m6;
		io.domanda("Inserisci dimensione della matrice (righe/colonne)");
		io.domanda("ATTENZIONE!! INSERISCI UNA MATRICE 2X2 O 3X3");
		int[][] matrice = new int [io.leggiIntero()][io.leggiIntero()];
		io.domanda("Inserire i valori della matrice");
		for(int r=0;r<matrice.length;r++) {		
			for(int c=0;c<matrice[r].length;c++) {
				io.domanda("Inserire il valore matrcie["+r+"]["+c+"]");
				matrice[r][c] = io.leggiIntero();				
			}
		}
		for(int r=0;r<matrice.length;r++) {

			for(int c=0;c<matrice[r].length;c++) {			
				System.out.print(matrice[r][c]+" ");				
			}
			System.out.println();
		}
		if(matrice.length == 2) {					
			m1=matrice[0][0]*matrice[1][1];
			m2=matrice[0][1]*matrice[1][0];
			det=m1-m2;
			io.domanda("Il determinante è: "+det);
		}else if(matrice.length==3) {
			m1=matrice[0][0]*matrice[1][1]*matrice[2][2];
			m2=matrice[0][1]*matrice[1][2]*matrice[2][0];
			m3=matrice[0][2]*matrice[1][0]*matrice[2][1];
			m4=matrice[0][2]*matrice[1][1]*matrice[2][0];
			m5=matrice[0][1]*matrice[1][0]*matrice[2][2];
			m6=matrice[0][0]*matrice[1][2]*matrice[2][1];
			det=m1+m2+m3-(m4+m5+m6);
			io.domanda("Il determinante è: "+det);
		}




	}






























}




























































































