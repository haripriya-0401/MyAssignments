package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.telerik.com/contact");
		
		WebElement dd = driver.findElement(By.id("Dropdown-1"));
		Select option1=new Select(dd);
		option1.selectByVisibleText("General Inquiries");
		
		WebElement ddone = driver.findElement(By.id("Dropdown-2"));
		Select option2=new Select(ddone);
		option2.selectByIndex(10);
		
		WebElement ddtwo = driver.findElement(By.id("Country-1"));
		Select option3=new Select(ddtwo);
		option3.selectByValue("Canada");
		
		WebElement ddthree = driver.findElement(By.name("DynamicListFieldController"));
		Select option4=new Select(ddthree);
		option4.selectByVisibleText("Albania");
	}

}
