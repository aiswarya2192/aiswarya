package Selenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestFacebookRegistration {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training\\Downloads\\chromedriver_win32\\chromedriver.exe");
	//jkhjgjgu
		//ufgyfy
		
		WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signin");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("aisusweety97@gmail.com");
		WebDriverWait wait=new WebDriverWait(driver, 20);               
driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); 
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("frgfg23");
	driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click(); 
	}
	}
