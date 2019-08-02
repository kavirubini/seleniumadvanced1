package seleniumdemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTestSelenium {

  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Abc");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Abd");
  }
  @Test(priority=1)
  public void f() {
	  System.out.println("flight");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("flight booked");
  }
  @Test(enabled=false)
  public void fute() {
	  System.out.println("flight2");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Abd2");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Ab2d");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("mnd");
  }

}
