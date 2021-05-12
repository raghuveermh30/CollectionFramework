package naveenSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HomeTown {

	static WebDriver driver;
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\raghuveer.mh\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeOptions options  = new ChromeOptions();
	    //options.addArguments("incognito");
	    options.addArguments("--disable-popup-blocking");
	    DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	    driver = new ChromeDriver(capabilities);
		driver.get("https://www.hometown.in/%E2%80%99");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[contains(text(), 'Electronics')]")).click();
		
		WebElement ele = driver.findElement(By.xpath("//button[contains(text(), 'Color')]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
		
		delay();
		
		driver.findElement(By.xpath("//label[contains(text(), 'Black')]")).click();
		delay();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/main/section/div[1]/div/div/section[5]/div/div/div[1]/div[1]/button[2]")).click();
		
		
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
