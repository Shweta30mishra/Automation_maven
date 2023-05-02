package parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterization_Login_testngXml {
	public static WebDriver driver;
	@Test
	@Parameters({"Browser","url","emailid","password"})
	public void rediffLogin(String Browser,String url,String emailid,String password) {
		if(Browser.equals("Chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			}else if(Browser.equals("firefox")) {
				driver = new FirefoxDriver();
				driver.manage().window().maximize();	
			}	
	//driver= new ChromeDriver();
	//driver.manage().window().maximize();
	driver.get(url);
	driver.findElement(By.className("signin")).click();
	driver.findElement(By.cssSelector("div.cell>input#login1")).sendKeys(emailid);
	driver.findElement(By.id("password")).sendKeys(password);
	driver.findElement(By.xpath("//div[@class='pwdpass']/child::em/following-sibling::input")).click();	
	driver.quit();
	
}
}
