package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Limitingdriverscope {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.ebay.com/");
		System.out.println("total number of links "+driver.findElements(By.tagName("a")).size());
		WebElement footer = driver.findElement(By.xpath(".//*[@id='glbfooter']"));
		System.out.println("total number of links in footer "+footer.findElements(By.tagName("a")).size());
		WebElement footer1 = driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		System.out.println("total number of links in footer second column "+footer1.findElements(By.tagName("a")).size());
		for(int i=0;i<footer1.findElements(By.tagName("a")).size();i++){
			if(footer1.findElements(By.tagName("a")).get(i).getText().equals("Site map")){
				footer1.findElements(By.tagName("a")).get(i).click();
		//		System.out.println(driver.getTitle());
				break;
			}
		}
		if(driver.getTitle().equals("Sitemap | eBay"))
			System.out.println("page sucessfully changed to "+driver.getTitle());
		
		driver.close(); 
	}

}
