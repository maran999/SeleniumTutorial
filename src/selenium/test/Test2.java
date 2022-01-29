package selenium.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manimaran\\eclipse-workspace\\Selenium Tutorial\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		 String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.navigate().to("https://annamalaiuniversity.ac.in/index.php");
		driver.manage().window().maximize();
		//driver.close();
		String title = driver.getTitle();
		System.out.println(title);
	}

}
