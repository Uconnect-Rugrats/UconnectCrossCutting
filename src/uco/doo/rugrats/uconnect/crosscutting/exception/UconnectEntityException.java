package uco.doo.rugrats.uconnect.crosscutting.exception;

public class UconnectEntityException extends UconnectException{

	private static final long serialVersionUID = -4636066115510646740L;

	protected UconnectEntityException(String technicalMessage, String userMessage, Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.ENTITY);
		// TODO Auto-generated constructor stub
	}
	
	public static UconnectEntityException create(final String technicalMessage, final String userMessage, final Throwable rootCause) {
		return new UconnectEntityException(technicalMessage, userMessage, rootCause);
	}
	
	public static UconnectEntityException create(final String userMessage) {
		return new UconnectEntityException(userMessage, userMessage, new Exception());
	}
	
	public static UconnectEntityException create(final String technicalMessage, final String userMessage) {
		return new UconnectEntityException(technicalMessage, userMessage, new Exception());
	}
	

}
