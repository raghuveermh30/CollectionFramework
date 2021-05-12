package agiletestingallience;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NSEIndiaEicher {

	static WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\raghuveer.mh\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void test() throws IOException {
		driver.get("https://www.nseindia.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);

		WebElement ele = driver.findElement(By.xpath("//input[@id = 'keyword']"));
		ele.sendKeys("Eicher Motors Limited");
		delay();
		driver.findElement(By.xpath("//input[@id = 'keyword']")).sendKeys(Keys.ENTER);
		delay();
		System.out.println("Title of the new Page : " + driver.getTitle());
		TakesScreenshot scrSht = (TakesScreenshot) driver;
		File src = scrSht.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\raghuveer.mh\\Desktop\\Varun\\nse.png"));
		WebElement faceValue = driver.findElement(By.xpath("//li[@id = 'face']"));
		System.out.println(faceValue.getText());
		WebElement weekHigh = driver.findElement(By.xpath("//span[@id = 'high52']"));
		System.out.println("52 Week High : " + weekHigh.getText());
		WebElement weekLow = driver.findElement(By.xpath("//span[@id = 'low52']"));
		System.out.println("52 Week Low : " + weekLow.getText());

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

	public static void delay() {
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
