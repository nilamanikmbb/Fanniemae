package testcase;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_003 {
	private WebDriver driver;
	public static FileInputStream read;
	public static XSSFWorkbook book;
	public static XSSFSheet sheet;

	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void contracts() throws Exception {
		read = new FileInputStream("C:\\Users\\TO-WVLD-09\\Downloads\\TestData.xlsx");
		book = new XSSFWorkbook(read);
		sheet = book.getSheet("TestData");
		driver.get("https://env-pre.ivalua.us/buyer/fanniemae/prepmaint27/aysu7/page.aspx/en/buy/homepage/buy");
		driver.findElement(By.id("body_x_txtLogin_x_x")).sendKeys(sheet.getRow(5).getCell(6).getStringCellValue());
		driver.findElement(By.id("body_x_txtPass_x_x")).sendKeys(sheet.getRow(5).getCell(7).getStringCellValue());
		driver.findElement(By.id("body_x_btnLogin_btn2")).click();
		driver.findElement(By.id("link_ivmenu00_menu_2")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("link_ivmenu00_menu_2_sub0_sub0")).click();
		driver.findElement(By.id("body_x_tabc_x_info_x_prxinfo_x_txtLibContract_x_txtLibContracten")).sendKeys(sheet.getRow(5).getCell(51).getStringCellValue());
		new Select(driver.findElement(By.id("ddlbody_x_tabc_x_info_x_prxinfo_x_selTypeContract_x"))).selectByIndex(6);
		driver.findElement(By.id("body_x_tabc_x_info_x_prxinfo_x_selSupplier_x_txtselSupplier_x_x")).sendKeys(sheet.getRow(5).getCell(54).getStringCellValue());
		Thread.sleep(2000);
		driver.findElement(By.id("body_x_tabc_x_info_x_prxinfo_x_selFamily_x_txtselFamily_x_x")).sendKeys(sheet.getRow(5).getCell(57).getStringCellValue());
		Thread.sleep(3000);
		driver.findElement(By.id("body_x_tabc_x_info_x_prxinfo_x_selFamily_x_txtselFamily_x_x")).sendKeys(Keys.ENTER);

		driver.findElement(By.id("body_x_tabc_x_info_x_prxinfo_x_txtCtrFmTxtproductservice_x_x")).sendKeys(sheet.getRow(5).getCell(58).getStringCellValue());

		new Select(driver.findElement(By.id("ddlbody_x_tabc_x_info_x_prxinfo_x_selFbdrindiCodeFmDdlriskindicator_2_x"))).selectByIndex(1);
		driver.findElement(By.id("body_x_tabc_x_info_x_prxinfo_x_txtCtrStatUpdNextSteps_1_x_x")).sendKeys(sheet.getRow(5).getCell(61).getStringCellValue());
		new Select(driver.findElement(By.id("ddlbody_x_tabc_x_info_x_prxinfo_x_txtCtrFromPr_x"))).selectByIndex(2);
		new Select(driver.findElement(By.id("ddlbody_x_tabc_x_info_x_prxinfo_x_txtCtrFg_x"))).selectByIndex(2);
		Thread.sleep(2000);
		driver.findElement(By.id("proxyActionBar_x__cmdSave_btn2")).click();
		Alert alr=driver.switchTo().alert();
		alr.accept();
	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}

}
