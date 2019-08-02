package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import Pages.login;
import Pages.loginusingPageFactory;
import libraryFunctions.Browserfactory;

public class Test1 {
	WebDriver driver;
	
@Test
public void test(){
	/*WebDriver driver=Browserfactory.startBrowser("firefox","http://demoaut.com");
	login log=new login(driver);
	log.loginuser("tutorial", "tutorial");*/
	WebDriver driver=Browserfactory.startBrowser("firefox","http://demoaut.com/");
	loginusingPageFactory log=PageFactory.initElements(driver, loginusingPageFactory.class);
	log.login("tutorial","tutorial");
}

}
