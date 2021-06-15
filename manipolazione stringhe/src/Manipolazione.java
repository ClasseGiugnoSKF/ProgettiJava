
public class Manipolazione {

	void confrontoStringhe() {
		String nome= "PiPPo";
		System.out.println(nome.equals("pippo"));
		System.out.println(nome.equalsIgnoreCase("pippo"));
	}

	void concatenaStringhe() {
		String nome="Antonio ";
		String cognome="Caso";
		System.out.println(nome.concat(cognome));
	}

	void estrazioneSubStringa() {
		String nome="Antonio";
		String estrazione1=nome.substring(3);//substring non modifica la stringa originale ma ne ritorna
		//una nuova che deriva dalla prima
		System.out.println(estrazione1);
		String estrazione2=nome.substring(0, 4);//il limite inferiore è compreso mentre quello superiore 
		//è escluso
		System.out.println(estrazione2);
		System.out.println(nome);//questo system.out dimostra che il contenuto della variabile non è stato
		//modificato
	}

	void verificaContenuto() {
		String nome="Antonio";
		System.out.println(nome.contains("Toni"));
		System.out.println(nome.contains("toni"));
	}

	void ingrandisciCaratteri() {
		String nome="Antonio";
		//System.out.println(nome.toUpperCase());
		nome=nome.toUpperCase();
		System.out.println(nome);
	}

	void riduciCaratteri() {
		String nome="Antonio";
		System.out.println(nome.toLowerCase());
	}

	void verificaStringVuota() {
		String s1=" ";
		String s2="";
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
	}

	void letturaCaratterDaStringa(){
		String nome="Antonio";
		boolean b=false;
		for(int i=0;i<nome.length();i++) {
			if(nome.charAt(i)=='f') {		
				System.out.println("il carattere è stato trovato");
				b=true;
				break;
			}
		}
		if(!b) {
			System.out.println("carattere non trovato");
		}
	}

	void verificaSpaziEstremi() {
		String nominativo=" Antonio Caso";
		System.out.println("****"+nominativo);
		System.out.println("****"+nominativo.trim());
	}
	
	void sostituisciCarattere() {
		String nome="Antonio";
		System.out.println(nome.replace('o', 'x'));
	}
	
	void sostituisciSequenzaCaratteri() {
		String nome="Antonio ";
		System.out.println(nome.replaceAll(" ", "not"));
		System.out.println(nome.replaceAll("o|i|t", "a"));
	}
	
	void lunghezzaStringa() {
		String nome="Antonio";
		System.out.println(nome.length());//da non confondere con il length degli array in quanto
		//è un attributo
		}
	
	void dividiStringa() {
		String utente="Antonio Caso 20";
		String nome;
		String cognome;
		int eta;
		String[] datiUtente=utente.split(" ");
		nome=datiUtente[0];
		cognome=datiUtente[1];
		eta=Integer.parseInt(datiUtente[2]);
		System.out.println(nome+"\n"+cognome+"\n"+eta);
	}
}
