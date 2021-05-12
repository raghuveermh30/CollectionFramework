package com.datadriven.woodland;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WoodlandInTestng {

	static WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\raghuveer.mh\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.woodlandworldwide.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);

	}

	@DataProvider
	public Iterator<Object[]> getTestData() {
		ArrayList<Object[]> testData = TestUtil.getDataFromExcel();
		return testData.iterator();
	}

	@Test(dataProvider = "getTestData")
	public void test(String productName) throws InterruptedException {

		driver.findElement(By.xpath("//div[contains(@class, 'spirit-bg search-icon')]")).click();
		driver.findElement(By.name("searchkey")).clear();
		driver.findElement(By.name("searchkey")).sendKeys(productName);
		driver.findElement(By.id("searchBtn")).click();
		Thread.sleep(4000L);
		driver.findElement(By.xpath("(//label[@class = 'spirit-bg radio1'])[1]")).click();

		List<WebElement> list = driver.findElements(By.xpath("//span[@class = 'mrp']"));
		

		/*List<Integer> price = new ArrayList<Integer>();
		for (WebElement ele : list) {
			System.out.println(price.add(Integer.parseInt(ele.getText().replaceAll("[^0-9]", ""))));
		}

		System.out.println("checking in Descending order");
		Collections.sort(price, Collections.reverseOrder());
		System.out.println(price);
*/
		
		for(int i =0; i<8;i++) {
			String s = list.get(i).getText().replaceAll("[^0-9]", "");
			int a = Integer.parseInt(s);
			System.out.println(a);
		}
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
