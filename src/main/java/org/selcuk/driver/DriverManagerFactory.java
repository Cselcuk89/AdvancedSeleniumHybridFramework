package org.selcuk.driver;

import org.selcuk.projectenums.DriverType;

public class DriverManagerFactory {
    public static DriverManagerBase getManager(DriverType driverType){
        switch (driverType){
            case CHROME : {
                return new DriverManagerChrome();
            }
            case FIREFOX : {
                return new DriverManagerFirefox();
            }
            case EDGE: {
                return new DriverManagerEdge();
            }
            default : throw new IllegalArgumentException("Invalid Driver: " + driverType);
        }

    }
}
