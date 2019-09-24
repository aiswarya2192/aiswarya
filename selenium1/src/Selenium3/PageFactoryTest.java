package Selenium3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageFactoryTest {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://connect.maveric-systems.com/index.php/site/login");
		Actiontest in=new Actiontest(driver);
		in.username.sendKeys("aiswaryab");
		Thread.sleep(2000);
		driver.quit();
		
	}
	
}