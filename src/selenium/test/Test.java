package selenium.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Manimaran\\eclipse-workspace\\Selenium Tutorial\\Driver\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		//String pageSource = driver.getPageSource();
		//System.out.println(pageSource);
     
		
	}

}
