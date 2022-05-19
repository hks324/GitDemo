package methodName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginMethodName {
	WebDriver driver;
	
	public loginMethodName(WebDriver driver) {
		this.driver= driver;
		
	}
	
	
	
	public void getWebsite() {
		driver.get("https://github.com/login");		
	}
	
	public WebElement getUsername() {
		return driver.findElement(By.id("login_field"));
	}
	public WebElement getPassword() {
		return driver.findElement(By.id("password"));
	}
	public WebElement getSubmit() {
		return driver.findElement(By.xpath("//input[@value='Sign in']"));
	}

}
