package uco.doo.rugrats.uconnect.crosscutting.exception;

public class UconnectBusisnessException extends UconnectException{

	private static final long serialVersionUID = -4636066115510646740L;

	protected UconnectBusisnessException(String technicalMessage, String userMessage, Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.BUSISNESS);
		// TODO Auto-generated constructor stub
	}
	
	public static UconnectBusisnessException create(final String technicalMessage, final String userMessage, final Throwable rootCause) {
		return new UconnectBusisnessException(technicalMessage, userMessage, rootCause);
	}
	
	public static UconnectBusisnessException create(final String userMessage) {
		return new UconnectBusisnessException(userMessage, userMessage, new Exception());
	}
	
	public static UconnectBusisnessException create(final String technicalMessage, final String userMessage) {
		return new UconnectBusisnessException(technicalMessage, userMessage, new Exception());
	}
	

}
