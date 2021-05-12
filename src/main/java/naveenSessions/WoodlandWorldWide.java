package naveenSessions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WoodlandWorldWide {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\raghuveer.mh\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.woodlandworldwide.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[contains(@class, 'spirit-bg search-icon')]")).click();
		WebElement ele = driver.findElement(By.name("searchkey"));
		ele.sendKeys("Bags");
		driver.findElement(By.id("searchBtn")).click();
		delay();
		driver.findElement(By.xpath("(//label[@class = 'spirit-bg radio1'])[1]")).click();

		List<WebElement> list = driver.findElements(By.xpath("//span[@class = 'mrp']"));
		
		/*List<Integer> priceList = new ArrayList<Integer>();
		
		for(WebElement price : list) {
			
		System.out.println(priceList.add(Integer.parseInt(price.getText().replaceAll("[^0-9]", ""))));
			
		}
		
		System.out.println("checking in Descending order");
		Collections.sort(priceList, Collections.reverseOrder());
		System.out.println(priceList);*/
		
		for(int i =0;i<list.size();i++) {
			String s = list.get(i).getText().replaceAll("[^0-9]", "");
			System.out.println(Integer.parseInt(s));
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
