
public class Avvio {

	public static void main(String[] args) {

		OperazioniBancomat ob = new OperazioniBancomat();
		
		do {
			System.out.println("Inserire identificativo della CARD "
					+ "(tre numeri e tre lettere maiuscole)");
			if(ob.letturaCard()) {
				System.out.println("Digitare PIN (cinque numeri):");
				if(ob.verificaPin()) {
					System.out.println("Verifico disponibilità conto corrente . . .");
					if(ob.disponibilitaContoCorrente() != 0.0) {
						System.out.println("Sul conto corrente ci sono " + ob.disponibilitaCassa() + "€");
						System.out.println("La disponibilità di cassa (massimo che puoi"
								+ " prelevare in un giorno) è: " + ob.disponibilitaCassa()
								+ "€");
						System.out.println("Tenendo conto della disponibilità del tuo"
								+ " conto corrente, puoi prelevare massimo " + 
								ob.disponibilitaBMT() + "€");
						ob.importo();
						System.out.println("Inserisci l'importo che desideri prelevare.");
						if(ob.verificaImporto()) {
							System.out.println("Preparo importo . . .");
							ob.preparaImporto();
						} else {
							System.out.println("L'importo supera la disponibilità indicata.");
						}
					} else {
						System.out.println("Conto corrente vuoto.");
					}
				} else {
					System.out.println("PIN non corretto.");
				}
			}
			System.out.println("Vuoi iniziare una nuova operazione? (si/no)");
		}while(ob.scan.nextLine().equalsIgnoreCase("si"));
		
		System.out.println("Fine operazione");
	}

}
