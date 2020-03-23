package config;

import base_utils.Excel_Handler;

public class Constants {

	// Driver path
	public static final String driverpath = "./src/test/resources/webdrivers/";

	// Drivers
	public static final String chromedriver = driverpath + "chromedriver.exe";
	public static final String phantomjsdriver = driverpath + "phantomjs.exe";
	public static final String geckodriver = driverpath + "geckodriver.exe";
	public static final String iedriver = driverpath + "IEDriverServer.exe";

	// initiate Excel_Data_Config Library
	public static final Excel_Handler TestData = new Excel_Handler(
			"./path.xlsx");


	// Database Connection
	public static String sqlUrl = "xxxxx"; 
	public static String sqlUsername = "test"; // beta database
	public static String sqlPassword = "test123"; // beta database
}
