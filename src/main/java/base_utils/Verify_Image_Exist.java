package base_utils;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Verify_Image_Exist {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public static void Execute(WebDriver driver, WebElement locator, String pagename) throws IOException {
        try {
            WebElement ImageFile = locator;
            Boolean ImagePresent = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
            if (!ImagePresent) {
                Log.error(ANSI_RED + pagename + "  IMAGE NOT DISPLAYED." + ANSI_RESET);
            } else {
                Log.info(ANSI_GREEN + pagename + " IMAGE DISPLAYED." + ANSI_RESET);
            }
        } catch (Exception e) {
            System.out.println(e.getClass());
            e.printStackTrace();
        }
    }
}
