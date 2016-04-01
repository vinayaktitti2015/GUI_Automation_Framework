package POM_Files;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Newlaunch_POM_File {
	
	
	public  Newlaunch_POM_File (WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}

	
	
	
// Landing page Search Filter properties.......
	
	
	@FindBy(id= "ddlProType")
	public WebElement property_Type;
	
	@FindBy(id= "ddlRegionLv1")
	public WebElement all_states;
	
	
	@FindBy(id= "ddlRegionLv2")
	public WebElement area_select;
	
	@FindBy(id= "chk1")
	public WebElement check_area1; 
	
	@FindBy(id= "chk2")
	public WebElement check_area2; 
	
	@FindBy(id= "chk3")
	public WebElement check_area3; 


	
	@FindBy(id= "chk26")
	public WebElement check_random1; 
	
	
	
	
	@FindBy(id= "txtKeyword")
	public WebElement search_Box;
	
	@FindBy(id= "btnSearchBoxSearch")
	public WebElement search_Btn;
	
	
	@FindBy(id= "btnSearchMapSearch")
	public WebElement map_Btn;
	
	
	// more option properties........
	
	
	@FindBy(id= "moreOption")
	public WebElement moreoption_arrow;
	
	@FindBy(id= "txtPriceMin")
	public WebElement price_min;

	
	@FindBy(id= "txtPriceMax")
	public WebElement price_max;
	
	
	@FindBy(xpath= "//*[@id='content']/div[3]/div[2]/div/span/a")
	public WebElement price_validation;

	
	
	@FindBy(id= "txtSizeMin")
	public WebElement size_min;
	
	
	@FindBy(id= "txtSizeMax")
	public WebElement size_max;
	
	
	@FindBy(xpath= "//*[@id='content']/div[3]/div[3]/div[2]/div[3]/span[1]/text()[1]")
	public WebElement size_validation;
	
	
	
	@FindBy(id= "txtLandMin")
	public WebElement land_min;
	
	@FindBy(id= "txtLandMax")
	public WebElement land_max;
	
	@FindBy(id= "txtBedMin")
	public WebElement bed_min;
	
	@FindBy(id= "txtBedMax")
	public WebElement bed_max;
	
	@FindBy(xpath= "//*[@id='content']/div[3]/div[3]/div[2]/div[1]/span[2]")
	public WebElement bed_validation;
	
	
	
	@FindBy(id= "txtBathMin")
	public WebElement bath_min;
	
	@FindBy(id= "txtBathMax")
	public WebElement bath_max;
	
	

	@FindBy(id= "ddlTenure")
	public WebElement tenure_all;
	
	@FindBy(id= "ddlCompletionDt")
	public WebElement completion_date;
	
	@FindBy(id= "ddlListedWt")
	public WebElement listed_within;
	
	@FindBy(id= "chkVideo")
	public WebElement video_check;
	
	@FindBy(id= "chkPhoto")
	public WebElement photo_check;
	
	@FindBy(xpath= "//*[@id='searchBoxMore']/div[2]/div[2]/a")
	public WebElement reset_btn;
	
	
	
	
	
	
// Listing / Results page properties.................
	
	
	
	
	
	@FindBy(xpath= "//*[@id='content']/div[3]/div[1]/h6/b")
	public WebElement header_breadcumb;
	
	
	@FindBy(xpath= "//*[@id='content']/div[3]/div[2]/h2/span/a")
	public WebElement development_assertionx;
	
	
	@FindBy(xpath= ".//*[@id='content']/div[3]/div[3]/div[2]/div[1]/span[1]")
	public WebElement propertytype_assertion;
	
	
	@FindBy(xpath= "//*[@id='content']/div[3]/div[3]/div[2]/div[1]/div[2]/span[1]/text()[1]")
	public WebElement location_assertion;
	
	
	@FindBy(xpath= "//*[@id='content']/div[3]/div[2]/h2/span/a")
	public WebElement development_name_listingpage;
	
	
	@FindBy(xpath= "//*[@id='content']/div[3]/div[6]/div[2]/div[1]/span[2]")
	public char bedcount_listingpage;
	
	
	
	
	
	@FindBy(id= "ddlSortBy")
	public WebElement sort_by;
	
	@FindBy(id= "ddlResultPerPage")
	public WebElement listing_perpage;
	
	
	@FindBy(xpath= "//*[@id='content']/div[3]/div[43]/div/ul/li[1]")
	public WebElement pagination1_listingpage;
	
	
	@FindBy(xpath= "//*[@id='content']/div[3]/div[43]/div/ul/li[2]/a")
	public WebElement pagination2_listingpage;
	
	
	
	@FindBy(xpath= "//*[@id='content']/div[3]/div[1]/a")
	public WebElement map_search;
	
	
	@FindBy(xpath= "//*[@id='content']/div[3]/div/a")
	public WebElement listing_search;
	
	
	
	@FindBy(xpath= "/html/body/div[3]/div[3]/div[3]/a[2]/div")
	public WebElement shortlist_listingpage;
	
	
	

	
   //  veiw details btn properties....
	
	
	@FindBy(xpath= "//*[@id='content']/div[3]/div[3]/a[1]/div")
	public WebElement view_btn1; //*[@id="content"]/div[3]/div[3]/a[1]/div
	
	@FindBy(xpath= "//*[@id='content']/div[3]/div[6]/a[1]/div")
	public WebElement view_btn2;  //*[@id="content"]/div[3]/div[6]/a[1]/div
	
	
	@FindBy(xpath= "//*[@id='content']/div[3]/div[8]/a[1]/div")
	public WebElement view_btn3; //*[@id="content"]/div[3]/div[8]/a[1]/div
	
	
	@FindBy(xpath= "//*[@id='content']/div[3]/div[10]/a[1]/div")
	public WebElement view_btn4;  //*[@id="content"]/div[3]/div[10]/a[1]/div
	
	
	@FindBy(xpath= "//*[@id='content']/div[3]/div[12]/a[1]/div")
	public WebElement view_btn5;  //*[@id="content"]/div[3]/div[12]/a[1]/div
	
	
	
	
	
// Details page properties ..............................
	
	
	
    //  headline
	
	@FindBy(id= "headline")
	public WebElement main_headline_detailspage;
	
	
	 // sub-  headline
	
		@FindBy(xpath= "//*[@id='content']/div[3]/div[3]/div[2]/div[1]/h1")
		public WebElement sub_headline_detailspage;
		
		
		 // price -  headline
		
		@FindBy(xpath= "//*[@id='content']/div[3]/div[3]/div[2]/div[1]/div/span[2]")
		public WebElement price_headline_detailspage;
		
		
		
		 // PropertyDescription -  headline properties
		
		
		@FindBy(xpath= "//*[@id='tabs']/ul/li[1]/a/span")
		public WebElement PropertyDescription_tab_detailspage;
		
		
		@FindBy(xpath= "//*[@id='detail']/div[2]/div[1]/h2")
		public WebElement PropertyDescription_title_detailspage;
		
		
		@FindBy(xpath= "/html/body/div[4]/div[3]/div[4]/div[1]/div[1]/div[2]/div[2]/div/ul/li[1]/span[1]")
		public WebElement QuikProNo_title_detailspage;
		
		@FindBy(xpath= "/html/body/div[4]/div[3]/div[4]/div[1]/div[1]/div[2]/div[2]/div/ul/li[1]/span[2]")
		public WebElement QuikProNo_value_detailspage;
		
		
		@FindBy(xpath= "/html/body/div[4]/div[3]/div[4]/div[1]/div[1]/div[2]/div[2]/div/ul/li[2]/span[1]")
		public WebElement Address_title_detailspage;
		
		
		@FindBy(xpath= "/html/body/div[4]/div[3]/div[4]/div[1]/div[1]/div[2]/div[2]/div/ul/li[2]/span[2]")
		public WebElement Address_value_detailspage;
		
		
		@FindBy(xpath= "/html/body/div[4]/div[3]/div[4]/div[1]/div[1]/div[2]/div[2]/div/ul/li[3]/span[1]")
		public WebElement PropertyType_title_detailspage;
		
		
		@FindBy(xpath= "/html/body/div[4]/div[3]/div[4]/div[1]/div[1]/div[2]/div[2]/div/ul/li[3]/span[2]")
		public WebElement PropertyType_value_detailspage;
		
		
		@FindBy(xpath= "/html/body/div[4]/div[3]/div[4]/div[1]/div[1]/div[2]/div[3]/div/ul/li[1]/span[1]")
		public WebElement ListingPrice_title_detailspage;
		
		
		@FindBy(xpath= "/html/body/div[4]/div[3]/div[4]/div[1]/div[1]/div[2]/div[3]/div/ul/li[1]/span[2]")
		public WebElement ListingPrice_value_detailspage;
		
		
		
		
		
		
		
		 // sub-  headline
		
		@FindBy(xpath= "//*[@id='detail']/div[2]/div[5]/div[1]/h3")
		public WebElement PropertyDetails_title_detailspage;
		
		
		
		
		
		
		
     // Carousel 
		
		@FindBy(xpath= "/html/body/div[4]/div[3]/div[3]/div[4]/a[2]")
		public WebElement Carousel_right_detailspage;
		
		
		@FindBy(xpath= "/html/body/div[4]/div[3]/div[3]/div[4]/a[1]")
		public WebElement Carousel_left_detailspage;
		
		
	// Register /Tell me more Title 
		
		@FindBy(xpath= "/html/body/div[4]/div[3]/div[4]/div[2]/form/div/h3")
		public WebElement tellmemore_title_detailspage;
		
   
		
	
	
    // Form field error message  Validation  properties ,,,,,,,,,,,,,,
  
	
	@FindBy(xpath= "/html/body/div[4]/div[3]/div[4]/div[2]/form/div/div[1]/div[1]/div/label")
	public WebElement name_error;
	
	@FindBy(xpath= "/html/body/div[4]/div[3]/div[4]/div[2]/form/div/div[1]/div[2]/div/label")
	public WebElement email_error;
	
	@FindBy(xpath= "/html/body/div[4]/div[3]/div[4]/div[2]/form/div/div[1]/div[3]/div/label")
	public WebElement phone_error;
	
	
	@FindBy(xpath= "/html/body/div[4]/div[3]/div[4]/div[2]/form/div/div[2]/div[1]/div/label")
	public WebElement remark_error;
	
	@FindBy(xpath= "/html/body/div[4]/div[3]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/label/label")
	public WebElement terms_conditions_error;
	
	@FindBy(xpath= "/html/body/div[4]/div[3]/div[4]/div[2]/form/div/div[2]/div[4]/div")
	public WebElement continue_alert_error;
	
	
	
	
	// Form field  properties -- BOTTOM SUBMISSION [lead] ,,,,,,,,,,,,,,,,,,
	
	
	@FindBy(xpath= "//*[@id='enquiryForm']/div/div[1]/div[1]/div/input")
	public WebElement name_field_bottom;
	
	@FindBy(xpath= "//*[@id='enquiryForm']/div/div[1]/div[2]/div/input")
	public WebElement email_field_bottom;
	
	@FindBy(xpath= "//*[@id='enquiryForm']/div/div[1]/div[3]/div/input")
	public WebElement phone_field_bottom;
	
	@FindBy(xpath= "//*[@id='enquiryForm']/div/div[1]/div[4]/div/select")
	public WebElement country_dropdown_bottom;
	
	@FindBy(xpath= "//*[@id='enquiryForm']/div/div[2]/div[1]/div/textarea")
	public WebElement remark_field;
	
	@FindBy(xpath= "//*[@id='enquiryForm']/div/div[2]/div[2]/div[1]/label/input")
	public WebElement recieve_updates_check_bottom;
	
	@FindBy(xpath= "//*[@id='enquiryForm']/div/div[2]/div[2]/div[2]/label/input")
	public WebElement terms_conditions_check_bottom;
	
	
	 // Register Btn  BOTTOM
	
	@FindBy(id= "btnSend")
	public WebElement register_btn_bottom;
	
	
	// TY Message BOTTOM
	
	
	@FindBy(xpath= "//*[@id='enquiryForm']/div/div[2]/div[4]/div")
	public WebElement thankyou_bottom_message;
	
	
	
   // Form field  properties -- TOP  SUBMISSION [lead]	,,,,,,,,,,,,,,,,,
	
	
	@FindBy(xpath= "//*[@id='enquiryFormRight']/div/div[1]/input")
	public WebElement name_field_top;
	
	@FindBy(xpath= "//*[@id='enquiryFormRight']/div/div[2]/input")
	public WebElement email_field_top;
	
	@FindBy(xpath= "//*[@id='enquiryFormRight']/div/div[3]/input")
	public WebElement phone_field_top;
	
	@FindBy(xpath= "//*[@id='enquiryFormRight']/div/div[4]/select")
	public WebElement country_dropdown_top;
	
	
	
	@FindBy(xpath= "//*[@id='enquiryFormRight']/div/div[5]/div[1]/label/input")
	public WebElement recieve_updates_check_top;
	
	@FindBy(xpath= "//*[@id='enquiryFormRight']/div/div[5]/div[2]/label/input")
	public WebElement terms_conditions_check_top;
	
	
	// Register Btn  TOP
	
		@FindBy(id= "btnContactDeveloper")
		public WebElement register_btn_top;
		
	
		// TY Message TOP
		
		
		@FindBy(xpath= "//*[@id='enquiryFormRight']/div/div[7]/div")
		public WebElement thankyou_top_message;
	
		
		
		
		

		   // Form field  properties -- SCROLL BAR SUBMISSION [lead]	,,,,,,,,,,,,,,,,,
			
		     
		@FindBy(id= "btnContactDevPopup")
		public WebElement scrollbar_btnContactDevPopup;
		    
		
		
			@FindBy(xpath= "//*[@id='enquiryPopUpForm']/div/div[1]/div[1]/div/input")
			public WebElement name_field_scrollbar;
			
			@FindBy(xpath= "//*[@id='enquiryPopUpForm']/div/div[1]/div[2]/div/input")
			public WebElement email_field_scrollbar;
			
			@FindBy(xpath= "//*[@id='enquiryPopUpForm']/div/div[1]/div[3]/div/input")
			public WebElement phone_field_scrollbar;
			
			@FindBy(xpath= "//*[@id='enquiryPopUpForm']/div/div[1]/div[4]/div/select")
			public WebElement country_dropdown_scrollbar;
			
			
			@FindBy(xpath= "//*[@id='enquiryPopUpForm']/div/div[2]/div[1]/div/textarea")
			public WebElement remark_field_scrollbar;
			
			
			
			@FindBy(xpath= "//*[@id='enquiryPopUpForm']/div/div[2]/div[2]/div[1]/label/input")
			public WebElement recieve_updates_check_scrollbar;
			
			@FindBy(xpath= "//*[@id='enquiryPopUpForm']/div/div[2]/div[2]/div[2]/label/input")
			public WebElement terms_conditions_check_scrollbar;
			
			
			// Register Btn  
			
				@FindBy(xpath= "/html/body/div[11]/form/div/div[2]/div[3]/button")
				public WebElement tellmemore_sumbitbtn_scrollbar;
				
			
				// TY Message 
				
				
				@FindBy(xpath= "//*[@id='enquiryPopUpForm']/div/div[2]/div[4]/div")
				public WebElement thankyou_scrollbar_message;
	
	
	
		
		
//DETAILS PAGE --  SOCIAL SHARING PROPERTIES ,,,,,,,,,,,,,
		
		
		
		@FindBy(id= "ContactDevPhone")
		public WebElement reveal_number;
		
		
		@FindBy(xpath= ".//*[@id='content']/div[3]/div[4]/div[1]/div[1]/div/a[1]/span")
		public WebElement fb_share; 
		
		
		@FindBy(xpath= ".//*[@id='content']/div[3]/div[4]/div[1]/div[1]/div/a[2]/span")
		public WebElement twitter_share;
		
		
		@FindBy(xpath= ".//*[@id='content']/div[3]/div[4]/div[1]/div[1]/div/a[3]/span")
		public WebElement googleplus_share;
		
		
		@FindBy(id= "linkEmailFriend")
		public WebElement email_share_detailspage;
		
	
		@FindBy(xpath= ".//*[@id='socialShortList']/span")
		public WebElement shortlist_detailspage_btn;
		
		
		@FindBy(xpath= "//*[@id='content']/div[3]/div[4]/div[1]/div[2]/a[2]/span")
		public WebElement print_detailspage;
		
		
		@FindBy(xpath= "//*[@id='content']/div[3]/div[1]/a")
		public WebElement search_again_btn_detailspage;
		
		
		@FindBy(xpath= "//*[@id='main-container']/div/div[2]/div[1]/div/table/tbody/tr/td/div/table/tbody/tr/td[3]/div[3]/div/div[1]/strong")
		public WebElement sign_into_iproperty_registerpage;
		
		
		@FindBy(xpath= "//*[@id='emailFriendForm']/div/div[1]/div[1]/div/input")
		public WebElement name_field_propertyshare;
		
		
		@FindBy(xpath= "//*[@id='emailFriendForm']/div/div[1]/div[2]/div/div/input")
		public WebElement email_field_propertyshare;
		
		
		@FindBy(xpath= "/html/body/div[11]/form/div/div[2]/div[1]/button")
		public WebElement email_submit_btn_propertyshare;  
		
		
		@FindBy(xpath= "//*[@id='emailFriendForm']/div/div[2]/div[2]/div")
		public WebElement thankyou_message_emaitofrnd;  
		
		
		
		@FindBy(id= "close_x")
		public WebElement email_close_propertyshare;
		
		
		
		
		
// Developers Page  properties --   developer_link/ image / text header 
				
				
				@FindBy(xpath= ".//*[@id='content']/div[3]/div[4]/div[2]/span/a/b")
				public WebElement developer_link_detailspage;
				
				
				@FindBy(xpath= "//*[@id='content']/div[3]/div[6]/div[2]/div[3]/span[2]/a")
				public WebElement developer_link_listingpage;
				
				
				@FindBy(name= "dev-image")
				public WebElement image_dev;
				
				
				@FindBy(name= "img-auto")
				public WebElement img_auto;
				
				
				@FindBy(name= "prod-text")
				public WebElement abt_developer_title;
				
				
				@FindBy(id= "gMap")
				public WebElement map_g;
				
				
				@FindBy(xpath= "//*[@id='gMap']/h2")
				public WebElement project_header;
				
				
				@FindBy(id= "map-sidebar")
				public WebElement map_sidebar;
				
				
				
				
				
				// Form field properties --- Developers Page  SUBMISSION [lead]
				
				
				
				@FindBy(name= "name")
				public WebElement name_developer;
				
				@FindBy(name= "email")
				public WebElement email_developer;
				
				@FindBy(name= "phone")
				public WebElement phone_developer;
				
				
				@FindBy(name= "remark")
				public WebElement message_developer;
				
				
				@FindBy(name= "agreeTerm")
				public WebElement terms_developer;
				
				
				 // Register Btn  BOTTOM
				
				@FindBy(id= "btnSend")
				public WebElement submit_btn_developer;
				
				
				// TY Message TOP
				
				
						@FindBy(xpath= "//*[@id='enquiryForm']/div[3]/div")
						public WebElement thankyou_developer_message;
						
						
						
						
						
						
						
// REGISTER PAGE  properties.......
							
							
							@FindBy(id= "loginbtn")
							public WebElement signin_btn_registerpage;
							
							
							@FindBy(id= "txtEmail")
							public WebElement email_field_registerpage;
							
							@FindBy(id= "txtPassword")
							public WebElement passwrd_field_registerpage;
							
							
							@FindBy(id= "loginmsg")
							public WebElement passwrd_errormessage_registerpage;
							
							
							@FindBy(id= "chkAutoSign")
							public WebElement checkbox_registerpage;
							
							
							
							
							
							

	
	
	
}




/*
 * 
 * 		
=======
	
	
	@FindBy(id= "txtKeyword")
	public WebElement search_Box;
	
	@FindBy(id= "btnSearchBoxSearch")
	public WebElement search_Btn;
	
	
	@FindBy(id= "btnSearchMapSearch")
	public WebElement map_Btn;
	
	
	// more option properties........
	
	
	@FindBy(id= "moreOption")
	public WebElement moreoption_arrow;
	
	@FindBy(id= "txtPriceMin")
	public WebElement price_min;
	
	@FindBy(id= "txtPriceMax")
	public WebElement price_max;
	
	
	@FindBy(id= "txtSizeMin")
	public WebElement size_min;
	
	
	@FindBy(id= "txtSizeMax")
	public WebElement size_max;
	
	@FindBy(id= "txtLandMin")
	public WebElement land_min;
	
	@FindBy(id= "txtLandMax")
	public WebElement land_max;
	
	@FindBy(id= "txtBedMin")
	public WebElement bed_min;
	
	@FindBy(id= "txtBedMax")
	public WebElement bed_max;

	@FindBy(id= "ddlTenure")
	public WebElement tenure_all;
	
	@FindBy(id= "ddlCompletionDt")
	public WebElement completion_date;
	
	@FindBy(id= "ddlListedWt")
	public WebElement listed_within;
	
	@FindBy(id= "chkVideo")
	public WebElement video_check;
	
	@FindBy(id= "chkPhoto")
	public WebElement photo_check;
	
	@FindBy(id= "/html/body/div[3]/div[1]/div/div[3]/div[2]/div[2]/a")
	public WebElement reset_btn;
	
	
	
	
	
	
// Listing / Results page properties.................
	
	
	@FindBy(xpath= "//*[@id='content']/div[3]/div[1]/h6/b")
	public WebElement header_breadcumb;
	
	
	
	@FindBy(id= "ddlSortBy")
	public WebElement sort_by;
	
	@FindBy(id= "ddlResultPerPage")
	public WebElement listing_perpage;
	
	@FindBy(xpath= "//*[@id='content']/div[3]/div[1]/a")
	public WebElement map_search;
	
	
	@FindBy(xpath= "//*[@id='content']/div[3]/div/a")
	public WebElement listing_search;
	
	
	

	
   //  veiw details btn properties....
	
	@FindBy(xpath= "//*[@id='content']/div[3]/div[3]/a[1]/div")
	public WebElement view_btn1;
	
	@FindBy(xpath= "//*[@id='content']/div[3]/div[5]/a[1]/div")
	public WebElement view_btn2;
	
	
	@FindBy(xpath= "//*[@id='content']/div[3]/div[7]/a[1]/div")
	public WebElement view_btn3;
	
	
	@FindBy(xpath= "//*[@id='content']/div[3]/div[9]/a[1]/div")
	public WebElement view_btn4;
	
	
	@FindBy(xpath= "//*[@id='content']/div[3]/div[11]/a[1]/div")
	public WebElement view_btn5;
	
	
	
	
	
// Details page properties ..............................
	
	
	
    //  headline
	
	@FindBy(id= "headline")
	public WebElement openfor_headline;
	
	
	 // sub-  headline
	
		@FindBy(className= "headline")
		public WebElement sub_headline;
		
		
     // Carousel 
		
		@FindBy(xpath= "/html/body/div[4]/div[3]/div[3]/div[4]/a[2]")
		public WebElement Carousel_right;
		
		
		@FindBy(xpath= "/html/body/div[4]/div[3]/div[3]/div[4]/a[1]")
		public WebElement Carousel_left;
		
		
	// Register /Tell me more Title 
		
		@FindBy(xpath= "/html/body/div[4]/div[3]/div[4]/div[2]/form/div/h3")
		public WebElement register_title;
		
   
		
	
	
    // Form field error message  Validation  properties
  
	
	@FindBy(xpath= "/html/body/div[4]/div[3]/div[4]/div[2]/form/div/div[1]/div[1]/div/label")
	public WebElement name_error;
	
	@FindBy(xpath= "/html/body/div[4]/div[3]/div[4]/div[2]/form/div/div[1]/div[2]/div/label")
	public WebElement email_error;
	
	@FindBy(xpath= "/html/body/div[4]/div[3]/div[4]/div[2]/form/div/div[1]/div[3]/div/label")
	public WebElement phone_error;
	
	
	@FindBy(xpath= "/html/body/div[4]/div[3]/div[4]/div[2]/form/div/div[2]/div[1]/div/label")
	public WebElement remark_error;
	
	@FindBy(xpath= "/html/body/div[4]/div[3]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/label/label")
	public WebElement terms_conditions_error;
	
	@FindBy(xpath= "/html/body/div[4]/div[3]/div[4]/div[2]/form/div/div[2]/div[4]/div")
	public WebElement continue_alert_error;
	
	
	
	
	// Form field  properties -- BOTTOM SUBMISSION [lead]
	
	
	@FindBy(name= "name")
	public WebElement name_field_bottom;
	
	@FindBy(name= "email")
	public WebElement email_field_bottom;
	
	@FindBy(name= "phone")
	public WebElement phone_field_bottom;
	
	@FindBy(name= "country")
	public WebElement country_dropdown_bottom;
	
	@FindBy(name= "remark")
	public WebElement remark_field;
	
	@FindBy(name= "tickBox")
	public WebElement recieve_updates_check_bottom;
	
	@FindBy(name= "agreeTerm")
	public WebElement terms_conditions_check_bottom;
	
	
	 // Register Btn  BOTTOM
	
	@FindBy(id= "btnSend")
	public WebElement register_btn_bottom;
	
	
	// TY Message BOTTOM
	
	
	@FindBy(xpath= "//*[@id='enquiryForm']/div/div[2]/div[4]/div")
	public WebElement thankyou_bottom_message;
	
	
	
   // Form field  properties -- TOP  SUBMISSION [lead]	
	
	
	@FindBy(xpath= "//*[@id='enquiryFormRight']/div/div[1]/input")
	public WebElement name_field_top;
	
	@FindBy(xpath= "//*[@id='enquiryFormRight']/div/div[2]/input")
	public WebElement email_field_top;
	
	@FindBy(xpath= "//*[@id='enquiryFormRight']/div/div[3]/input")
	public WebElement phone_field_top;
	
	@FindBy(xpath= "//*[@id='enquiryFormRight']/div/div[4]/select")
	public WebElement country_dropdown_top;
	
	
	
	@FindBy(xpath= "//*[@id='enquiryFormRight']/div/div[5]/div[1]/label/input")
	public WebElement recieve_updates_check_top;
	
	@FindBy(xpath= "//*[@id='enquiryFormRight']/div/div[5]/div[2]/label/input")
	public WebElement terms_conditions_check_top;
	
	
	// Register Btn  TOP
	
		@FindBy(id= "btnContactDeveloper")
		public WebElement register_btn_top;
		
	
		// TY Message TOP
		
		
		@FindBy(xpath= "/html/body/div[4]/div[3]/div[4]/div[2]/form/div/div[2]/div[4]/div")
		public WebElement thankyou_top_message;
	
	
	
	
>>>>>>> branch 'master' of https://github.com/vinayaktitti2015/GUI_Automation_Framework.git
	
// Developers Page  properties --   developer_link/ image / text header 
		
		
		@FindBy(xpath= ".//*[@id='content']/div[3]/div[4]/div[2]/span/a/b")
		public WebElement developer_link;
		
		
		@FindBy(name= "dev-image")
		public WebElement image_dev;
		
		@FindBy(name= "img-auto")
		public WebElement img_auto;
		
		
		@FindBy(name= "prod-text")
		public WebElement abt_developer;
		
		
		@FindBy(id= "gMap")
		public WebElement map_g;
		
		
		@FindBy(xpath= "//*[@id='gMap']/h2")
		public WebElement project_header;
		
		
		@FindBy(id= "map-sidebar")
		public WebElement map_sidebar;
		
		
		
		
		
		// Form field properties --- Developers Page  SUBMISSION [lead]
		
		
		
		@FindBy(name= "name")
		public WebElement name_developer;
		
		@FindBy(name= "email")
		public WebElement email_developer;
		
		@FindBy(name= "phone")
		public WebElement phone_developer;
		
		
		@FindBy(name= "remark")
		public WebElement message_developer;
		
		
		@FindBy(name= "agreeTerm")
		public WebElement terms_developer;
		
		
		 // Register Btn  BOTTOM
		
		@FindBy(id= "btnSend")
		public WebElement submit_btn_developer;
		
		
		// TY Message TOP
		
		
				@FindBy(xpath= "//*[@id='enquiryForm']/div[3]/div")
				public WebElement thankyou_developer_message;
				
				
				
				
				*/
