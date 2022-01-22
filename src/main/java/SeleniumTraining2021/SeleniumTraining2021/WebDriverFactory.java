package SeleniumTraining2021.SeleniumTraining2021;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverFactory {
	
	public WebDriver driver;
	
	/**
	 * This method is used to launch the browser
	 * @return driver
	 * @author Imran Khan
	 */
	
	public WebDriver launchBrowser(String browser) {
		
		System.out.println("Browser value is :"+browser);
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();	
			driver=new FirefoxDriver();		
		}
		
		else {
			System.out.println("Pls pass the correct browser name :" + browser);
		}
		
		return driver;
		
	}
	
		public void launchUrl(String url) {
			
			driver.get(url);
		}
		
		public void getPageTitle() {
			
			String title=driver.getTitle();
			
			if(title.contains("Amazon")) {
				
				System.out.println("Correct title");
			}
				else {
					System.out.println("Incorrect title");
				}
				
			}
		
		public void closeBrowser() {
			
			driver.quit();
		}
		

}
