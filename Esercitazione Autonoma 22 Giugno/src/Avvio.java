
public class Avvio {

	public static void main(String[] args) {
		GestioneIO io = new GestioneIO();
		Raccolta r = new Raccolta();
		switch(io.menu()) {
		case 1:
			r.algoritmo1();
			break;
		case 2:
			r.algoritmo2();
			break;
		case 3:
			r.algoritmo3();
			break;
		case 4:
			r.algoritmo4();
			break;
		case 5:
			r.algoritmo5();
			break;
		case 6:
			r.algoritmo6();
			break;
		case 7:
			r.algoritmo7();
			break;
		case 8:
			r.algoritmo8();
			break;
		case 9:
			r.algoritmo9();
			break;
		case 10:
			r.algoritmo10();
			break;
		case 11:
			r.algoritmo11();
			break;
		case 12:
			r.algoritmo12();
			break;
		default:
			io.stampaErrore("Scegli un'opzione corretta!");
		}
		
		
	}

}
