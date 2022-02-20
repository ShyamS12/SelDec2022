package week5.day2;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LeadDeletion extends FatherLeafClass
{
	@BeforeClass
	public void sheetName()
	{
		filename = "LeadDeletion";
	}
	
	@Test(dataProvider = "ConsumingData")
	public void deleteLead(String name) throws InterruptedException 
	{
			driver.findElement(By.linkText("Find Leads")).click();
			driver.findElement(By.xpath("(//div[@class='x-form-element']/input[@name='firstName'])[3]"
					)).sendKeys(name);
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			Thread.sleep(3000);
			
			String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			driver.findElement(By.linkText("Delete")).click();
			driver.findElement(By.linkText("Find Leads")).click();
			driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			
			String result = driver.findElement(By.className("x-paging-info")).getText();
			
			if (result.contains("No records to display")) 
			{
				System.out.println("You deleted the Lead");
			} 
			
			else 
			{
				System.out.println("Lead Deletion process failed");
			}
	}
}
	
