package org.selcuk.projectutils;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.selcuk.driver.DriverManager;

public class BrowserInfoUtils {
    private BrowserInfoUtils() {
    }
    public static String getBrowserInfo(){
        Capabilities capabilities =
                ((RemoteWebDriver) DriverManager.getDriver()).getCapabilities();
        return capabilities.getBrowserName().toUpperCase();
    }
    public static String getBrowserVersionInfo(){
        Capabilities capabilities =
                ((RemoteWebDriver) DriverManager.getDriver()).getCapabilities();
        return capabilities.getVersion();
    }
}
