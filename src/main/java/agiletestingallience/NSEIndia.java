package agiletestingallience;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NSEIndia {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\raghuveer.mh\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nseindia.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		List<WebElement> advances = driver.findElements(By.xpath("//li[@id = 'advances']"));
		/*
		 * for(int i =0;i<=list.size();i++) { System.out.println(list.get(i).getText());
		 * }
		 */
		for (WebElement ele : advances) {
			System.out.println(ele.getText());
		}

		List<WebElement> declined = driver.findElements(By.xpath("//li[@id = 'declines']"));
		for (WebElement ele : declined) {
			System.out.println(ele.getText());
		}

		List<WebElement> unChanged = driver.findElements(By.xpath("//li[@id = 'unchanged']"));
		for (WebElement ele : unChanged) {
			System.out.println(ele.getText());
		}
		driver.quit();
	}

}
