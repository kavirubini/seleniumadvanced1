package libraryFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserfactory {
	static WebDriver driver;
	public static WebDriver startBrowser ( String browsername,String url){
		if(browsername.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium 3.0\\chromedriver_win32\\chromedriver.exe");

			   driver= new ChromeDriver();}
		else if(browsername.equals("firefox")){
			System.setProperty("webdriver.gecko.driver","C:\\Selenium 3.0\\geckodriver-v0.24.0-win64\\geckodriver.exe");

			   driver= new FirefoxDriver();}
			
		
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
		
	}}
	
	


