package testcase;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

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

public class TC_002 {
	 private WebDriver driver;
		public static FileInputStream read;
		public static XSSFWorkbook book;
		public static XSSFSheet sheet;


	  @BeforeClass(alwaysRun = true)
	  public void setUp() throws Exception {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test(priority=1)
	  public void corporate() throws Exception {
		driver.get("https://env-pre.ivalua.us/buyer/fanniemae/prepmaint27/aysu7/page.aspx/en/usr/login");
		read = new FileInputStream("C:\\Users\\TO-WVLD-09\\Downloads\\TestData.xlsx");
		book = new XSSFWorkbook(read);
		sheet = book.getSheet("TestData");
	    driver.get("https://env-pre.ivalua.us/buyer/fanniemae/prepmaint27/aysu7/page.aspx/en/usr/login");
	    driver.findElement(By.id("body_x_txtLogin_x_x")).sendKeys(sheet.getRow(3).getCell(6).getStringCellValue());
	    driver.findElement(By.id("body_x_txtPass_x_x")).sendKeys(sheet.getRow(3).getCell(7).getStringCellValue());
	    driver.findElement(By.id("body_x_btnLogin_btn2")).click();
	    driver.findElement(By.id("link_ivmenu00_menu_0")).click();
	    driver.findElement(By.id("link_ivmenu00_menu_0_sub0_sub0")).click();
	    driver.findElement(By.id("body_x_tabc_x_identity_x_prxidentity_x_txtName_x_x")).sendKeys(sheet.getRow(3).getCell(31).getStringCellValue());
	    driver.findElement(By.id("body_x_tabc_x_identity_x_prxidentity_x_ddlType_x")).click();
	    new Select(driver.findElement(By.id("body_x_tabc_x_identity_x_prxidentity_x_ddlType_x"))).selectByVisibleText("Corporate");
	    Thread.sleep(3000);
	    new Select(driver.findElement(By.id("ddlbody_x_tabc_x_identity_x_prxidentity_x_selClasCode_x"))).selectByVisibleText("Outside Party (Supplier)");
	    driver.findElement(By.id("body_x_tabc_x_identity_x_prxidentity_x_proxyAdr_x_txtCompNom_x_x")).sendKeys("Test Address");
	    driver.findElement(By.id("body_x_tabc_x_identity_x_prxidentity_x_proxyAdr_x_txtVoie_x_x")).sendKeys(sheet.getRow(3).getCell(32).getStringCellValue());
	    driver.findElement(By.id("body_x_tabc_x_identity_x_prxidentity_x_proxyAdr_x_txtCity_x_x")).sendKeys(sheet.getRow(3).getCell(33).getStringCellValue());
	    driver.findElement(By.id("body_x_tabc_x_identity_x_prxidentity_x_proxyAdr_x_ddlState_x_txtddlState_x_x")).sendKeys("Virginia");
	    Thread.sleep(3000);
	    driver.findElement(By.id("body_x_tabc_x_identity_x_prxidentity_x_proxyAdr_x_ddlState_x_txtddlState_x_x")).sendKeys(Keys.ENTER);
	    driver.findElement(By.id("body_x_tabc_x_identity_x_prxidentity_x_proxyAdr_x_txtZip_x_x")).sendKeys(sheet.getRow(3).getCell(34).getStringCellValue());
	    driver.findElement(By.id("proxyActionBar_x__cmdSave_btn2")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//div[@id='body_x_tabc_containerTab_partadmin']/div/div/div/span/span")).click();
	    Thread.sleep(3000);
	    new Select(driver.findElement(By.id("ddlbody_x_tabc_x_admin_x_prxadmin_x_selQualCode_x"))).selectByVisibleText("Tax Identification Number");
	    driver.findElement(By.id("body_x_tabc_x_admin_x_prxadmin_x_txtTva_x_x")).sendKeys(sheet.getRow(3).getCell(38).getStringCellValue());
	    driver.findElement(By.id("proxyActionBar_x__cmdSave_btn2")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//div[@id='body_x_tabc_containerTab_parteproc']/div/div/div/span")).click();
	    driver.findElement(By.id("body_x_tabc_x_eproc_x_prxeproc_x_selBdetaCodeBankDetail_x_btnselBdetaCodeBankDetail_btn2")).click();
	    driver.switchTo().frame(0);
	    driver.findElement(By.id("body_x_grid_x__ctl10__ctl0")).click();
	    driver.switchTo().defaultContent();
	    driver.findElement(By.id("body_x_tabc_x_eproc_x_prxeproc_x_selBaccoCodeBankAccountDetails_x_btnselBaccoCodeBankAccountDetails_btn2")).click();
	    driver.switchTo().frame(0);
	    driver.findElement(By.id("body_x_grid_x__ctl2__ctl0")).click();
	    driver.switchTo().defaultContent();
	    driver.findElement(By.id("body_x_tabc_x_eproc_x_prxeproc_x_selBpmethCodePaymentMethod_x_btnselBpmethCodePaymentMethod_btn2")).click();
	    driver.switchTo().frame(0);
	    driver.findElement(By.id("body_x_grid_x__ctl2__ctl0")).click();
	    driver.switchTo().defaultContent();
	    driver.findElement(By.id("body_x_tabc_x_eproc_x_prxeproc_x_btnAddNewBI_btn2")).click();
	    driver.switchTo().frame(0);
	    driver.findElement(By.id("body_x_txtOrder_x_x")).sendKeys(sheet.getRow(3).getCell(42).getStringCellValue());
	    driver.findElement(By.id("body_x_txtAgency_x_x")).sendKeys(sheet.getRow(3).getCell(43).getStringCellValue());
	    driver.findElement(By.id("body_x_txtBiBankId_x_x")).sendKeys(sheet.getRow(3).getCell(44).getStringCellValue());
	    driver.findElement(By.id("body_x_txtBiAccountNumber_x_x")).sendKeys(sheet.getRow(3).getCell(45).getStringCellValue());
	    driver.findElement(By.id("proxyActionBar_x__cmdSave_btn2")).click();
	    Alert alr=driver.switchTo().alert();
	    alr.accept();
	    Thread.sleep(3000);
	    alr.accept();
	    driver.findElement(By.id("proxyActionBar_x_BackAction_btn2")).click();
	    driver.switchTo().defaultContent();
	    Thread.sleep(3000);
	    driver.findElement(By.id("body_x_tabc_x_eproc_x_prxeproc_x_txtSupPaymentConfirmEmail_x_x")).sendKeys(sheet.getRow(3).getCell(48).getStringCellValue());
	    driver.findElement(By.id("proxyActionBar_x__cmdSave_btn2")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@id=\"body_x_tabc_containerTab_partcontact\"]/div/div/div")).click();
	    driver.findElement(By.id("body_x_tabc_x_contact_x_prxcontact_x_proxyContact_x_selContact_x_btnselContact_btn2")).click();
	    driver.switchTo().frame(0);
	    driver.findElement(By.id("body_x_pxCtc_x_ContactControl_x_txtContactLastname_x_x")).sendKeys(sheet.getRow(3).getCell(46).getStringCellValue());
	    driver.findElement(By.id("body_x_pxCtc_x_ContactControl_x_txtContactFirstname_x_x")).sendKeys(sheet.getRow(3).getCell(47).getStringCellValue());
	    driver.findElement(By.id("body_x_pxCtc_x_ContactControl_x_txtContactEmail_x_x")).sendKeys(sheet.getRow(3).getCell(48).getStringCellValue());
	    driver.findElement(By.id("body_x_pxCtc_x_ContactControl_x_txtContactPhone_x_x")).sendKeys(sheet.getRow(3).getCell(49).getStringCellValue());
	    driver.findElement(By.id("proxyActionBar_x__cmdSave_btn2")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("proxyActionBar_x_BackAction_btn2")).click();
	    driver.switchTo().defaultContent();
	    driver.findElement(By.id("proxyActionBar_x__cmdSave_btn2")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@id=\"body_x_tabc_containerTab_partworkflow\"]/div/div/div/span")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("proxyActionBar_x_valFM_SUPREF_SuppliersINI_btn2")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("proxyActionBar_x_valFM_SUPREF_Suppliersots_btn2")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("proxyActionBar_x_valFM_SUPREF_SuppliersVAL2_btn2")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("proxyActionBar_x_valFM_SUPREF_SuppliersAPP2_btn2")).click();
	    driver.findElement(By.id("link_ivmenu00_menu_0")).click();
	    driver.findElement(By.id("link_ivmenu00_menu_0_sub0")).click();
	    alr.accept();
	    driver.findElement(By.id("body_x_ddlStatus_x_vddlStatus_x__ctl2___colDelvddlStatus")).click();
	    driver.findElement(By.id("body_x_selFamily_x_txtselFamily_x_x")).sendKeys(sheet.getRow(3).getCell(31).getStringCellValue());
	    Thread.sleep(3000);
	    driver.findElement(By.id("body_x_prxFilterBar_x_cmdSearchBtn_btn2")).click();
	    alr.accept();
	    driver.findElement(By.xpath("//a[@id=\"aLoginMenu\"]/table/tbody/tr/td[2]/div")).click();
	    driver.findElement(By.linkText("Logout")).click();
	  }
	    @Test(priority=2)
	    public void broker() throws Exception{
	    driver.findElement(By.id("body_x_txtLogin_x_x")).sendKeys(sheet.getRow(4).getCell(6).getStringCellValue());//"rhonda_milhouse@fanniemae.com"
	    driver.findElement(By.id("body_x_txtPass_x_x")).sendKeys(sheet.getRow(4).getCell(7).getStringCellValue());//"Milhouse1234"
	    driver.findElement(By.id("body_x_btnLogin_btn2")).click();
	    driver.findElement(By.id("link_ivmenu00_menu_0")).click();
	    driver.findElement(By.id("link_ivmenu00_menu_0_sub0_sub0")).click();
	    new Select(driver.findElement(By.id("body_x_tabc_x_identity_x_prxidentity_x_ddlType_x"))).selectByVisibleText("Real Estate Broker");
	    Thread.sleep(2000);
	    driver.findElement(By.id("body_x_tabc_x_identity_x_prxidentity_x_txtName_x_x")).sendKeys(sheet.getRow(4).getCell(31).getStringCellValue());//"Test Supplier"
	    driver.findElement(By.id("body_x_tabc_x_identity_x_prxidentity_x__sup_fm_equator_id_x_x")).sendKeys(sheet.getRow(4).getCell(6).getStringCellValue());//"ABC123"
	    driver.findElement(By.id("body_x_tabc_x_identity_x_prxidentity_x_proxyAdr_x_txtCompNom_x_x")).sendKeys("Test Address");
	    driver.findElement(By.id("body_x_tabc_x_identity_x_prxidentity_x_proxyAdr_x_txtVoie_x_x")).sendKeys(sheet.getRow(4).getCell(32).getStringCellValue());//"13150worldgate drive"
	    driver.findElement(By.id("body_x_tabc_x_identity_x_prxidentity_x_proxyAdr_x_txtCity_x_x")).sendKeys(sheet.getRow(4).getCell(33).getStringCellValue());//"Herendon"
	    driver.findElement(By.id("body_x_tabc_x_identity_x_prxidentity_x_proxyAdr_x_ddlState_x_txtddlState_x_x")).sendKeys("Virginia");//
	    Thread.sleep(2000);
	    driver.findElement(By.id("body_x_tabc_x_identity_x_prxidentity_x_proxyAdr_x_ddlState_x_txtddlState_x_x")).sendKeys(Keys.ENTER);
	    driver.findElement(By.id("body_x_tabc_x_identity_x_prxidentity_x_proxyAdr_x_txtZip_x_x")).sendKeys(sheet.getRow(4).getCell(34).getStringCellValue());//"20170"
	    driver.findElement(By.id("body_x_tabc_x_identity_x_prxidentity_x_txtSupUseWeb_x0")).click();
	    driver.findElement(By.id("body_x_tabc_x_identity_x_prxidentity_x_txtSupPayTrx_x0")).click();
	    driver.findElement(By.id("proxyActionBar_x__cmdSave_btn2")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@id='body_x_tabc_containerTab_partadmin']/div/div/div/span/span")).click();
	    driver.findElement(By.id("body_x_tabc_x_admin_x_prxadmin_x_proxyAdrPay_x_txtCompNom_x_x")).sendKeys("Head Quarters");
	    driver.findElement(By.id("body_x_tabc_x_admin_x_prxadmin_x_proxyAdrPay_x_txtVoie_x_x")).sendKeys("52145 Mclean Drive");
	    driver.findElement(By.id("body_x_tabc_x_admin_x_prxadmin_x_proxyAdrPay_x_txtCity_x_x")).sendKeys("Ashburn");
	    driver.findElement(By.id("body_x_tabc_x_admin_x_prxadmin_x_proxyAdrPay_x_ddlState_x_txtddlState_x_x")).sendKeys("Virginia");
	    Thread.sleep(2000);
	    driver.findElement(By.id("body_x_tabc_x_admin_x_prxadmin_x_proxyAdrPay_x_ddlState_x_txtddlState_x_x")).sendKeys(Keys.ENTER);
	    driver.findElement(By.id("body_x_tabc_x_admin_x_prxadmin_x_proxyAdrPay_x_txtZip_x_x")).sendKeys("20148");
	    driver.findElement(By.id("proxyActionBar_x__cmdSave_btn2")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@id='body_x_tabc_containerTab_partcontact']/div/div/div/span/span")).click();
	    driver.findElement(By.id("body_x_tabc_x_contact_x_prxcontact_x_proxyContact_x_selContact_x_btnselContact_btn2")).click();
	    driver.switchTo().frame(0);
	    driver.findElement(By.id("body_x_pxCtc_x_ContactControl_x_txtContactLastname_x_x")).sendKeys("Test");
	    driver.findElement(By.id("body_x_pxCtc_x_ContactControl_x_txtContactFirstname_x_x")).sendKeys("pbc");
	    Thread.sleep(2000);
	    driver.findElement(By.id("body_x_pxCtc_x_ContactControl_x_txtContactEmail_x_x")).sendKeys("pbs@testing.com");
	    driver.findElement(By.id("body_x_pxCtc_x_ContactControl_x_txtContactPhone_x_x")).sendKeys("9852112546");
	    driver.findElement(By.id("proxyActionBar_x__cmdSave_btn2")).click();
	    driver.findElement(By.xpath("//table[@id='body_x_frmLink']/tbody/tr[2]/td/div/a[2]")).click();
	    Thread.sleep(3000);
	    driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//input[@id='body_x_pxCtc_x_txtLoginName_x_x']")).sendKeys("bptp239up@test.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='body_x_pxCtc_x_txtLoginPass_x_x']")).sendKeys("12345");
		driver.findElement(By.id("proxyActionBar_x__cmdEnd_btn2")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//table[@id='body_x_frmLink']/tbody/tr[2]/td/div/a[1]/img")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.id("proxyActionBar_x_resend_btn2")).click();

		
		driver.findElement(By.xpath("//div[@class='ui-widget ui-widget-content iv-messagebar-container iv-messagebar-shadow ui-state-highlight ui-state-info']//div[@class='msgbar-icon-container']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("proxyActionBar_x_BackAction_btn2")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("proxyActionBar_x__cmdEnd_btn2")).click();
		driver.switchTo().defaultContent();
		

		new Select(driver.findElement(By.xpath("//select[contains(@id,'ddlbody_x_tabc_x_contact_x_prxcontact_x_proxyContact_x_selContact')]"))).selectByIndex(4);
		new Select(driver.findElement(By.xpath("//select[contains(@id,'ddlbody_x_tabc_x_contact_x_prxcontact_x_proxyContact_x_selContact')]"))).selectByIndex(5);
		driver.findElement(By.id("proxyActionBar_x__cmdSave_btn2")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("body_x_tabc_x_contact_x_prxcontact_x_proxyContact_x_selContact_x_btnselContact_btn2")).click();
		driver.switchTo().frame(0);
	    driver.findElement(By.id("body_x_pxCtc_x_ContactControl_x_txtContactLastname_x_x")).sendKeys("Test");
	    driver.findElement(By.id("body_x_pxCtc_x_ContactControl_x_txtContactFirstname_x_x")).sendKeys("bo");
	    Thread.sleep(2000);
	    driver.findElement(By.id("body_x_pxCtc_x_ContactControl_x_txtContactEmail_x_x")).sendKeys("bo@testing.com");
	    driver.findElement(By.id("body_x_pxCtc_x_ContactControl_x_txtContactPhone_x_x")).sendKeys("9856478213");
	    driver.findElement(By.id("proxyActionBar_x__cmdSave_btn2")).click();
	    driver.findElement(By.xpath("//table[@id=\"body_x_frmLink\"]/tbody/tr[2]/td/div/a[2]")).click();
	    Thread.sleep(3000);
	    driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//input[@id='body_x_pxCtc_x_txtLoginName_x_x']")).sendKeys("bou9@test.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='body_x_pxCtc_x_txtLoginPass_x_x']")).sendKeys("1234");
		driver.findElement(By.id("proxyActionBar_x__cmdEnd_btn2")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//table[@id='body_x_frmLink']/tbody/tr[2]/td/div/a[1]/img")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		
		driver.findElement(By.id("proxyActionBar_x_resend_btn2")).click();
		
		
		
		driver.findElement(By.xpath("//div[@class='ui-widget ui-widget-content iv-messagebar-container iv-messagebar-shadow ui-state-highlight ui-state-info']//div[@class='msgbar-icon-container']")).click();
		
		driver.findElement(By.id("proxyActionBar_x_BackAction_btn2")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.findElement(By.id("proxyActionBar_x__cmdEnd_btn2")).click();
		driver.switchTo().defaultContent();
		new Select(driver.findElement(By.xpath("(//select[contains(@id,'ddlbody_x_tabc_x_contact_x_prxcontact_x_proxyContact_x_selContact_x_vselContact')][@tabindex='0'])[2]"))).selectByIndex(2);
		new Select(driver.findElement(By.xpath("(//select[contains(@id,'ddlbody_x_tabc_x_contact_x_prxcontact_x_proxyContact_x_selContact_x_vselContact')][@tabindex='0'])[2]"))).selectByIndex(10);
		new Select(driver.findElement(By.xpath("(//select[contains(@id,'ddlbody_x_tabc_x_contact_x_prxcontact_x_proxyContact_x_selContact_x_vselContact')][@tabindex='0'])[2]"))).selectByIndex(11);
		driver.findElement(By.id("proxyActionBar_x__cmdSave_btn2")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='body_x_tabc_containerTab_partworkflow']/div/div/div/span")).click();
		Thread.sleep(3000);
	    driver.findElement(By.id("proxyActionBar_x_valFM_SUPREF_SuppliersINI_btn2")).click();//1
	    Thread.sleep(3000);
	    driver.findElement(By.id("proxyActionBar_x_valFM_SUPREF_Suppliersots_btn2")).click();//2
	    Thread.sleep(3000);
	    driver.findElement(By.id("proxyActionBar_x_valFM_SUPREF_Suppliersm_trax_chk_btn2")).click();//3
	    Thread.sleep(3000);
	    driver.findElement(By.id("proxyActionBar_x_valFM_SUPREF_Suppliersfm_sup_update_btn2")).click();//4
	    Thread.sleep(3000);
	    driver.findElement(By.id("proxyActionBar_x_valFM_SUPREF_Suppliersfm_sup_ops_review_btn2")).click();//5
	    Thread.sleep(3000);
	    driver.findElement(By.id("proxyActionBar_x_valFM_SUPREF_Suppliersfm_due_diligence_btn2")).click();//6
	    Thread.sleep(3000);
	    driver.findElement(By.id("proxyActionBar_x_valFM_SUPREF_Suppliersfm_sup_op_trax_upd_btn2")).click();//7
	    Thread.sleep(3000);
	    driver.findElement(By.id("proxyActionBar_x_valFM_SUPREF_Suppliersfm_upd_proc_one_btn2")).click();//8
	    Thread.sleep(3000);
	    driver.findElement(By.id("proxyActionBar_x_valFM_SUPREF_Suppliersfm_upd_ach_btn2")).click();//9
	    Thread.sleep(3000);
	    driver.findElement(By.id("proxyActionBar_x_valFM_SUPREF_SuppliersVAL1_btn2")).click();//10
	    Thread.sleep(3000);
	    driver.findElement(By.id("proxyActionBar_x_txtWflRefuseMessage_x_x")).sendKeys("For House");
	    driver.findElement(By.id("proxyActionBar_x_btnWflRefuseMessage_btn2")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("link_ivmenu00_menu_0")).click();
	    driver.findElement(By.id("link_ivmenu00_menu_0_sub0")).click();
	    driver.switchTo().alert().accept();
	    driver.findElement(By.id("body_x_ddlStatus_x_vddlStatus_x__ctl2___colDelvddlStatus")).click();
	    driver.findElement(By.id("body_x_selFamily_x_txtselFamily_x_x")).sendKeys("Test supplier");
	    driver.findElement(By.id("body_x_prxFilterBar_x_cmdSearchBtn_btn2")).click();
	    driver.switchTo().alert().accept();
	    driver.findElement(By.xpath("//a[@id=\"aLoginMenu\"]/table/tbody/tr/td[2]/div")).click();
	    driver.findElement(By.linkText("Logout")).click();
	  }

	  @AfterClass(alwaysRun = true)
	  public void tearDown() throws Exception {
	    driver.quit();

	    }
	 


}
