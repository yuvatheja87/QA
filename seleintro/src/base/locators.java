package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locators {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("rpcnaidu@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("9440044303");
		driver.findElement(By.xpath(".//*[@id='u_0_o']")).click();
		
		
	}

}
