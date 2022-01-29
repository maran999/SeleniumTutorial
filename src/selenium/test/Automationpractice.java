package selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationpractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manimaran\\eclipse-workspace\\Selenium Tutorial\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		//SignIn
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();
		
		//Create an account
		WebElement email = driver.findElement(By.xpath("(//input[@class='is_required validate account_input form-control'])[1]"));
		email.sendKeys("robin@gmail.com");
		
		//Button->Create an account
		WebElement button = driver.findElement(By.xpath("//button[@class='btn btn-default button button-medium exclusive']"));
		button.click();
		
		
		
          Thread.sleep(3000);

		WebElement rad = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		rad.click();
		
		
       
	}

}
