package org.selcuk.projectreports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.selcuk.constants.FrameworkConstants;
import org.selcuk.projectenums.AuthorType;
import org.selcuk.projectenums.CategoryType;
import org.selcuk.projectutils.BrowserInfoUtils;
import org.selcuk.projectutils.IconUtils;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

import static org.selcuk.constants.FrameworkConstants.*;

public class ExtentReport {
    private ExtentReport() {
    }

    private static ExtentReports extent;

    public static void initReports() {
        if (Objects.isNull(extent)) {
            extent = new ExtentReports();
            ExtentSparkReporter spark = new ExtentSparkReporter(FrameworkConstants.getExtentReportFilePath());
            extent.attachReporter(spark);

            // spark.config().setEncoding("utf-8");
            spark.config().setTheme(Theme.STANDARD);
            spark.config().setDocumentTitle(FrameworkConstants.getProjectName() + " - ALL");
            spark.config().setReportName(FrameworkConstants.getProjectName() + " - ALL");

            extent.setSystemInfo("Organization", "Nagarro");
            extent.setSystemInfo("Employee",
                    "<b> Cagri Selcuk </b>" + " " + ICON_SOCIAL_LINKEDIN + " " + ICON_SOCIAL_GITHUB);
            extent.setSystemInfo("Domain", "Engineering (IT - Software)"+"  "+ICON_LAPTOP);
            extent.setSystemInfo("Skill", "Test Automation Engineer");
        }
    }

    public static void flushReports() throws IOException {
        if (Objects.nonNull(extent)) {
            extent.flush();
        }
        ExtentManager.unload();
        try {
            Desktop.getDesktop().browse(new File(FrameworkConstants.getExtentReportFilePath()).toURI());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createTest(String testCaseName) {
        ExtentManager.setExtentTest(extent.createTest(IconUtils.getBrowserIcon() + " : " + testCaseName));
    }

    synchronized public static void addAuthors(AuthorType[] authors) {
        for (AuthorType author : authors) {
            ExtentManager.getExtentTest().assignAuthor(author.toString());
        }
    }

    // public static void addCategories(String[] categories) {
    synchronized public static void addCategories(CategoryType[] categories) {
        // for (String category : categories) {
        for (CategoryType category : categories) {
            ExtentManager.getExtentTest().assignCategory(category.toString());
        }
    }

    synchronized public static void addDevices() {
        ExtentManager.getExtentTest().assignDevice(BrowserInfoUtils.getBrowserInfo());

    }
}
