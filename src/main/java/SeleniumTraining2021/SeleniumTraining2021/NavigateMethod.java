package SeleniumTraining2021.SeleniumTraining2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateMethod {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
//		driver.navigate().to("https://www.orangehrm.com/");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://classic.crmpro.com/");
		Thread.sleep(5000);
		//Approach 1
//		driver.findElement(By.name("username")).sendKeys("imrankhan.kalim@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("test@123");
//		driver.findElement(By.xpath("//*[@id=\'loginForm\']/div/div/input")).click();		
		//Approach 2
//		WebElement username=driver.findElement(By.name("username"));
//		WebElement password=driver.findElement(By.name("password"));
//		WebElement loginBtn=driver.findElement(By.xpath("//*[@id=\'loginForm\']/div/div/input"));
//		
//		username.sendKeys("imran@gmail.com");
//		password.sendKeys("test@123");
//		loginBtn.click();
		
		//Approach 3
		
		By username=By.name("username");
		By password=By.name("password");
		By loginBtn=By.xpath("//*[@id='loginForm']/div/div/input");
							 
		
	//driver.findElement(username).sendKeys("imran@gmail.com");
//		driver.findElement(password).sendKeys("imran@123");
//		driver.findElement(loginBtn).click();
		driver.findElement(By.linkText("Sign")).click();
		
		doSendKeys(username, "imran@gmail.com");
		doSendKeys(password, "test@123");
		
		
	}
	
	public static WebElement getElement(By locator) {
		
		WebElement element=driver.findElement(locator);
		
		return element;
		
	}
	
	public static void doSendKeys(By locator, String value) {
		
		getElement(locator).sendKeys(value);
		
	}
	
	public static void doclick(By locator) {
		
		getElement(locator).click();
		
	}

}
