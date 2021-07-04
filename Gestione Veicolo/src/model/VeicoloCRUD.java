package model;

import java.util.HashMap;

public class VeicoloCRUD implements IVeicoloCRUD {

	HashMap<Integer,Veicolo> veicoli = new HashMap<Integer,Veicolo>();
	
	@Override
	public void inserisci(Integer id, Veicolo v) {
		veicoli.put(id, v);
	}

	@Override
	public void modifica(Integer id, Veicolo v) {
		veicoli.replace(id, v);
	}

	@Override
	public void rimuovi(Integer id) {
		veicoli.remove(id);
		
	}

	@Override
	public Veicolo leggi(Integer id) {
		return veicoli.get(id);
	}

	@Override
	public HashMap<Integer, Veicolo> leggi() {
		return veicoli;
	}

}
