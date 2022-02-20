package week5.day2;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LeadsMerge extends FatherLeafClass
{
 @BeforeClass
 public void sheetName()
 {
  filename = "LeadsMerge";
 }
	
 @Test(dataProvider = "ConsumingData")
 public void mergeLead(String primeLead, String secondLead) throws InterruptedException 
 {
    
   driver.findElement(By.xpath("//a[text()='Merge Leads']")).click();  
   driver.findElement(By.xpath("//input[@id='partyIdFrom']/following::a[1]")).click(); 
   
   Set<String> processWindow1 = driver.getWindowHandles();
   List<String> primeWindow = new ArrayList<String>(processWindow1);
   
   driver.switchTo().window(primeWindow.get(1));
   
   driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(primeLead);
   driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
   Thread.sleep(2000);
   
   driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
   
   driver.switchTo().window(primeWindow.get(0));
   
   driver.findElement(By.xpath("//input[@id='partyIdFrom']/following::a[2]")).click();
   
   Set<String> processWindow2 = driver.getWindowHandles();
   List<String> secondWindow = new ArrayList<String>(processWindow2);
   
   driver.switchTo().window(secondWindow.get(1));
   
   driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(secondLead);
   driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
   Thread.sleep(2000);
   driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
   
   driver.switchTo().window(secondWindow.get(0));
   
   
   driver.findElement(By.linkText("Merge")).click();
   
   driver.switchTo().alert().accept();
   
   String title = driver.getTitle();
   
   if(title.contains("View Contact")) 
   {
    System.out.println("We Merged the given leads and verified it.");
   }
   
   else 
   {
    System.out.println("Mission failed");
   }
 }
}
