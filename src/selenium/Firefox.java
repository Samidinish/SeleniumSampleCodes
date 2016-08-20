package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create a new instance of the Firefox driver
        // Notice that the remainder of the code relies on the interface, 
        // not the implementation.
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\asus\\Desktop\\Selenium Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http://amazon.com");
        
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.MICROSECONDS);
           
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Laptops", Keys.ENTER);
        
	}

}
