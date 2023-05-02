package parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TN_registration_Parameterization {
	public static WebDriver driver;
	@Test
	@Parameters({"Browser","url","clickOnMYAccount","clickOnRegister","firstNameId","lastNameId","emailId","telephoneId","passwordName","confirmPasswordId","continueClass",
		"firstName","lastName","email","telephone","password","confirmPassword"})
	public void TN_registration(String Browser,String url,String clickOnMYAccount,String clickOnRegister,String firstNameId,String lastNameId,String emailId,String telephoneId,String passwordName,String confirmPasswordId,String continueClass,String firstName,String lastName,String email,String telephone,String password,String confirmPassword) {
	if(Browser.equals("Chrome")) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		}else if(Browser.equals("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();	
		}	
	driver.get(url);
	driver.findElement(By.linkText(clickOnMYAccount)).click();
	driver.findElement(By.linkText(clickOnRegister)).click();
	driver.findElement(By.id(firstNameId)).sendKeys(firstName);
	driver.findElement(By.id(lastNameId)).sendKeys(lastName);
	driver.findElement(By.id(emailId)).sendKeys(email);
	driver.findElement(By.id(telephoneId)).sendKeys(telephone);
	driver.findElement(By.name(passwordName)).sendKeys(password);
	driver.findElement(By.id(confirmPasswordId)).sendKeys(confirmPassword);
	driver.findElement(By.name("agree")).click();
	driver.findElement(By.cssSelector(continueClass)).click();
	driver.quit();					
	
}
}