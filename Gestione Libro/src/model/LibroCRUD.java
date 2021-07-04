package model;
import java.util.ArrayList;

public class LibroCRUD implements ILibroCRUD {

	ArrayList<Libro> libri = new ArrayList<Libro>();
	
	@Override
	public void inserisci(Libro l) {
		libri.add(l);
	}

	@Override
	public Libro leggi(int i) {
		return libri.get(i);
	}

	@Override
	public void modifica(int i, Libro l) {
		libri.set(i, l);
	}

	@Override
	public void rimuovi(int i) {
		libri.remove(i);
	}

	@Override
	public ArrayList<Libro> leggi() {
		return libri;
	}

}
