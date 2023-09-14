package Libraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utility {
	
	static WebDriver driver;
	
	public static WebDriver launchBrowser(String browserName, String url)
	{
		if (browserName.equalsIgnoreCase("firefox"))
		{
			driver= WebDriverManager.firefoxdriver().create();
		}
		else if (browserName.equalsIgnoreCase("chrome"))
		{
			driver= WebDriverManager.chromedriver().create();
			
		}
		else if (browserName.equalsIgnoreCase("edge"))
		{
			driver= WebDriverManager.edgedriver().create();
			
		}	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(url);
	return driver;

}
}

