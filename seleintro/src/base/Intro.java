package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Intro {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
//		System.setProperty("webdriver.chrome.driver","E:\\QA\\workspace\\chromedriver.exe");				// to work with chrome
//		WebDriver driver= new ChromeDriver();
//		System.setProperty("webdriver.ie.driver","E:\\QA\\workspace\\IEDriverServer.exe");				
//		WebDriver driver= new InternetExplorerDriver();
//	Safari download and install plugin in mac
//		WebDriver driver= new SafariDriver();
		
		
		driver.get("http://www.google.com"); 			//to open url
	//	System.out.println(driver.getTitle());   		// to get title of url
	//	System.out.println(driver.getPageSource());  	//to get page source
	//	System.out.println(driver.getCurrentUrl());		// to get current url
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[3]/center/input[1]")).click();
		
		
		
/*		try {
		    Thread.sleep(1000);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		driver.close();*/
	}
}
	

