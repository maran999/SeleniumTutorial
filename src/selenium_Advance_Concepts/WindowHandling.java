package selenium_Advance_Concepts;

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

public class WindowHandling {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manimaran\\eclipse-workspace\\Selenium Tutorial\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

		Actions action = new Actions(driver);

		// **MOBILE**//
		WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		Actions MobileClick = action.contextClick(mobile);
		MobileClick.build().perform();

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);

		// **BEST SELLER**//
		WebElement bestSeller = driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
		Actions bestSellerClick = action.contextClick(bestSeller);
		bestSellerClick.build().perform();

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);

		// **Window Handle**//
		String parentWindow = driver.getWindowHandle();
		String parentTitle = driver.switchTo().window(parentWindow).getTitle();
		System.out.println(parentTitle);

		Set<String> allWindow = driver.getWindowHandles();
		for (String totWindow : allWindow) {
			String alltitle = driver.switchTo().window(totWindow).getTitle();
			System.out.println(alltitle);
		}

		// **MOVE TO PARTICULAR WINDOW**//
		String BestSellerWindow = "Amazon.in Bestsellers: The most popular items on Amazon";
		for (String selectedWindow : allWindow) {
			if (driver.switchTo().window(selectedWindow).getTitle().equalsIgnoreCase(BestSellerWindow)) {
				break;
			}
		}

		WebElement bags = driver.findElement(
				By.xpath("//div[@class='a-section a-spacing-mini']//img[@alt='American Tourister Casual Backpack']"));
		bags.click();
		
		//**Close unused window**//
		String CurrentWindow = driver.getWindowHandle();
		for (String unusedWindow : allWindow) {
			if (!unusedWindow.equals(CurrentWindow)) {
				driver.switchTo().window(unusedWindow).close();
			}
		}
		
		
	}

	
}
