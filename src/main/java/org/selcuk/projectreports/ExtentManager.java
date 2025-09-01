package org.selcuk.projectreports;

import com.aventstack.extentreports.ExtentTest;

public class ExtentManager {
    private ExtentManager() {}
    private static ThreadLocal<ExtentTest> extentTestThreadLocal = new ThreadLocal<>();
    public static ExtentTest getExtentTest(){
        return extentTestThreadLocal.get();
    }
    public static void setExtentTest(ExtentTest extentTest){
        extentTestThreadLocal.set(extentTest);
    }
    static void unload() {
        extentTestThreadLocal.remove();
    }

}
