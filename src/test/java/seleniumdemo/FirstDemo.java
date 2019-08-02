package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium 3.0\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("seleniumhq.org");
		driver.findElement(By.name("q")).submit();
	}}