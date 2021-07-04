
public class Avvio {

	public static void main(String[] args) {
		GestioneIO io = new GestioneIO();
		byte scelta;

		do {
			io.menu();
			scelta = io.leggiByte("Quale operazione vuoi eseguire?: ");
			switch(scelta) {
			case 1:
				IOperazione sommaClassic = new IOperazione() {
					@Override
					public Double operazione(Double num1, Double num2) {
						return num1+num2;
					}
				};
				IOperazione sommaLambda = (num1,num2)-> num1+num2;
				switch(io.leggiByte("Operazione classica (1) o lambda? (2)")) {
				case 1:
					System.out.println(sommaClassic.operazione(io.leggiDouble("Inserisci il primo numero: "), 
							io.leggiDouble("Inserisci il secondo numero: ")));
					break;
				case 2:
					System.out.println(sommaLambda.operazione(io.leggiDouble("Inserisci il primo numero: "), 
							io.leggiDouble("Inserisci il secondo numero: ")));
				}			
				break;
			case 2:
				IOperazione sottraiClassic = new IOperazione() {
					@Override
					public Double operazione(Double num1, Double num2) {
						return num1-num2;
					}
				};
				IOperazione sottraiLambda = (num1,num2) -> num1-num2;
				switch(io.leggiByte("Operazione classica (1) o lambda? (2)")) {
				case 1:
					System.out.println(sottraiClassic.operazione(io.leggiDouble("Inserisci il primo numero: "), 
							io.leggiDouble("Inserisci il secondo numero: ")));
					break;
				case 2:
					System.out.println(sottraiLambda.operazione(io.leggiDouble("Inserisci il primo numero: "), 
							io.leggiDouble("Inserisci il secondo numero: ")));
				}	
				break;
			case 3:
				IOperazione moltiplicaClassic = new IOperazione() {
					@Override
					public Double operazione(Double num1, Double num2) {
						return num1*num2;
					}
				};
				IOperazione moltiplicaLambda = (num1,num2) -> num1*num2;
				switch(io.leggiByte("Operazione classica (1) o lambda? (2)")) {
				case 1:
					System.out.println(moltiplicaClassic.operazione(io.leggiDouble("Inserisci il primo numero: "), 
							io.leggiDouble("Inserisci il secondo numero: ")));
					break;
				case 2:
					System.out.println(moltiplicaLambda.operazione(io.leggiDouble("Inserisci il primo numero: "), 
							io.leggiDouble("Inserisci il secondo numero: ")));
				}	
				break;
			case 4:
				IOperazione dividiClassic = new IOperazione() {
					@Override
					public Double operazione(Double num1, Double num2) {
						return num1/num2;
					}
				};
				IOperazione dividiLambda = (num1,num2) -> num1/num2;
				switch(io.leggiByte("Operazione classica (1) o lambda? (2)")) {
				case 1:
					System.out.println(dividiClassic.operazione(io.leggiDouble("Inserisci il primo numero: "), 
							io.leggiDouble("Inserisci il secondo numero: ")));
					break;
				case 2:
					System.out.println(dividiLambda.operazione(io.leggiDouble("Inserisci il primo numero: "), 
							io.leggiDouble("Inserisci il secondo numero: ")));
				}	
				break;
			case 5:
				IOperazione potenzaClassic = new IOperazione() {
					@Override
					public Double operazione(Double num1, Double num2) {
						return Math.pow(num1, num2);
					}
				};
				IOperazione potenzaLambda = (num1,num2) -> Math.pow(num1, num2);
				switch(io.leggiByte("Operazione classica (1) o lambda? (2)")) {
				case 1:
					System.out.println(potenzaClassic.operazione(io.leggiDouble("Inserisci il primo numero: "), 
							io.leggiDouble("Inserisci la potenza: ")));
					break;
				case 2:
					System.out.println(potenzaLambda.operazione(io.leggiDouble("Inserisci il primo numero: "), 
							io.leggiDouble("Inserisci la potenza: ")));
				}	
				break;
			case 6:
				IOperazione radiceClassic = new IOperazione() {
					@Override
					public Double operazione(Double num1, Double num2) {
						return Math.pow(num1, 1/num2);
					}
				};
				IOperazione radiceLambda = (num1,num2) -> Math.pow(num1, 1/num2);
				switch(io.leggiByte("Operazione classica (1) o lambda? (2)")) {
				case 1:
					System.out.println(radiceClassic.operazione(io.leggiDouble("Inserisci il primo numero: "), 
							io.leggiDouble("Inserisci il radicando: ")));
					break;
				case 2:
					System.out.println(radiceLambda.operazione(io.leggiDouble("Inserisci il primo numero: "), 
							io.leggiDouble("Inserisci l'indice della radice: ")));
				}	
				break;
			case 7:
				IFigura2D esagono = new IFigura2D() {
					@Override
					public Double calcoloArea(Double num1) {
						return (num1*calcoloPerim(io.leggiDouble("Inserisci il lato: ")))/2;
					}

					@Override
					public Double calcoloPerim(Double num1) {
						return num1*6;
					}
				};
				switch(io.leggiByte("Vuoi calcolare il perimetro (1) o l'area? (2)")) {
				case 1:
					System.out.println(esagono.calcoloPerim(io.leggiDouble("Inserisci il lato: ")));
					break;
				case 2:
					System.out.println(esagono.calcoloArea(io.leggiDouble("Inserisci l'apotema: ")));
				}
				break;
			case 8:
				IFigura2D cerchio = new IFigura2D() {
					final Double PIGRECO = 3.14;
					@Override
					public Double calcoloArea(Double num1) {
						return PIGRECO*Math.pow(num1, 2);
					}

					@Override
					public Double calcoloPerim(Double num1) {
						return 2*PIGRECO*num1;
					}
				};
				switch(io.leggiByte("Vuoi calcolare il perimetro (1) o l'area? (2)")) {
				case 1:
					System.out.println(cerchio.calcoloPerim(io.leggiDouble("Inserisci il lato: ")));
					break;
				case 2:
					System.out.println(cerchio.calcoloArea(io.leggiDouble("Inserisci l'apotema: ")));
				}
				break;
			case 9:
				System.out.println("Fine programma.");
			}
		}while(scelta!=9);
	}
}
