package mini_Project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonMouseHover {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manimaran\\eclipse-workspace\\Selenium Tutorial\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		Actions actions = new Actions(driver);

		// Mobile
		WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		actions.contextClick(mobile).perform();
		// Robot class ==>For KeyBoard Operation
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);

		// Best Seller
		WebElement bestSeller = driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
		actions.contextClick(bestSeller).perform();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		//fashion
		WebElement fashion = driver.findElement(By.xpath("//a[text()='Fashion']"));
		actions.contextClick(fashion).perform();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		
	    //sign In
		Thread.sleep(3000);
		WebElement signin = driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
		actions.moveToElement(signin).click().perform();

	}

}
