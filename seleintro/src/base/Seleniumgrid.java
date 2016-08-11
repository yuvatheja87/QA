package base;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Seleniumgrid {

	public static void main(String[] args) throws MalformedURLException {
		//configure hub and nodes
		/* Java -jar selenium.standalone.2.55.0.jar -role hub
		 * http://localhost:4444/grid/console
		 * 
		 * java -jar selenium.standalone.2.55.0.jar -role webdriver -hub http://hubip:4444/grid/register -port <random_port>	
		*/
		WebDriver driver;
		DesiredCapabilities cap= DesiredCapabilities.firefox();
		cap.setCapability(FirefoxDriver.BINARY,new File("firefox path at node").getAbsolutePath());
		driver = new RemoteWebDriver(new URL("http://nodeip:port/wb/hub"),cap);
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		
		
	}

}
