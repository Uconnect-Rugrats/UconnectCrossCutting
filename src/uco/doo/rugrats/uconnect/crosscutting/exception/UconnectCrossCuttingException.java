package uco.doo.rugrats.uconnect.crosscutting.exception;

public class UconnectCrossCuttingException extends UconnectException{

	private static final long serialVersionUID = -4636066115510646740L;

	protected UconnectCrossCuttingException(String technicalMessage, String userMessage, Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.CROSSCUTTING);
		// TODO Auto-generated constructor stub
	}
	
	public static UconnectCrossCuttingException create(final String technicalMessage, final String userMessage, final Throwable rootCause) {
		return new UconnectCrossCuttingException(technicalMessage, userMessage, rootCause);
	}
	
	public static UconnectCrossCuttingException create(final String userMessage) {
		return new UconnectCrossCuttingException(userMessage, userMessage, new Exception());
	}
	
	public static UconnectCrossCuttingException create(final String technicalMessage, final String userMessage) {
		return new UconnectCrossCuttingException(technicalMessage, userMessage, new Exception());
	}
	

}
