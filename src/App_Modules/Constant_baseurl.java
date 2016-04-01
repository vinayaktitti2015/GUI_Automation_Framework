package App_Modules;

import org.DDT.Excel_Data_Config;
import org.apache.log4j.Logger;

import Test_Scripts_Malaysia_Singapore.Verify_Any_Broken_Links;

public class Constant_baseurl {
	
	
	
	// MY DOMAIN
	
			//public static final  String baseurl = "http://newlaunch.iproperty.com.my/";
		    //public static final  String baseurl = "http://beta-newlaunch.iproperty.com.my/";
		    public static final String baseurl = "http://test.newlaunch.iproperty.com.my/";
		    
		    
		    
    // initiate Excel_Data_Config Library
		    
		    public static Excel_Data_Config excel = new Excel_Data_Config("C:\\Users\\vinayak\\workspace\\Automation_Framework\\src\\Test_Data\\Malaysia_TestData.xlsx");

		    
		    


    // SG DOMAIN
		    
		    //public static final  String baseurl_sg = "http://newlaunch.iproperty.com.sg/";
		    //public static final  String baseurl_sg = "http://beta-newlaunch.iproperty.com.sg/";
		    //public static final String baseurl = "http://test.newlaunch.iproperty.com.sg/";
		    
		    

    // initiate Excel_Data_Config Library
		    
		    //public static Excel_Data_Config excel = new Excel_Data_Config("C:\\Users\\vinayak\\Documents\\Selenium\\workspace\\Automation_Framework\\src\\Test_Data\\Singapore_TestData.xlsx");

		    
		    
		   
		    
		        // MY SUB-DOMAIN
			
					//public static final  String sub_baseurl = "http://newlaunch.iproperty.com.my/listing/";
				    //public static final  String sub_baseurl = "http://beta-newlaunch.iproperty.com.my/listing/";
				    public static final String sub_baseurl = "http://test.newlaunch.iproperty.com.my/listing/";


				// SG SUB-DOMAIN
				    
				    //public static final  String sub_baseurl = "http://newlaunch.iproperty.com.sg/listing/";
				    //public static final  String sub_baseurl = "http://beta-newlaunch.iproperty.com.sg/listing/";
				    //public static final String sub_baseurl = "http://test.newlaunch.iproperty.com.sg/listing/";
		    
		    
		  // Logger
				    
				    
				    public static Logger Log = Logger.getLogger(Verify_Any_Broken_Links.class.getName());

}
