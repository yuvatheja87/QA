package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Formsubmit {

	public static void main(String[] args) {
//		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","E:\\QA\\workspace\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.get("http://spicejet.com/");
//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		driver.findElement(By.xpath("//a[@value='IXM']")).click();
//		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
//		driver.findElement(By.xpath("//*[@id='dropdownGroup1']/div/ul[2]/li[1]/a")).click();
		
		Select dropdown1 = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")));
		dropdown1.selectByIndex(4);
//		dropdown1.deselectByVisibleText("9 Adults");
		dropdown1.selectByValue("8");
		if(!driver.findElement(By.xpath("//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected())
			driver.findElement(By.xpath("//*[@id='ctl00_mainContent_chk_IndArm']")).click();
		
			
	}

}
