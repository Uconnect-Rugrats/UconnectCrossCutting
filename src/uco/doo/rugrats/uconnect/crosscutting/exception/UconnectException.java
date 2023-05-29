package uco.doo.rugrats.uconnect.crosscutting.exception;


import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilText;

public abstract class UconnectException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private ExceptionType type;
	private String userMessage;
	
	protected UconnectException(String technicalMessage, String userMessage, Throwable rootCause, ExceptionType type) {
		super(technicalMessage, rootCause);
		setUserMessage(userMessage);
		setType(type);
	}
	
	public final Throwable getRootCause() {
		return UtilObject.getDefault(getCause(), new Exception());
	}
	
	public final String getTechnicalMessage() {
		return UtilText.getUtilText().getDefaultIfEmpty(getMessage(), getUserMessage());
	}

	public final ExceptionType getType() {
		return type;
	}

	private final void setType(ExceptionType type) {
		this.type = UtilObject.getDefault(type, ExceptionType.GENERAL);
	}

	public final String getUserMessage() {
		return userMessage;
	}

	public final void setUserMessage(String userMessage) {
		this.userMessage = UtilText.getUtilText().getDefault(userMessage);
	}
	
	
}
