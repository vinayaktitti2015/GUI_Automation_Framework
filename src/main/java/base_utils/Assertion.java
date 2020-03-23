package base_utils;


import java.io.IOException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class Assertion {

    // pass actual & expected values in the script ex:
    // class.Execute(driver,"actual","expected");

    public static void TextEquals(WebDriver driver, WebElement locator, String expected, String message)
            throws IOException {

        String Actual;
        WebElement element = locator;
        Actual = element.getText();
        Log.info("Actual Message Showing: " + Actual);

        if (!expected.contentEquals(Actual)) {
            Log.info("Actual Message Showing : " + Actual);
            Log.info("Expected Message Should Show : " + expected);
        }
        Assert.assertEquals(Actual, expected, message);
    }

    public static void TextContains(WebDriver driver, WebElement locator, String expected)
            throws Exception {
        String Actual;
        WebElement element = locator;
        Actual = element.getText();

        Log.info("Actual Message Showing: " + Actual);
        if (!Actual.contains(expected)) {
            throw new Exception("Actual Message Showing : " + Actual + "Expected Message Should Show : " + expected);
        }
    }

    public static void isSelected(WebDriver driver, WebElement locator, String message) throws IOException {
        Assert.assertTrue(locator.isSelected(), message);
    }

    public static void isEnabled(WebDriver driver, WebElement locator, String message) throws IOException {
        Assert.assertTrue(locator.isEnabled(), message);
    }

    public static void isDisplayed(WebDriver driver, WebElement locator, String message) throws IOException {
        Assert.assertTrue(locator.isDisplayed(), message);
    }

    public static void verify_Title(WebDriver driver, String expected, String result) throws IOException {
        Assert.assertEquals(driver.getTitle(), expected, result);
    }

    public static void verify_Text_Boolean(WebDriver driver, WebElement locator, String textname) throws IOException {

        try {
            WebElement TextFile = locator;
            String Actual = TextFile.getText();
            Boolean ImagePresent = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", Actual);

            if (!ImagePresent) {
                System.out.println(Actual + "  Text NOT Found.");
            } else {
                System.out.println(Actual + " Text  Found.");
            }
        } catch (Exception e) {
            System.out.println(e.getClass());
            e.printStackTrace();
        }

    }

    // pass actual & expected values in the script
    // ex:class.Execute(driver,"actual","expected");

    public static void Verify_Image_Boolean(WebDriver driver, WebElement locator, String pagename) throws IOException {
        // GET IMAGE
        try {
            WebElement ImageFile = locator;
            Boolean ImagePresent = (Boolean) ((JavascriptExecutor) driver).executeScript(
                    "return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0",
                    ImageFile);
            if (!ImagePresent) {
                Log.error(pagename + "  IMAGE NOT DISPLAYED.");
            } else {
                Log.info(pagename + " IMAGE DISPLAYED.");
            }
        } catch (Exception e) {
            System.out.println(e.getClass());
            e.printStackTrace();
        }
    }

    public static void Verify_Alert_Text(WebDriver driver, String expected) {
        try {
            // Now once we hit AlertButton we get the alert
            Alert alert = driver.switchTo().alert();
            // Text displayed on Alert using getText() method of Alert class
            String Actual = alert.getText();
            // accept() method of Alert Class is used for ok button
            alert.accept();
            // Verify Alert displayed correct message to user
            SoftAssert Assert = new SoftAssert();
            Assert.assertEquals(Actual, expected);

            if (!expected.contentEquals(Actual)) {
                Log.info("Actual Text Showing: " + Actual);
                Log.info("Expected Text Should Show : " + expected);
                Log.info("Assertion Failed");
            }
            Assert.assertAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
