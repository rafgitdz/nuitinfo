package model.user.exceptions;

public class cannotAddSameUserTwiceException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public cannotAddSameUserTwiceException(String message) {
		super(message);
	}
}
