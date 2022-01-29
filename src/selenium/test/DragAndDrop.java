package selenium.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manimaran\\eclipse-workspace\\Selenium Tutorial\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
//		 driver.get("http://demo.guru99.com/test/drag_drop.html");
//				
		 Actions action = new Actions(driver);
		 //bank
//		 WebElement five_K = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
//		 WebElement debitSide = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
//		 
//		 action.dragAndDrop(five_K, debitSide).perform();
//		 
//		 WebElement debitOutput = driver.findElement(By.xpath("//div[@id='t7']"));
//		 System.out.println("Amount Debit :"+debitOutput.getText());
//		 
//		 WebElement creditSide = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
//		 action.dragAndDrop(five_K, creditSide).perform();
		 
		 //Amazon
//		 driver.get("https://www.amazon.in/");
//		 WebElement categories = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
//		 Select select = new Select(categories);
//		 select.selectByValue("search-alias=stripbooks");
//		 
//		 WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
//		 search.sendKeys("malgudi days");
//		  WebElement btn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
//		  btn.click();
        
		  //filpkart
		  
		  driver.get("https://www.flipkart.com/");
		  //WebElement appliances = driver.findElement(By.xpath("(//div[@class='xtXmba'])[7]"));
		 // action.moveToElement(appliances).build().perform();
		  WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		  close.click();
		  
		  WebElement element = driver.findElement(By.xpath("//div[text()='Appliances']"));
		  //Actions action = new Actions(driver);
		  action.moveToElement(element).perform();
	}

}
