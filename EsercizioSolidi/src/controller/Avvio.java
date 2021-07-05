package controller;
import model.*;
import view.GestioneIO;
import java.util.HashMap;

public class Avvio {

	public static void main(String[] args) {
		GestioneIO io = new GestioneIO();
		HashMap<String,Solido> solidi = new HashMap<String,Solido>();
		byte scelta;
		
		do {
			io.menu();
			scelta = io.leggiByte("Quale operazione vuoi eseguire?");
			try {
				if(scelta>3) {
					throw new PrimaEccezione();
				}
				switch(scelta) {
				case 1:
					Solido s=null;
					switch(io.leggiByte("Vuoi inserire un cubo (1) oppure una sfera (2)?: ")) {
					case 1:
						s=new Cubo();
						break;
					case 2:
						s=new Sfera();
					}
					if(s!=null) {
						io.creaMaschera(s);
						String chiave = "";
						do {
							try {
								chiave=io.leggiStringa("Inserisci una chiave unica per l'elemento: ");
								if(chiave.isEmpty() || chiave.isBlank()){
									throw new SecondaEccezione();
								}
							} catch(SecondaEccezione e) {
								System.err.println(e.getMessage()+": La chiave deve contenere caratteri alfanumerici.");
							}
						}while(chiave.isEmpty() || chiave.isBlank());
						solidi.put(chiave, s);
					}
					break;
				case 2:
					switch(io.leggiByte("Vuoi stampare in formato elenco (1) o scheda (2)?")) {
					case 1:
						io.stampaElenco(solidi);
						break;
					case 2:
						io.stampaScheda(solidi);
					}
					break;
				case 3:
					io.stampa("Fine programma.");
				}
			} catch(PrimaEccezione e) {
				System.err.println(e.getMessage()+": Scegli un'opzione presente nel menu.");
			}
		}while(scelta!=3);
	}
}
