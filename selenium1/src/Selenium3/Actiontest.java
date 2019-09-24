package Selenium3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actiontest {

	WebDriver driver;
	
		@FindBy(xpath="//*[@id='LoginForm_username']")
		WebElement username;
		@FindBy(xpath="//*[@id='LoginForm_password']")
		WebElement userpassword;
	



		
	public  Actiontest(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

}
