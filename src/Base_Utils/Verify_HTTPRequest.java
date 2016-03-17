package Base_Utils;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import org.openqa.selenium.WebDriver;

public class Verify_HTTPRequest {
	
	
	
	public static void Execute(WebDriver driver,  String link, String name ) throws IOException   {
		
		// provide link, name when calling the method. ex: "link", "name"
		
		{

	         URL url = new URL(link);
	         HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	         connection.setRequestMethod("GET");
	         connection.connect();

	         int statusCode = connection.getResponseCode();
	         System.out.println("Response code of the [" + name + "] Submission is " + statusCode);
	         if (statusCode == 200) {
	             System.out.println(" [" + name + "] Submission Passed");
	         } else {
	             System.out.println(" [" + name + "] Submission Failed");
	         }

	     	}
		
		
		
		
		
	}

}
