package SeleniumTraining2021.SeleniumTraining2021;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LangClick {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.in/");
		langClick(driver, "தமிழ்");
	
	}
	
	public static void langClick(WebDriver driver,String language) {
		
		
		List<WebElement> totalLinks=driver.findElements(By.xpath("//*[@id=\"SIvCob\"]/a"));
		
		System.out.println("total links is:" + totalLinks.size());
		
		for(int i=0;i<totalLinks.size();i++) {
			
			String langName=totalLinks.get(i).getText();
			
			System.out.println(langName);
			totalLinks.get(i).click();
			
//			if(langName.equals(language)) {
//				
//				totalLinks.get(i).click();
//				break;
//				
//			}
			
		}
		
		

	}
		
	}

