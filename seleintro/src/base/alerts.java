package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alerts {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.javascripter.net/faq/alert.htm");
		driver.findElement(By.xpath("//input[@value='Try it now']")).click();
		driver.switchTo().alert().accept();
	}

}
