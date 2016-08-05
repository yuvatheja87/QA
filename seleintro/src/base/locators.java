package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locators {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
	}

}
