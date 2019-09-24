package Selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassPageObject {
	public static WebElement username(WebDriver driver)
	{
		
		WebElement element=driver.findElement(By.id("LoginForm_username"));
			return element;
	}
	
}
