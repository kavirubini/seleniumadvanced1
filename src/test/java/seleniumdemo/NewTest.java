package seleniumdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NewTest {
	WebDriver driver ;
  @Test
  public void f() throws InterruptedException {
	  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	  Thread.sleep(5000);
	//  WebDriverWait wait= new WebDriverWait(driver,20);
	   System.out.println("abc");
	   driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	   System.out.println("abc");
	   String alertmessage= driver.switchTo().alert().getText();
	   driver.switchTo().alert().accept();
	   System.out.println(alertmessage);
	   /*driver.findElement(By.xpath("//a[@href='login.htm']")).click();
	   System.out.println("abc");
	   
	   driver.findElement(By.id("userName")).sendKeys("Admin");
	   System.out.println("abc");
	   driver.findElement(By.id("password")).sendKeys("Password456");
	   System.out.println("abc");
	   driver.findElement(By.name("Login")).click();
	   Assert.assertEquals(driver.getTitle(),"admin Home");*/
	   
	   
	   
	   
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
