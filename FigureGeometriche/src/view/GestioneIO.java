package view;
import java.util.ArrayList;
import java.util.Scanner;
import model.Cerchio;
import model.FiguraGeometrica;
import model.Quadrato;
import model.Rettangolo;
import model.Triangolo;

public class GestioneIO {
	Scanner s = new Scanner(System.in);
	
	public void menu() {		
		stampa("***** MENU\n"
				+ "1) Inserimento\n"
				+ "2) Cerca\n"
				+ "3) Modifica\n"
				+ "4) Cancella\n"
				+ "5) Visualizza Elenco\n"
				+ "6) Visualizza Scheda\n"
				+ "7) Esci");
	}
	
	public String leggiStringa(String messaggio) {
		System.out.println(messaggio);
		return s.nextLine();
	}
	
	public int leggiIntero(String messaggio) {
		System.out.println(messaggio);
		return Integer.parseInt(s.nextLine());
	}
	
	public byte leggiByte(String messaggio) {
		System.out.println(messaggio);
		return Byte.parseByte(s.nextLine());
	}
	
	public double leggiDouble(String messaggio) {
		System.out.println(messaggio);
		return Double.parseDouble(s.nextLine());
	}
	
	public char leggiChar(String messaggio) {
		System.out.println(messaggio);
		return s.nextLine().charAt(0);
	}
	
	public boolean leggiBool(String messaggio) {
		System.out.println(messaggio);
		if(s.nextLine().equalsIgnoreCase("si")) {
			return true;
		}
		return false;
	}
	
	public void stampa(String messaggio) {
		System.out.println(messaggio);
	}
	
	public void stampaNL(String messaggio) {
		System.out.print(messaggio);
	}
	
	public void stampaInt(int num) {
		System.out.println(num);
	}
	
	public void stampaErrore(String messaggio){
		System.err.println(messaggio);
	}
	
	public void creaMaschera(FiguraGeometrica fg) {
		if(fg instanceof Cerchio) {
			((Cerchio) fg).setRaggio(leggiDouble("Inserisci il raggio: "));
		} else if(fg instanceof Quadrato) {
			((Quadrato) fg).setLato(leggiDouble("Inserisci la lunghezza del lato: "));
		} else if(fg instanceof Rettangolo) {
			((Rettangolo) fg).setAltezza(leggiDouble("Inserisci l'altezza: "));
			((Rettangolo) fg).setBase(leggiDouble("Inserisci la base: "));
		} else {
			((Triangolo) fg).setLato1(leggiDouble("Primo lato: "));
			((Triangolo) fg).setLato2(leggiDouble("Secondo lato: "));
			((Triangolo) fg).setLato3(leggiDouble("Terzo lato: "));
		}
	}
	
	public FiguraGeometrica clonaMaschera(FiguraGeometrica fg) {
		FiguraGeometrica c;
		if(fg instanceof Cerchio) {
			c = new Cerchio();
			((Cerchio)c).setRaggio(((Cerchio) fg).getRaggio());
		} else if(fg instanceof Quadrato) {
			c = new Quadrato();
			((Quadrato)c).setLato(((Quadrato) fg).getLato());
		} else if(fg instanceof Rettangolo) {
			c = new Rettangolo();
			((Rettangolo)c).setBase(((Rettangolo) fg).getBase());
			((Rettangolo)c).setAltezza(((Rettangolo) fg).getAltezza());
		} else {
			c = new Triangolo();
			((Triangolo)c).setLato1(((Triangolo) fg).getLato1());
			((Triangolo)c).setLato2(((Triangolo) fg).getLato2());
			((Triangolo)c).setLato3(((Triangolo) fg).getLato3());
		}
		c.setNomeFigura(fg.getNomeFigura());
		return c;
	}
	
	public void modificaMaschera(FiguraGeometrica fg) {
		String s;
		if(fg instanceof Cerchio) {
			s = leggiStringa("Raggio ["+((Cerchio)fg).getRaggio()+"]: ");
			if(!s.isEmpty()) {
				((Cerchio) fg).setRaggio(Double.parseDouble(s));
			}
		} else if(fg instanceof Quadrato) {
			s = leggiStringa("Lato ["+((Quadrato)fg).getLato()+"]: ");
			if(!s.isEmpty()) {
				((Quadrato) fg).setLato(Double.parseDouble(s));
			}
		} else if(fg instanceof Rettangolo) {
			s = leggiStringa("Base ["+((Rettangolo)fg).getBase()+"]: ");
			if(!s.isEmpty()) {
				((Rettangolo)fg).setBase(Double.parseDouble(s));
			}
			s = leggiStringa("Altezza ["+((Rettangolo)fg).getAltezza()+"]: ");
			if(!s.isEmpty()) {
				((Rettangolo)fg).setAltezza(Double.parseDouble(s));
			}
		} else {
			s = leggiStringa("Lato 1 ["+((Triangolo)fg).getLato1()+"]: ");
			if(!s.isEmpty()) {
				((Triangolo) fg).setLato1(Double.parseDouble(s));
			}
			s = leggiStringa("Lato 2 ["+((Triangolo)fg).getLato2()+"]: ");
			if(!s.isEmpty()) {
				((Triangolo) fg).setLato2(Double.parseDouble(s));
			}
			s = leggiStringa("Lato 3 ["+((Triangolo)fg).getLato3()+"]: ");
			if(!s.isEmpty()) {
				((Triangolo) fg).setLato3(Double.parseDouble(s));
			}
		}
	}
	
	public void stampaElenco(ArrayList<FiguraGeometrica> fgList, byte scelta) {
		for(FiguraGeometrica figure: fgList) {
			switch(scelta) {
			case 1:
				if(figure instanceof Cerchio) {
					System.out.println(figure);
				}
				break;
			case 2:
				if(figure instanceof Quadrato) {
					System.out.println(figure);
				}
				break;
			case 3:
				if(figure instanceof Rettangolo) {
					System.out.println(figure);
				}
				break;
			case 4:
				if(figure instanceof Triangolo) {
					System.out.println(figure);
				}
				break;
			}
		}
	}
	
	public void stampaScheda(ArrayList<FiguraGeometrica> fgList, byte scelta) {
		for(int i=0;i<fgList.size();i++) {
			switch(scelta) {
			case 1:
				if(fgList.get(i) instanceof Cerchio) {
					stampa("ELEMENTO "+i);
					stampa("Nome Figura: "+fgList.get(i).getNomeFigura()+"\n"
							+ "Raggio: "+((Cerchio)fgList.get(i)).getRaggio()+"\n"
							+ "Perimetro: "+((Cerchio)fgList.get(i)).calcolaPerim()+"\n"
							+ "Area: "+((Cerchio)fgList.get(i)).calcolaArea());
				}
				break;
			case 2:
				if(fgList.get(i) instanceof Quadrato) {
					stampa("ELEMENTO "+i);
					stampa("Nome Figura: "+fgList.get(i).getNomeFigura()+"\n"
							+ "Lato: "+((Quadrato)fgList.get(i)).getLato()+"\n"
							+ "Perimetro: "+((Quadrato)fgList.get(i)).calcolaPerim()+"\n"
							+ "Area: "+((Quadrato)fgList.get(i)).calcolaPerim());
				}
				break;
			case 3:
				if(fgList.get(i) instanceof Rettangolo) {
					stampa("ELEMENTO "+i);
					stampa("Nome Figura: "+fgList.get(i).getNomeFigura()+"\n"
							+ "Base: "+((Rettangolo)fgList.get(i)).getBase()+"\n"
							+ "Altezza: "+((Rettangolo)fgList.get(i)).getAltezza()+"\n"
							+ "Perimetro: "+((Rettangolo)fgList.get(i)).calcolaPerim()+"\n"
							+ "Area: "+((Rettangolo)fgList.get(i)).calcolaArea());
				}
				break;
			case 4:
				if(fgList.get(i) instanceof Triangolo) {
					stampa("ELEMENTO "+i);
					stampa("Nome Figura: "+fgList.get(i).getNomeFigura()+"\n"
							+ "Primo lato: "+((Triangolo)fgList.get(i)).getLato1()+"\n"
							+ "Secondo lato: "+((Triangolo)fgList.get(i)).getLato2()+"\n"
							+ "Terzo lato: "+((Triangolo)fgList.get(i)).getLato3()+"\n"
							+ "Perimetro: "+((Triangolo)fgList.get(i)).calcolaPerim()+"\n"
							+ "Area: "+((Triangolo)fgList.get(i)).calcolaArea());
				}
				break;
			}
		}
	}
}