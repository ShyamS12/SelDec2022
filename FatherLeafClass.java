package week5.day2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FatherLeafClass 
{
 public ChromeDriver driver;
 public String filename;
	
 @Parameters({"site", "username", "password"})
	
 @BeforeMethod
 public void beforeMethod(String site, String username, String password) 
 {
  
  WebDriverManager.chromedriver().setup();
  driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.get(site);
  driver.findElement(By.id("username")).sendKeys(username);
  driver.findElement(By.id("password")).sendKeys(password);
  driver.findElement(By.className("decorativeSubmit")).click();
  driver.findElement(By.linkText("CRM/SFA")).click();
  driver.findElement(By.linkText("Leads")).click();
  }
	
   @DataProvider(name="ConsumingData")
   public String[][] getData() throws IOException
   {
    return MyExcel.readExcel(filename); 
   }

   @AfterMethod
   public void afterMethod() 
   {
    driver.close();
   }

}