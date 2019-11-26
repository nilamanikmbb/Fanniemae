package excellearn;

//import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UiTest {
	public static Cell cell;

	public static void main(String args[]) throws Exception {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\TO-WVLD-09\\Desktop\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(
					"https://env-pre.ivalua.us/buyer/fanniemae/prepmaint27/aysu7/page.aspx/en/usr/login?ReturnUrl=%2fbuyer%2ffanniemae%2fprepmaint27%2faysu7%2fpage.aspx%2fen%2fbuy%2fhomepage%2fbuy");
			Thread.sleep(3000);
			FileInputStream fi = new FileInputStream("C:\\Users\\TO-WVLD-09\\Desktop\\Book2.xlsx");
			XSSFWorkbook wbook = new XSSFWorkbook(fi);
			XSSFSheet wsht = wbook.getSheetAt(0);
			for (int i = 1; i <= wsht.getLastRowNum(); i++) {
				cell = wsht.getRow(i).getCell(0);
				cell.setCellType(Cell.CELL_TYPE_STRING);
				driver.findElement(By.name("body:x:txtLogin:x:x")).sendKeys(cell.getStringCellValue());
				cell = wsht.getRow(i).getCell(1);
				cell.setCellType(Cell.CELL_TYPE_STRING);
				driver.findElement(By.id("body_x_txtPass_x_x")).sendKeys(cell.getStringCellValue());
				driver.findElement(By.name("body:x:btnLogin_btn2")).click();
				Thread.sleep(2000);
				System.out.println(driver.getTitle());
				fi.close();
				if (driver.getTitle().matches("Corporate Procurement HomePage: Buyer Fannie Mae")) {
					wsht.getRow(i).createCell(2).setCellValue("Pass");
					System.out.println(wsht.getRow(i).getCell(2));
					// wbook.write(new
					// FileOutputStream("C:\\\\Users\\\\TO-WVLD-09\\\\Desktop\\\\Book1.xlsx"));
					FileOutputStream output_file = new FileOutputStream(
							"C:\\\\Users\\\\TO-WVLD-09\\\\Desktop\\\\Book2.xlsx");
					wbook.write(output_file);
					output_file.close();
					wbook = new XSSFWorkbook(new FileInputStream("C:\\\\Users\\\\TO-WVLD-09\\\\Desktop\\\\Book2.xlsx"));
//				fi.close();
					driver.findElement(By.xpath("//a[@id='aLoginMenu']/table/tbody/tr/td[2]/div")).click();
					driver.findElement(By.linkText("Logout")).click();
				} else {
					System.out.println("fail");
					wsht.getRow(i).createCell(2).setCellValue("Fail");
					System.out.println(wsht.getRow(i).getCell(2));
					FileOutputStream output_file = new FileOutputStream("C:\\\\Users\\\\TO-WVLD-09\\\\Desktop\\\\Book2.xlsx");
					wbook.write(output_file);
					output_file.close();
					wbook = new XSSFWorkbook(new FileInputStream("C:\\\\Users\\\\TO-WVLD-09\\\\Desktop\\\\Book2.xlsx"));
//					FileOutputStream out = new FileOutputStream(new File("EmployeeData_Excel.xlsx"));
//					wbook.write(out);
//					out.close();
//					wbook = new XSSFWorkbook(new FileInputStream("C:\\\\Users\\\\TO-WVLD-09\\\\Desktop\\\\Book2.xlsx"));
//			fi.close();
				}
			}
			driver.close();
		} catch (Exception e) {

		}
	}
}
















//else {
//	System.out.println("fail");
//	wsht.getRow(i).createCell(2).setCellValue("Fail");
//System.out.println(wsht.getRow(i).getCell(2));
//	FileOutputStream output = new FileOutputStream("C:\\Users\\TO-WVLD-09\\Desktop\\Book1.xlsx");
//	wbook.write(output);
//	output.close();
//	wbook = new XSSFWorkbook(new FileInputStream("C:\\\\Users\\\\TO-WVLD-09\\\\Desktop\\\\Book1.xlsx"));
//	fi.close();
//	}

//driver.findElement(By.xpath("//a[@id='aLoginMenu']/table/tbody/tr/td[2]/div")).click();
//driver.findElement(By.linkText("Logout")).click();

//FileInputStream fi=new FileInputStream("Testdata\\Hybrid_excel.xlsx");
////Create Connection For xssfwork book
//XSSFWorkbook wbook=new XSSFWorkbook(fi);
////Create Connection for xssfsheet
//XSSFSheet wsht=wbook.getSheetAt(1);
//
////How to write the data into excel sheet in runtime
//wsht.getRow(0).createCell(5).setCellValue("Result");
//wsht.getRow(1).createCell(5).setCellValue("Pass");
//wsht.getRow(2).createCell(5).setCellValue("Fail");
//
//wbook.write(new FileOutputStream("Logfiles\\Output34.xlsx"));
//wbook.close();

//} else {
//System.out.println("Fail");
//XSSFCell cell = read1.getRow(i).createCell(2);
//cell.setCellValue("fail");
//FileOutputStream output = new FileOutputStream("");
//r.write(output);
//output.close();
//}
