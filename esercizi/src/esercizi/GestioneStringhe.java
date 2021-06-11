package esercizi;

public class GestioneStringhe {

	public static void main(String[] args) {
	int a=5;
	String aToString=""+a; //con una concatenazione di stringhe un qualunque tipo viene assorbito
	//dalla stringa stessa diventando a sua volta una stringa
	System.out.println(aToString);
////////////////////////////////////////////////////////////////////////////////////////////
	
	System.out.println(1+2+"Pippo"+2+1); //il compilatore legge da sinistra verso destra quindi prima
	// vedrà i numeri da sommare aritmeticamente, poi tutti i dati che verranno dopo la stringa Pippo 
	// verranno assorbiti come stringhe
	System.out.println(1+2+"Pippo"+(2+1));
//	 prima otteniamo il risultato aritmetico e poi la concatenazione di stringhe
	}

}
