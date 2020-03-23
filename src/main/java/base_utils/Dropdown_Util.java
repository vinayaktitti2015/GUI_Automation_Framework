package base_utils;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Dropdown_Util {

    public static void SelectByIndex(WebElement locator, int indx) throws IOException {
        WebElement dropdown = locator;
        Select value = new Select(dropdown);
        value.selectByIndex(indx);
    }

    public static void SelectByVisibleText(WebElement locator, String strng)
            throws IOException, InterruptedException {
        WebElement dropdown = locator;
        Select value = new Select(dropdown);
        value.selectByVisibleText(strng);
    }

    public static void SelectByValue(WebElement locator, String strng)
            throws IOException, InterruptedException {
        WebElement dropdown = locator;
        Select value = new Select(dropdown);
        value.selectByValue(strng);
    }

    public static void Elements_Clickable(WebElement locator) throws IOException {
        // id of the dropdown
        WebElement dropdown = locator;

        // capture all the proprty type elements
        List<WebElement> list = dropdown.findElements(By.tagName("option"));
        for (int i = 0; i < list.size(); i++) {
            list.get(i).click();

            if (!list.get(i).isSelected()) {
                Log.info(list.get(i).getText() + " is In-Active");
            }
            Assert.assertTrue(list.get(i).isSelected(), list.get(i).getText() + " : is In-Active");
        }
    }

    public static void Capture_dropdown_elements(WebElement locator) throws IOException {
        // id of the dropdown
        WebElement dropdown = locator;
        // capture all the proprty type elements
        List<WebElement> list = dropdown.findElements(By.tagName("option"));

        for (int i = 0; i < list.size(); i++) {
            Log.info(list.get(i).getText());
        }
    }
}

// usage in class
// Dropdown_Util.SelectByIndex(driver, loc);