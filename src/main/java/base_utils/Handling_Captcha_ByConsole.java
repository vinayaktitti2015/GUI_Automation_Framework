package base_utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.openqa.selenium.WebDriver;


public class Handling_Captcha_ByConsole {

    public WebDriver driver;
    public static void Execute(WebDriver driver) throws IOException {

// We can't automate captacha but can Handle those.
// scenario: 1. enter username 2. enter captcha in console manually 3. enter password

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String captcha;
        System.out.println("Please Enter the CAPTCHA Code:: ");
        captcha = br.readLine();
        System.out.println("Entered  CAPTCHA Code is:: " + captcha);
    }
}








