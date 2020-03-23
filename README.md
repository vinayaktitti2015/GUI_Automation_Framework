# Web_Automation_Framework_UDF
# User Defined Funtions

This is a java-based automation reusable library. User can import the given `jar`file into 
project & call the ready to execute functions. 

# Usage of functions in class:

1. Dropwown_Util.SelectByIndex(driver, locator);
Ex: to use dropdown function

2. Assertion.TextEquals(driver, locator, expected);
Ex: to call Assert function

3. Javascript_Util.Scroll_PageUp(driver);
Ex: to call JavascriptExecutor function

4. Excel_Data_Config excel = new Excel_Data_Config("path.xlsx");
   excel.getData(0, 1, 2);
Ex: to call excel function