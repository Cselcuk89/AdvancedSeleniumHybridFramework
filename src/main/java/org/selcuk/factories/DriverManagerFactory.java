package org.selcuk.factories;

import org.selcuk.driver.DriverManagerBase;
import org.selcuk.driver.DriverManagerChrome;
import org.selcuk.driver.DriverManagerEdge;
import org.selcuk.driver.DriverManagerFirefox;
import org.selcuk.projectenums.DriverType;

public class DriverManagerFactory {
    public static DriverManagerBase getManager(DriverType driverType) {

        switch (driverType) {

            case CHROME: {
                return new DriverManagerChrome();
            }
            case FIREFOX: {
                return new DriverManagerFirefox();
            }
            case EDGE: {
                return new DriverManagerEdge();
            }
            default:
                throw new IllegalArgumentException("Invalid Driver: " + driverType);
        }

    }
}
