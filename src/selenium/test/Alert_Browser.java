package selenium.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Browser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manimaran\\eclipse-workspace\\Selenium Tutorial\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		//simple pop-up//
		WebElement simple = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		simple.click();
		Thread.sleep(3000);
		Alert simple_Alert = driver.switchTo().alert();
		simple_Alert.accept();
		//Confirm pop-up//
		WebElement confirm = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		confirm.click();
		WebElement confirmbtn = driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box ')]"));
		confirmbtn.click();
		Alert confirmpop = driver.switchTo().alert();
		String text = confirmpop.getText();
		System.out.println(text);
		Thread.sleep(2000);
		confirmpop.accept();
		//Prompt Pop-up//
		WebElement prom = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		prom.click();
		WebElement promselect = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		promselect.click();
		Alert palert = driver.switchTo().alert();
		String text1 = palert.getText();
		System.out.println(text1);
		palert.sendKeys("Manimaran");
		palert.accept();
		
		
		
		
		
		
		
	}

}
