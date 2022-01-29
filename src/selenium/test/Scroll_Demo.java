package selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manimaran\\eclipse-workspace\\Selenium Tutorial\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		// WebElement
		WebElement down = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;

		executor.executeScript("arguments[0].scrollIntoView();", down);
		Thread.sleep(3000);
		WebElement scrollup = driver.findElement(By.xpath("//div[@class='a-cardui-header as-title-block']"));
		executor.executeScript("arguments[0].scrollIntoView();", scrollup);

		// using pixel

//	executor.executeScript("window.scrollBy(0,1000)");
//	
//	executor.executeScript("window.scrollBy(0,-1000)");

	}

}
