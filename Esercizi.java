
public class Esercizi {

	public static void main(String[] args) {
		
		String var = "Skill Factory";
		if(var.equalsIgnoreCase("skill Factory")) {
			System.out.println("Welcome!");
		}
		else {
			System.out.println("Le due stringhe non corrispondono");
		}
		
		String var1 = "Skill";
		String var2 = "Factory";
		String var3 = "Channell";
		String spazio = " ";
		
		System.out.println(var1.concat( spazio + var2 + spazio + var3));
		
		String subStr1 = var.substring(0,5);
		String subStr2 = var.substring(6);
		
		
		System.out.println(var.substring(6));
		System.out.println(subStr1.concat(subStr2));
		
		
		if(var.contains("g")) {
			System.out.println("ok");
		}
		else {
			System.out.println("non contiene la lettera");
		}
		
		
		System.out.println(var.length());
		
		
		String vuoto = "";
		
		if(vuoto.isEmpty()) {
			System.out.println("La parola è vuota");
		}
		
		String nomi = "Federico,Rosa,Fabrizio,Mario";
		
		String[] array = nomi.split(",");
			for(int contatore = 0; contatore < array.length; contatore++) {
				System.out.println(array[contatore]);
			}
		
		
		System.out.println(var.trim());
		
		String replace = var.replace("l", "C");
		String replaceAll = var.replaceAll("Skill", "Ciao");
		
		System.out.println(replace);
		System.out.println(replaceAll);
		
		
		System.out.println(var.charAt(5));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				

	}

}
