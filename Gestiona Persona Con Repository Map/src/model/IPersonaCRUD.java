package model;
import java.util.HashMap;

public interface IPersonaCRUD {

	public void inserisci(String key, Persona p);
	public void rimuovi(String key);
	public Persona leggi(String key);
	public HashMap<String,Persona> leggi();
	
}
