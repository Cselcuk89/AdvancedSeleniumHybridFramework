package org.selcuk.driver;

import org.openqa.selenium.WebDriver;

public class DriverManager {
    private DriverManager(){}
    private static ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<WebDriver>();
    public static WebDriver getDriver(){
        return driverThreadLocal.get();
    }
    public static void setDriver(WebDriver driver){
        driverThreadLocal.set(driver);
    }
    public static void unload(){
        driverThreadLocal.remove();
    }
}
