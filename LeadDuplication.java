package week5.day2;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LeadDuplication extends FatherLeafClass
{
 @BeforeClass
 public void sheetName()
 {
  filename = "LeadDuplication";
 }
	
 @Test(dataProvider = "ConsumingData")
 public void duplicateLead(String name) throws InterruptedException
 {
  driver.findElement(By.linkText("Find Leads")).click();
  driver.findElement(By.xpath("(//div[@class='x-form-element']/input[@name='firstName'])[3]")).sendKeys(name);
  driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
  Thread.sleep(3000);

  driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a[@class='linktext']")).click();
  driver.findElement(By.linkText("Duplicate Lead")).click();
  
  String title = driver.getTitle();
  if(title.contains("Duplicate Lead")) 
  {
   System.out.println("Going to duplicate the current lead");
  }
  
  else 
  {
   System.out.println("This is not the correct page we're looking for. Let's try again");
  }
  
  driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
  
  String newName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
  
  if(name.contains(newName)) 
  {
   System.out.println("We succeed in duplication");
  }
  
  else 
  {
   System.out.println("We failed the mission:( , Retry");
  }
  }
}
