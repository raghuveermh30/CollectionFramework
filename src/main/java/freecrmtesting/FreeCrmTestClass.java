package freecrmtesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FreeCrmTestClass {
	
	/*login
	Login with the Cust user
	place the order
	logout
	login with the admin user
	check the order
	check all the orders
	logout
	*/
	
	WebDriver driver = new ChromeDriver();

	@BeforeMethod
	public void setUp() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raghuveer.mh\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");

		driver.get("https://www.crmpro.com/index.html");
		driver.manage().window().maximize();
		Thread.sleep(3000L);
	}

	@Test
	public void loginWithAdminTest() {

		String adminCred = Data.getUserLoginInfo().get("admin");

		String adminInfo[] = adminCred.split("_");

		driver.findElement(By.name("username")).sendKeys(adminInfo[0]);
		driver.findElement(By.name("password")).sendKeys(adminInfo[1]);

		WebElement loginBtn = driver.findElement(By.xpath("//input[@type = 'submit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginBtn);
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);

	}

	@Test
	public void loginWithCusTest() throws InterruptedException {

		String adminCred = Data.getUserLoginInfo().get("customer");

		String adminInfo[] = adminCred.split("_");

		driver.findElement(By.name("username")).sendKeys(adminInfo[0]);
		driver.findElement(By.name("password")).sendKeys(adminInfo[1]);

		WebElement loginBtn = driver.findElement(By.xpath("//input[@type = 'submit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginBtn);
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		
		driver.switchTo().frame("mainpanel");
		Thread.sleep(3000L);
		Select select = new Select(driver.findElement(By.name("slctMonth")));
		select.selectByVisibleText(Data.monthMap().get(10));

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
