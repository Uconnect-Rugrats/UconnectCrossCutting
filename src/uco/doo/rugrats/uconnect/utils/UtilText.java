package uco.doo.rugrats.uconnect.utils;

public final class UtilText {

	private static final String EMAIL_RE = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
	private static final String DEFAULT_EMAIL = "uconnectrugrats@gmail.com";
	private static final String NUMERIC_RE = "[0-9]+";
	private static final String DEFAULT_NUMERIC = "0";
	private static final UtilText INSTANCE = new UtilText();
	public static final String EMPTY = "";
	
	private UtilText() {
		super();
	}
	
	public static final UtilText getUtilText(){
		return INSTANCE;
	}
	
	public static final boolean isNull(final String text) {
		return UtilObject.isNull(text);
	}
	
	public static final String getDefault(final String text, final String defaultValue) {

		String result = text;
		if (isNull(text)) {
			result = isNull(defaultValue)? EMPTY: defaultValue;
		}
		return result;
	}
	
	public static final String getDefaultValue() {
		return EMPTY;
	}

	public static final String getDefaultNumeric(){
		return DEFAULT_NUMERIC;
	}

	public static final String getDefaultEmailAdress(){
		return DEFAULT_EMAIL;
	}
	
	public static final String getDefault(final String text) {
		return (getDefault(text, EMPTY));
	}
	
	public static final String applyTrim(final String text){
		return getDefault(text).trim();
	}
	
	public final boolean matchPattern(final String text, final String pattern) {
		return getDefault(text).matches(getDefault(pattern));
	}

	public static boolean numericIsValid(final String numericString){
		return isNull(numericString) ? false : getUtilText().matchPattern(numericString, NUMERIC_RE);
	}

	public static boolean emailIsvalid(final String emailAdress){
		return isNull(emailAdress) ? false : getUtilText().matchPattern(emailAdress, EMAIL_RE);
	}
	
	public static void main(String[] args) {
		System.out.println(emailIsvalid("tejadaramirezc@gmail.com"));
	}

}