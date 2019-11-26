package excellearn;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kgg {
	public static Cell cell;

	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TO-WVLD-09\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		Thread.sleep(3000);
		FileInputStream fi = new FileInputStream("C:\\Users\\TO-WVLD-09\\Desktop\\Book3.xlsx");
		XSSFWorkbook wbook = new XSSFWorkbook(fi);
		XSSFSheet wsht = wbook.getSheetAt(0);
		for (int i = 1; i <= wsht.getLastRowNum(); i++) {
			cell = wsht.getRow(i).getCell(0);
			cell.setCellType(Cell.CELL_TYPE_STRING);
			driver.findElement(By.name("userName")).sendKeys(cell.getStringCellValue());
			cell = wsht.getRow(i).getCell(1);
			cell.setCellType(Cell.CELL_TYPE_STRING);
			driver.findElement(By.name("password")).sendKeys(cell.getStringCellValue());
			driver.findElement(By.name("login")).click();
			Thread.sleep(5000);
			System.out.println(driver.getTitle());
			if (driver.getTitle().equals("Find a Flight: Mercury Tours:")) {
				System.out.println("pass");
				wsht.getRow(i).createCell(2).setCellValue("Pass");
				driver.findElement(By.linkText("Home")).click();
			} else {
				System.out.println("fail");
				wsht.getRow(i).createCell(2).setCellValue("Fail");
			}	
		}
		FileOutputStream output_file = new FileOutputStream("C:\\Users\\TO-WVLD-09\\Desktop\\Book3.xlsx");
		wbook.write(output_file);
		wbook = new XSSFWorkbook(new FileInputStream("C:\\\\Users\\\\TO-WVLD-09\\\\Desktop\\\\Book3.xlsx"));
		driver.close();
	}

}
