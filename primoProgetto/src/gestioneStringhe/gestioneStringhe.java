package gestioneStringhe;

public class gestioneStringhe {

	public static void main(String[] args) {
		int a = 5;
		String aToString = ""+a; /* con una concatenazione di stringhe un qualunque tipo viene assorbita dalla stringa stessa
		 							diventando essa stessa una stringa */
		System.out.println(aToString);
		
		////////////////////////////////////////////////////////////////////////
		
		System.out.println(1+2+"Pippo"+2+1);
		/* 3Pippo21
		   Il compilatore legge da sinistra verso destra quindi prima vedr� i numeri da sommare aritmeticamente,
		   poi tutti i dati che verranno dopo la stringa Pippo verranno assorbiti come stringhe */
		System.out.println(1+2+"Pippo"+(2+1));
		// Prima otteniamo il risultato aritmetico e poi la concatenazione di stringhe
	}

}