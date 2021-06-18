package app;
import utility.GestioneIO;

public class Applicazioni {
	GestioneIO io = new GestioneIO();
	
	public int menu() {
		return io.leggiIntero("*** HOME SCREEN\n"
				+ "1) Browser\n"
				+ "2) Rubrica\n"
				+ "3) Messaggi");
	}
	
	public void browser() {
		io.stampa("Nessuna connessione internet. Controlla le tue impostazioni di connessione wireless.");
	}
	
	public void messaggi() {
		io.stampa("Non ci sono nuovi messaggi.");
	}
	
	public void rubricaMenu() {
		String[][] contatti = {
				{"Geraldina Ferri", "3803361251"},
				{"Maria Teresa Calabresi", "3351259251"},
				{"Teresa Giordano", "3262735008"},
				{"Fedro Lo Duca", "3299926434"},
				{"Prisca Mazzanti", "3361771967"}
		};
		switch(io.leggiIntero("Che operazione vuoi eseguire?\n"
				+ "1) Visualizzare tutti i contatti salvati\n"
				+ "2) Cercare un contatto dal numero\n"
				+ "3) Cercare un contatto dal nome")) {
		case 1:
			visualizzaContatti(contatti);
			break;
		case 2:
			cercaNumero(contatti, io.leggiStringa("Che numero stai cercando?"));
			break;
		case 3:
			cercaNome(contatti, io.leggiStringa("Che nome stai cercando?"));
			break;
		default:
			return;
		}
	}
	
	void visualizzaContatti(String[][] matrice) {
		for(int i=0;i<matrice.length;i++) {
			io.stampa("("+i+") "+matrice[i][0]+" - "+matrice[i][1]);
		}
		digitaNumero(matrice);
	}
	
	void cercaNumero(String[][] matrice, String num) {
		boolean flag = false;
		for(int i=0;i<matrice.length;i++) {
			if(matrice[i][1].contains(num)) {
				io.stampa("("+i+") "+matrice[i][0]+" - "+matrice[i][1]);
				if(!flag) {
					flag = true;
				}
			}
		}
		if(!flag) {
			io.stampa("Numero non trovato!");
		}
		digitaNumero(matrice);
	}
	
	void cercaNome(String[][] matrice, String nome) {
		boolean flag = false;
		for(int i=0;i<matrice.length;i++) {
			if(matrice[i][0].contains(nome)) {
				io.stampa("("+i+") "+matrice[i][0]+" - "+matrice[i][1]);
				if(!flag) {
					flag = true;
				}
			}
		}
		if(!flag) {
			io.stampa("Numero non trovato!");
			return;
		}
		digitaNumero(matrice);
	}
	
	void digitaNumero(String matrice[][]) {
		do {
		int selezione = io.leggiIntero("Quale contatto vuoi chiamare?\nOppure premi 9 per tornare al menu.");
		switch(selezione) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			componiNumero(matrice[selezione][0], matrice[selezione][1]);
			break;
		case 9:
			rubricaMenu();
			break;
		default:
			io.stampaErrore("Opzione non valida.");
		} 
	} while(io.leggiStringa("Vuoi continuare? (Si/No)").equalsIgnoreCase("si"));
		return;
}
	
	void componiNumero(String nome, String num) {
		io.stampa("Stai chiamando: "+nome+"\n"+num);
		int flag = io.ritornaStato(Math.random());
		if(flag < 1) {
			io.stampa("Il numero è occupato.");
			return;
		}
		chiamaNumero(nome);
	}
	
	void chiamaNumero(String nome) {
		byte tentativi = 0;
		int flag = io.ritornaStato(Math.random());
		do {
			io.stampa("In attesa..."); 
			io.stampa("1 minuto dopo...");
			flag = io.ritornaStato(Math.random());
			tentativi++;
		}while (flag < 1 && tentativi < 3);
		if(flag == 1) {
			io.leggiStringa("\n***CHIAMATA ACCETTATA***\n"+nome+": Hey, ciao. Da quanto tempo, che si dice?\n"
					+ "*** Comunica il tuo messaggio: ");
			io.stampa("*** FINE");
		} else {
			io.stampa("Chiamata Inoltrata. Segreteria telefonica.\n***FINE");
		}
	}
}
