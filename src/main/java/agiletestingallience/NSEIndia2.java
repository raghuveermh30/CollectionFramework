package agiletestingallience;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class NSEIndia2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\raghuveer.mh\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nseindia.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);

		WebElement ele = driver.findElement(By.xpath("//input[@id = 'keyword']"));
		ele.sendKeys("Bajaj Finserv Limited");
		delay();
		ele.sendKeys(Keys.ENTER);
		String title = driver.getTitle();
		System.out.println("Title of the new Page is : " + title);

		WebElement ele1 = driver.findElement(By.xpath("//span[@id = 'faceValue']"));
		String faceValue = ele1.getText();
		System.out.println("FaceValue is : " + faceValue);

		WebElement ele2 = driver.findElement(By.xpath("//span[@id = 'high52']"));
		String week52 = ele2.getText();
		System.out.println("Week 52 High value is : " + week52);

		WebElement ele3 = driver.findElement(By.xpath("//span[@id = 'low52']"));
		String week52Low = ele3.getText();
		System.out.println("week 52 Low value is : " + week52Low);
		driver.navigate().back();

		WebElement hind = driver.findElement(By.xpath("//input[@id = 'keyword']"));
		hind.sendKeys("Hindustan Unilever");
		delay();
		hind.sendKeys(Keys.ENTER);
		String hindTitle = driver.getTitle();
		System.out.println("Title of the new Page is : " + hindTitle);

		WebElement hindele1 = driver.findElement(By.xpath("//span[@id = 'faceValue']"));
		String hindfaceValue = hindele1.getText();
		System.out.println("FaceValue is : " + hindfaceValue);

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
