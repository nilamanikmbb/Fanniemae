package excellearn;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public static void main(String args[]) throws Exception {
		XSSFWorkbook book=new XSSFWorkbook();
		XSSFSheet sheet=book.createSheet("data");
		sheet.getRow(0).createCell(0).setCellStyle(null);
//		sheet.getRow(0).createCell(1).setCellValue("password");
//		sheet.getRow(0).createCell(2).setCellValue("result");
//		sheet.getRow(1).createCell(0).setCellValue("qaq");
//		sheet.getRow(1).createCell(1).setCellValue("qaq");
//		sheet.getRow(2).createCell(0).setCellValue("qaq");
//		sheet.getRow(2).createCell(1).setCellValue("aqa");
		FileOutputStream out = new FileOutputStream(new File("EmployeeData_Excel.xlsx"));
        book.write(out);
        out.close();
        System.out.println("EmployeeData_Excel.xlsx written successfully on disk.");
        book = new XSSFWorkbook(new FileInputStream("C:\\\\Users\\\\TO-WVLD-09\\\\Desktop\\\\Book3.xlsx"));
//		book.write(new FileOutputStream("Clientdetail.xlsx"));
//		//book.close();
	}

}
