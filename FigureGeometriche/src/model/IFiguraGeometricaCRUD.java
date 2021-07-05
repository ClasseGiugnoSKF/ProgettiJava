package model;

import java.util.ArrayList;

public interface IFiguraGeometricaCRUD {

	public void inserisci(FiguraGeometrica fg);
	public void modifica(int i, FiguraGeometrica fg);
	public void rimuovi(int i);
	public FiguraGeometrica leggi(int i);
	public ArrayList<FiguraGeometrica> leggi();
	
}
