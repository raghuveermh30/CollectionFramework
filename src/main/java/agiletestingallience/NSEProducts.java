package agiletestingallience;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NSEProducts {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\raghuveer.mh\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nseindia.com/products.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("//a[contains(text(), 'Live Market')]"));

		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
		delay();

		WebElement ele2 = driver.findElement(By.xpath("//a[contains(text(), 'Top Ten Gainers / Losers ')]"));
		act.moveToElement(ele2).build().perform();
		ele2.click();
		System.out.println("Title of the page is : " + driver.getTitle());

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id = 'topGainers']/tbody/tr"));
		int rowsCount = rows.size();

		List<WebElement> cols = driver.findElements(By.xpath("//table[@id = 'topGainers']/tbody/tr[1]/th"));
		int colsCount = cols.size();
		String xpath = "//table[@id = 'topGainers']/tbody/tr[%s]";

		for (int i = 1; i <= rowsCount; i++) {
			String xyz = String.format(xpath, i);
			WebElement tab = driver.findElement(By.xpath(xyz));

			System.out.println(tab.getText());
		}
		System.out.println("Rows count : " + rowsCount + " Cols Count : " + colsCount);
		System.out.println();

		delay();
		driver.findElement(By.xpath("//ul[@class = 'tab']//a[contains(text(), 'Losers')]")).click();
		delay();

		System.out.println("Prinitng the values for top loosers");

		List<WebElement> rows1 = driver.findElements(By.xpath("//table[@id = 'topLosers']/tbody/tr"));
		int rowCount1 = rows1.size();

		List<WebElement> cols1 = driver.findElements(By.xpath("//table[@id = 'topLosers']/tbody/tr[1]/th"));
		int colsCount1 = cols1.size();

		System.out.println("Rows count : " + rowCount1 + " Cols Count : " + colsCount1);
		System.out.println();

		String xpath1 = "//table[@id = 'topLosers']/tbody/tr['%s']";

		for (int i = 1; i <= rowCount1; i++) {

			String xyz = String.format(xpath1, i);

			WebElement ele3 = driver.findElement(By.xpath(xyz));
			System.out.println(ele3.getText());
		}

		driver.quit();
	}

	public static void delay() {
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
		}
	}

}
