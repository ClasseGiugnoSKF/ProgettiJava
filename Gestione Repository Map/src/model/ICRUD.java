package model;

import java.util.HashMap;

public interface ICRUD {

	public void inserisci(Persona p);
	public Persona leggi(String chiave);
	public void modifica(String chiave, Persona p);
	public void cancella(String chiave);
	public HashMap<String, Persona> leggi();
}
