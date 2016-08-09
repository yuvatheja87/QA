package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class customizedxpath {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("xxxxxxxxxxxx");
//		driver.findElement(By.className("inputText")).sendKeys("xxxxxxx@xxxx.xxx");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("xxxxxxxx");
//		driver.findElement(By.linkText("Forgot account?")).click();
		driver.findElement(By.partialLinkText("Forgot")).click();

		
		
		
	}
}
