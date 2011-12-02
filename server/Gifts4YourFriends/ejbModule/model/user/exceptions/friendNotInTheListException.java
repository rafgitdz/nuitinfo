package model.user.exceptions;

public class friendNotInTheListException extends RuntimeException {

	private static final long serialVersionUID = -3977510885307768745L;

	public friendNotInTheListException(String message) {
		super(message);
	}
}
