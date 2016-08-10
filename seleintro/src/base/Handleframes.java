package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handleframes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		System.out.println(driver.getPageSource());
		driver.switchTo().frame(0);
		Thread.sleep(1500L);
		driver.findElement(By.cssSelector("input[class='input_password']")).sendKeys("124");
		driver.findElement(By.cssSelector(".lForm>tbody>tr>td>a")).click();
		
	}

}
