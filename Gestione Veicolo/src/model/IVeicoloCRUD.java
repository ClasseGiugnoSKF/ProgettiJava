package model;
import java.util.HashMap;

public interface IVeicoloCRUD {

	public void inserisci(Integer id, Veicolo v);
	public void modifica(Integer id, Veicolo v);
	public void rimuovi(Integer id);
	public Veicolo leggi(Integer id);
	public HashMap<Integer,Veicolo> leggi();
}
