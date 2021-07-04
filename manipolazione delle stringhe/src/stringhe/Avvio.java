package stringhe;

public class Avvio {

	public static void main(String[] args) {
		String var="Skill Factory";
		String subStr1=var.substring(0,6); //viene estratto «Skill»
		String subStr2=var.substring(6); //viene estratto «Factory»
		System.out.println(subStr1); //stampo «Skill»
		System.out.println(subStr2); //stampo «Factory»
		System.out.print(subStr1.concat(subStr2)); //stampo «Skill Factory»

	}

}
