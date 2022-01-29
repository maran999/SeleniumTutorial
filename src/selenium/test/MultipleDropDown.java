package selenium.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manimaran\\eclipse-workspace\\Selenium Tutorial\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
         driver.manage().window().maximize();
         
         
         //Single Select
         System.out.println("=========Single Select==========");
         WebElement singleSelect = driver.findElement(By.id("select-demo"));
         Select select = new Select(singleSelect);
         
          select.selectByValue("Monday");
          WebElement selectedOption = select.getFirstSelectedOption();
          System.out.println(selectedOption.getText());
          
          //Multiple Select
          System.out.println("=========Multiple Select==========");
          WebElement multipleSelect = driver.findElement(By.id("multi-select"));
          
          Select select2 = new Select(multipleSelect);
          
          boolean multiple = select2.isMultiple();
          System.out.println("Multiple :"+multiple);
          
          select2.selectByIndex(0);
          select2.selectByValue("New Jersey");
          select2.selectByVisibleText("Washington");
          
          System.out.println("=========Selected Option==========");
          List<WebElement> allSelectedOptions = select2.getAllSelectedOptions();
          for (WebElement options : allSelectedOptions) {
			System.out.println(options.getText());
		}
          
          
          System.out.println("=========Entire Option==========");
          List<WebElement> list = select2.getOptions();
          
          for (WebElement data : list) {
        	  System.out.println(data.getText());
			
		}
          
          
          
         
	}

}
