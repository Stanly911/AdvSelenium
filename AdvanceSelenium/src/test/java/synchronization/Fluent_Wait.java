package synchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fluent_Wait 
{
	@SuppressWarnings("deprecation")
	@Test
	public void demo() 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		//Selenium Version 3
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Selenium Version 4
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
		FluentWait w = new FluentWait(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(2,TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.close();
	}
}
