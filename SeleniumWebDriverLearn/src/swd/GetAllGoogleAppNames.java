package swd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetAllGoogleAppNames 
{
  @Test
  public void navigateThroughTabsAndGetTitle() throws InterruptedException 
  {
	    System.out.println("Test Start");
		
		System.setProperty("webdriver.chrome.driver", "D:\\SWD\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@class='gb_0e']")).click();
				
		Thread.sleep(5000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@role='presentation']")));
		Thread.sleep(5000);
		// Locating all app names. XPath is tricky as we can not use their values as they are dynamic
				List<WebElement> allMenus = driver.findElements(By.xpath("//div[@jsname and @jsaction]//li/a/span"));
				
				// Printing all app names Without stream
				for(WebElement menu : allMenus)
				{
					System.out.println(menu.getText());
				}
				
				System.out.println("===========Tushar=========================================");
				// With stream apis
				allMenus.stream().map(WebElement::getText).forEach(System.out::println);
				
				//quitting driver
				driver.quit();
		
		System.out.println("Test End");
  }
}
