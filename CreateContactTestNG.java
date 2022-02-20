package week5.day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateContactTestNG extends BaseClass
{
 @Test
 public void createContact()
 {
  driver.findElement(By.linkText("CRM/SFA")).click();
  driver.findElement(By.linkText("Contacts")).click();
  driver.findElement(By.linkText("Create Contact")).click();
  driver.findElement(By.id("firstNameField")).sendKeys("Manivel");
  driver.findElement(By.id("lastNameField")).sendKeys("Ramar");
  driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("maniveljc3@gmail.com");
  driver.findElement(By.className("smallSubmit")).click();
 }
}

