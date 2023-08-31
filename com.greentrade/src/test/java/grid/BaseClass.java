package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseClass {

	public RemoteWebDriver driver;
	//@Parameters("chrome")
	@BeforeMethod
	public void gridPractice() throws MalformedURLException
	{
		URL url=new URL("http://192.168.85.1:4444/wd/hub");
		DesiredCapabilities cap=new DesiredCapabilities();		
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);

		driver=new RemoteWebDriver(url, cap);
	}

	@Test
	public void remoteExecution()
	{
		driver.get("https://www.gmail.com");
	}


}
