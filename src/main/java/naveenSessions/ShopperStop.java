package naveenSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopperStop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raghuveer.mh\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
		driver.get("https://www.shoppersstop.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.xpath("//div[contains(@class, 'next-arrow slick-arrow')]"));
		
		for(int i =0;i<=5;i++) {
			ele.click();
		}
		
		WebElement men = driver.findElement(By.xpath("//a[@title = 'MEN']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(men).build().perform();
		delay();
		//System.out.println("Hello");
		
	WebElement menFrag=	driver.findElement(By.linkText("Men's Fragrance"));
		act.moveToElement(menFrag).build().perform();
		//menFrag.click();
		delay();
		
		WebElement perfumes = driver.findElement(By.xpath("(//a[contains(text(), 'Perfumes')])[2]"));
		act.moveToElement(perfumes).build().perform();
		perfumes.click();
		
		
		

		
	
		

	}
	
	public static void delay() {
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
