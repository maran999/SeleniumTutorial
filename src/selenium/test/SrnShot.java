package selenium.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SrnShot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manimaran\\eclipse-workspace\\Selenium Tutorial\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://twitter.com/login");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("(//input[@name='session[username_or_email]'])[1]"));
		username.sendKeys("beeworkconsultancyservices@gmail.com");
		WebElement password = driver.findElement(By.xpath("(//input[@name='session[password]'])[1]"));
		password.sendKeys("karthimani");
		//WebElement login = driver.findElement(By.xpath("(//div[contains(@class,'css-901oao r-1awozwy')])[3]"));
		//login.click();
		
		//screenshot//
		TakesScreenshot sc = (TakesScreenshot) driver;
		
		File scrfile = sc.getScreenshotAs(OutputType.FILE);
		File desfile = new File("C:\\Users\\Manimaran\\eclipse-workspace\\Selenium Tutorial\\Screenshot\\img.png");
		FileUtils.copyFile(scrfile, desfile);
		
		
		
		
		
		
		
	}

}
