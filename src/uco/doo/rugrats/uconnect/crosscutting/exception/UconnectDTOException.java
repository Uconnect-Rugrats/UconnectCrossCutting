package uco.doo.rugrats.uconnect.crosscutting.exception;

public class UconnectDTOException extends UconnectException{

	private static final long serialVersionUID = -4636066115510646740L;

	protected UconnectDTOException(String technicalMessage, String userMessage, Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.DTO);
		// TODO Auto-generated constructor stub
	}
	
	public static UconnectDTOException create(final String technicalMessage, final String userMessage, final Throwable rootCause) {
		return new UconnectDTOException(technicalMessage, userMessage, rootCause);
	}
	
	public static UconnectDTOException create(final String userMessage) {
		return new UconnectDTOException(userMessage, userMessage, new Exception());
	}
	
	public static UconnectDTOException create(final String technicalMessage, final String userMessage) {
		return new UconnectDTOException(technicalMessage, userMessage, new Exception());
	}
	

}
