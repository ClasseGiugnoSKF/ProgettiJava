package model;

import java.util.ArrayList;

public interface ILibroCRUD {
	
	public void inserisci(Libro l);
	public Libro leggi(int i);
	public void modifica(int i, Libro l);
	public void rimuovi(int i);
	public ArrayList<Libro> leggi();
}
