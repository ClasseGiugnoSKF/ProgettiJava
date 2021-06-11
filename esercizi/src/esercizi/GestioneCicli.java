package esercizi;

public class GestioneCicli {

	public static void main(String[] args) {
		int opzione=2;
		Raccolta r = new Raccolta();
		switch (opzione) {
		case 1: 
			//ALGORITMO 1: CONTA DA 1 A 10 SIA CON IL WHILE CHE CON IL FOR STAMPANDO SOLO I PARI			
			r.contaPari();
			r.contaPari2();
			break;
		case 2:
			//CONTA DA 10 A 1 STAMPANDO SOLO I DISPARI SIA CON WHILE E CON FOR
			r.contaDispari1();
			r.contaDispari2();
			break;
		case 3: 
			//ALGORITMO 3: DICHIARARE 2 VARIABILI DI TIPO INTERO E CONFRONTARLE PER CAPIRE
			//MASSIMO, MINIMO O UGUALI
			r.confronto();
			break;			
			// ALGORITMO 4: FARE LA SOMMA DEI VALORI CONTATI DA 1 A 10 SFRUTTANDO IL CICLO FOR
		case 4:
			r.somma();
			break;
		}
	}
}
