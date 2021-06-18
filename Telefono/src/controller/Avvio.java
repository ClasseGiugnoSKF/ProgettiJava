package controller;
import app.Applicazioni;

public class Avvio {
	
	public static void main(String[] args) {
		Applicazioni app = new Applicazioni();
			switch(app.menu()) {
			case 1:
				app.browser();
				break;
			case 2:
				app.rubricaMenu();
				break;
			case 3:
				app.messaggi();
				break;
		}

	}

}
