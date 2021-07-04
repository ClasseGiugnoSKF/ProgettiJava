package controller;
import model.Cane;
import model.Mammifero;
import view.GestioneIO;

public class Avvio {

	public static void main(String[] args) {
		GestioneIO io = new GestioneIO();
		Mammifero[] mVet = new Mammifero[10];
		Cane[] cVet = new Cane[10];
		byte mCont = 0;
		byte cCont = 0;
		byte scelta = 0;
		
		do {
			io.menu();
			scelta = io.leggiByte("Scegli un'operazione: ");
			switch(scelta) {
			case 1:
				switch(io.leggiIntero("Cosa desideri inserire? Mammifero (1) o Cane (2): ")) {
				case 1:
					if(mCont < mVet.length) {
						mVet[mCont] = new Mammifero();
						io.inserisci(mVet[mCont]);
						mCont++;
					} else {
						io.stampaErrore("Hai raggiunto il limite massimo di mammiferi!");
					}
					break;
				case 2:
					if(cCont < cVet.length) {
						cVet[cCont] = new Cane();
						io.inserisci(cVet[cCont]);
						cCont++;
					} else {
						io.stampaErrore("Hai raggiunto il limite massimo di cani!");
					}
					break;
				}
				break;
			case 2:
				switch(io.leggiIntero("Cosa desideri visualizzare? Mammifero (1) o Cane (2): ")) {
				case 1:
					for(int i=0;i<mVet.length;i++) {
						if(mVet[i] != null) {
							io.stampa(""+mVet[i]);
						}
					}
					break;
				case 2:
					for(int i=0;i<cVet.length;i++) {
						if(cVet[i] != null) {
							io.stampa(""+cVet[i]);
						}
					}
					break;
				}
				break;
			case 3:
				switch(io.leggiIntero("Cosa desideri visualizzare? Mammifero (1) o Cane (2): ")) {
				case 1:
					for(int i=0;i<mVet.length;i++) {
						if(mVet[i] != null) {
							io.stampa(mVet[i]);
						}
					}
					break;
				case 2:
					for(int i=0;i<mVet.length;i++) {
						if(cVet[i] != null) {
							io.stampa(cVet[i]);
						}
					}
					break;
				}
				break;
			case 4:
				io.stampa("Fine programma.");
				break;
			}
		}while(scelta < 4);
		
		
	}	
}
