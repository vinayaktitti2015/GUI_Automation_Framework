package base_utils;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.WebDriver;

public class Verify_HTTPRequest {

    public static void Execute(WebDriver driver, String link, String name) throws IOException {
        // provide link, name when calling the method. ex: "link", "name"
        {
            URL url = new URL(link);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();

            int statusCode = connection.getResponseCode();
            Log.info("Response code of the [" + name + "] Submission is " + statusCode);
            if (statusCode == 200) {
                Log.info(" [" + name + "] Status Passed");
            } else {
                Log.error(" [" + name + "] Status Failed");
            }
        }
    }
}
