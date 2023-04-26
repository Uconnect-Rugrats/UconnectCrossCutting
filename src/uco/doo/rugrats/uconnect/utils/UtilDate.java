package co.edu.uco.publiuco.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public final class UtilDate {

    //public static final String LOCALDATETIME_RE = "/((19|2[0-9])[0-9]{2})-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])[T][0-9]{2}[:][0-9]{2}[:][0-9]{2}[.][0-9]{3}/mg";
    public static final String LOCALDATETIME_RE = "((19|2[0-9])[0-9]{2})-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])[ ]([01][0-9]|2[0123])[:]([0-5][0-9])[:]([0-5][0-9])";

    public static final LocalDateTime getDefault(){
        return LocalDateTime.now();
    }

    public static final String getDefaultAsString(){
        return getDefault().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public static final boolean localDateTimeStringIsValid(final String localdateTimeValue){
        return (UtilText.getUtilText().matchPattern(localdateTimeValue, LOCALDATETIME_RE));
    }

    public static final LocalDateTime generate(String dateTime){
        DateTimeFormatter formater = new DateTimeFormatterBuilder().parseCaseInsensitive().append(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")).toFormatter();
        return (localDateTimeStringIsValid(dateTime)? LocalDateTime.parse(dateTime, formater): getDefault());
    }

    public static final LocalDateTime generate(String date, String time){
        String dateTime = date + " " + time;
        return generate(dateTime);
    }

    public static void main(String[] args) {
        //System.out.println(getDefault());
        System.out.println(generate("2018-12-17 23:26:30"));
    }
}
