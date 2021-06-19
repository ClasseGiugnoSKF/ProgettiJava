
public class Raccolta {
	GestioneIO io = new GestioneIO();
	int valoreCassa = 1500;
	
	void menu() {
		switch(io.leggiIntero("***Benvenuto\n"
				+ "Desideri effettuare un'importo? Inserisci la carta. (1) Si | (2) No")) {
		case 1:				// [0] numero carta [1] pin [2] conto corrente
			String[] carta = {"342078139745205", "28089", "2000"}; 
			controlloPIN(carta);
			break;
		case 2:
			io.stampa("Arrivederci.");
			break;
		default:
			io.stampaErrore("Opzione non valida. Il terminale andrà in standby.");
		}
	}
	
	void controlloPIN(String[] vettore) {
		if(io.leggiStringa("Inserisci il PIN: ").equals(vettore[1])) {
			io.stampa("PIN corretto! Attendere...");
			prelievoBanco(io.ritornaIntero(vettore[2]));
		} else {
			io.stampaErrore("PIN non corretto! Operazione interrotta, ritirare la carta. Arrivederci.");
		}
	}
	// parto dal presupposto che non trovo cosa sia un BMT, presuppongo sia il massimo contante ritirabile dalla cassa
	int calcoloBMT(int conto) {
		int bmt = conto; // rimosso if-else per risparmiare qualche linea
		if(valoreCassa < conto) {
			bmt = conto - valoreCassa; // nel caso in cui il nostro conto sia maggiore inseriamo un limite
		}
		return bmt;
	}
	
	void prelievoBanco(int conto) {
		io.stampa("Il massimo prelievo effettuabile è: "+calcoloBMT(conto));
		int prelievo;
		do {
			prelievo = io.leggiIntero("Quanto desideri prelevare?");
			if(prelievo > calcoloBMT(conto)) {
				io.stampaErrore("Il prelievo supera la quantità massima! Operazione interrotta.");
				return;
			} else if (prelievo%20 != 0 && prelievo%50 != 0) {
				io.stampaErrore("Disporre un prelievo prelevabile tramite banconote da 50€ o da 20€");
			} 
		} while(prelievo%20 != 0 && prelievo%50 != 0);
		int banconote50 = 0, banconote20 = 0;
		while(prelievo>0) { // ciclo while per la distribuzione delle banconote da 20 e 50
			if(prelievo%50 == 0) {
				banconote50++;
				prelievo-=50;
			} else if(prelievo%20 == 0) {
				banconote20++;
				prelievo-=20;
			}
		}
		io.stampa(banconote50+" banconote da 50€ e "+banconote20+" banconote da 20€. Buona giornata.");
	}
}
