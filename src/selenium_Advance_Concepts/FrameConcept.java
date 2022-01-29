package selenium_Advance_Concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manimaran\\eclipse-workspace\\Selenium Tutorial\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		//**TimeOut**//
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		//**Single frame**//
		
		WebElement singleFrm = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(singleFrm);
		
	    WebElement text1 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	    text1.sendKeys("This is single frame");
	    driver.switchTo().defaultContent();
	    
	    //**Nested Frame**//
	    WebElement nestedBtn = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
	    nestedBtn.click();
	    
	    WebElement outerFrm = driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[2]/div[2]/iframe"));
	    driver.switchTo().frame(outerFrm);
	    
	    WebElement innerfrm = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
	    driver.switchTo().frame(innerfrm);
	    
	    driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("This is nested frame");
	}
}
