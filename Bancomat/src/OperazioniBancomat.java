import java.util.Scanner;

public class OperazioniBancomat {

	Scanner scan = new Scanner(System.in);
	String numeroCard = "";
	double importo = 0.0;
		
	String[][] archivioCardPin() {
		String [][] archivio = {{"123ABC", "47281"}, {"675DOP", "09691"}, 
				{"984HTW", "66561"}, {"270KLJ", "89022"}, {"347ERT", "77155"}};
		return archivio;
	}

	String[][] contoCorrente() {
		String [][] contoCorrente = {{"123ABC", "80.00"}, {"675DOP", "350.00"}, 
				{"984HTW", "1000.00"}, {"270KLJ", "750.00"}, {"347ERT", "120.00"}};
		return contoCorrente;
	}

	boolean letturaCard() {
		boolean cardPresente = false;
		numeroCard = scan.nextLine();
		for(int i=0; i<archivioCardPin().length; i++) {
			if(numeroCard.equalsIgnoreCase(archivioCardPin()[i][0])) {
				cardPresente = true;
				break;
			}
		}
		return cardPresente;
	}
	
	boolean verificaPin() {
		String pin = scan.nextLine();
		boolean pinCorretto = false;
		for(int i=0; i<archivioCardPin().length; i++) {
			if(numeroCard.equalsIgnoreCase(archivioCardPin()[i][0])) {
				if(pin.equals(archivioCardPin()[i][1])) {
					pinCorretto = true;
					break;
				}
			}
		}
		return pinCorretto;
	}
	
	double disponibilitaContoCorrente() {
		double contoCorrente = 0.0;
		for(int i=0; i<contoCorrente().length; i++) {
			if(numeroCard.equalsIgnoreCase(contoCorrente()[i][0])) {
				contoCorrente = Double.parseDouble(contoCorrente()[i][1]);
			}
		}
		return contoCorrente;
	}
	
	double disponibilitaCassa() {
		return 250.00;
	}

	double disponibilitaBMT() {
		double BMT = disponibilitaCassa();
		if(disponibilitaCassa() > disponibilitaContoCorrente()) {
			BMT = disponibilitaContoCorrente();
		}
		return BMT;
	}
	
	void importo() {
		System.out.println("Gli importi possibili da richiedere sono:");
		System.out.println("20€\t40€\t50€\t60€\t70€\t80€\t90€\t100€\t120€"
				+ "\n140€\t150\t€160€\t170€\t180€\t190€\t200€\t220€\t240€\t250€");
	}

	boolean verificaImporto() {
		boolean importoValido = false;
		importo = Double.parseDouble(scan.nextLine());
		if(importo <= disponibilitaBMT()) {
			importoValido = true;
		}
		return importoValido;
	}
	
	void preparaImporto() {
		String ventiEuro = "20€";
		String cinquantaEuro = "50€";
		int valore = (int)importo/10;
		if((valore % 5) == 0) {
			for(int i=0; i<(valore/5); i++) {
				System.out.print(cinquantaEuro + "\t");
			}
		} else if((valore % 2) == 0) {
			for(int i=0; i<(valore/2); i++) {
				System.out.print(ventiEuro + "\t");				
			}
		} else {
			for(int i=0; i<(valore/5); i++) {
				System.out.print(cinquantaEuro + "\t");
			}
			for(int i=0; i<((valore%5)/2); i++) {
				System.out.print(ventiEuro + "\t");
			}
		}
		System.out.println();
	}
}
