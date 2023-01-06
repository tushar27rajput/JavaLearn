package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id='user-name']")
	WebElement username;
	
	@FindBy(xpath ="//*[@id='password']")
	WebElement password;

	@FindBy(xpath ="//*[@id='login-button']")
	WebElement submitButton;
	
	
	 // Constructor
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// Actions
    public void setUsername(String strUsername)
    {
        username.sendKeys(strUsername);
    }
	
    public void setPassword(String strPassword)
    {
        password.sendKeys(strPassword);
    }
	
    public void clickSubmit()
    {
        submitButton.click();
    }
}
