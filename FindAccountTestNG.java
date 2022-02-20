package week5.day1;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FindAccountTestNG extends BaseClass
{
 @Test
 public void editAccount()
 {
  driver.findElement(By.linkText("CRM/SFA")).click();
  driver.findElement(By.linkText("Accounts")).click();
  driver.findElement(By.linkText("Find Accounts")).click();
  driver.findElement(By.xpath("//span[text()='Email']")).click();
  driver.findElement(By.name("emailAddress")).sendKeys("maniveljc3@gmail.com");
  driver.findElement(By.xpath("//button[text()='Find Accounts']")).click();
 }
}

