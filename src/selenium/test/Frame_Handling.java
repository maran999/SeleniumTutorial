package selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Handling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manimaran\\eclipse-workspace\\Selenium Tutorial\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("SingleFrame");
		//single Iframe//
		WebElement text = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
               text.sendKeys("this is single frame");
               //back to browser from frame//
	         driver.switchTo().defaultContent();
	      //click the second option//
	         driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
	     //Nested iframe//
	       
	       WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	       driver.switchTo().frame(frame1);
	       
	       
	       WebElement frame2 = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
	         driver.switchTo().frame(frame2);
	         
	         WebElement text2 = driver.findElement(By.xpath("//input[@type='text']"));
	         text2.sendKeys("Nested frame is completed");
	        
	         
	}

}
