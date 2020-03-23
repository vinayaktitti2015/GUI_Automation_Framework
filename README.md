# Web_Automation_Framework
# User Defined Functions

This is a java-based automation reusable library. User can import the above 
`Automation_UserDefinedFunctions.jar` file into your build project such as import from Maven 
central repo & call the ready to execute functions. 


Library Contains:
1. Custom wait commands.
2. Asserions.
3. Excel handling.
4. Database handling.
5. JavascriptExecutor usage.
6. Actions class usage.
7. Actions - dropdown, click functions
8. Capture screenshot functions.


# Usage of functions in class:

1. Dropdown_Util.SelectByIndex(driver, locator);
Ex: to use dropdown function

2. Assertion.TextEquals(driver, locator, expected);
Ex: to call Assert function

3. Javascript_Util.Scroll_PageUp(driver);
Ex: to call JavascriptExecutor function

4. Excel_Data_Config excel = new Excel_Data_Config("path.xlsx");
   excel.getData(0, 1, 2);
Ex: to call excel function