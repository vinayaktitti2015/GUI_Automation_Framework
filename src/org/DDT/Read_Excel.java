package org.DDT;

public class Read_Excel {

	
	public static void main(String[] args) throws Exception
	
	
	{
	 Excel_Data_Config excel = new Excel_Data_Config("C:\\Users\\vinayak\\Documents\\Selenium\\workspace\\Automation_Framework\\src\\Test_Data\\Test_Data.xlsx");
	 
	 
	 System.out.println(excel.getData(0, 1, 2));
	 
	 
	}
}
