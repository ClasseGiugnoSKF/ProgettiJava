package model;

import java.util.ArrayList;

public class PersonaCRUD implements IPersonaCRUD {

	ArrayList<Persona> persone = new ArrayList<Persona>();
	
	@Override
	public void inserisci(Persona p) {
		persone.add(p);
	}

	@Override
	public void modifica(int indice, Persona p) {
		persone.set(indice, p);
	}

	@Override
	public void cancella(int indice) {
		persone.remove(indice);
	}

	@Override
	public Persona leggi(int indice) {
		return persone.get(indice);
	}

	@Override
	public ArrayList<Persona> leggi() {
		return persone;
	}

}
