package selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeMouseHover {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manimaran\\eclipse-workspace\\Selenium Tutorial\\Driver\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		 
		 WebElement electronic = driver.findElement(By.xpath("//div[text()='Electronics']"));
		 Actions action = new Actions(driver);
		 action.moveToElement(electronic).perform();
		 
		 WebElement gaming = driver.findElement(By.xpath("//a[text()='Gaming']"));
		 action.moveToElement(gaming).perform();
		 
		 WebElement gPad = driver.findElement(By.xpath("//a[text()='Gamepads']"));
		 action.click(gPad).perform();

	}		

}
