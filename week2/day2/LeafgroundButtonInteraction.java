package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButtonInteraction {

	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String title = driver.getTitle();
		
		System.out.println("Page is verified : "+title);
		
		driver.navigate().back();
		Thread.sleep(3000);
		WebElement db = driver.findElement(By.xpath("//span[text()='Disabled']"));
		if(db.isEnabled()==false) {
			System.out.println("Disabled");
		}
		else {
			System.out.println("Enabled");
		}
		driver.quit();
        
	}
}