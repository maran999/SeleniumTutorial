package selenium.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickDemo {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manimaran\\eclipse-workspace\\Selenium Tutorial\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		
		Actions ac = new Actions(driver);
		ac.contextClick(gmail).perform();
		
	     Robot robot = new Robot();
	     Thread.sleep(3000);
	     robot.keyPress(KeyEvent.VK_DOWN);
	     Thread.sleep(3000);
	     robot.keyPress(KeyEvent.VK_DOWN);
	     Thread.sleep(3000);
	     robot.keyPress(KeyEvent.VK_DOWN);
	     robot.keyRelease(KeyEvent.VK_DOWN);
	     Thread.sleep(3000);
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	     
	     
	     

	}

}
