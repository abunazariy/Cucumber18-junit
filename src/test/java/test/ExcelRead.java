package test;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ExcelRead {
    public static void main(String[] args) throws Exception{
        File file = new File("src/workBook1.xlsx");
        //System.out.println(file.exists());
        //Now we need to load our file
        FileInputStream fileInputStream = new FileInputStream(file);
        //Now we need to load our Excel into java class
        XSSFWorkbook workbook1 = new XSSFWorkbook(fileInputStream);
        // workbook > sheet > row > cell

        XSSFSheet employeesSheet = workbook1.getSheet("Employees");
        //System.out.println(employeesSheet.getRow(2).getCell(0));

        //System.out.println(employeesSheet.getActiveCell());
        System.out.println(employeesSheet.getPhysicalNumberOfRows());


    }
}
