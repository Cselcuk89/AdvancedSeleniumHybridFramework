package org.selcuk.javamailapi;

import org.selcuk.constants.FrameworkConstants;

public class EmailConfig {
    public static final String SERVER = "smtp.gmail.com";
    public static final String PORT = "587";

    public static final String FROM = "testtmail95@gmail.com";
    public static final String PASSWORD = "********";

    /* "**********@gmail.com", */
    public static final String[] TO = {"testtmail95@gmail.com"};
    public static final String SUBJECT = FrameworkConstants.getProjectName();
}
