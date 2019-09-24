package Selenium3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionClass {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\training\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://connect.maveric-systems.com/index.php/site/login");
	//ClassPageObject.username(driver).sendKeys("aiswaryab");
	
	WebDriverWait wait=new WebDriverWait(driver,20);//class name,constructor name
    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("aiswaryab")));
    
}
}
