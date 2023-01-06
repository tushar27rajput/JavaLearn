package swd;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartBrowserTest 
{

	public static void main(String[] args) 
	{
		System.out.println("Test Start");
		
		System.setProperty("webdriver.chrome.driver", "D:\\SWD\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		WebElement m= driver.findElement(By.xpath("//*[@name='q']"));
		
		m.sendKeys("Selenium");
		m.sendKeys(Keys.ENTER);
		
		driver.close();
		
		System.out.println("Test End");
	}

}
