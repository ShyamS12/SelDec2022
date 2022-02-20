package week5.day1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testNGAttributes {
	
 @Test(priority = 0)
 public void tvBrand()
 {
  System.out.println("OnePlus Ultra HD TV");
 }
	
 // this value will not print
 @Test(priority = 1, enabled = false)
 public void tvValue()
 {
  System.out.println("Price of this TV : 55000.00 INR");
 }
	
	
 @Test(priority = 2)
 public void seller()
 {
  System.out.println("Official OnePlus Tv seller is Oppo India Private Limited");
  
  // Failing test explicitly
  Assert.fail();
 }
	
 // alwaysRun attribute will override dependsOnMethods if dependent method is failed or skipped
	
 @Test(priority = 3, dependsOnMethods = "seller", alwaysRun=true)
 public void noOfUsers()
 {
  System.out.println("91500 users are using OnePlus Ultra HD TV");
 }

 //invocationCount - Opens browser window two times and threadPoolSize helps to open them parallel
 @Test(priority = 4, invocationCount = 2, threadPoolSize = 2)
 public void testNGSite()
 {
  WebDriverManager.chromedriver().setup();
  ChromeDriver driver = new ChromeDriver();
  driver.get("https://testng.org/doc/documentation-main.html");
  System.out.println(driver.getTitle());
  driver.close();
 }
}

