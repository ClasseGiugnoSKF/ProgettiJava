
public class Calcolatrice {

	double addizione(double a, double b) {
		return a + b;
	}

	double addizione(double a, double b, double c) {
		return a + b + c;
	}

	double sottrazione(double a, double b) {
		return a - b;
	}

	double sottrazione(double a, double b, double c) {
		return a - b - c;
	}

	double moltiplicazione(double a, double b) {
		return a * b;
	}

	double moltiplicazione(double a, double b, double c) {
		return a * b * c;
	}

	double divisione(double a, double b) {
		return a / b;
	}

	double divisione(double a, double b, double c) {
		return a / b / c;
	}
	
	void determinante(int[][] matrice) {
		for(int i=0;i<=matrice.length/2;i++) {
			System.out.println((matrice[i][i] * matrice[matrice.length-1-i][matrice.length-1-i]));
		}
	}

}
