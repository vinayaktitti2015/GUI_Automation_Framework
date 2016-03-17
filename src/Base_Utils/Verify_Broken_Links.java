package Base_Utils;



import java.util.List;
 
import java.util.concurrent.TimeUnit;


import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.WebElement;
 
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
 
//import org.openqa.selenium.*;
//import org.openqa.selenium.firefox.*;
 



public class Verify_Broken_Links {
 
	public WebDriver driver;
	public static int invalidLinksCount;
	
	
	
	

	
	public static void Execute(WebDriver driver)   {

		try {
			
			invalidLinksCount = 0;
			
			List<WebElement> anchorTagsList = driver.findElements(By.tagName("a"));
			
			anchorTagsList.addAll(driver.findElements(By.tagName("img")));
			
			System.out.println("Total no. of links are "+ anchorTagsList.size());
			
			
			for (WebElement anchorTagElement : anchorTagsList) {
				if (anchorTagElement != null) {
					String url = anchorTagElement.getAttribute("href");
					
									
					//WebElement number = driver.findElement(By.xpath("//*[@id='top']/div/div/a"));
					//URL u = number.toURL();
					
					
					
					if (url != null && !url.contains("javascript")&& !url.contains("hello@imoney.sg") && !url.contains("03 2106 5434")
							&& !url.contains("tel:+639174135028") && !url.contains("tel:+639174135028")  )
					
					
					
					{
						
						//String thePath = "03 2106 5434";
						//thePath = URLEncoder.encode(thePath, "UTF-8"); 
						
						
						verifyURLStatus(url);
					} else {
						invalidLinksCount++;
					}
				}
			}

			//System.out.println("Total no. of invalid links are " + invalidLinksCount);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	
	
	
	

	public static void verifyURLStatus(String url) {

		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(url);
		try {
			HttpResponse response = client.execute(request);
			// verifying response code and The HttpStatus should be 200 if not,
			// increment invalid link count
			////We can also check for 404 status code like response.getStatusLine().getStatusCode() == 404
			if (response.getStatusLine().getStatusCode() == 404){
				
			    System.out.println("The Broken links are " + url);
			    System.out.println(url);
			    
			    invalidLinksCount++;

				//System.out.println("URL: " + anchorTagElement.getAttribute("href")+ " returned " + verifyURLStatus(new url(anchorTagElement.getAttribute("href"))));

				//System.out.println("URL: " + element.getAttribute("outerhtml")+ " returned " + isLinkBroken(new URL(element.getAttribute("href"))));
			    
			}
			else {

				//System.out.println("The passed links are " + url);

				//System.out.println("At " + anchorTagElement.getAttribute("innerHTML") + " Exception occured -&gt; " + e.getMessage());

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}






