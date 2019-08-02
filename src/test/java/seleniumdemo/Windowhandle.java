package seleniumdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.sql.Driver;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Windowhandle {
	WebDriver driver ;
  @Test
  public void f() {
	  driver.get("https://about.google.com");
	  System.out.println(driver.getTitle());
	  driver.findElement(By.linkText("Privacy")).click();
	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  Set<String> set= driver.getWindowHandles();
	  for(String s:set)
	  {
		  driver.switchTo().window(s);
		  System.out.println(driver.getTitle());
	  }
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium 3.0\\chromedriver_win32\\chromedriver.exe");

	   driver= new ChromeDriver();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
