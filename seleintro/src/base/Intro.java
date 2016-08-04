package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Intro {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		System.setProperty("webdriver.chrome.driver","E:\\QA\\workspace\\Selenium-Web"
				+ "\\Chrome\\chromedriver.exe");
		WebDriver driver1= new ChromeDriver();
		driver1.get("http://www.google.com");
	}
}
	

