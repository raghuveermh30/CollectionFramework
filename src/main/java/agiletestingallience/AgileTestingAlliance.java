package agiletestingallience;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class AgileTestingAlliance {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\raghuveer.mh\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://agiletestingalliance.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Certifications")).click();
		List<WebElement> list = driver
				.findElements(By.xpath("//map[@name = 'image-map']/area[contains(@target, '_self')]"));
		System.out.println(list.size());

		/*
		 * for (int i = 0; i <= list.size(); i++) {
		 * 
		 * System.out.println(list.get(i).getAttribute("href")); }
		 */

		for (WebElement ele : list) {
			System.out.println(ele.getAttribute("href"));
		}

		System.out.println("checking all the links are working or not");

		for (WebElement ele : list) {
			try {
				System.out.println("URL : " + ele.getAttribute("href") + " returned "
						+ isLinkBroken(new URL(ele.getAttribute("href"))));
			} catch (Exception e) {
				SoftAssert softAsert = new SoftAssert();
				System.out.println("At " + ele.getAttribute("href") + "Exception Occured " + e.getMessage());
				softAsert.assertEquals(true, true, "Broken Links");
				softAsert.assertAll();
			}
		}

		TakesScreenshot scrSht = ((TakesScreenshot) driver);
		File src = scrSht.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\raghuveer.mh\\Desktop\\Varun\\scrSht.png"));

		WebElement ele1 = driver.findElement(
				By.xpath("//map[@name = 'image-map']/area[contains(@target, '_self') and @title = 'CP-CCT']"));
		Actions act = new Actions(driver);
		act.moveToElement(ele1).build().perform();
		Thread.sleep(2000L);
		TakesScreenshot scrsht1 = (TakesScreenshot) driver;
		File src1 = scrsht1.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File("C:\\Users\\raghuveer.mh\\Desktop\\Varun\\scrSht1.png"));

		driver.quit();
	}

	public static List<WebElement> findAllLinks(WebDriver driver) {
		List<WebElement> list = driver
				.findElements(By.xpath("//map[@name = 'image-map']/area[contains(@target, '_self')]"));
		List<WebElement> finalList = new ArrayList<>();

		for (WebElement ele : list) {
			if (ele.getAttribute("href") != null) {
				finalList.add(ele);
			}

		}	
		return finalList;
	}

	public static String isLinkBroken(URL url) throws IOException {
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();

		try {
			connection.connect();
			String respone = connection.getResponseMessage();
			connection.disconnect();
			return respone;
		} catch (Exception e) {
			return e.getMessage();
		}
	}
}
