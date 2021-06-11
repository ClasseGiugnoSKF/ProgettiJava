package eccezioni;

@SuppressWarnings("serial")
public class MinimaLunghezzaException extends Exception {

	public MinimaLunghezzaException() {
		super("Errore!!! La stringa deve essere maggiore dei 3 caratteri");
	}

}
