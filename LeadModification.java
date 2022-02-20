package week5.day2;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LeadModification extends FatherLeafClass
{
 @BeforeClass
 public void sheetName()
 {
  filename = "LeadModification";
 }
	
 @Test(dataProvider = "ConsumingData")
 public void editLead(String company, String name) throws InterruptedException 
 {
     driver.findElement(By.linkText("Find Leads")).click();
   driver.findElement(By.xpath("(//div[@class='x-form-element']/input[@name='firstName'])[3]")).sendKeys(name);
   driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
   Thread.sleep(2000);
   driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a[@class='linktext']")).click();
   
   driver.findElement(By.linkText("Edit")).click();
   driver.findElement(By.id("updateLeadForm_companyName")).clear();
   driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(company);
   driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
   String newCompany = driver.findElement(By.id("viewLead_companyName_sp")).getText();
   
   if(newCompany.contains(company)) 
   {
    System.out.println("Joined in new company");
   }
   else 
   {
    System.out.println("Not relieved from current company");
   }
 }
	
}
