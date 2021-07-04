
public class Manipolazione {

	void confrontoStringhe() {
		String nome = "piPPo";
		System.out.println(nome.equals("pippo"));
		System.out.println(nome.equalsIgnoreCase("pippo"));
	}
	
	void concatenaStringhe() {
		String nome = "Antonio ";
		String cognome = "Caso";
		System.out.println(nome.concat(cognome));
	}
	
	void estrazioneSubStringa() {
		String nome = "Antonio";
		String estrazione1 = nome.substring(3); // substring non trasforma la stringa originale ma ne ritorna una nuova 
												// che deriva dalla prima
		System.out.println(estrazione1);
		String estrazione2 = nome.substring(0, 4); // limite inferiore è compreso mentre quello superiore è escluso
		System.out.println(estrazione2);
		System.out.println(nome); // questo System.out dimostra che il contenuto della variabile non è stato modificato
	}
	
	void verificaContenuto() {
		String nome = "Antonio";
		System.out.println(nome.contains("Toni"));
		System.out.println(nome.contains("toni"));
	}
	
	void ingrandisciCaratteri() {
		String nome = "Antonio";
//		System.out.println(nome.toUpperCase());
		nome = nome.toUpperCase();
		System.out.println(nome);
	}
	
	void riduciCaratteri() {
		String nome = "Antonio";
		System.out.println(nome.toLowerCase());
	}
	
	void verificaStringaVuota() {
		String s1 = " ";
		String s2 = "";
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
	}
	
	void letturaCarattere() {
		String parola = "Albero";
		char carattere = 'e';
		boolean risultato = false;
		for(int i=0;i<parola.length();i++) {
			if(parola.charAt(i) == carattere) {
				System.out.println("Il carattere è stato trovato.");
				risultato = true;
				break;
			}
		}
		if(!risultato) {
			System.out.println("Carattere non trovato.");
		}
	}
	
	void verificaSpaziEstremi() {
		String nome = " Antonio Caso";
		System.out.println("****"+nome);
		System.out.println("****"+nome.trim());
	}
	
	void sostituisciCarattere() {
		String nome="Antonio";
		System.out.println(nome.replace('t', '1'));
	}
	
	void sostituisciSequenzaCaratteri() {
		String nome = "Antonio";
		System.out.println(nome.replaceAll("ton", "not")); // si può usare | or per sostituire più parti di una stringa
															// tipo: o|t|a diventa not
	}
	
	void lunghezzaStringa() {
		String nome = "Antonio";
		System.out.println(nome.length()); // da non confendere con il length degli array in quanto è un attributo
	}
	
	void dividiStringa() {
		String utente="Antonio Caso 20";
		String nome, cognome;
		int eta;
		String[] datiUtente = utente.split(" ");
		nome = datiUtente[0];
		cognome = datiUtente[1];
		eta = Integer.parseInt(datiUtente[2]);
		System.out.println(nome+"\n"+cognome+"\n"+eta);
	}
}
