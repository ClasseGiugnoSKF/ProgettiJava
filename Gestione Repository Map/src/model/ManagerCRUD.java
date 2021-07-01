package model;

import java.util.HashMap;

public class ManagerCRUD implements ICRUD{

	HashMap<String, Persona> repository = new HashMap<String, Persona>();
	
	@Override
	public void inserisci(Persona p) {
		repository.put(p.getCodiceFiscale(), p);
	}

	@Override
	public Persona leggi(String chiave) {
		return repository.get(chiave);
	}

	@Override
	public void modifica(String chiave, Persona p) {
		repository.replace(chiave, p);
	}

	@Override
	public void cancella(String chiave) {
		repository.remove(chiave);
	}

	@Override
	public HashMap<String, Persona> leggi() {
		return repository;
	}
}
