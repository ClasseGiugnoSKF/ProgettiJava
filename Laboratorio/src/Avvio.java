
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
		case 11:
			r.sommaCoppie(r.creaVettore(8));
			break;
		case 12:
			r.stampaVocali(io.leggiStringa("Inserisci una frase e ne verranno stampate le vocali: "));
			break;
		case 13:
			r.stampaVocaliLim(io.leggiStringa("Inserisci una frase e ne verranno stampate (solo una volta) le singoli vocali: "));
			break;
		case 14:
			r.contaVocali(io.leggiStringa("Inserisci una frase e ne verranno contate le vocali: "));
			break;
		case 15:
			r.sostituisciCarattere(io.leggiStringa("Inserisci una frase: "));
			break;
		case 16:
			r.vettoreM(r.creaAlfabeto());
			break;
		case 17:
			r.vettoreMP(r.creaAlfabeto());
			break;
		case 18:
			r.vettoreCGMP(r.creaAlfabeto());
			break;
		case 19:
			r.asteriscoSingolo();
			break;
		case 20:
			r.asteriscoPiramide();
			break;
		case 21:
			r.matriceSlide();
			break;
		case 22:
			r.matriceDiagonale();
			break;
		case 23:
			r.stampaTabella();
			break;
		case 24:
			r.stampaMeteo();
			break;
		default:
			io.stampaErrore("Scegli un'opzione corretta!");
		}
		
	}

}
