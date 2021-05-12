package naveenSessions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PremierLeague {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\raghuveer.mh\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");

		Map prefs = new HashMap();
		prefs.put("profile.default_content_settings.cookies", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.premierleague.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//ul[@class = 'showMoreEnabled']//a[contains(text(), 'Tables')]")).click();
		driver.findElement(By.linkText("Arsenal")).click();
		Thread.sleep(6000);
		String url = driver.getCurrentUrl();
		System.out.println("official website URL on the page is : " + url);

		String newTitle = driver.getTitle();

		System.out.println("page title of the newly opened window is : " + newTitle);

		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		
		String parentWindow = it.next();
		driver.switchTo().window(parentWindow);
		System.out.println("Parent window title" +driver.getTitle());
		driver.quit();
		
	}

}
