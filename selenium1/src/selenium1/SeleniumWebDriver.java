package selenium1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class SeleniumWebDriver {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://connect.maveric-systems.com/index.php/site/login");
		driver.get("https://www.toolsqa.com/iframe-practice-page/");
		//WebElement Alert1=driver.findElement(By.id("cookie_action_close_header"));
		 //Alert1.click();
		WebElement element=driver.findElement(By.xpath("//a[@property='v:title']"));
		
		String toolTipText=element.getAttribute("property");
		System.out.println(toolTipText);
		 /*WebElement Alert1=driver.findElement(By.id("cookie_action_close_header"));
		 Alert1.click();
		 Thread.sleep(5000);
		 String str="Burj Khalifa";
		String in=driver.findElement(By.xpath("//table[@class='tsc_table_s13']//th[text()='"+str+"']//following-sibling::td[2]")).getText();
		System.out.println(in);*/
		//WebElement Alert1=driver.findElement(By.id("cookie_action_close_header"));
		 //Alert1.click();
		/*
		 * JavascriptExecutor js=(JavascriptExecutor) driver; WebElement
		 * Element=driver.findElement(By.xpath(
		 * "//a[@href='https://github.com/operasoftware/operachromiumdriver/releases']")
		 * ); js.executeScript("arguments[0].scrollIntoView();",Element);
		 */
		/*
		 * Actions actions=new Actions(driver); WebElement
		 * mainMenu=driver.findElement(By.xpath(
		 * "//*[@id=\"primary-menu\"]/li[2]/a/span/span"));
		 * actions.moveToElement(mainMenu); WebElement
		 * subMenu=driver.findElement(By.xpath(
		 * "//*[@id=\"primary-menu\"]/li[2]/ul/li[11]/a/span/span"));
		 * actions.moveToElement(subMenu); actions.click().build().perform();
		 */
		
		/*
		 * TakesScreenshot scrShot=((TakesScreenshot)driver); File
		 * SrcFile=scrShot.getScreenshotAs(OutputType.FILE); File DestFile=new
		 * File("C:\\Users\\training\\Desktop\\New folder.png");
		 * Files.copy(SrcFile,DestFile); driver.close();
		 */
	
		 
		/*
		 * WebElement Alert1=driver.findElement(By.id("cookie_action_close_header"));
		 * Alert1.click();
		 * driver.findElement(By.xpath("//button[@id='button1']")).click();
		 * Thread.sleep(1000); String MainWindow=driver.getWindowHandle();
		 * Set<String>s1=driver.getWindowHandles(); Iterator<String> i1=s1.iterator();
		 * while(i1.hasNext()) { String ChildWindow=i1.next();
		 * if(!MainWindow.equalsIgnoreCase(ChildWindow)) {
		 * driver.switchTo().window(ChildWindow);
		 * 
		 * } }
		 */
		//WebDriver driver=new ChromeDriver();
		/*Select continent = new Select(driver.findElement(By.id("continents"))); 
		//continent.selectByVisibleText("Europe"); 
		Thread.sleep(2000);
		continent.selectByIndex(3); 
        driver.findElement(By.xpath("//div//form//input[@type='text']"));*/
        /*String in=driver.findElement(By.xpath("//*[contains(text(),'credential')]")).getText();
        System.out.println(in);*/
		//driver.quit();
		//Thread.sleep(4000);
		/*List<WebElement> input=driver.findElements(By.tagName("input"));
		System.out.println(input.size());
	    WebElement remember=driver.findElement(By.id("LoginForm_rememberMe"));
		remember.click();
		System.out.println(remember.isSelected());
		WebElement username=driver.findElement(By.id("LoginForm_username"));
		username.sendKeys("aiswaryab");
		WebElement password=driver.findElement(By.id("LoginForm_password"));
		password.sendKeys("Araviya@");*/
		/*driver.findElement(By.id("LoginForm_username")).sendKeys("aiswaryab");
		driver.findElement(By.id("LoginForm_password")).sendKeys("Araviya@");
		driver.findElement(By.name("yt0")).click();
		//String test=driver.findElement(By.name("")).getText();
		//System.out.println(test);
		//WebElement remember=driver.findElement(By.id("LoginForm_rememberMe"));
		//System.out.println(remember.isSelected());*/
		
		/*WebElement Alert1=driver.findElement(By.id("cookie_action_close_header"));
	       Alert1.click();
	       Thread.sleep(5000);
	       WebElement Alert2=driver.findElement(By.xpath("//button[@onclick=\"if (!window.__cfRLUnblockHandlers) return false; pushAlert()\"]"));
	       Alert2.click();
	       Alert alert=driver.switchTo().alert();
	      // alert.accept();
	      String in= alert.getText();
	     System.out.println(in);    */
		/*
		 * WebElement Alert1=driver.findElement(By.id("cookie_action_close_header"));
		 * Alert1.click(); driver.switchTo().frame("iframe1");
		 * driver.findElement(By.xpath("Software Testing Tutorial")).click();
		 * //driver.findElement(By.
		 * xpath("//div[@class='dt-mobile-header']//span[@class='menu-text' and contains(text(),'Software Testing Tutorial')]"
		 * )).click(); driver.switchTo().defaultContent();
		 * driver.findElement(By.xpath("//a[@href='https://www.toolsqa.com/']")).click()
		 * ;
		 */
		//driver.quit();      
        
	}
}