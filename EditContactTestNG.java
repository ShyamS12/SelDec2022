package week5.day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EditContactTestNG extends BaseClass
{
 @Test
 public void editContact() throws InterruptedException
 {
  driver.findElement(By.linkText("CRM/SFA")).click();
  driver.findElement(By.linkText("Contacts")).click();
  driver.findElement(By.linkText("Find Contacts")).click();
  driver.findElement(By.linkText("Email")).click();
  driver.findElement(By.name("emailAddress")).sendKeys("maniveljc3@gmail.com");
  driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
  Thread.sleep(2000);
  driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a[1]")).click();
  
  driver.findElement(By.xpath("//a[text()='Edit']")).click();
  
  driver.findElement(By.id("updateContactForm_description")).sendKeys("The contact updated");
  driver.findElement(By.name("submitButton")).click();
 }
}

