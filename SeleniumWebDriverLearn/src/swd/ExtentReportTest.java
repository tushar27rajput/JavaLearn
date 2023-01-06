package swd;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportTest 
{

	public static void main(String[] args) 
	{
		
		
		ExtentReports report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");
		ExtentTest test = report.startTest("ExtentDemo");
		
		
		
		
		
		
		System.out.println("Test Start");
		
		System.setProperty("webdriver.chrome.driver", "D:\\SWD\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		
		if(driver.getTitle().equals("Google"))
		{
		test.log(LogStatus.PASS, "Navigated to the specified URL");
		}
		else
		{
		test.log(LogStatus.FAIL, "Test Failed");
		}
	
		
		
		
		
		report.endTest(test);
		report.flush();
		driver.quit();
		System.out.println("Test End");
			
	}
	
}

