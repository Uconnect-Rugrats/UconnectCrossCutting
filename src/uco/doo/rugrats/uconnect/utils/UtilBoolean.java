package uco.doo.rugrats.uconnect.utils;

public class UtilBoolean {
    private static final Boolean DEFAULT_BOOLEAN = false;
    private static final String DEFAULT_BOOLEAN_STRING = "false";

    private UtilBoolean(){
        super();
    }

    public static final Boolean isNull(Boolean bool){
        return UtilObject.isNull(bool) ? false : bool;
    }

    public static final Boolean convertFromString(String bool) {
        return UtilText.isNull(bool) ? getDefaultValue() : Boolean.parseBoolean(bool);
    }

    public static final Boolean getDefault(Boolean bool){
        return isNull(bool) ? getDefaultValue() : bool;
    }

    public static final Boolean getDefaultValue(){
        return DEFAULT_BOOLEAN;
    }

}
