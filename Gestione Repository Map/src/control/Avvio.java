package control;

import model.Dipendente;
import model.DipendenteCRUD;
import model.Manager;
import model.ManagerCRUD;
import model.Persona;
import model.PersonaCRUD;
import view.GestoreIO;

public class Avvio {

	public static void main(String[] args) {

		GestoreIO g = new GestoreIO();
		PersonaCRUD pc = new PersonaCRUD();
		DipendenteCRUD dc = new DipendenteCRUD();
		ManagerCRUD mc = new ManagerCRUD();
		boolean flag = true;
		Persona p;
		String codiceFiscale;
		
		do {
			g.menuPrincipale();
			switch(g.leggiIntero("Scegli un'opzione: ")) {
			case 1:
				//INSERIMENTO
				g.menuSecondario();
				switch(g.leggiIntero("Scegli un'opzione.\n")) {
				case 1:
					p = new Persona();
					g.inserisci(p);
					pc.inserisci(p);
					break;
				case 2:
					p = new Dipendente();
					g.inserisci(p);
					dc.inserisci(p);				
					break;
				case 3:
					p = new Manager();
					g.inserisci(p);
					mc.inserisci(p);					
					break;
				default:
					g.stampaStringa("L'opzione inserita non è valida.\n");
				}
				break;
			case 2:
				//MODIFICA
				g.menuSecondario();
				switch(g.leggiIntero("Scegli un'opzione.\n")) {
				case 1:
					if(pc.leggi().size() != 0) {
						codiceFiscale = g.leggiStringa("Inserisci il codice fiscale: ");
						if(pc.leggi(codiceFiscale) != null) {
							p = g.duplica(pc.leggi(codiceFiscale));
							g.mascheraModifica(p);
							if(g.leggiStringa("Confermi le modifiche?(si/no)").equals("si")) {
								pc.modifica(codiceFiscale, p);
							}
						} else {
							g.stampaStringa("Persona non presente nel repository.\n");
						}
					} else {
						g.stampaStringa("Repository vuoto.\n");
					}
					break;
				case 2:
					if(dc.leggi().size() != 0) {
						codiceFiscale = g.leggiStringa("Inserisci il codice fiscale: ");
						if(dc.leggi(codiceFiscale) != null) {
							p = g.duplica(dc.leggi(codiceFiscale));
							g.mascheraModifica(p);
							if(g.leggiStringa("Confermi le modifiche?(si/no)").equals("si")) {
								dc.modifica(codiceFiscale, p);
							}
						} else {
							g.stampaStringa("Dipendente non presente nel repository.\n");
						}
					} else {
						g.stampaStringa("Repository vuoto.\n");
					}
					break;
				case 3:
					if(mc.leggi().size() != 0) {
						codiceFiscale = g.leggiStringa("Inserisci il codice fiscale: ");
						if(mc.leggi(codiceFiscale) != null) {
							p = g.duplica(mc.leggi(codiceFiscale));
							g.mascheraModifica(p);
							if(g.leggiStringa("Confermi le modifiche?(si/no)").equals("si")) {
								mc.modifica(codiceFiscale, p);
							}
						} else {
							g.stampaStringa("Manager non presente nel repository.\n");
						}
					} else {
						g.stampaStringa("Il repository è vuoto.\n");
					}
					break;
				default:
					g.stampaStringa("L'opzione inserita non è valida.\n");
				}				
				break;
			case 3:
				//CANCELLA
				g.menuSecondario();
				switch(g.leggiIntero("Scegli un'opzione.\n")) {
				case 1:
					if(pc.leggi().size() != 0) {
						codiceFiscale = g.leggiStringa("Inserisci il codice fiscale: ");
						if(pc.leggi(codiceFiscale) != null) {
							pc.cancella(codiceFiscale);
							g.stampaStringa("Persona cancellata con successo.\n");
						} else {
							g.stampaStringa("Persona non presente nel repository.\n");
						}
					} else {
						g.stampaStringa("Il repository è vuoto.\n");
					}
					break;
				case 2:
					if(dc.leggi().size() != 0) {
						codiceFiscale = g.leggiStringa("Inserisci il codice fiscale: ");
						if(dc.leggi(codiceFiscale) != null) {
							dc.cancella(codiceFiscale);
							g.stampaStringa("Dipendente cancellato con successo.\n");
						} else {
							g.stampaStringa("Dipendente non presente nel repository.\n");
						}
					} else {
						g.stampaStringa("Il repository è vuoto.\n");
					}
					break;
				case 3:
					if(mc.leggi().size() != 0) {
						codiceFiscale = g.leggiStringa("Inserisci il codice fiscale: ");
						if(mc.leggi(codiceFiscale) != null) {
							mc.cancella(codiceFiscale);
							g.stampaStringa("Manager cancellato con successo.\n");					
						} else {
							g.stampaStringa("Manager non presente nel repository.\n");
						}
					} else {
						g.stampaStringa("Il repository è vuoto.\n");
					}
					break;
				default:
					g.stampaStringa("L'opzione inserita non è valida.\n");
				}
				break;
			case 4:
				//TROVA
				g.menuSecondario();
				switch(g.leggiIntero("Scegli un'opzione.\n")) {
				case 1:
					if(pc.leggi().size() != 0) {
						codiceFiscale = g.leggiStringa("Inserisci il codice fiscale: ");
						if(pc.leggi(codiceFiscale) == null) {
							g.stampaStringa("La persona cercata non è nel repository.\n");
						} else {
							g.stampaStringa("La persona è nel repository.\n");
						}
					} else {
						g.stampaStringa("Il repository è vuoto.\n");
					}
					break;
				case 2:
					if(dc.leggi().size() != 0) {
						codiceFiscale = g.leggiStringa("Inserisci il codice fiscale: ");
						if(dc.leggi(codiceFiscale) == null) {
							g.stampaStringa("Il dipendente cercato non è nel repository.\n");
						}else {
							g.stampaStringa("Il dipendente è nel repository.\n");
						}
					} else {
						g.stampaStringa("Il repoository è vuoto.\n");
					}
					break;
				case 3:
					if(mc.leggi().size() != 0) {
						codiceFiscale = g.leggiStringa("Inserisci il codice fiscale: ");
						if(mc.leggi(codiceFiscale) == null) {
							g.stampaStringa("Il manager cercato non è nel repository.\n");
						}else {
							g.stampaStringa("Il manager è nel repository.\n");
						}
					} else {
						g.stampaStringa("Il repository è vuoto.\n");
					}
					break;
				default:
					g.stampaStringa("L'opzione inserita non è valida.\n");
				}
				break;
			case 5:
				//STAMPA ELENCO
				g.menuSecondario();
				switch(g.leggiIntero("Scegli un'opzione.\n")) {
				case 1:
					if(pc.leggi().size() != 0) {
						g.stampaRepositoryElenco(pc.leggi());
					} else {
						g.stampaStringa("Repository vuoto.\n");
					}
					break;
				case 2:
					if(dc.leggi().size() != 0) {
						g.stampaRepositoryElenco(dc.leggi());
					} else {
						g.stampaStringa("Repository vuoto.\n");
					}
					break;
				case 3:
					if(mc.leggi().size() != 0) {
						g.stampaRepositoryElenco(mc.leggi());
					} else {
						g.stampaStringa("Repository vuoto.\n");
					}
					break;
				default:
					g.stampaStringa("L'opzione inserita non è valida.\n");
				}				
				break;
			case 6:
				//STAMPA SCHEDA
				g.menuSecondario();
				switch(g.leggiIntero("Scegli un'opzione.\n")) {
				case 1:
					if(pc.leggi().size() != 0) {
						g.stampaRepositoryScheda(pc.leggi());
					} else {
						g.stampaStringa("Repository vuoto.\n");
					}
					break;
				case 2:
					if(dc.leggi().size() != 0) {
						g.stampaRepositoryScheda(dc.leggi());
					} else {
						g.stampaStringa("Repository vuoto.\n");
					}
					break;
				case 3:
					if(mc.leggi().size() != 0) {
						g.stampaRepositoryScheda(mc.leggi());
					} else {
						g.stampaStringa("Repository vuoto.\n");
					}
					break;
				default:
					g.stampaStringa("L'opzione inserita non è valida.\n");
				}				
				break;				
			case 7:
				g.stampaStringa("Fine programma.\n");
				flag = false;
				break;
			default :
				g.stampaStringa("L'opzione inserita non è valida.\n");
			}
		}while(flag);
	}

}
