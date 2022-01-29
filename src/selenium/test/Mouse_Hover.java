package selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manimaran\\eclipse-workspace\\Selenium Tutorial\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		WebElement tc = driver.findElement(By.xpath("//a[@class='sf-with-ul'][1]"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(tc);
		 WebElement wom = driver.findElement(By.xpath("//a[text()='T-shirts']"));
		 act.click(wom).perform();

	}

}
