package org.selcuk.projectutils;

import org.zeroturnaround.zip.ZipUtil;

import java.io.File;

import static org.selcuk.constants.FrameworkConstants.EXTENT_REPORT_FOLDER_PATH;
import static org.selcuk.constants.FrameworkConstants.Zipped_ExtentReports_Folder_Name;

public class ZipUtils {
    /* make Zip file of Extent Reports in Project Root folder */
    public static void zip() {
        ZipUtil.pack(new File(EXTENT_REPORT_FOLDER_PATH),
                new File(Zipped_ExtentReports_Folder_Name));

        System.out.println("Zipped ExtentReports folder successfuly");
    }
    }


