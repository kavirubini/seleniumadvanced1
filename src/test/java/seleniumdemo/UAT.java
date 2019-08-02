package seleniumdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class UAT {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("http://demoaut.com/");
	  driver.manage().window().maximize();
	  WebDriverWait wait=new WebDriverWait(driver,20);
	  WebDriverWait wait1=new WebDriverWait(driver,20);
	  driver.findElement(By.name("userName")).sendKeys("tutorial");
	  wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name("password")));
	  driver.findElement(By.name("password")).sendKeys("tutorial");
	  driver.findElement(By.name("login")).click();
	  wait1.until(ExpectedConditions.titleIs("Find a flight:Mercury tours:"));
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  Select s= new Select(driver.findElement(By.name("passCount")));
	  s.selectByVisibleText("3");
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\Selenium 3.0\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		 driver= new FirefoxDriver();
  }

 /* @AfterClass
  public void afterClass() {
  }*/

}
