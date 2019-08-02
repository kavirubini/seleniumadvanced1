package seleniumdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class Test3 {
	WebDriver driver ;
  @Test
  public void f() {
	  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	  WebElement aboutus= driver.findElement(By.xpath("//*[@id='menu3']/li[3]/a"));
	  WebElement ouroffc= driver.findElement(By.xpath("//*[@id='menu3']/li[3]/ul/li/a/span"));
	  WebElement Chennai= driver.findElement(By.xpath("//*[@id='menu3']/li[3]/ul/li/ul/li[1]/a/span"));
	  
	  Actions act= new Actions(driver);
	  act.moveToElement(aboutus).click().build().perform();
	  
	  WebDriverWait wait = new WebDriverWait(driver,50);
	  wait.until(ExpectedConditions.elementToBeClickable(ouroffc));
	  
	  act.moveToElement(ouroffc).click().build().perform();
	  WebDriverWait wait1 = new WebDriverWait(driver,50);
	  wait1.until(ExpectedConditions.elementToBeClickable(Chennai));
	  act.moveToElement(Chennai).click().build().perform();
	  String parentwindowid= driver.getWindowHandle();
	  Set<String> set= driver.getWindowHandles();
	  System.out.println(driver.getWindowHandles());
	  
	  for(String s:set)
	  {
		  driver.switchTo().window(s);
		  System.out.println("abc");
		  System.out.println(driver.getTitle());
		  System.out.println("abc");
	  }
	  driver.switchTo().frame(driver.findElement(By.name("main_page")));
	  String address=driver.findElement(By.tagName("address")).getText();
	  System.out.println("address");
	  driver.switchTo().window("parentwindowid");}
	  
	  
	 
	  
	  
	  
  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium 3.0\\chromedriver_win32\\chromedriver.exe");

	   driver= new ChromeDriver();
	  
  }

  @AfterClass
  public void afterClass() {
  }

}
