package Base_Utils_Verify;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import org.openqa.selenium.WebDriver;

public class Verify_HTTPRequest {
	
	
	 public static final String ANSI_RESET = "\u001B[0m";
	 public static final String ANSI_BLACK = "\u001B[30m";
	 public static final String ANSI_RED = "\u001B[31m";
	 public static final String ANSI_GREEN = "\u001B[32m";
	
	
	public static void Execute(WebDriver driver,  String APIlink, String name ) throws IOException   {
		
		// provide link, name when calling the method. ex: "link", "name"
		
		{

	         URL url = new URL(APIlink);
	         HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	         connection.setRequestMethod("GET");
	         connection.connect();

	         int statusCode = connection.getResponseCode();
	         System.out.println( "Response code of the [" + name + "] Submission is " + statusCode);
	         if (statusCode == 200) {
	             System.out.println(ANSI_GREEN + " [" + name + "] Submission Passed" + ANSI_RESET);
	         } else {
	             System.out.println(ANSI_RED + " [" + name + "] Submission Failed" + ANSI_RESET);
	         }

	     	}
		
		
		
		
		
	}

}
