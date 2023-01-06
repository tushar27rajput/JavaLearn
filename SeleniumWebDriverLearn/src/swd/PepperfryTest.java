package swd;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class PepperfryTest {
  private WebDriver driver;

  @Test
  public void testPepperfrySearch() {
    // Set up Chrome driver
	  System.setProperty("webdriver.chrome.driver", "D:\\SWD\\chromedriver_win32\\chromedriver.exe");
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--incognito");
    driver = new ChromeDriver(options);

    // Navigate to pepperfry.com
    driver.get("https://www.pepperfry.com/");

    // Enter search keyword and submit the form
    driver.findElement(By.id("search")).sendKeys("furniture");
    driver.findElement(By.xpath("//*[@id='searchButton']")).click();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    String list=driver.findElement(By.xpath("//*[@id='productView']")).getText();
    //List<WebElement> list=driver.findElements(By.xpath("//*[@id='productView']"));
    System.out.println(list);
    

    // Wait for the search results to load
    // You can use a wait function here to wait for the search results to load
    // before continuing with the rest of the script

    // Get the list of items and print them in ascending and descending order
    // You can use a loop to iterate over the list of items and print their names
    // You can also use the Collections.sort() method to sort the list in ascending or descending order
  }
}

