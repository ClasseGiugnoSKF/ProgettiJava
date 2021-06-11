package eccezioni;

import java.util.Scanner;

public class GestioneEccezione {

	Scanner input = new Scanner(System.in);

	//	public int getNumero() {
	//		int n=0;
	//		try { //quarantena->qui, sono presenti la riga/righe incriminate
	//		System.out.println("Inserisci un numero:");
	//		n=Integer.parseInt(input.nextLine());
	//		}
	//		catch(NumberFormatException e) {
	//			//controrisposta all'eccezione
	//			System.out.println("Attenzione!!! Il valore inserito non è un numero!"+
	//			"\nIl valore verrà quindi impostato a: ");
	//		}
	//		return n;
	//	}

	//		public int getNumero() {
	//			int n=0;
	//			try { //quarantena->qui, sono presenti la riga/righe incriminate
	//			System.out.println("Inserisci un numero:");
	//			n=Integer.parseInt(input.nextLine());
	//			}
	//			catch(NumberFormatException e) { 
	//				//il catch permette di evitare una brusca interruzione
	//				//controrispondendo all'eccezione con delle righe di codice
	//				System.out.println("Attenzione!!! Il valore inserito non è un numero!");
	//				n=getNumero(); //ricorsione
	//			}
	//			System.out.println("test "+n);
	//			return n;
	//		}

	public int getNumero() {
		int n=0;
		boolean flag=false;
		do {
			try { //quarantena->qui, sono presenti la riga/righe incriminate
				flag=false;
				System.out.println("Inserisci un numero:");
				n=Integer.parseInt(input.nextLine()); //NumberFormatException
				System.out.println("La divisione è pari a: "+(1/n)); //ArithmeticException
			}
			catch(NumberFormatException e) { 
				//il catch permette di evitare una brusca interruzione
				//controrispondendo all'eccezione con delle righe di codice
				System.out.println("Attenzione!!! Il valore inserito non è un numero!");
				flag=true;
			}
			catch(ArithmeticException e) {
				System.out.println("Attenzione!!! Passare un numero diverso da zero");
				flag=true;
			}
			catch(Exception e) { //TAMPONE per catturare le eccezioni non previste dal programmatore
				System.out.println("Attenzione!!! Si è maniefestato un errore!");
				flag=true;
			}
			finally {
				System.out.println("Grazie per aver usato questo metodo. Saluti!");
				flag=true;
			}
		}
		while(flag);
		return n;
	}

	public void testArray() {
		int[] array = {3,4,12,78,8};
		System.out.println("La dimensione è pari a: "+array.length); //5->indici:0,1,2,3,4
		try {
			System.out.println(array[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("MA TI SEI RESO CONTO CHE L'ARRAY TERMINA CON LA POSIZIONE DI INDICE 4??????!!!!!");
		}
	}

	//throws delego il try-catch alla classe chiamante (nel nostro caso Avvio)
	public void testArray2() throws ArrayIndexOutOfBoundsException, Exception{
		int[] array = {3,4,12,78,8};
		System.out.println("La dimensione è pari a: "+array.length); //5->indici:0,1,2,3,4
		System.out.println(array[5]);
	}

	public void chiamataNumberFormat() {
		throw new NumberFormatException();
	}

	public void controlloLunghezzaUser() {
		boolean flag=false;
		do {
			flag=false;
			System.out.println("Inserisci un username");
			String username=input.nextLine();
			if(username.length()>=3) {
				System.out.println("La stringa è stata accettata!");
			}
			else {
				try {
					throw new MinimaLunghezzaException(); 
				}
				catch(MinimaLunghezzaException e) {
					System.out.println("Attenzione! Inserisci un user maggiore di 3 caratteri!");
					flag=true;
				}
			}
		}
		while(flag);
	}


}
