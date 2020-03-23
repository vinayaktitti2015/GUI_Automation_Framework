package browserFactory;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class TearDown_Browser {

    public static void Execute(WebDriver driver, ITestResult result) {
        // Here will compare if test is failing then only it will enter into if condition
        if (ITestResult.FAILURE == ((ITestResult) result).getStatus()) {
            try {
                // Create refernce of TakesScreenshot
                TakesScreenshot ts = (TakesScreenshot) driver;

                // Call method to capture screenshot
                File source = ts.getScreenshotAs(OutputType.FILE);

                // Copy files to specific location here it will save all screenshot in our project home directory and
                // result.getName() will return name of test case so that screenshot name will be same
                FileUtils.copyFile(source, new File("./Execution_Screenshots/Failed_Case_Screenshots/" + result.getName() + ".png"));

                System.out.println("Screenshot taken");
                System.out.println("Test FAILED");
            } catch (Exception e) {
                System.out.println("Exception while taking screenshot " + e.getMessage());
            }
        }

        // Here will compare if test is success then only it will enter into if condition
        else if (ITestResult.SUCCESS == ((ITestResult) result).getStatus()) {
            try {
                // Create refernce of TakesScreenshot
                TakesScreenshot ts = (TakesScreenshot) driver;

                // Call method to capture screenshot
                File source = ts.getScreenshotAs(OutputType.FILE);

                // Copy files to specific location here it will save all screenshot in our project home directory and
                // result.getName() will return name of test case so that screenshot name will be same
                FileUtils.copyFile(source, new File("./Execution_Screenshots/Passed_Case_Screenshots/" + result.getName() + ".png"));
            } catch (Exception e) {
                System.out.println("Exception while taking screenshot " + e.getMessage());
            }
        }

        // close application
        driver.quit();
    }
}
