package SeleniumTraining2021.SeleniumTraining2021;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LangClickAll {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.in/");
		
		
			List<WebElement> totalLinks=driver.findElements(By.xpath("//*[@id=\"SIvCob\"]/a"));
			for(int i=0;i<totalLinks.size();i++) {
				
			//totalLinks=driver.findElements(By.xpath("//*[@id=\"SIvCob\"]/a"));
			
			totalLinks.get(i).click();
			totalLinks=driver.findElements(By.xpath("//*[@id=\"SIvCob\"]/a"));
			System.out.println("Lang clicked" +totalLinks.get(i).getText());

	}

}
}
