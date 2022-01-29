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

public class WindowHandleDemo {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manimaran\\eclipse-workspace\\Selenium Tutorial\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Actions action = new Actions(driver);

		// MOBILE//
		WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		action.contextClick(mobile).perform();

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		// BEST SELLER//
		WebElement bestSeller = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
		action.contextClick(bestSeller).perform();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);

		// TODAY DEAL//
		WebElement deal = driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
		action.contextClick(deal).perform();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);

		String parentWindow = driver.getWindowHandle();
		System.out.println("parent window" + parentWindow);

		Set<String> allWindow = driver.getWindowHandles();
		for (String allWindowId : allWindow) {
			System.out.println("id :" + allWindowId);
			String allTitle = driver.switchTo().window(allWindowId).getTitle();
			System.out.println("Title :" + allTitle);
		}
		// Move to Particular tab
		String todayDeal = "Amazon.in - Today's Deals";

		for (String allWindowId : allWindow) {
			if (driver.switchTo().window(allWindowId).getTitle().equals(todayDeal)) {
				break;
			}
		}
		// To close all other Tab except the selected Tab
		
		String windowHandle = driver.getWindowHandle();
		String title = driver.switchTo().window(windowHandle).getTitle();
		System.out.println(title);

		for (String allWindowId : allWindow) {
			if (!allWindowId.equals(windowHandle)) {
				driver.switchTo().window(allWindowId).close();
			}

		}

		// To close all other Tab except the selected Tab

		for (String allWindowId : allWindow) {
			if (!driver.switchTo().window(allWindowId).getTitle().equals(todayDeal)) {
				driver.close();
			}
		}

	}

}
