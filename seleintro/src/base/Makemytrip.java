package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Makemytrip {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://us.makemytrip.com/");
		driver.findElement(By.xpath(".//*[@id='trip_type']/label[2]")).click();
		driver.findElement(By.xpath(".//*[@id='top_content']/div[2]/div[2]/div[2]/div[1]/div[5]/div[2]/span[1]/a")).click();
		Thread.sleep(1500L);
		int count1=driver.findElements(By.xpath(".//*[@class='ui-menu-item']")).size();
		for(int i=0;i<count1;i++){
			String str1=driver.findElements(By.xpath(".//*[@class='ui-menu-item']/a")).get(i).getAttribute("innerText");
			if(str1.contains("(BOM)")){
				driver.findElements(By.xpath(".//*[@class='ui-menu-item']/a")).get(i).click();
				break;
			}	
		}
		driver.findElement(By.xpath(".//*[@id='top_content']/div[2]/div[2]/div[2]/div[1]/div[5]/div[3]/span/a")).click();
		Thread.sleep(1000L);
		int count2=driver.findElements(By.xpath(".//*[@id='ui-id-6']/li")).size();
		for(int i=0;i<count2;i++){
			String str1=driver.findElements(By.xpath(".//*[@id='ui-id-6']/li/a")).get(i).getAttribute("innerText");
			if(str1.contains("(BLR)")){
				driver.findElements(By.xpath(".//*[@id='ui-id-6']/li/a")).get(i).click();
				break;
			}	
		}
		Thread.sleep(1000L);
		driver.findElement(By.xpath(".//*[@id='top_content']/div[2]/div[2]/div[2]/div[1]/div[7]/span/span[2]/a")).click();
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[4]/td[6]/a")).click();
		driver.findElement(By.xpath(".//*[@id='top_content']/div[2]/div[2]/div[2]/div[1]/div[7]/span/span[4]/a")).click();
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[5]/td[3]/a")).click();
		driver.findElement(By.xpath(".//*[@id='top_content']/div[2]/div[2]/div[2]/div[1]/div[7]/div[1]/div[2]/div[4]/div[5]/span[2]/span/a")).click();
		int count3=driver.findElements(By.xpath(".//*[@id='ui-id-11']/li")).size();
		for(int i=0;i<count3;i++){
			String str1=driver.findElements(By.xpath(".//*[@id='ui-id-11']/li/a")).get(i).getAttribute("innerText");
			if(str1.equals("5")){
				driver.findElements(By.xpath(".//*[@id='ui-id-11']/li/a")).get(i).click();
				break;
			}	
		}
		driver.findElement(By.xpath(".//*[@id='bottom_buttons']/button[1]")).click();
	}

}
