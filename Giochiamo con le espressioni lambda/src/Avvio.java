import java.util.ArrayList;

public class Avvio {

	public static void main(String[] args) {
		/*
		 * Questo è un oggetto di classe anonima,
		 * ovvero una classe NON dichiarata esplicitamente
		 * figlia della classe astratta
		 */
		
		Figura2D quadrato = new Figura2D() {

			@Override
			public Double calcArea() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Double calcPerim() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		// Costruzione classica
		IFigura3D cilindroClassic = new IFigura3D() {
			@Override
			public Double calcVolume(Double area, Double altezza) {
				return area*altezza;
			}
		};
		System.out.println(cilindroClassic.calcVolume(4.5,7.3));
		
		// Costruzione lambda ex.
		IFigura3D cilindroLambda = (area, altezza)-> area*altezza;
		System.out.println(cilindroLambda.calcVolume(4.5,7.3));
		
		IFigura3D conoLambda = (area,altezza)->{
			Double lato1 = 78.9;
			final Double PIGRECO = 3.14;
			System.out.println("Fa caldo!!!"+lato1+","+PIGRECO);
			for(int i=1;i<=10;i++)
				System.out.println(i);
			return area*altezza;
		};
		System.out.println(conoLambda.calcVolume(5.53, 9.54));
	}

}
