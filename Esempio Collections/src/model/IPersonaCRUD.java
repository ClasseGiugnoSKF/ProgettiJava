package model;
import java.util.ArrayList;

public interface IPersonaCRUD {

	public void inserisci(Persona p);
	public void modifica(int indice, Persona p);
	public void cancella(int indice);
	public Persona leggi(int indice);
	public ArrayList<Persona> leggi();
}
