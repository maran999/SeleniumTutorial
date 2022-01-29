package selenium.test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manimaran\\eclipse-workspace\\Selenium Tutorial\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		System.out.println("============Compelete tr data==============");
		List<WebElement> comData = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr//td"));
		for (WebElement data : comData) {
			System.out.println(data.getText());
		}
        System.out.println("==========Particular tr data============");
        List<WebElement> partiData = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr[5]//td[1]"));
        for (WebElement data2 : partiData) {
			System.out.println(data2.getText());
		}
//        TakesScreenshot sc = (TakesScreenshot) driver;
//        File src = sc.getScreenshotAs(OutputType.FILE);
//         File dest = new File("C:\\Users\\Manimaran\\eclipse-workspace\\Selenium Tutorial\\Screenshot\\w3s.png");
//         FileUtils.copyFile(src, dest);
        driver.close();
        
	}

}
