package junit;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonWithNJunit {
      WebDriver driver=null;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\asus\\Desktop\\Selenium Drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.navigate().to("http://amazon.com");
        
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
           
        driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	@Test
	public void test() {
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Laptops", Keys.ENTER);
	}

}
