package keywordDriven;

import java.util.concurrent.TimeUnit;
import utility.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Action_Keyword {
	 
		public static WebDriver driver; 
		public void openBrowser() 
		{

		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe"); 
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
		//ChromeDriver driver = new ChromeDriver(options);
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		} 
		public void navigate() 
		{ 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		//System.out.println("url="+driver.get(Constants.URL));
		driver.get(Constants.URL); 
		} 
		public void enterEmail() 
		{ 
		driver.findElement(By.xpath("txtuserid")).sendKeys(Constants.username); 
		} 
		public void enterPassword() 
		{ 
		driver.findElement(By.xpath("txtpassword")).sendKeys(Constants.password); 
		} 
		public void clickSignIn() 
		{ 
		driver.findElement(By.xpath("txtpassword]")).click(); 
		}

		public void logout() 
		{ 
		driver.findElement(By.xpath("//a[@id='sign_out_link']")).click(); 
		} 
		public void closeBrowser() 
		{ 
		driver.quit(); 
		}
}
	
