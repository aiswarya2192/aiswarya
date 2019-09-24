package Selenium3;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestNgFile {
	WebDriver driver;
	String value="http://localhost:4444/wd/hub";
	
		@BeforeTest
		public void launchBrowser() throws InterruptedException {
			  System.setProperty("webdriver.chrome.driver",
			  "C:\\Users\\training\\Downloads\\chromedriver_win32\\chromedriver.exe");
			  driver=new ChromeDriver();
			  driver.get("https://connect.maveric-systems.com/index.php/site/login");
			  System.out.println("BeforeTest"); 
			  Thread.sleep(2000);
			  
			  }
	/*
	 * public void beforeTest() throws MalformedURLException { DesiredCapabilities
	 * ds=DesiredCapabilities.chrome(); ds.setPlatform(Platform.ANY); driver=new
	 * RemoteWebDriver(new URL(value),ds); driver.manage().window().maximize();
	 * driver.get("https://connect.maveric-systems.com/index.php/site/login"); }
	 */
		@AfterTest
		public void afterTest()
		{
			driver.close();
		}
		@Test 
		public void testValidUserDemoWebShop() throws InterruptedException
		{
			driver.findElement(By.id("LoginForm_username")).sendKeys("username");
			driver.findElement(By.id("LoginForm_password")).sendKeys("password");
			Thread.sleep(2000);
			driver.findElement(By.name("yt0")).click();
		 
		}
}
	//@BeforeMethod
	/*
	 * public void launchBrowser() throws InterruptedException {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\training\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 * driver=new ChromeDriver();
	 * driver.get("https://connect.maveric-systems.com/index.php/site/login");
	 * System.out.println("BeforeTest"); Thread.sleep(2000);
	 * 
	 * }
	 */
	/*@Test 
	@Parameters({ "sUsername", "sPassword" })

	public void test(String sUsername, String sPassword) throws InterruptedException {
		driver.findElement(By.id("LoginForm_username")).sendKeys(sUsername);
		driver.findElement(By.id("LoginForm_password")).sendKeys(sPassword);
		Thread.sleep(2000);
		driver.findElement(By.name("yt0")).click();
	 
	}*/


	/*@Test(priority=1)
	public void openBrowser() throws InterruptedException 
	{
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		System.out.println("AfterTest");
		Thread.sleep(2000);
	}
	@Test(priority=2)
	public void openGoogle() 
	{
		driver.get("http://www.google.co.in");
		System.out.println("AfterTest");
	}*/

	/*
	 * @Test(priority=3) public void performSearchAndClick1stLink() throws
	 * InterruptedException {
	 * driver.findElement(By.xpath("//*[@title='Search']")).sendKeys("Facebook");
	 * Thread.sleep(2000); System.out.println("AfterTest"); }
	 */
	/*
	 * @Test public void loginconn() throws InterruptedException {
	 * driver.findElement(By.id("LoginForm_username")).sendKeys("aiswaryab");
	 * driver.findElement(By.id("LoginForm_password")).sendKeys("Araviya@");
	 * Thread.sleep(2000); driver.findElement(By.name("yt0")).click(); }
	 * //@AfterTest
	 * 
	 * @AfterMethod public void terminateBrowser() {
	 * 
	 * driver.quit(); }
	 */

