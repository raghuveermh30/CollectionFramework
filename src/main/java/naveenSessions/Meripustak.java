package naveenSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Meripustak {
	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\raghuveer.mh\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.meripustak.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println("Title of the Page is : " + title);

		// checking the Dimenesion of the Logo

		int width = driver.findElement(By.xpath("//img[@alt = 'Meripustak logo']")).getSize().getWidth();
		System.out.println("Width of the image is : " + width);
		int height = driver.findElement(By.xpath("//img[@alt = 'Meripustak logo']")).getSize().getHeight();
		System.out.println("Height of the image is : " + height);

		// Extracting the href value

		String href = driver.findElement(By.xpath("//i[@class = 'fa fa-twitter sky_blue']//parent::a"))
				.getAttribute("href");
		System.out.println("printing the href value : " + href);

		// click on shopping cart when the item in the cart is 0

		String itemNo = driver.findElement(By.xpath("//span[contains(text(), '0 Item')]")).getText();

		if (itemNo.contains("0 Item")) {
			driver.findElement(By.xpath("//a[contains(text(), 'Shopping Cart')]")).click();
			driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
			String cartText = driver.findElement(By.xpath("//h4[contains(text(), 'Cart is Empty!!!' )]")).getText();
			System.out.println("checking Cark is Empty : " + cartText);
			Assert.assertEquals("No Item is Added In Cart yet.Cart is Empty!!!", cartText);
		}

		driver.navigate().back();
		driver.findElement(By.name("search")).click();
		driver.findElement(By.name("search")).sendKeys("Java 8");
		driver.findElement(By.id("btnsearch")).click();
		String title1 = driver.getTitle();
		System.out.println("Title of the search Page : " + title1);

		driver.findElement(By.xpath("//div[@class = 'book_list_name']/a[contains(text(), 'Java 8')]")).click();
		String title3 = driver.getTitle();
		System.out.println("Java 8 Page is : " + title3);

		// clicking to Add to Cart

		driver.findElement(By.xpath("//input[contains(@id, 'AddtoCart')]")).click();
		String title4 = driver.getTitle();
		System.out.println("Cart Page is : " + title4);

		isElementPresent("//h4[contains(text(), 'Cart is Empty!!!' )]");

		driver.quit();

	}

	public static boolean isElementPresent(String value) {
		try {
			driver.findElement(By.xpath(value)).isDisplayed();
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

}
