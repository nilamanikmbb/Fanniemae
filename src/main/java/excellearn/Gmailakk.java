package excellearn;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmailakk {
	public static WebDriver driver;

	public static void setUp() throws InterruptedException

	{
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome,driver", "G:\\SeleniumFolder\\chromedriver.exe");
		driver.get("https://www.google.com/search?q=gmail+login&rlz=1C1CHBD_enIN799IN799&oq=gmail+&aqs=chrome.0.69i59j69i57j0l2j69i60j69i61.12315j1j7&sourceid=chrome&ie=UTF-8");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[3]/div/div/div[1]/a/h3")).click();
		driver.findElement(By.xpath("//a[@class='action-button']")).click();
		driver.findElement(By.xpath(" //a[@class='action-button']")).click();
		Thread.sleep(2000);
		// Window Handling
		String mainWindow = driver.getWindowHandle();
		// It returns no. of windows opened by WebDriver and will return Set of Strings
		Set<String> set = driver.getWindowHandles();
		// Using Iterator to iterate with in windows
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String childWindow = itr.next();
			// Compare whether the main windows is not equal to child window. If not equal,
			// we will close.
			if (!mainWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
				Thread.sleep(2000);
				System.out.println("New Window Title is: " + driver.switchTo().window(childWindow).getTitle());

			}
		}
		driver.findElement(By.id("identifierId")).sendKeys("swathisriswathisri4");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("jituswathi");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=':pk']")).sendKeys("swathisriswathisri4@gmail.com");
		driver.findElement(By.name("subjectbox")).sendKeys("Permission for leave");
		driver.findElement(By.xpath("//*[@id=':q7']")).sendKeys("sdhgksavbasfafsdvndsghsdjv");
		driver.findElement(By.id(":os")).click();
	}

	public static void main(String args[]) throws InterruptedException {
		setUp();
	}
}
