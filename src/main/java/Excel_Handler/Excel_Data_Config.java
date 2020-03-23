package Excel_Handler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Data_Config {


    XSSFWorkbook wb;
    XSSFSheet sheet1;

    public Excel_Data_Config(String excelpath) {
        try {
            File src = new File(excelpath);
            FileInputStream fis = new FileInputStream(src);
            wb = new XSSFWorkbook(fis);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public String getData(int sheetNumber, int row, int column) throws Exception {
        sheet1 = wb.getSheetAt(sheetNumber);
        String data = sheet1.getRow(row).getCell(column).getStringCellValue();
        return data;
    }
}

// usage
// Excel_Data_Config excel = new Excel_Data_Config("path.xlsx");
//excel.getData(0, 1, 2);