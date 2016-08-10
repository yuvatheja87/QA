package base;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowortabswitch {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/SignUp");
		driver.findElement(By.xpath(".//*[@id='wrapper']/div[2]/div/div[1]/p/a")).click();
		System.out.println(driver.getTitle());
		Set<String> st=driver.getWindowHandles();
		Iterator<String> itr1=st.iterator();
		String parentid=itr1.next();
		String childid=itr1.next();
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		
	}

}
