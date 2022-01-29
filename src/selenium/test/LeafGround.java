package selenium.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LeafGround {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manimaran\\eclipse-workspace\\Selenium Tutorial\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		WebElement button = driver.findElement(By.xpath("//a[text()='Mobiles']"));
          
		Actions action = new Actions(driver);
		action.contextClick(button).build().perform();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		String parentWindow = driver.getWindowHandle();
              
		
		Set<String> allWindow = driver.getWindowHandles();
		
		for (String windows : allWindow) {
			String alltitle = driver.switchTo().window(windows).getTitle();
			System.out.println(alltitle);
			
			
		}
		
				
		
		
		
	}

}
