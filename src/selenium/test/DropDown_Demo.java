package selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Demo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manimaran\\eclipse-workspace\\Selenium Tutorial\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		//Thread.sleep(3000);
		WebElement create = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		create.click();
		
		//day ====>Using by Index
		Thread.sleep(3000);
		WebElement days = driver.findElement(By.id("day"));
		
		Select select1 = new Select(days);
		select1.selectByIndex(7);
		
		WebElement month = driver.findElement(By.id("month"));
		Select select2 = new Select(month);
		select2.selectByValue("11");
		
		
		WebElement year = driver.findElement(By.id("year"));
		Select select3 = new Select(year);
		select3.selectByVisibleText("2013");
		
		
		
		
		
		
		
		

	}

}
