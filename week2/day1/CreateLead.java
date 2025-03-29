package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();                //launching chrome driver
		driver.get("http://leaftaps.com/opentaps/");           //load the url
		driver.manage().window().maximize();                   // maximize window
		
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Haripriya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Natarajan");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testlead");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Ms");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();					// store it in ref variale
		System.out.println(title);             				// print the title of the page
		driver.close();                                     // close window
	}

}
