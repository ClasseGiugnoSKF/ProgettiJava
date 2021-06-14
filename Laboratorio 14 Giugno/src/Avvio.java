
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
		default:
			io.stampaErrore("Scegli un'opzione corretta!");
		}
		
	}

}
