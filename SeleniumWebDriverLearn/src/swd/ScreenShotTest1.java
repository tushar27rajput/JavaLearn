package swd;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotTest1 
{

	public static void main(String[] args) throws IOException 
	{
		System.out.println("Test Start");
		
		System.setProperty("webdriver.chrome.driver", "D:\\SWD\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		Files.copy(screenshot, new File("D:\\testGoogle.png"));
		
		System.out.println("Test End");
		

	}

	

}
