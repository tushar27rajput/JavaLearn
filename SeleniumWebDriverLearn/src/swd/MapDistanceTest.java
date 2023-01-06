package swd;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MapDistanceTest 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Test Start");
		
		//Create a ChromeOptions object and set the "headless" option to true to run Chrome in headless mode
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		
		
		//Create a ChromeDriver object and pass the ChromeOptions object as an argument.
		WebDriver driver = new ChromeDriver(options);
		
		//Use the ChromeDriver object to navigate to the Google Maps website and enter the names of the two places in the search bar.
		driver.get("https://www.google.com/maps");
		driver.findElement(By.id("searchboxinput")).sendKeys("Jammu" + " to " + "Kanyakumari");
		driver.findElement(By.id("searchbox-searchbutton")).click();
		Thread.sleep(10000);
		
		//Find the distance element on the page and extract the text.
		driver.findElement(By.xpath("//*[@aria-label='Driving']")).click();
		Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='section-directions-trip-travel-mode-0']")).click();
        Thread.sleep(5000);
        String km=driver.findElement(By.xpath("//span[@class='hPzYFf']")).getText();
        System.out.println(km);
        
		
        System.out.println("Test End");
		

	}

}
