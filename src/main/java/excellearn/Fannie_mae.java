package excellearn;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fannie_mae {
	
	public void run()
	{
		WebDriver driver=new ChromeDriver();
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\TO-WVLD-09\\Downloads\\chromedriver.exe");
		 driver.manage().window().maximize();
		 driver.navigate().to("https://env-pre.ivalua.us/buyer/fanniemae/prepmaint27/aysu7/page.aspx/en/usr/login?ReturnUrl=%2fbuyer%2ffanniemae%2fprepmaint27%2faysu7%2fpage.aspx%2fen%2fbuy%2fhomepage%2fbuy");
		 driver.findElement(By.name("body:x:txtLogin:x:x")).sendKeys("martha_euresti@fanniemae.com");
		 driver.findElement(By.id("body_x_txtPass_x_x")).sendKeys("Euresti1234");
		 driver.findElement(By.name("body:x:btnLogin_btn2")).click();
		  System.out.println(driver.getTitle()); 
		// driver.quit();
	

	}

	}  
