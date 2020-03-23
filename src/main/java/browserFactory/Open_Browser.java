package browserFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Browser {

    public static void Execute(WebDriver driver, String baseurl) {
        // Create a new instance of the  driver
        System.setProperty("webdriver.chrome.driver", "path");
        driver = new ChromeDriver();

        // Launch the URL
        driver.get(baseurl);

        //Maximize the browser
        driver.manage().window().maximize();

        // Put an Implicit wait,
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
