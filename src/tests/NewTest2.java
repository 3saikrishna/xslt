package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest2 {
	WebDriver driver;
  @Test
  public void f() {
	  driver = new FirefoxDriver();
	  driver.get("https://www.facebook.com");
	  System.out.println(driver.getTitle());
	  Reporter.log("hellooooooo");
  }
}
