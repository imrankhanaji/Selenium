package SeleniumTraining2021.SeleniumTraining2021;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcalss {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://amazon.syf.com/login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		
		WebElement text=driver.findElement(By.xpath("//*[contains(text(),'Access')]"));
		String str=text.getText();
		System.out.println(str);
		if(str.equals("Access")) {
			System.out.println("pass");
			
		}
		else {
			System.out.println("fail");
		}
		System.out.println(text);
		WebElement amazonLink=driver.findElement(By.xpath("(//a[contains(text(),amazon.com)])[8]"));
		amazonLink.click();
		//dropdown values= //select[@id='searchDropdownBox']
		
		//String parentWindow=driver.getWindowHandle();
		Set<String> handles=driver.getWindowHandles(); 
		System.out.println(handles);
		
		List<String> ls=new ArrayList<String>(handles);
		String parentWindow=ls.get(0);
		String chldwndow=ls.get(1);
		driver.switchTo().window(chldwndow);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parentWindow);
		System.out.println("return back to parent window");
		
		System.out.println(driver.getTitle());
		
		
		}

}
