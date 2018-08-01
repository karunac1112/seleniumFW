package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements AutoConst
{

public static WebDriver d;
	
	@BeforeMethod
	public void preCondition()
	{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		d = new ChromeDriver();
		d.get("http://localhost/login.do");
	}
	
//	@AfterMethod
//	public void postCondition()
//	{
//		d.close();
//	}
	
}
