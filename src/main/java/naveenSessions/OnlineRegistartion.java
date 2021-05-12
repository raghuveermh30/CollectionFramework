package naveenSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OnlineRegistartion {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\raghuveer.mh\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.cii.in/OnlineRegistration.aspx");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);

		WebElement ele = driver.findElement(By.name("drpAttendee"));

		Select sel = new Select(ele);
		sel.selectByVisibleText("3");
		Thread.sleep(3000L);

		List<WebElement> list = driver.findElements(By.xpath("//table[@id = 'Gridview1']/tbody/tr/td/parent::tr"));

		int rowCont = list.size();
		System.out.println("Total Row Count is : " + rowCont);

		WebElement ele1 = driver.findElement(By.xpath("//select[@id='Gridview1_ctl02_drpTitle']"));
		Select select1 = new Select(ele1);
		select1.selectByVisibleText("Admiral");

		WebElement ele2 = driver.findElement(By.id("Gridview1_ctl03_drpTitle"));
		Select select2 = new Select(ele2);
		select2.selectByVisibleText("CA");

		WebElement ele3 = driver.findElement(By.name("Gridview1$ctl04$drpTitle"));
		Select select3 = new Select(ele3);
		select3.selectByVisibleText("CS");

		List<WebElement> list1 = driver.findElements(By.id("drpRegTitle"));

		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i).getText());
		}
		
		driver.quit();

	}

}
