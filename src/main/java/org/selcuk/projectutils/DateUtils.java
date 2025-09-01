package org.selcuk.projectutils;

import java.util.Date;

public class DateUtils {
    private DateUtils() {
    }

    public static String getCurrentDate() {
        Date date = new Date();
        return date.toString().replace(":", "_").replace(" ", "_");
    }
}
