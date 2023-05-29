package uco.doo.rugrats.uconnect.crosscutting.exception;

public class UconnectDataException extends UconnectException{

	private static final long serialVersionUID = -4636066115510646740L;

	protected UconnectDataException(String technicalMessage, String userMessage, Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.DATA);
		// TODO Auto-generated constructor stub
	}
	
	public static UconnectDataException create(final String technicalMessage, final String userMessage, final Throwable rootCause) {
		return new UconnectDataException(technicalMessage, userMessage, rootCause);
	}
	
	public static UconnectDataException create(final String userMessage) {
		return new UconnectDataException(userMessage, userMessage, new Exception());
	}
	
	public static UconnectDataException create(final String technicalMessage, final String userMessage) {
		return new UconnectDataException(technicalMessage, userMessage, new Exception());
	}
	

}
