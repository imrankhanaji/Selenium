package SeleniumTraining2021.SeleniumTraining2021;

public class Test {

	static String browser="Chrome";
	
	public static void main(String[] args) {
		
		
		WebDriverFactory wf=new WebDriverFactory();
		wf.launchBrowser(browser);
		wf.launchUrl("http://amazon.com");
		wf.getPageTitle();
		wf.closeBrowser();

	}

}
