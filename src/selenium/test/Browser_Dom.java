package selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Dom {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manimaran\\eclipse-workspace\\Selenium Tutorial\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		/*String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.navigate().to("https://web.whatsapp.com/");*/
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("manivenom@gmail.com ");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("robinleo");
		//WebElement login = driver.findElement(By.id("u_0_j_AF"));==>doubt
		//login.click();
		WebElement login = driver.findElement(By.name("login"));
		login.click();

	}

}
