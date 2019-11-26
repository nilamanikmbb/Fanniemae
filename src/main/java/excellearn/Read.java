package excellearn;

import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {
	public static void main(String args[]) throws Exception {
		FileInputStream read=new FileInputStream("D:\\practice ws\\excelrewr\\EmployeeData_Excel.xlsx");
        XSSFWorkbook r=new XSSFWorkbook(read);
        XSSFSheet re=r.getSheetAt(0);
        Iterator<Row> rowIterator = re.iterator();
        while (rowIterator.hasNext())
        {
            Row row = rowIterator.next();
            Iterator<Cell> cellIterator = row.cellIterator();
            while (cellIterator.hasNext())
            {
                Cell cell = cellIterator.next();
                switch (cell.getCellType())
                {
                    case Cell.CELL_TYPE_NUMERIC:
                        System.out.print(cell.getNumericCellValue() + "   ");
                        break;
                    case Cell.CELL_TYPE_STRING:
                        System.out.print(cell.getStringCellValue() + "   ");
                        break;
                }
            }
            System.out.println("");
        }
        read.close();
	}

}
//File src=new File("C:\\Users\\Admin\\Desktop\\TestData.xls");
//    FileInputStream finput = new FileInputStream(src);
//   workbook = new HSSFWorkbook(finput);
//    // Load the sheet in which data is stored.
//    sheet= workbook.getSheetAt(0);
//    for(int i=1; i&lt;=sheet.getLastRowNum(); i++)
//    {
//        // Import data for Email.
//        cell = sheet.getRow(i).getCell(1);
//        cell.setCellType(Cell.CELL_TYPE_STRING);
//        driver.findElement(By.id("login-email")).sendKeys(cell.getStringCellValue());
//        // Import data for password.
//        cell = sheet.getRow(i).getCell(2);
//        cell.setCellType(Cell.CELL_TYPE_STRING);
//        driver.findElement(By.id("login-password")).sendKeys(cell.getStringCellValue());
