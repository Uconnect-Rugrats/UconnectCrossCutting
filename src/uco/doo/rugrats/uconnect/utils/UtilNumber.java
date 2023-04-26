package co.edu.uco.publiuco.utils;

public final class UtilNumber {

    private static final UtilNumber INSTANCE = new UtilNumber();
    public static final Number NUMBER_DEFAULT = 0;

    private UtilNumber() {
        super();
    }

    public static UtilNumber getUtilInt(){
        return INSTANCE;
    }

    public static Number getDefaultValue() {
        return NUMBER_DEFAULT;
    }
    public static byte getIntegerDefaultValue() {
        return getDefaultValue().byteValue();
    }
    public static float getRealDefaultValue() {
        return getDefaultValue().floatValue();
    }



    public static Number getDefault(final Number number, final Number default_value){
        Number result = number;
        if (isNull(number)){
            result = isNull(default_value)? NUMBER_DEFAULT: default_value;
        }
        return result;
    }

    public static boolean isNull(final Number number){
        return UtilObject.isNull(number);
    }

    public static void main(String[] args) {
        int number = getIntegerDefaultValue();
        double numberTwo = getRealDefaultValue();
        System.out.println(getDefault(null, null));
    }
}
