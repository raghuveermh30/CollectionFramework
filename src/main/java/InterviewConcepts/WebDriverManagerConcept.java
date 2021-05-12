package InterviewConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	
	WebDriver driver;

    @BeforeTest
    public void setup(){

 /*       WebDriverManager.firefoxdriver().setup();
        WebDriverManager.operadriver().setup();
        WebDriverManager.iedriver().setup();
        WebDriverManager.edgedriver().setup();*/


        ChromeOptions chromeOptions = new ChromeOptions();
       // WebDriverManager.chromiumdriver().setup();
        WebDriverManager.chromiumdriver().browserVersion("88.0").setup();

    //    WebDriverManager.chromedriver().version("2.40").setup();
         driver = new ChromeDriver(chromeOptions);
         
         /* WebDriverManager.operadriver().setup();
         driver = new OperaDriver(); // Error message = Cannot find opera Binary*/
    }

    @Test
    public void freeCRMTest(){
        driver.get("https://classic.crmpro.com");
        System.out.println(driver.getTitle());
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
