package realApplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import methodName.loginMethodName;

public class gitHubLoginCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "H:\\Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		loginMethodName lm= new loginMethodName(driver);
		lm.getWebsite();
		lm.getUsername().sendKeys("Himanshu@gmail.com");
		lm.getPassword().sendKeys("himanshu");
		lm.getSubmit().click();
	}
}

