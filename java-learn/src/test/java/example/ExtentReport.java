package example;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class ExtentReport {

    @Test
    public void case1() {
        ExtentReports extent = new ExtentReports();
        ExtentTest test = extent.createTest("twoTest", "这是一个描述");
        test.log(Status.INFO, "this is ");
        test.info("this is test hello world");
        test.fail("details");
        String a = "helloworld";
        Assert.assertEquals(a, "helloworld!");
        extent.flush();

    }

    @Test
    public static void main(String[] args) throws IOException {
        // start reporters
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");

        // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();

        extent.attachReporter(htmlReporter);

        // creates a toggle for the given test, adds all log events under it
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");

        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");

        // log with snapshot
//        test.fail("details", MewdiaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

        // test with snapshot
//        test.addScreenCaptureFromPath("screenshot.png");

        // calling flush writes everything to the log file
        extent.flush();
    }
}