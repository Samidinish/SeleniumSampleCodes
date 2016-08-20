package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) {
		// 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Desktop\\Selenium Drivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.navigate().to("http://www.amazon.com");
       // driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Laptops", Keys.ENTER);
	}

}
