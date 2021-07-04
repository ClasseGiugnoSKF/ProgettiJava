package view;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Scanner;
import model.Veicolo;
import model.Auto;
import model.AutoElettrica;

public class GestioneIO {
	Scanner s = new Scanner(System.in);
	
	public void menu() {		
		stampa("***** MENU\n"
				+ "1) Inserimento\n"
				+ "2) Modifica\n"
				+ "3) Cancella\n"
				+ "4) Trova\n"
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
	
	public void creaMaschera(Veicolo v) throws Exception {
		v.setMarca(leggiStringa("Marca: "));
		v.setColore(leggiStringa("Colore: "));
		v.setPeso(leggiDouble("Peso: "));
		v.setTipo(leggiStringa("Tipo: "));
		v.setLunghezza(leggiDouble("Lunghezza: "));
		v.setAltezza(leggiDouble("Altezza: "));
		if(v instanceof Auto) {
			((Auto) v).setCilindrata(leggiIntero("Cilindrata: "));
			((Auto) v).setCambioAutomatico(leggiBool("Cambio Automatico (Si/No): "));
			((Auto) v).setCavalli(leggiIntero("Cavalli: "));
			((Auto) v).setImmatricolazione(new SimpleDateFormat("dd/MM/yyyy").parse(leggiStringa("Immatricolazione: (Giorno/Mese/Anno)")));
		}
		if(v instanceof AutoElettrica) {
			((AutoElettrica) v).setAutonomia(leggiDouble("Autonomia: "));
			((AutoElettrica) v).setGuidaAutomatica(leggiBool("Guida Automatica (Si/No): "));
			((AutoElettrica) v).setTempoRicarica(leggiDouble("Tempo di ricarica: "));
		}
	}
	
	public Veicolo clonaMaschera(Veicolo v) {
		Veicolo c;
		if(v instanceof AutoElettrica) {
			c = new AutoElettrica();
			((AutoElettrica)c).setAutonomia(((AutoElettrica)v).getAutonomia());
			((AutoElettrica)c).setGuidaAutomatica(((AutoElettrica)v).getGuidaAutomatica());
			((AutoElettrica)c).setTempoRicarica(((AutoElettrica)v).getTempoRicarica());
		} else if(v instanceof Auto) {
			c = new Auto();
			((Auto)c).setCilindrata(((Auto)v).getCilindrata());
			((Auto)c).setCambioAutomatico(((Auto)v).getCambioAutomatico());
			((Auto)c).setCavalli(((Auto)v).getCavalli());
			((Auto)c).setImmatricolazione(((Auto)v).getImmatricolazione());
		} else {
			c = new Veicolo();
		}
		c.setMarca(v.getMarca());
		c.setColore(v.getColore());
		c.setPeso(v.getPeso());
		c.setTipo(v.getTipo());
		c.setLunghezza(v.getLunghezza());
		c.setAltezza(v.getAltezza());
		return c;
	}
	
	public void modificaMaschera(Veicolo v) throws Exception {
		String s = leggiStringa("Marca ["+v.getMarca()+"]: ");
		if(!s.isEmpty()) {
			v.setMarca(s);
		}
		s = leggiStringa("Colore ["+v.getColore()+"]: ");
		if(!s.isEmpty()) {
			v.setColore(s);
		}
		s = leggiStringa("Peso ["+v.getPeso()+"]: ");
		if(!s.isEmpty()) {
			v.setPeso(Double.parseDouble(s));
		}
		s = leggiStringa("Tipo ["+v.getTipo()+"]: ");
		if(!s.isEmpty()) {
			v.setTipo(s);
		}
		s = leggiStringa("Lunghezza ["+v.getLunghezza()+"]: ");
		if(!s.isEmpty()) {
			v.setLunghezza(Double.parseDouble(s));
		}
		s = leggiStringa("Altezza ["+v.getAltezza()+"]: ");
		if(!s.isEmpty()) {
			v.setAltezza(Double.parseDouble(s));
		}
		if(v instanceof Auto) {
			s=leggiStringa("Cilindrata ["+((Auto)v).getCilindrata()+"]: ");
			if(!s.isEmpty()) {
				((Auto)v).setCilindrata(Integer.parseInt(s));
			}
			s=leggiStringa("Cambio Automatico ["+((Auto)v).getCambioAutomatico()+"]: (Si/No)");
			if(!s.isEmpty()) {
				if(s.equalsIgnoreCase("si")) {
					((Auto)v).setCambioAutomatico(true);
				} else {
					((Auto)v).setCambioAutomatico(false);
				}
			}
			s=leggiStringa("Cavalli ["+((Auto)v).getCavalli()+"]: ");
			if(!s.isEmpty()) {
				((Auto)v).setCavalli(Integer.parseInt(s));
			}
			s=leggiStringa("Immatricolazione ["+((Auto)v).getImmatricolazione()+"]: (Giorno/Mese/Anno)");
			if(!s.isEmpty()) {
				((Auto) v).setImmatricolazione(new SimpleDateFormat("dd/MM/yyyy").parse(s));
			}
		}
		if(v instanceof AutoElettrica) {
			s=leggiStringa("Autonomia ["+((AutoElettrica)v).getAutonomia()+"]: ");
			if(!s.isEmpty()) {
				((AutoElettrica)v).setAutonomia(Double.parseDouble(s));
			}
			s=leggiStringa("Guida Automatica ["+((AutoElettrica)v).getGuidaAutomatica()+"]: (Si/No)");
			if(!s.isEmpty()) {
				if(s.equalsIgnoreCase("si")) {
					((AutoElettrica) v).setGuidaAutomatica(true);
				} else {
					((AutoElettrica) v).setGuidaAutomatica(false);
				}
			}
			s=leggiStringa("Tempo di ricarica ["+((AutoElettrica)v).getTempoRicarica()+"]: ");
			if(!s.isEmpty()) {
				((AutoElettrica) v).setTempoRicarica(Double.parseDouble(s));
			}
		}
	}
	
	public void stampaElenco(HashMap<Integer,Veicolo> vMap) {
		for(Object valori: vMap.values()) {
			System.out.println(valori);
		}
	}
	
	public void stampaScheda(HashMap<Integer,Veicolo> vMap) {
		for(Veicolo v: vMap.values()) {
			stampa("*****\nMarca: "+v.getMarca()+"\n"
					+ "Colore: "+v.getColore()+"\n"
					+ "Peso: "+v.getPeso()+" kg\n"
					+ "Tipo: "+v.getTipo()+"\n"
					+ "Lunghezza: "+v.getLunghezza()+" m");	
			if(v instanceof Auto) {
				stampa("Cilindrata: "+((Auto)v).getCilindrata()+"\n"
						+ "Cambio Automatico: "+((Auto)v).getCambioAutomatico()+"\n"
						+ "Cavalli: "+((Auto)v).getCavalli()+"\n"
						+ "Immatricolazione: "+((Auto)v).getImmatricolazione());
			}
			if(v instanceof AutoElettrica) {
				stampa("Autonomia: "+((AutoElettrica)v).getAutonomia()+"\n"
						+ "Guida Automatica: "+((AutoElettrica)v).getGuidaAutomatica()+"\n"
						+ "Tempo di ricarica: "+((AutoElettrica)v).getTempoRicarica());
			}
		}
	}
}