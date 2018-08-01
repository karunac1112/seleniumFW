import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\karuna\\Desktop\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("https://www.facebook.com/ss");
	//	d.navigate().to("https://www.facebook.com/");
	}
}
