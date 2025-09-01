package org.selcuk.projectutils;

public class OSInfoUtils {
    private OSInfoUtils() {
    }

    public static String getOSInfo() {
        return System.getProperty("os.name").replace(" ", "_");
    }

}
