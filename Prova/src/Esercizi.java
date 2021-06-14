import java.util.Scanner;

public class Esercizi {
	Scanner input=new Scanner(System.in);
	public void matrice() {
		int [][] matrice=new int [2][3];
		for (int z=0;z<2;z++)
			for (int x=0;x<=3;x++) {
				System.out.print("Valori numerici: ["+(z+1)+"]["+(x+1)+"]:");
				matrice[z][x]=Integer.parseInt(input.nextLine());
			}
		for (int z=0;z<2;z++)
			for (int x=0;x<3;x++) {
				System.out.println("matrice["+(z+1)+"]["+(x+1)+"]:"+matrice[z][x]+" ");
			}
	}
}
