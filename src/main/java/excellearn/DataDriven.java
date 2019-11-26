package excellearn;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;


public class DataDriven {
	public static Cell cell;
	public static void main(String args[]) throws Exception {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TO-WVLD-09\\Desktop\\chromedriver.exe");
		driver.get("http://www.newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(3000);
		FileInputStream read=new FileInputStream("C:\\Users\\TO-WVLD-09\\Downloads\\mercuryregistration.xls");
        HSSFWorkbook r=new HSSFWorkbook(read);
        HSSFSheet re=r.getSheetAt(0);
        for(int i=1; i<=re.getLastRowNum(); i++)
	         {
            cell = re.getRow(i).getCell(0);
            cell.setCellType(Cell.CELL_TYPE_STRING);
            driver.findElement(By.name("firstName")).sendKeys(cell.getStringCellValue());
            cell = re.getRow(i).getCell(1);
            cell.setCellType(Cell.CELL_TYPE_STRING);
        	driver.findElement(By.name("lastName")).sendKeys(cell.getStringCellValue());
        	cell = re.getRow(i).getCell(2);
            cell.setCellType(Cell.CELL_TYPE_STRING);
            driver.findElement(By.name("phone")).sendKeys(cell.getStringCellValue());
        	cell = re.getRow(i).getCell(3);
            cell.setCellType(Cell.CELL_TYPE_STRING);
            driver.findElement(By.name("userName")).sendKeys(cell.getStringCellValue());
        	cell = re.getRow(i).getCell(4);
            cell.setCellType(Cell.CELL_TYPE_STRING);
            driver.findElement(By.name("address1")).sendKeys(cell.getStringCellValue());
        	cell = re.getRow(i).getCell(5);
            cell.setCellType(Cell.CELL_TYPE_STRING);
            driver.findElement(By.name("city")).sendKeys(cell.getStringCellValue());
        	cell = re.getRow(i).getCell(6);
            cell.setCellType(Cell.CELL_TYPE_STRING);
            driver.findElement(By.name("state")).sendKeys(cell.getStringCellValue());
        	cell = re.getRow(i).getCell(7);
            cell.setCellType(Cell.CELL_TYPE_STRING);
            driver.findElement(By.name("postalCode")).sendKeys(cell.getStringCellValue());
            cell = re.getRow(i).getCell(8);
            cell.setCellType(Cell.CELL_TYPE_STRING);
            Select s=new Select(driver.findElement(By.name("country")));
    		s.selectByVisibleText(cell.getStringCellValue());
    		cell = re.getRow(i).getCell(9);
            cell.setCellType(Cell.CELL_TYPE_STRING);
            driver.findElement(By.name("email")).sendKeys(cell.getStringCellValue());
            cell = re.getRow(i).getCell(10);
            cell.setCellType(Cell.CELL_TYPE_STRING);
            driver.findElement(By.name("password")).sendKeys(cell.getStringCellValue());
            cell = re.getRow(i).getCell(11);
            cell.setCellType(Cell.CELL_TYPE_STRING);
            driver.findElement(By.name("confirmPassword")).sendKeys(cell.getStringCellValue());
            driver.findElement(By.linkText("Home")).click();
            driver.findElement(By.linkText("REGISTER")).click();
    		Thread.sleep(3000);
	         }
        driver.close();
	}
	}
        	














//		driver.findElement(By.name("firstName")).sendKeys(cell.getStringCellValue());
//		driver.findElement(By.name("lastName")).sendKeys(cell.getStringCellValue());
//		driver.findElement(By.name("phone")).sendKeys(cell.getStringCellValue());
//		driver.findElement(By.name("userName")).sendKeys(cell.getStringCellValue());
//		driver.findElement(By.name("address1")).sendKeys(cell.getStringCellValue());
//		driver.findElement(By.name("city")).sendKeys(cell.getStringCellValue());
//		driver.findElement(By.name("state")).sendKeys(cell.getStringCellValue());
//		driver.findElement(By.name("postalCode")).sendKeys(cell.getStringCellValue());
//		driver.findElement(By.name("country")).click();
//		Select s=new Select(driver.findElement(By.name("country")));
//		s.selectByVisibleText("INDIA");
//		driver.findElement(By.name("register")).click();
//		driver.navigate().back();
		//driver.close();
//		File src=new File("");
//	    FileInputStream finput = new FileInputStream(src);
//	   XSSFworkbook = new XSSFWorkbook(finput);
//	    // Load the sheet in which data is stored.
//	    XSSFsheet= workbook.getSheetAt(0);
	   
//	    {
//	        // Import data for Email.
//	        cell = sheet.getRow(i).getCell(1);
//	        cell.setCellType(Cell.CELL_TYPE_STRING);
//	        driver.findElement(By.id("login-email")).sendKeys(cell.getStringCellValue());
//	        // Import data for password.
//	        cell = sheet.getRow(i).getCell(2);
//	        cell.setCellType(Cell.CELL_TYPE_STRING);
//	        driver.findElement(By.id("login-password")).sendKeys(cell.getStringCellValue());
//		
//	}


