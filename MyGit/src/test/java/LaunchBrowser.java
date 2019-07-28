

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;


public class LaunchBrowser {
	public static WebDriver driver;

	//String path;
	public void launchbrowser(String path)
	{
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Jyothi Venkat\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	driver=new ChromeDriver();
	driver.get(path);
	//driver.wait(2000);
	}
	
	
	//String path= "https://www.google.com"
	//launchbrowser(path);
	
	
	
	
}