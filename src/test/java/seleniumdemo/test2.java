package seleniumdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class test2 {
	WebDriver driver ;
  @Test
  public void f() {
	  driver.get("http://jqueryui.com/resources/demos/resizable/default.html");
	  WebElement resize = driver.findElement(By.xpath(".//*[@id='resizable']/div[3]"));
	  Actions action=new Actions(driver);
	  action.dragAndDropBy(resize, 400, 200).build().perform();
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium 3.0\\chromedriver_win32\\chromedriver.exe");

	   driver= new ChromeDriver();
  }

  @AfterClass
  public void afterClass() {
	  //driver.close();
  }

}
