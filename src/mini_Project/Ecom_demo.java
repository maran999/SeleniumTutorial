package mini_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecom_demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manimaran\\eclipse-workspace\\Selenium Tutorial\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//SignIn
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();
		
		Thread.sleep(3000);
		//Create an account
		WebElement email = driver.findElement(By.xpath("//input[@class='is_required validate account_input form-control'][1]"));
		email.sendKeys("manimaran@gmail.com");
		
		//Button->Create an account
		WebElement button = driver.findElement(By.xpath("//button[@class='btn btn-default button button-medium exclusive']"));
		button.click();
		
		//Radio Button
		Thread.sleep(3000);
		WebElement radio = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		radio.click();
		
		//Personal Info
		WebElement firstname = driver.findElement(By.xpath("//input[@name='customer_firstname']"));
		firstname.sendKeys("Manimaran");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@name='customer_lastname']"));
		lastname.sendKeys("G");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='passwd']"));
		password.sendKeys("password");
		
		WebElement radio2 = driver.findElement(By.xpath("//label[text()='Sign up for our newsletter!']"));
		radio2.click();
		
		//Your Address
	    //driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Manimaran");
	   // driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("G");
	    
	    WebElement company = driver.findElement(By.xpath("//input[@name='company']"));
	    company.sendKeys("BeeworkConsultancyServices");
	    
	    WebElement address1 = driver.findElement(By.xpath("//input[@name='address1']"));
	    address1.sendKeys("No.32 Thiruvalluvar St");
	    
	    WebElement address2 = driver.findElement(By.xpath("//input[@name='address2']"));
	    address2.sendKeys("Jones Road, Saidapet");
	    
	    WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
	    city.sendKeys("Chennai");
	    
	   // WebElement state = driver.findElement(By.xpath("//select[@class='form-control']"));
	    WebElement name = driver.findElement(By.xpath("//option [text()='Alabama']"));
//	    state.sendKeys("mississippi");
//	    state.click();
	    name.click();
	    
	    //Postal Code
	    WebElement pin = driver.findElement(By.xpath("//input[@name='postcode']"));
	    pin.sendKeys("00000");
	    
	    //Text area
	    WebElement mess = driver.findElement(By.xpath("//textarea[@class='form-control']"));
	    mess.sendKeys("This website is tested by automation software");
	    
	    //Home Phone
//	    Thread.sleep(3000);
//	    WebElement landline = driver.findElement(By.xpath("(//input[@name='phone']"));
//	    landline.sendKeys("044-24719877");
	    
	    //Mobile 
	    Thread.sleep(3000);
	    WebElement mobile = driver.findElement(By.xpath("//input[@name='phone_mobile']"));
	    mobile.sendKeys("9866755435");
	    
	    //Address
	    Thread.sleep(3000);
	    WebElement address = driver.findElement(By.xpath("//input[@value='My address']"));
	    address.sendKeys("chennai");
	    
	    //Register
	    Thread.sleep(3000);
	    WebElement register = driver.findElement(By.xpath("//button[@name='submitAccount']"));
	    register.click();
	    
	    //Sign out
	    WebElement signout = driver.findElement(By.xpath("//a[@title='Log me out']"));
	    signout.click();
//	    
	    //====>Already Registered<======//
	    WebElement emailAdd = driver.findElement(By.xpath("(//input[@class='is_required validate account_input form-control'])[2]"));
	    emailAdd.sendKeys("manimaran@gmail.com");
	    
	    WebElement pass = driver.findElement(By.xpath("//input[@name='passwd']"));
	    pass.sendKeys("password");
	    
	    WebElement submit = driver.findElement(By.xpath("//button[@name='SubmitLogin']"));
	    submit.click();
	    
	    
	    
		
	}

}
