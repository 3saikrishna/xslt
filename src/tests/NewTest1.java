package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest1 {
	WebDriver driver;
  @Test
  public void f() {
	  driver = new FirefoxDriver();
	  driver.get("https://www.google.co.in/?gfe_rd=cr&ei=Trb9U4zUOsuDuASEh4HYBA&gws_rd=ssl");
	  System.out.println(driver.getTitle());
	  Reporter.log("test sucessful");
	  
  }
}
