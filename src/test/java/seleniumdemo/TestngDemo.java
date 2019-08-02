package seleniumdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestngDemo {
	//String expectedresult = "Welcome";
  WebDriver driver ;
  @Test
  public void f() {
   driver.get("http:\\www.google.com");
   driver.findElement(By.name("q")).sendKeys("selenium");
   driver.findElement(By.name("q")).submit();
   System.out.println(driver.getTitle());
   Assert.assertEquals("selenium - Google Search", driver.getTitle());
  
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



