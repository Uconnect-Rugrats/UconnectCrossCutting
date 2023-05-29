package uco.doo.rugrats.uconnect.crosscutting.exception;

public class UconnectAPIException extends UconnectException{

	private static final long serialVersionUID = -4636066115510646740L;

	protected UconnectAPIException(String technicalMessage, String userMessage, Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.API);
		// TODO Auto-generated constructor stub
	}
	
	public static UconnectAPIException create(final String technicalMessage, final String userMessage, final Throwable rootCause) {
		return new UconnectAPIException(technicalMessage, userMessage, rootCause);
	}
	
	public static UconnectAPIException create(final String userMessage) {
		return new UconnectAPIException(userMessage, userMessage, new Exception());
	}
	
	public static UconnectAPIException create(final String technicalMessage, final String userMessage) {
		return new UconnectAPIException(technicalMessage, userMessage, new Exception());
	}
	

}
