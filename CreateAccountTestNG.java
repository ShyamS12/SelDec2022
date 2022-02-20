package week5.day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateAccountTestNG extends BaseClass
{
 @Test
 public void newAccount()
 {
  driver.findElement(By.linkText("CRM/SFA")).click();
  driver.findElement(By.linkText("Create Account")).click();
  driver.findElement(By.id("accountName")).sendKeys("Manivel R");
  driver.findElement(By.id("annualRevenue")).sendKeys("10000000");
  driver.findElement(By.id("primaryEmail")).sendKeys("maniveljc3@gmail.com");
  driver.findElement(By.className("smallSubmit")).click();
  
 }
}

