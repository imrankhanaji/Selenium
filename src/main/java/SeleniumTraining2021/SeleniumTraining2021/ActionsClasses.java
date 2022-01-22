package SeleniumTraining2021.SeleniumTraining2021;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClasses {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.syf.com");
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		By button=By.xpath("//button[@class='sc-hiSbYr kYVtPs sc-fbNXWD iFMyOV sc-mlOqW haiQsn']");
		//WebDriverWait wait= new WebDriverWait(driver, 5);
		//wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		waitForElementPresent(driver, 5, button);
		
		//Actions ac=new Actions(driver);
		
		//ac.contextClick();
		//ac.contextClick(driver.findElement(By.xpath("//h1")));
		//driver.navigate().refresh();
		WebElement element=driver.findElement(By.xpath("//button[@class='sc-hiSbYr kYVtPs sc-fbNXWD iFMyOV sc-mlOqW haiQsn']"));
		boolean br=element.isDisplayed();
		String str=element.getText();
		System.out.println(str);
		if(str.equals("CHAT FOR HELP")) {
			System.out.println(br);
		}
			else {
				System.out.println(br);
			}
			
		
		Thread.sleep(5000);
		element.click();
		//destination_publishing_iframe_syf_0_name
		Thread.sleep(5000);
		//driver.switchTo().frame("id=destination_publishing_iframe_syf_0");
		driver.switchTo().parentFrame();
		
		WebElement CTA=driver.findElement(By.xpath("(//span[text()])[3]"));
		String text=CTA.getText();
		System.out.println(text);
		if(text.contains("Hi, I'm Sydney")) {
			System.out.println("pass");
		}
		driver.findElement(By.xpath("//input[@class='alme--window--footer--inputbox__textarea']")).sendKeys("Account locked");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='alme--window--footer--inputbox__submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='alme--window--header--toolbar--close']")).click();
		 element=driver.findElement(By.xpath("//button[@class='sc-hiSbYr kYVtPs sc-fbNXWD iFMyOV sc-mlOqW haiQsn']"));
		Thread.sleep(5000);
		element.click();
		driver.findElement(By.xpath("//button[@class='alme--window--header--toolbar--close']")).click();
		
	}
	public static void waitForElementPresent(WebDriver driver, int timeout, By locator) {
	WebDriverWait wait= new WebDriverWait(driver, timeout);
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	
	}

}
