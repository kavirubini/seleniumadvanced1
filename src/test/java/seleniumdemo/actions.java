package seleniumdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class actions {
	WebDriver driver ;
  @Test
  public void f() {
	  driver.get("http:\\www.google.com");
	    driver.findElement(By.name("q")).sendKeys("selenium");
	    driver.findElement(By.name("q")).submit();
	    Actions act=new Actions(driver);
	    act.clickAndHold(driver.findElement(By.linkText("Books"))).release().build().perform();
	    System.out.println("ab");
	    //act.clickAndHold(driver.findElement(By.linkText("Gmail"))).release().build().perform();
	    //System.out.println(driver.getTitle());
	    //Assert.assertEquals("selenium - Google Search",driver.getTitle());
	
	  
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
