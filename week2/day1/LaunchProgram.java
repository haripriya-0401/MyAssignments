package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchProgram {

		public static void main(String[] args) throws InterruptedException {
			
			//step 1 - open the browser
			//cntrl+shift+o - import stmt
			ChromeDriver driver=new ChromeDriver();
			
			//step2 - maximize browser
			driver.manage().window().maximize();
			
			//step3 - load the url -> get() to pass the url
			driver.get("https://www.facebook.com");
			
			System.out.println(driver.getTitle());
			
			//java wait - Thread.sleep();
			Thread.sleep(4000);
			
			
			//step4 - after completing the steps close the browser
			driver.close();
			}
	}

