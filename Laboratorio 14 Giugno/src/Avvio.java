
public class Avvio {
	
	public static void main(String[] args) {
		Raccolta r = new Raccolta();
		GestioneIO io = new GestioneIO();
		switch(io.menu()) {
		case 1:
			r.stampaConta();
			break;
		case 2:
			r.stampaNumeri();
			break;
		case 3:
			r.stampaMinMax();
			break;
		case 4:
			r.sommaMedia();
			break;
		case 5:
			r.verificaPalindroma();
			break;
		case 6:
			String[] nominativi = r.creaVettoreStringa();
			r.ricercaNome(nominativi);
			break;
		case 7:
			r.swapVariabili();
			break;
		case 8:
			r.ordinamentoVettore();
			break;
		case 9:
			r.stampaAlfabeto();
			break;
		case 10:
			r.fibonacci();
			break;
		default:
			io.stampaErrore("Scegli un'opzione corretta!");
		}
		
	}

}
