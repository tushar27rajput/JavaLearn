package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SWD\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		LoginPage loginPage = new LoginPage(driver);
		
		
		// Use the methods of the LoginPage class to enter the login credentials and submit the form
        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret_sauce");
        loginPage.clickSubmit();
		

	}

}
