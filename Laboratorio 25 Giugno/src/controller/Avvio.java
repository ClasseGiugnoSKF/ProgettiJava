package controller;
import model.Alimento;
import model.Frutta;
import view.GestioneIO;

public class Avvio {

	public static void main(String[] args) {
		GestioneIO io = new GestioneIO();
		
		Alimento[] alimenti = new Alimento[10];
		Frutta[] frutti = new Frutta[10];
		byte scelta;
		byte contaAlimento = 0;
		byte contaFrutta = 0;
		do {
			io.menu();
			scelta = io.leggiByte("Scegli un'operazione: ");
			switch(scelta) {
			case 1:
				switch(io.leggiIntero("Vuoi inserire un'alimento (1) o una frutta (2)?: ")) {
				case 1:
					if(contaAlimento < alimenti.length) {
						alimenti[contaAlimento] = new Alimento();
						io.inserimentoA(alimenti[contaAlimento]);
						contaAlimento++;	
					} else {
						io.stampaErrore("Hai raggiunto la capacità massima per gli alimenti!");
					}
					break;
				case 2:
					if(contaFrutta < frutti.length) {
						frutti[contaFrutta] = new Frutta();
						io.inserimentoF(frutti[contaFrutta]);
						contaFrutta++;	
					} else {
						io.stampaErrore("Hai raggiunto la capacità massima per i frutti!");
					}
					break;
				}
				break;
			case 2:
				switch(io.leggiIntero("Vuoi visualizzare gli alimenti (1) o i frutti? (2): ")) {
				case 1:
					for(int i=0;i<alimenti.length;i++) {
						if(alimenti[i] != null) {
							io.stampa(""+alimenti[i]);
						}
					}
					break;
				case 2:
					for(int i=0;i<frutti.length;i++) {
						if(frutti[i] != null) {
							io.stampa(""+frutti[i]);
						}
					}
					break;
				}
				break;
			case 3:
				switch(io.leggiIntero("Vuoi visualizzare gli alimenti (1) o i frutti? (2): ")) {
				case 1:
					for(int i=0;i<alimenti.length;i++) {
						if(alimenti[i] != null) {
							io.stampaAlimento(alimenti[i]);
						}
					}
					break;
				case 2:
					for(int i=0;i<frutti.length;i++) {
						if(frutti[i] != null) {
							io.stampaFrutta(frutti[i]);
						}
					}
					break;
				}
				break;
			default:
				io.stampa("Fine.");
			}
		} while(scelta < 4);
	}

}
