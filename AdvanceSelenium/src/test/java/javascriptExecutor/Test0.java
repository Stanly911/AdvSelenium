package javascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test0 
{
	public void demo() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazone.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//TypeCasting
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,5000)");

		Thread.sleep(3000);

		js.executeScript("window.scrollBy(0,-5000)");

	}
}
