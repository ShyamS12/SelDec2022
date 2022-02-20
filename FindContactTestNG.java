package week5.day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FindContactTestNG extends BaseClass
{
 @Test
 public void findContact()
 {
  driver.findElement(By.linkText("CRM/SFA")).click();
  driver.findElement(By.linkText("Contacts")).click();
  driver.findElement(By.linkText("Find Contacts")).click();
  driver.findElement(By.linkText("Email")).click();
  driver.findElement(By.name("emailAddress")).sendKeys("maniveljc3@gmail.com");
  driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
  System.out.println("Program executed successfully");
 }
}