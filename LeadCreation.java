package week5.day2;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LeadCreation extends FatherLeafClass
{
	
 @BeforeClass
 public void sheetName()
 {
  filename = "LeadCreation";
 }
	
 @Test(dataProvider = "ConsumingData")
 public void createLead(String company, String fName, String lName ) throws InterruptedException 
 {
  driver.findElement(By.linkText("Create Lead")).click();
  driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
  driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);  
  driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
  driver.findElement(By.name("submitButton")).click();
 }
}

