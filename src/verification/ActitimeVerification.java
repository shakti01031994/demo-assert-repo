package verification;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ActitimeVerification 
{
	@Test
	public void verify()
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		String expectedtitle="actiTIME";
		String actualtitle=driver.getTitle();
		Assert.assertEquals(actualtitle, expectedtitle);
		Reporter.log("hello", true);
		Assert.assertNotEquals(actualtitle, expectedtitle);
		Reporter.log("hi", true);
		Assert.assertSame(actualtitle, expectedtitle);
		Reporter.log("hey",true);
		Assert.assertNotSame(actualtitle, expectedtitle);
		Reporter.log("yeah",true);
		/*SoftAssert s=new SoftAssert();
		s.assertEquals(actualtitle, expectedtitle);
		Reporter.log("ray", true);
		s.assertNotEquals(actualtitle, expectedtitle);
		Reporter.log("a",true);
		s.assertAll();*/
		
		
		
		
	}

}
