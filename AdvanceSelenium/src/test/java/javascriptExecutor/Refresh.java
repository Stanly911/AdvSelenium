package javascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Refresh {
	@Test
		public void demo() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://amazone.com");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			//getTitle
			Object title = js.executeScript("return document.title");
			System.out.println(title);
			
			//getURL
			Object URL = js.executeScript("return document.URL");
			System.out.println(URL);
			
			//refresh
			js.executeScript("history.go(0)");
						
	}

}
