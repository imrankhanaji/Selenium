package SeleniumTraining2021.SeleniumTraining2021;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDown {

	public static void main(String[] args) {
		
			
			WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
	
	//By country=
	
	Select select=new Select(driver.findElement(By.id("Form_submitForm_Country")));
	
	List<WebElement> countryoptions=select.getOptions();
	System.out.println(countryoptions.size());
	//countryoptions.get(5).click();
	String str=countryoptions.get(4).getText();
	System.out.println(str);
	
	
	
	

	}

}
