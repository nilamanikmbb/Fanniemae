package testcase;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_001 {
	public WebDriver driver;
	public static String url = "https://env-pre.ivalua.us/buyer/fanniemae/prepmaint27/aysu7/page.aspx/en/usr/login?ReturnUrl=%2fbuyer%2ffanniemae%2fprepmaint27%2faysu7%2fpage.aspx%2fen%2fbuy%2fhomepage%2fbuy";
	public static String user_id1 = "body_x_txtLogin_x_x";
	public static String pass_id1 = "body_x_txtPass_x_x";
	public static String clicklog_id1 = "body_x_btnLogin_btn2";
	public static String procurment_id = "link_ivmenu00_menu_4";
	public static String createre_id = "link_ivmenu00_menu_4_sub0_sub0";
	public static String reqname_id = "body_x_tabc_x_identity_x_prxidentity_x_txtLabel_x_x";
	public static String justification_id = "body_x_tabc_x_identity_x_prxidentity_x_txtComment_x_x";
	public static String save_id1 = "proxyActionBar_x__cmdSave_btn2";
	public static String add_id = "body_x_tabc_x_identity_x_prxidentity_x_proxyItemControl_x_btnNewItem_btn2";
	public static String description_id = "body_x_txtItemLabel_x_x";
	public static String price_id = "body_x_txtPrice_x_x";
	public static String quantity_id = "body_x_txtQuantity_x_x";
	public static String category_id = "body_x_selFamily_x_txtselFamily_x_x";
	public static String save_id2 = "proxyActionBar_x__cmdSave_btn2";
	public static String gl_acc_xpath = "//input[contains(@id,'ctrl_account_allocation_x_txtctrl_account_allocation_x_x')]";
	public static String cost_xpath = "//input[contains(@id,'ctrl_orga_allocation_x_txtctrl_orga_allocation_x_x')]";
	public static String saveclose_id = "proxyActionBar_x__cmdEnd_btn2";
	public static String submit_name = "proxyActionBar:x:_cmdVal_btn2";
	public static String profile_xpath1 = "//a[@id=\"aLoginMenu\"]/table/tbody/tr/td[2]/div";
	public static String lout_linktxt = "Logout";
	public static String user_id2 = "body_x_txtLogin_x_x";
	public static String pass_id2 = "body_x_txtPass_x_x";
	public static String clicklog_id2 = "body_x_btnLogin_btn2";
	public static String profile_xpath2 = "//a[@id=\"aLoginMenu\"]/table/tbody/tr/td[2]/div";
	public static String workflow_linktxt = "My open workflow tasks";
	public static String pencilimg_xpath = "/html/body/form[1]/div/div[2]/div[2]/div/div/div/table/tbody/tr[2]/td[1]/a/img";
	public static String approve_id = "proxyActionBar_x_valPUO_v7CATMANVAL_btn2";
	public static String profile_xpath3 = "//a[@id=\"aLoginMenu\"]/table/tbody/tr/td[2]/div";
	public static String lout_linktxt2 = "Logout";
	public static FileInputStream read;
	public static XSSFWorkbook book;
	public static XSSFSheet sheet;

	@BeforeClass
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TO-WVLD-09\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test(priority = 1)
	public void testFunnyme() throws Exception {
		driver.get(url);
		read = new FileInputStream("C:\\Users\\TO-WVLD-09\\Downloads\\TestData.xlsx");
		book = new XSSFWorkbook(read);
		sheet = book.getSheet("TestData");
		driver.findElement(By.id(user_id1)).sendKeys(sheet.getRow(1).getCell(6).getStringCellValue());// "martha_euresti@fanniemae.com"
		driver.findElement(By.id(pass_id1)).sendKeys(sheet.getRow(1).getCell(7).getStringCellValue());// "Euresti1234"
		driver.findElement(By.id(clicklog_id1)).click();
		driver.findElement(By.id(procurment_id)).click();
		driver.findElement(By.id(createre_id)).click();
		driver.findElement(By.id(reqname_id)).sendKeys(sheet.getRow(1).getCell(17).getStringCellValue());// "Mac-Book
																											// Purchase
																											// Request"
		driver.findElement(By.id(justification_id)).sendKeys(sheet.getRow(1).getCell(18).getStringCellValue());// "Test
																												// description"
		driver.findElement(By.id(save_id1)).click();
		driver.findElement(By.id(add_id)).click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		driver.findElement(By.id(description_id)).sendKeys(sheet.getRow(1).getCell(12).getStringCellValue());// "For
																												// official
																												// purpose"
		driver.findElement(By.id(price_id)).sendKeys(sheet.getRow(1).getCell(13).getStringCellValue());// "200"
		driver.findElement(By.id(quantity_id)).sendKeys(sheet.getRow(1).getCell(14).getStringCellValue());// "1"
		driver.findElement(By.id(category_id)).sendKeys("Advertising: Creative Services");
		driver.findElement(By.id(category_id)).sendKeys(Keys.ENTER);
		Alert alr = driver.switchTo().alert();
		alr.accept();
		Thread.sleep(3000);
		driver.findElement(By.id(category_id)).sendKeys(Keys.ENTER);

		Thread.sleep(3000);
		driver.findElement(By.id(save_id2)).click();
		driver.findElement(By.xpath(gl_acc_xpath)).sendKeys(sheet.getRow(1).getCell(15).getStringCellValue());// "612151"
		Thread.sleep(3000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath(cost_xpath)).click();
		driver.findElement(By.xpath(cost_xpath)).sendKeys(sheet.getRow(1).getCell(16).getStringCellValue());// "031"
		Thread.sleep(4000);
		driver.findElement(By.xpath(cost_xpath)).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.id(saveclose_id)).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.name(submit_name)).click();
		alr.accept();
		driver.findElement(By.xpath(profile_xpath1)).click();
		driver.findElement(By.linkText(lout_linktxt)).click();
	}

	@Test(priority = 2)
	public void approve() throws Exception {
		driver.findElement(By.id(user_id2)).sendKeys(sheet.getRow(2).getCell(19).getStringCellValue());// "tom_j_froehlich@fanniemae.com"
		driver.findElement(By.id(pass_id2)).sendKeys(sheet.getRow(2).getCell(20).getStringCellValue());// "fanniemae"
		driver.findElement(By.id(clicklog_id2)).click();
		driver.findElement(By.xpath(profile_xpath2)).click();
		driver.findElement(By.linkText(workflow_linktxt)).click();
		driver.findElement(By.xpath(pencilimg_xpath)).click();
		driver.findElement(By.id(approve_id)).click();
		driver.findElement(By.xpath(profile_xpath3)).click();
		driver.findElement(By.linkText(lout_linktxt2)).click();
//		    driver.close();
	}

	@AfterClass
	public void tearDown() throws Exception {
		driver.quit();

	}

}
