package Base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;
//import lombok.var;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.sql.Driver;

public class ExtentReportUtil extends BaseUtil {

   String fileName=reportLocation + "extentreport.html";
 //create extent report object

    public void ExtentReport() {
     extent=new ExtentReports();
     ExtentSparkReporter sparkReporter=new ExtentSparkReporter(fileName);
     sparkReporter.config().setTheme(Theme.DARK);
     sparkReporter.config().setDocumentTitle("Test report for Selenium basics");
     sparkReporter.config().setEncoding("utf-8");
     sparkReporter.config().setReportName("Test report");
     extent.attachReporter(sparkReporter);

    }

//    public void extentReportScreenshot() {
//        var scr= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        Files.copy(scr.toPath(), new File(reportLocation + "screenshot.png").toPath());
//
//    }

    public void FlushExtentReport() {
        extent.flush();
    }

}
