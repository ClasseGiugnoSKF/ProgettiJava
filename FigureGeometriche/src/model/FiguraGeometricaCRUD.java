package model;

import java.util.ArrayList;

public class FiguraGeometricaCRUD implements IFiguraGeometricaCRUD {

	ArrayList<FiguraGeometrica> figure = new ArrayList<FiguraGeometrica>();
	
	@Override
	public void inserisci(FiguraGeometrica fg) {
		figure.add(fg);
	}

	@Override
	public void modifica(int i, FiguraGeometrica fg) {
		figure.set(i, fg);
	}

	@Override
	public void rimuovi(int i) {
		figure.remove(i);
	}

	@Override
	public FiguraGeometrica leggi(int i) {
		return figure.get(i);
	}

	@Override
	public ArrayList<FiguraGeometrica> leggi() {
		return figure;
	}

}
