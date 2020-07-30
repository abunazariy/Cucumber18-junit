package test;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ExcelWrite {
    public static void main(String[] args)throws Exception {
        FileInputStream fileInputStream = new FileInputStream("src/workBook1.xlsx");
        XSSFWorkbook workbook1 = new XSSFWorkbook(fileInputStream);
        XSSFSheet employeesSheet = workbook1.getSheet("Employees");

        //changing excel cell's value
        employeesSheet.getRow(1).getCell(1).setCellValue("Putin");
        System.out.println(employeesSheet.getRow(1).getCell(1));

        employeesSheet.getRow(1).getCell(0).setCellValue("Ivanka");
        System.out.println(employeesSheet.getRow(1).getCell(0));

        System.out.println(employeesSheet.getRow(3).getCell(0));


        FileOutputStream fileOutputStream = new FileOutputStream("src/workBook1.xlsx");
        workbook1.write(fileOutputStream);
        fileInputStream.close();
        fileOutputStream.close();
        workbook1.close();


    }
}
