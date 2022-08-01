package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomWait 
{
	@Test
	public void demo() 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
		
		//custom wait
		while(true) {
			try {
				driver.findElement(By.id("nav-search-submit-button")).click();
				break;
			}
			catch(Exception e) {
				System.out.println("Element not Found");
			}
		}
		driver.close();
	}
}
