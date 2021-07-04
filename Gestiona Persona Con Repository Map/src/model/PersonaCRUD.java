package model;
import java.util.HashMap;
import model.Persona;

public class PersonaCRUD implements IPersonaCRUD {

	HashMap<String,Persona> persone = new HashMap<String,Persona>();

	@Override
	public void inserisci(String key, Persona p) {
		persone.put(key, p);
		
	}

	@Override
	public void rimuovi(String key) {
		persone.remove(key);
	}

	@Override
	public Persona leggi(String key) {
		return persone.get(key);
	}

	@Override
	public HashMap<String, Persona> leggi() {
		return persone;
	}
	
}
