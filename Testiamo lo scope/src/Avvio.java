
public class Avvio {

	public static void main(String[] args) {
		Test t = new Test();
		t.metodo1();
		t.metodo2();
		t.metodo3(); // effetto shadowing / ombra: la variabile locale sta oscurando quella globale
	}

}
