package week5.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteIncidentTestNG 
{
	
  @Test
  public void deleteIncident() throws InterruptedException
  {
  WebDriverManager.chromedriver().setup();
  ChromeDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://dev115675.service-now.com/navpage.do");
  driver.switchTo().frame("gsft_main");
  driver.findElement(By.id("user_name")).sendKeys("admin");
  driver.findElement(By.id("user_password")).sendKeys("Cyclone@121212");
  driver.findElement(By.id("sysverb_login")).click();

  driver.findElement(By.id("filter")).sendKeys("Incident", Keys.ENTER);
  Thread.sleep(3000);
  
  driver.findElement(By.xpath("//a[@id='b55b4ab0c0a80009007a9c0f03fb4da9']//div[text()='All']")).click();
  
  driver.switchTo().frame("gsft_main");
  
  driver.findElement(By.xpath("//span[contains(text(),'search')]/following-sibling::input"))
  .sendKeys("INC0010048",Keys.ENTER);
  }	
}
