package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("912");
		driver.findElement(By.xpath("//button[text() ='Find Leads']")).click();
		Thread.sleep(3000);
		
		// Capture leadId of first resulting lead
		WebElement Lead1 = driver.findElement(By.xpath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first '])[1]/div[1]/child::a[1]"));
		String text = Lead1.getText();
		System.out.println("First lead id : "+text);
		
		Lead1.click();
		
		driver.findElement(By.xpath("((//div[@class='frameSectionExtra']))/a[4]")).click();
		driver.findElement(By.partialLinkText("Find")).click();
		
		driver.findElement(By.xpath("//input[@id='ext-gen246']")).sendKeys(text);
		driver.findElement(By.xpath("//button[text() ='Find Leads']")).click();
		Thread.sleep(3000);
		WebElement Message = driver.findElement(By.className("x-paging-info"));
		String text1 = Message.getText();
		System.out.println("Successfuly deleted : " +text1);
		driver.quit();
		
	}

}
