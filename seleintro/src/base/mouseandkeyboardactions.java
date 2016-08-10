package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseandkeyboardactions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.amazon.in/");
		Actions abc = new Actions(driver);
		WebElement ele1=driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']"));
		abc.moveToElement(ele1).build().perform();
		Thread.sleep(1500L);
		WebElement ele3= driver.findElement(By.linkText("Customer Service"));
		abc.moveToElement(ele3).contextClick().build().perform();
		Thread.sleep(2000L);
	//	driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']")).sendKeys("laptops");
		WebElement ele2= driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']"));
		abc.moveToElement(ele2).click().keyDown(Keys.SHIFT).sendKeys("mac book ").keyUp(Keys.SHIFT).sendKeys("pro").build().perform();
		
	}

}
