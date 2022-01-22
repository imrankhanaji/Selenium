package SeleniumTraining2021.SeleniumTraining2021;





import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagNameConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		//Get the total number of links and get thetext without empty text
		
		//for(WebElement s:totalLinks) {
//			
//			System.out.println(s.getText());
//			
//		}
		
		List<WebElement> totalLinks=driver.findElements(By.tagName("a"));
		System.out.println("total links is:" + totalLinks.size());
		
		for(int i=0;i<totalLinks.size();i++) {
			String text=totalLinks.get(i).getText();
				if(!text.isEmpty()) {
					System.out.println(text);
				
			}
			
			
			
		}
		
		
		

	}

}
